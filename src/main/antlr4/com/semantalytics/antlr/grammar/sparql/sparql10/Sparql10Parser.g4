parser grammar Sparql10Parser;

options { tokenVocab=Sparql10Lexer; }

/* SPARQL 1.0 [1] */
query
    : prologue ( selectQuery | constructQuery | describeQuery | askQuery )
    ;

/* SPARQL 1.0 [2] */
prologue
    : baseDecl? prefixDecl*
    ;

/* SPARQL 1.0 [3] */
baseDecl
    : BASE iriRef
    ;

/* SPARQL 1.0 [4] */
prefixDecl
    : PREFIX PNAME_NS IRI_REF
    ;

/* SPARQL 1.0 [5] */
selectQuery
    : SELECT ( DISTINCT | REDUCED )? ( var+ | ASTERISK ) datasetClause* whereClause solutionModifier
    ;

/* SPARQL 1.0 [6] */
constructQuery
    : CONSTRUCT constructTemplate datasetClause* whereClause solutionModifier
    ;

/* SPARQL 1.0 [7] */
describeQuery
    : DESCRIBE ( varOrIRIref+ | ASTERISK ) datasetClause* whereClause? solutionModifier
    ;

/* SPARQL 1.0 [8] */
askQuery
    : ASK datasetClause* whereClause
    ;

/* SPARQL 1.0 [9] */
datasetClause
    : FROM ( defaultGraphClause | namedGraphClause )
    ;

/* SPARQL 1.0 [10] */
defaultGraphClause
    : sourceSelector
    ;

/* SPARQL 1.0 [11] */
namedGraphClause
    : NAMED sourceSelector
    ;

/* SPARQL 1.0 [12] */
sourceSelector
    : iriRef
    ;

/* SPARQL 1.0 [13] */
whereClause
    : WHERE? groupGraphPattern
    ;

/* SPARQL 1.0 [14] */
solutionModifier
    : orderClause? limitOffsetClauses?
    ;

/* SPARQL 1.0 [15] */
limitOffsetClauses
    : limitClause offsetClause?
    | offsetClause limitClause?
    ;

/* SPARQL 1.0 [16] */
orderClause
    : ORDER BY orderCondition+
    ;

/* SPARQL 1.0 [17] */
orderCondition
    : ( ( o=ASC | o=DESC ) brackettedExpression )
    | ( c=constraint | v=var)
    ;

/* SPARQL 1.0 [18] */
limitClause
    : LIMIT INTEGER
    ;

/* SPARQL 1.0 [19] */
offsetClause
    : OFFSET INTEGER
    ;

/* SPARQL 1.0 [20] */
groupGraphPattern
	: OPEN_CURLY_BRACE (t1=triplesBlock )? ( ( g=graphPatternNotTriples | f=filter ) DOT? (t2=triplesBlock )? )* CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.0 [21] */
triplesBlock
    : triplesSameSubject ( DOT (t=triplesBlock )? )?
    ;

/* SPARQL 1.0 [22] */
graphPatternNotTriples
    : ogp=optionalGraphPattern
    | gougp=groupOrUnionGraphPattern
    | ggp=graphGraphPattern
    ;

/* SPARQL 1.0 [23] */
optionalGraphPattern
    : OPTIONAL groupGraphPattern
    ;

/* SPARQL 1.0 [24] */
graphGraphPattern
    : GRAPH varOrIRIref groupGraphPattern
    ;

/* SPARQL 1.0 [25] */
groupOrUnionGraphPattern
    : v1=groupGraphPattern ( UNION v2=groupGraphPattern )*
    ;

/* SPARQL 1.0 [26] */
filter
    : FILTER constraint
    ;

/* SPARQL 1.0 [27] */
constraint
    : be=brackettedExpression
    | bic=builtInCall
    | fc=functionCall
    ;

/* SPARQL 1.0 [28] */
functionCall
    : iriRef argList
    ;

/* SPARQL 1.0 [29] */
argList
    : NIL
    | OPEN_BRACE e1=expression ( COMMA e2=expression )* CLOSE_BRACE
    ;

/* SPARQL 1.0 [30] */
constructTemplate
    : OPEN_CURLY_BRACE (constructTriples )? CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.0 [31] */
constructTriples
	: triplesSameSubject ( DOT constructTriples? )?
    ;

/* SPARQL 1.0 [32] */
triplesSameSubject
    : varOrTerm propertyListNotEmpty
    | triplesNode propertyList
    ;

/* SPARQL 1.0 [33] */
propertyListNotEmpty
    : v1=verb ol1=objectList ( SEMICOLON ( v2=verb ol2=objectList )? )*
    ;

/* SPARQL 1.0 [34] */
propertyList
    : propertyListNotEmpty?
    ;

/* SPARQL 1.0 [35] */
objectList
    : o1=object ( COMMA o2=object  )*
    ;

/* SPARQL 1.0 [36] */
object
    : graphNode
    ;

/* SPARQL 1.0 [37] */
verb
    : varOrIRIref
    | A
    ;

/* SPARQL 1.0 [38] */
triplesNode
    : collection
    | blankNodePropertyList
    ;

/* SPARQL 1.0 [39] */
blankNodePropertyList
    : OPEN_SQUARE_BRACE propertyListNotEmpty CLOSE_SQUARE_BRACE
    ;

/* SPARQL 1.0 [40] */
collection
    : OPEN_BRACE ( graphNode )+ CLOSE_BRACE
    ;

/* SPARQL 1.0 [41] */
graphNode
    : varOrTerm
    | triplesNode
    ;

