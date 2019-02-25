parser grammar Sparql11Parser;

options { tokenVocab=Sparql11Lexer; }

sparql
    : queryUnit EOF
    | updateUnit EOF
    ;

/* SPARQL 1.1 [1] */
queryUnit
    : query
    ;

/* SPARQL 1.1 [2] > SPARQL 1.0 [1] */
query
    : prologue ( selectQuery | constructQuery | describeQuery | askQuery ) valuesClause
    ;

/* SPARQL 1.1 [3] */
updateUnit
    : update
    ;

/* SPARQL 1.1 [4] > SPARQL 1.0 [2] */
prologue
    : ( baseDecl | prefixDecl )*
    ;

/* SPARQL 1.1 [5] = SPARQL 1.0 [3] */
baseDecl
    : BASE IRI_REF
    ;

/* SPARQL 1.1 [6] = SPARQL 1.0 [4] */
prefixDecl
    : PREFIX PNAME_NS IRI_REF
    ;

/* SPARQL 1.1 [7] > SPARQL 1.0 [5] */
selectQuery
    : selectClause datasetClause* whereClause solutionModifier
    ;

/* SPARQL 1.1 [8] */
subSelect
    : selectClause whereClause solutionModifier valuesClause
    ;

/* SPARQL 1.1 [9] */
selectClause
    : SELECT ( DISTINCT | REDUCED )? ( (var | ( OPEN_BRACE expression AS var CLOSE_BRACE ) )+ | ASTERISK )
    ;

/* SPARQL 1.1 [10] > SPARQL 1.0 [6] */
constructQuery
    : CONSTRUCT ( constructTemplate datasetClause* whereClause solutionModifier | datasetClause* WHERE OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE solutionModifier )
    ;

/* SPARQL 1.1 [11] > SPARQL 10 [7] */
describeQuery
    : DESCRIBE ( varOrIri+ | ASTERISK ) datasetClause* whereClause? solutionModifier
    ;

/* SPARQL 1.1 [12] > SPARQL 1.0 [8] */
askQuery
    : ASK datasetClause* whereClause solutionModifier
    ;

/* SPARQL 1.1 [13] = SPARQL 1.0 [9] */
datasetClause
    : FROM ( defaultGraphClause | namedGraphClause )
    ;

/* SPARQL 1.1 [14] = SPARQL 1.0 [10] */
defaultGraphClause
    : sourceSelector
    ;

/* SPARQL 1.1 [15] = SPARQL 1.0 [11] */
namedGraphClause
    : NAMED sourceSelector
    ;

/* SPARQL 1.1 [16] > SPARQL 1.0 [12] */
sourceSelector
    : IRI
    ;

/* SPARQL 1.1 [17] = SPARQL 1.0 [13] */
whereClause
    : WHERE? groupGraphPattern
    ;

/* SPARQL 1.1 [18] > SPARQL 1.0 [14] */
solutionModifier
    : groupClause? havingClause? orderClause? limitOffsetClauses?
    ;

/* SPARQL 1.1 [19] */
groupClause
    : GROUP BY groupCondition+
    ;

/* SPARQL 1.1 [20] */
groupCondition
    : builtInCall
    | functionCall
    | OPEN_BRACE expression ( AS var )? CLOSE_BRACE
    | var
    ;

/* SPARQL 1.1 [21] */
havingClause
    : HAVING havingCondition+
    ;

/* SPARQL 1.1 [22] */
havingCondition
    : constraint
    ;

/* SPARQL 1.1 [23] > SPARQL 1.0 [16] */
orderClause
    : ORDER BY orderCondition
    ;

/* SPARQL 1.1 [24] = SPARQL 1.0 [17] */
orderCondition
    : ( ( ASC | DESC ) brackettedExpression )
    | ( constraint | var )
    ;

/* SPARQL 1.1 [25] = SPARQL 1.0 [15] */
limitOffsetClauses
    : limitClause offsetClause?
    | offsetClause limitClause?
    ;

/* SPARQL 1.1 [26] = SPARQL 1.0 [18] */
limitClause
    : LIMIT INTEGER
    ;

/* SPARQL 1.1 [27] = SPARQL 1.0 [19] */
offsetClause
    : OFFSET INTEGER
    ;

/* SPARQL 1.1 [28] */
valuesClause
    : ( VALUES dataBlock )?
    ;

/* SPARQL 1.1 [29] */
update
    : prologue ( update1 ( SEMICOLON update )? )?
    ;

/* SPARQL 1.1 [30] */
update1
    : load
    | clear
    | drop
    | add
    | move
    | copy
    | create
    | insertData
    | deleteData
    | deleteWhere
    | modify
    ;

/* SPARQL 1.1 [31] */
load
    : LOAD SILENT? iri ( INTO graphRef )?
    ;

/* SPARQL 1.1 [32] */
clear
    : CLEAR SILENT? graphRefAll
    ;

/* SPARQL 1.1 [33] */
drop
    : DROP SILENT? graphRefAll
    ;

/* SPARQL 1.1 [34] */
create
    : CREATE SILENT? graphRef
    ;

/* SPARQL 1.1 [35] */
add
    : ADD SILENT? graphOrDefault TO graphOrDefault
    ;

/* SPARQL 1.1 [36] */
move
    : MOVE SILENT? graphOrDefault TO graphOrDefault
    ;

/* SPARQL 1.1 [37] */
copy
    : COPY SILENT? graphOrDefault TO graphOrDefault
    ;

/* SPARQL 1.1 [38] */
insertData
    : INSERT DATA quadData
    ;

/* SPARQL 1.1 [39] */
deleteData
    : DELETE DATA quadData
    ;

/* SPARQL 1.1 [40] */
deleteWhere
    : DELETE WHERE quadPattern
    ;

/* SPARQL 1.1 [41] */
modify
    : ( WITH iri )? ( deleteClause insertClause? | insertClause ) usingClause* WHERE groupGraphPattern
    ;

/* SPARQL 1.1 [42] */
deleteClause
    : DELETE quadPattern
    ;

/* SPARQL 1.1 [43] */
insertClause
    : INSERT quadPattern
    ;

/* SPARQL 1.1 [44] */
usingClause
    : USING ( iri | NAMED iri )
    ;

/* SPARQL 1.1 [45] */
graphOrDefault
    : DEFAULT
    | GRAPH? iri
    ;

/* SPARQL 1.1 [46] */
graphRef
    : GRAPH iri
    ;

/* SPARQL 1.1 [47] */
graphRefAll
    : graphRef
    | DEFAULT
    | NAMED
    | ALL
    ;

/* SPARQL 1.1 [48] */
quadPattern
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.1 [49] */
quadData
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.1 [50] */
quads
    : triplesTemplate? ( quadsNotTriples DOT? triplesTemplate? )*
    ;

/* SPARQL 1.1 [51] */
quadsNotTriples
    : GRAPH varOrIri OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.1 [52] */
triplesTemplate
    : triplesSameSubject ( DOT triplesTemplate? )?
    ;

/* SPARQL 1.1 [53] */
groupGraphPattern
 	: OPEN_CURLY_BRACE ( subSelect | groupGraphPatternSub ) CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [54] */
groupGraphPatternSub
 	: triplesBlock? (graphPatternNotTriples DOT? triplesBlock? )*
 	;

/* SPARQL 1.1 [55] */
triplesBlock
 	: triplesSameSubjectPath ( DOT triplesBlock? )?
 	;

/* SPARQL 1.1 [56] > SPARQL 1.0 [22] */
graphPatternNotTriples
 	: groupOrUnionGraphPattern
 	| optionalGraphPattern
 	| minusGraphPattern
 	| graphGraphPattern
 	| serviceGraphPattern
 	| filter
 	| bind
 	| inlineData
 	;

/* SPARQL 1.1 [57] */
optionalGraphPattern
 	: OPTIONAL groupGraphPattern
 	;

/* SPARQL 1.1 [58] */
graphGraphPattern
 	: GRAPH varOrIri groupGraphPattern
 	;

/* SPARQL 1.1 [59] */
serviceGraphPattern
 	: SERVICE SILENT? varOrIri groupGraphPattern
 	;

/* SPARQL 1.1 [60] */
bind
 	: BIND OPEN_BRACE expression AS var CLOSE_BRACE
 	;

/* SPARQL 1.1 [61] */
inlineData
 	: VALUES dataBlock
 	;

/* SPARQL 1.1 [62] */
dataBlock
 	: inlineDataOneVar
 	| inlineDataFull
 	;

/* SPARQL 1.1 [63] */
inlineDataOneVar
 	: var OPEN_CURLY_BRACE dataBlockValue* CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [64] */
inlineDataFull
  	: ( NIL | OPEN_BRACE var* CLOSE_BRACE ) OPEN_CURLY_BRACE ( OPEN_BRACE dataBlockValue* CLOSE_BRACE | NIL )* CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [65] */