/* SPARQL 1.0 [42] */
varOrTerm
    : var
    | graphTerm
    ;

/* SPARQL 1.0 [43] */
varOrIRIref
    : var
    | iriRef
    ;

/* SPARQL 1.0 [44] */
var
    : v=VAR1
    | v=VAR2
    ;

/* SPARQL 1.0 [45] */
graphTerm
    : ir=iriRef
    | rl=rdfLiteral
    | nl=numericLiteral
    | bl=booleanLiteral
    | bn=blankNode
    | NIL
    ;

/* SPARQL 1.0 [46] */
expression
    : conditionalOrExpression
    ;

/* SPARQL 1.0 [47] */
conditionalOrExpression
    : c1=conditionalAndExpression
    ( OR c2=conditionalAndExpression )*
    ;

/* SPARQL 1.0 [48] */
conditionalAndExpression
	: v1=valueLogical ( AND v2=valueLogical )*
    ;

/* SPARQL 1.0 [49] */
valueLogical
    : relationalExpression
    ;

/* SPARQL 1.0 [50] */
relationalExpression
    : n1=numericExpression ( EQUAL n2=numericExpression
                           | NOT_EQUAL n2=numericExpression
                           | LESS n2=numericExpression
                           | GREATER n2=numericExpression
                           | LESS_EQUAL n2=numericExpression
                           | GREATER_EQUAL n2=numericExpression
                           )?
    ;

/* SPARQL 1.0 [51] */
numericExpression
    : additiveExpression
    ;

/* SPARQL 1.0 [52] */
additiveExpression
    : m1=multiplicativeExpression ( op=PLUS m2=multiplicativeExpression
                                  | op=MINUS m2=multiplicativeExpression
                                  | nlp=numericLiteralPositive
                                  | nln=numericLiteralNegative
                                  )*
    ;

/* SPARQL 1.0 [53] */
multiplicativeExpression
    : u1=unaryExpression ( op=ASTERISK u2=unaryExpression | op=DIVIDE u2=unaryExpression )*
    ;

/* SPARQL 1.0 [54] */
unaryExpression
    : NOT_SIGN e=primaryExpression
    | PLUS e=primaryExpression
    | MINUS e=primaryExpression
    | e=primaryExpression
    ;

/* SPARQL 1.0 [55] */
primaryExpression
    : be=brackettedExpression
    | bic=builtInCall
    | irof=iriRefOrFunction
    | rl=rdfLiteral
    | nl=numericLiteral
    | bl=booleanLiteral
    | v=var
    ;

/* SPARQL 1.0 [56] */
brackettedExpression
    : OPEN_BRACE e=expression CLOSE_BRACE
    ;

/* SPARQL 1.0 [57] */
builtInCall
    : STR OPEN_BRACE e=expression CLOSE_BRACE
    | LANG OPEN_BRACE e=expression CLOSE_BRACE
    | LANGMATCHES OPEN_BRACE e1=expression COMMA e2=expression CLOSE_BRACE
    | DATATYPE OPEN_BRACE e=expression CLOSE_BRACE
    | BOUND OPEN_BRACE var CLOSE_BRACE
    | SAMETERM OPEN_BRACE e1=expression COMMA e2=expression CLOSE_BRACE
    | ISIRI OPEN_BRACE e=expression CLOSE_BRACE
    | ISURI OPEN_BRACE e=expression CLOSE_BRACE
    | ISBLANK OPEN_BRACE e=expression CLOSE_BRACE
    | ISLITERAL OPEN_BRACE e=expression CLOSE_BRACE
    | regexExpression
    ;

/* SPARQL 1.0 [58] */
regexExpression
    : REGEX OPEN_BRACE e1=expression COMMA e2=expression ( COMMA e3=expression )? CLOSE_BRACE

    ;

/* SPARQL 1.0 [59] */
iriRefOrFunction
    : iriRef argList?
    ;

/* SPARQL 1.0 [60] */
rdfLiteral
    : string ( LANGTAG | ( REFERENCE iriRef ) )?
    ;

/* SPARQL 1.0 [61] */
numericLiteral
    : unsigned=numericLiteralUnsigned
	| positive=numericLiteralPositive
	| negative=numericLiteralNegative
    ;

/* SPARQL 1.0 [62] */
numericLiteralUnsigned
    : v=INTEGER
    | v=DECIMAL
    | v=DOUBLE
    ;

/* SPARQL 1.0 [63] */
numericLiteralPositive
    : v=INTEGER_POSITIVE
    | v=DECIMAL_POSITIVE
    | v=DOUBLE_POSITIVE
    ;

/* SPARQL 1.0 [64] */
numericLiteralNegative
    : v=INTEGER_NEGATIVE
    | v=DECIMAL_NEGATIVE
    | v=DOUBLE_NEGATIVE
    ;

/* SPARQL 1.0 [65] */
booleanLiteral
    : TRUE
    | FALSE
    ;

/* SPARQL 1.0 [66] */
string
    : STRING_LITERAL1
    | STRING_LITERAL2
    | STRING_LITERAL_LONG1
    | STRING_LITERAL_LONG2
    ;

/* SPARQL 1.0 [67] */
iriRef
    : IRIREF
    | prefixedName
    ;

/* SPARQL 1.0 [68] */
prefixedName
    : PNAME_LN
    | PNAME_NS
    ;

/* SPARQL 1.0 [69] */
blankNode
    : v=BLANK_NODE_LABEL
    | ANON
    ;