dataBlockValue
 	: iri
 	| rdfLiteral
 	| numericLiteral
 	| booleanLiteral
 	| UNDEF
 	;

/* SPARQL 1.1 [66] */
minusGraphPattern
 	: MINUS groupGraphPattern
 	;

/* SPARQL 1.1 [67] */
groupOrUnionGraphPattern
 	: groupGraphPattern ( UNION groupGraphPattern )*
 	;

/* SPARQL 1.1 [68] = SPARQL 1.0 [26] */
filter
 	: FILTER constraint
 	;

/* SPARQL 1.1 [69] */
constraint
 	: brackettedExpression
 	| builtInCall
 	| functionCall
 	;

/* SPARQL 1.1 [70] */
functionCall
 	: iri argList
 	;

/* SPARQL 1.1 [71] */
argList
 	: NIL
 	| OPEN_BRACE DISTINCT? expression ( COMMA expression )* CLOSE_BRACE
 	;

/* SPARQL 1.1 [72] */
expressionList
 	: NIL
 	| OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE
 	;

/* SPARQL 1.1 [73] */
constructTemplate
 	: OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [74] */
constructTriples
 	: triplesSameSubject ( DOT constructTriples? )?
 	;

/* SPARQL 1.1 [75] */
triplesSameSubject
 	: varOrTerm propertyListNotEmpty
 	| triplesNode propertyList
 	;

/* SPARQL 1.1 [76] */
propertyList
 	: propertyListNotEmpty?
 	;

/* SPARQL 1.1 [77] */
propertyListNotEmpty
 	: verb objectList ( SEMICOLON ( verb objectList )? )*
 	;

/* SPARQL 1.1 [78] > SPARQL 1.0 [37] */
verb
 	: varOrIri
 	| A
 	;

/* SPARQL 1.1 [79] */
objectList
 	: object ( COMMA object )*
 	;

/* SPARQL 1.1 [80] = SPARQL 1.0 [36] */
object
 	: graphNode
 	;

/* SPARQL 1.1 [81] */
triplesSameSubjectPath
 	: varOrTerm propertyListPathNotEmpty
 	| triplesNodePath propertyListPath
 	;

/* SPARQL 1.1 [82] */
propertyListPath
 	: propertyListPathNotEmpty?
 	;

/* SPARQL 1.1 [83] */
propertyListPathNotEmpty
 	: ( verbPath | verbSimple ) objectListPath( SEMICOLON ( ( verbPath | verbSimple ) objectList )? )*
 	;

/* SPARQL 1.1 [84] */
verbPath
 	: path
 	;

/* SPARQL 1.1 [85] */
verbSimple
 	: var
 	;

/* SPARQL 1.1 [86] */
objectListPath
  	: objectPath ( COMMA objectPath )*
 	;

/* SPARQL 1.1 [87] */
objectPath
 	: graphNodePath
 	;

/* SPARQL 1.1 [88] */
path
 	: pathAlternative
 	;

/* SPARQL 1.1 [89] */
pathAlternative
 	: pathSequence ( PIPE pathSequence )*
 	;

/* SPARQL 1.1 [90] */
pathSequence
 	: pathEltOrInverse ( DIVIDE pathEltOrInverse ) *
 	;

/* SPARQL 1.1 [91] */
pathElt
 	: pathPrimary pathMod?
 	;

/* SPARQL 1.1 [92] */
pathEltOrInverse
 	: pathElt
 	| HAT pathElt
 	;

/* SPARQL 1.1 [93] */
pathMod
 	: QUESTION_MARK
 	| ASTERISK
 	| PLUS
 	;

/* SPARQL 1.1 [94] */
pathPrimary
 	: iri
 	| A
 	| BANG pathNegatedPropertySet
 	| OPEN_BRACE path CLOSE_BRACE
 	;

/* SPARQL 1.1 [95] */
pathNegatedPropertySet
 	: pathOneInPropetySet
 	| OPEN_BRACE ( pathOneInPropetySet ( PIPE pathOneInPropetySet )* )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [96] */
pathOneInPropetySet
 	: iri
 	| A
 	| HAT ( iri | A )
 	;

/* SPARQL 1.1 [97] */
integer
 	: INTEGER
 	;

/* SPARQL 1.1 [98] */
triplesNode
 	: collection
 	| blankNodePropertyList
 	;

/* SPARQL 1.1 [99] */
blankNodePropertyList
 	: OPEN_SQUARE_BRACE propertyListNotEmpty CLOSE_SQUARE_BRACE
 	;

/* SPARQL 1.1 [100] */
triplesNodePath
 	: collectionPath
 	| blankNodePropertyListPath
 	;

/* SPARQL 1.1 [101] */
blankNodePropertyListPath
 	: OPEN_SQUARE_BRACE propertyListNotEmpty CLOSE_SQUARE_BRACE
 	;

/* SPARQL 1.1 [102] */
  	//Collection	  ::=  	OPEN_BRACE GraphNode+ CLOSE_BRACE
collection
 	: OPEN_BRACE graphNode+ CLOSE_BRACE
 	;

/* SPARQL 1.1 [103] */
collectionPath
 	: OPEN_BRACE graphNodePath+ CLOSE_BRACE
 	;

/* SPARQL 1.1 [104] */
graphNode
 	: varOrTerm
 	| triplesNode
 	;

/* SPARQL 1.1 [105] */
graphNodePath
 	: varOrTerm
 	| triplesNodePath
 	;

/* SPARQL 1.1 [106] */
varOrTerm
 	: var
 	| graphTerm
 	;

/* SPARQL 1.1 [107] */
varOrIri
 	: var
 	| iri
 	;

/* SPARQL 1.1 [108] */
var
 	: VAR1
 	| VAR2
 	;

/* SPARQL 1.1 [109] */
graphTerm
 	: iri
 	| rdfLiteral
 	| numericLiteral
 	| booleanLiteral
 	| blankNode
 	| NIL
 	;

/* SPARQL 1.1 [110] */
expression
 	: conditionalOrExpression
 	;

/* SPARQL 1.1 [111] */
conditionalOrExpression
 	: conditionalAndExpression ( OR conditionalAndExpression )*
 	;

/* SPARQL 1.1 [112] */
conditionalAndExpression
 	: valueLogical ( AND valueLogical )*
 	;

/* SPARQL 1.1 [113] */
valueLogical
 	: relationalExpression
 	;

/* SPARQL 1.1 [114] */
relationalExpression
 	: numericExpression ( EQUAL numericExpression
 	                    | NOT_EQUAL numericExpression
 	                    | LESS numericExpression
 	                    | GREATER numericExpression
 	                    | LESS_EQUAL numericExpression
 	                    | GREATER_EQUAL numericExpression
 	                    | IN expressionList
 	                    | NOT IN expressionList
 	                    )?
 	;

/* SPARQL 1.1 [115] */
numericExpression
 	: additiveExpression
 	;

/* SPARQL 1.1 [116] */
additiveExpression
 	: multiplicativeExpression ( PLUS multiplicativeExpression
 	                           | MINUS multiplicativeExpression
 	                           | ( numericLiteralPositive
 	                             | numericLiteralNegative
 	                             )
 	                             ( ( ASTERISK unaryExpression )
 	                             | ( DIVIDE unaryExpression )
 	                             )*
 	                           )*
 	;

/* SPARQL 1.1 [117] */
multiplicativeExpression
 	: unaryExpression ( ASTERISK unaryExpression | DIVIDE unaryExpression )*
 	;

/* SPARQL 1.1 [118] */
unaryExpression
 	: NOT   primaryExpression
 	| PLUS  primaryExpression
 	| MINUS primaryExpression
 	|       primaryExpression
 	;

/* SPARQL 1.1 [119] */
primaryExpression
 	: brackettedExpression
 	| builtInCall
 	| iriOrFunction
 	| rdfLiteral
 	| numericLiteral
 	| booleanLiteral
 	| var
 	;

/* SPARQL 1.1 [120] */
brackettedExpression
 	: OPEN_BRACE expression CLOSE_BRACE
 	;

/* SPARQL 1.1 [121] */
builtInCall
 	: aggregate
    | STR OPEN_BRACE expression CLOSE_BRACE
    | LANG OPEN_BRACE expression CLOSE_BRACE
    | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | DATATYPE OPEN_BRACE expression CLOSE_BRACE
    | BOUND OPEN_BRACE var CLOSE_BRACE
    | IRI OPEN_BRACE expression CLOSE_BRACE
    | URI OPEN_BRACE expression CLOSE_BRACE
    | BNODE ( OPEN_BRACE expression CLOSE_BRACE |  NIL )
    | RAND NIL
    | ABS OPEN_BRACE expression CLOSE_BRACE
    | CEIL OPEN_BRACE expression CLOSE_BRACE
    | FLOOR OPEN_BRACE expression CLOSE_BRACE
    | ROUND OPEN_BRACE expression CLOSE_BRACE
    | CONCAT expressionList
    | substringExpression
    | STRLEN OPEN_BRACE expression CLOSE_BRACE
    | strReplaceExpression
    | UCASE OPEN_BRACE expression CLOSE_BRACE
    | LCASE OPEN_BRACE expression CLOSE_BRACE
    | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE
    | CONTAINS OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRSTARTS OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRENDS OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRBEFORE OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRAFTER OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | YEAR OPEN_BRACE expression CLOSE_BRACE
    | MONTH OPEN_BRACE expression CLOSE_BRACE
    | DAY OPEN_BRACE expression CLOSE_BRACE
    | HOURS OPEN_BRACE expression CLOSE_BRACE
    | MINUTES OPEN_BRACE expression CLOSE_BRACE
    | SECONDS OPEN_BRACE expression CLOSE_BRACE
    | TIMEZONE OPEN_BRACE expression CLOSE_BRACE
    | TZ OPEN_BRACE expression CLOSE_BRACE
    | NOW NIL
    | UUID NIL
    | STRUUID NIL
    | MD5 OPEN_BRACE expression CLOSE_BRACE
    | SHA1 OPEN_BRACE expression CLOSE_BRACE
    | SHA256 OPEN_BRACE expression CLOSE_BRACE
    | SHA384 OPEN_BRACE expression CLOSE_BRACE
    | SHA512 OPEN_BRACE expression CLOSE_BRACE
    | COALESCE expressionList
    | IF OPEN_BRACE expression COMMA expression COMMA expression CLOSE_BRACE
    | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | ISIRI OPEN_BRACE expression CLOSE_BRACE
    | ISURI OPEN_BRACE expression CLOSE_BRACE
    | ISBLANK OPEN_BRACE expression CLOSE_BRACE
    | ISLITERAL OPEN_BRACE expression CLOSE_BRACE
    | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE
    | regexExpression
    | existsFunc
    | notExistsFunc
 	;

/* SPARQL 1.1 [122] */
regexExpression
 	: REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [123] */
substringExpression
 	: SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [124] */
strReplaceExpression
 	: REPLACE OPEN_BRACE expression COMMA expression COMMA expression ( COMMA expression )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [125] */
existsFunc
 	: EXISTS groupGraphPattern
 	;

/* SPARQL 1.1 [126] */
notExistsFunc
 	: NOT EXISTS groupGraphPattern
 	;

/* SPARQL 1.1 [127] */
aggregate
 	: COUNT        OPEN_BRACE DISTINCT? ( ASTERISK | expression ) CLOSE_BRACE
    | SUM          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | MIN          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | MAX          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | AVG          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | SAMPLE       OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | GROUP_CONCAT OPEN_BRACE DISTINCT? expression ( SEMICOLON SEPARATOR EQUAL string )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [128] */
iriOrFunction
 	: iri argList?
 	;

/* SPARQL 1.1 [129] */
rdfLiteral
  	: string ( LANGTAG | ( REFERENCE iri ) )?
  	;

/* SPARQL 1.1 [130] */
numericLiteral
 	: numericLiteralUnsigned
 	| numericLiteralPositive
 	| numericLiteralNegative
 	;

/* SPARQL 1.1 [131] */
numericLiteralUnsigned
 	: INTEGER
 	| DECIMAL
    | DOUBLE
 	;

/* SPARQL 1.1 [132] */
numericLiteralPositive
 	: INTEGER_POSITIVE
 	| DECIMAL_POSITIVE
 	| DOUBLE_POSITIVE
 	;

/* SPARQL 1.1 [133] */
numericLiteralNegative
 	: INTEGER_NEGATIVE
 	| DECIMAL_NEGATIVE
 	| DOUBLE_NEGATIVE
 	;

/* SPARQL 1.1 [134] */
booleanLiteral
 	: TRUE
 	| FALSE
 	;

/* SPARQL 1.1 [135] */
string
 	: STRING_LITERAL1
 	| STRING_LITERAL2
 	| STRING_LITERAL_LONG1
 	| STRING_LITERAL_LONG2
 	;

/* SPARQL 1.1 [136] */
iri
 	: IRI_REF
 	| prefixedName
 	;

/* SPARQL 1.1 [137] */
prefixedName
 	: PNAME_LN
 	| PNAME_NS
 	;

/* SPARQL 1.1 [138] */
blankNode
 	: BLANK_NODE_LABEL
 	| ANON
 	;

