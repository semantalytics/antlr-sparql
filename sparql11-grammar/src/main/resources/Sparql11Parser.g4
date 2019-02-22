grammar Sparql11Parser;

import Sparql10Parser;

/* SPARQL 1.1 [1] */
queryUnit
    : query
    ;

/* SPARQL 1.1 [2] */
/* SPARQL 1.0 [1] */
// query

/* SPARQL 1.1 [3] */
updateUnit
    : update
    ;

/* SPARQL 1.1 [4] */
/* SPARQL 1.0 [2] */
prologue
    : ( baseDecl | prefixDecl)*
    ;

/* SPARQL 1.1 [5] */
/* SPARQL 1.0 [3] */
// baseDecl

/* SPARQL 1.1 [6] */
/* SPARQL 1.0 [4] */
// prefixDecl

/* SPARQL 1.1 [7] */
selectQuery
    : selectClause datasetClause* whereClause solutionModifier
    ;

/* SPARQL 1.1 [8] */
subSelect
    : selectClause whereClause solutionModifier valuesClause
    ;

/* SPARQL 1.1 [9] */
  	// SelectClause	  ::=  	'SELECT' ( 'DISTINCT' | 'REDUCED' )? ( ( Var | ( OPEN_BRACE Expression 'AS' Var CLOSE_BRACE ) )+ | '*' )
selectClause :
    SELECT ( DISTINCT | REDUCED )? ( (var | ( OPEN_BRACE expression AS var CLOSE_BRACE ) )+ | STAR )

/* SPARQL 1.1 [10] */
 	//ConstructQuery	  ::=  	'CONSTRUCT' ( ConstructTemplate DatasetClause* WhereClause SolutionModifier | DatasetClause* 'WHERE' OPEN_CURLY_BRACE TriplesTemplate? CLOSE_CURLY_BRACE SolutionModifier )
constructQuery
    : CONSTRUCT ( constructTemplate datasetClause* whereClause solutionModifier | datasetClause* WHERE OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE solutionModifier )
    ;

/* SPARQL 1.1 [11] */
  	//DescribeQuery	  ::=  	'DESCRIBE' ( VarOrIri+ | '*' ) DatasetClause* WhereClause? SolutionModifier
describequery
    : DESCRIBE ( varOrIri+ | ASTERISK ) datasetClause* whereClause? solutionModifier
    ;

/* SPARQL 1.1 [12] */
 	//AskQuery	  ::=  	'ASK' DatasetClause* WhereClause SolutionModifier
askQuery
    : ASK datasetClause* whereClause solutionModifier
    ;


/* SPARQL 1.1 [13] */
 	// DatasetClause	  ::=  	'FROM' ( DefaultGraphClause | NamedGraphClause )
datasetClause
    : FROM ( defaultGraphClasue | namedGraphClause )
    ;

/* SPARQL 1.1 [14] */
 	// DefaultGraphClause	  ::=  	SourceSelector
defaultGraphClause
    : sourceSelector
    ;

/* SPARQL 1.1 [15] */
	// NamedGraphClause	  ::=  	'NAMED' SourceSelector
namedGraphClause
    : NAMED sourceSelector
    ;

/* SPARQL 1.1 [16] */
 	// SourceSelector	  ::=  	iri
sourceSelector
    : IRI
    ;

/* SPARQL 1.1 [17] */
 	// WhereClause	  ::=  	'WHERE'? GroupGraphPattern
whereClause
    : WHERE? groupGraphPattern
    ;

/* SPARQL 1.1 [18] */
 	// SolutionModifier	  ::=  	GroupClause? HavingClause? OrderClause? LimitOffsetClauses?
solutionModifier
    : groupClause? havingClause? orderClause? limitOffsetaClauses?
    ;

/* SPARQL 1.1 [19] */
  	// GroupClause	  ::=  	'GROUP' 'BY' GroupCondition+
groupClause
    : GROUP BY groupCondition+
    ;

/* SPARQL 1.1 [20] */
 	// GroupCondition	  ::=  	BuiltInCall | FunctionCall | OPEN_BRACE Expression ( 'AS' Var )? CLOSE_BRACE | Var
groupCondition
    : builtInCall
    | functionCall
    | OPEN_BRACE expression ( AS var )? CLOSE_BRACE
    | var
    ;

/* SPARQL 1.1 [21] */
  	// HavingClause	  ::=  	'HAVING' HavingCondition+
havingClause
    : HAVING havingCondition+
    ;

/* SPARQL 1.1 [22] */
  	// HavingCondition	  ::=  	Constraint
havingCondition
    : constraint
    ;

/* SPARQL 1.1 [23] */
  	// OrderClause	  ::=  	'ORDER' 'BY' OrderCondition+
orderClause
    : ORDER BY orderCondition
    ;

/* SPARQL 1.1 [24] */
  	// OrderCondition	  ::=  	( ( 'ASC' | 'DESC' ) BrackettedExpression ) | ( Constraint | Var )
orderCondition
    : ( ( ASC | DESC ) brackettedExpression )
    | ( constraint | var )
    ;

/* SPARQL 1.1 [25] */
  	// LimitOffsetClauses	  ::=  	LimitClause OffsetClause? | OffsetClause LimitClause?
limitOffsetClauses
    : limitClause offsetClause?
    | offsetClause limitClause?
    ;

/* SPARQL 1.1 [26] */
  	// LimitClause	  ::=  	'LIMIT' INTEGER
limitClause
    : LIMIT INTEGER
    ;

/* SPARQL 1.1 [27] */
  	// OffsetClause	  ::=  	'OFFSET' INTEGER
offsetClause
    : OFFSET INTEGER
    ;

/* SPARQL 1.1 [28] */
  	//ValuesClause	  ::=  	( 'VALUES' DataBlock )?
values
    : ( VALUES dataBlock )?
    ;

/* SPARQL 1.1 [29] */
  	//Update	  ::=  	Prologue ( Update1 ( ';' Update )? )?
update
    : prologue ( update1 ( ';' update )? )?
    ;

/* SPARQL 1.1 [30] */
  	//Update1	  ::=  	Load | Clear | Drop | Add | Move | Copy | Create | InsertData | DeleteData | DeleteWhere | Modify
update1
    : load
    | clear
    | drop
    | add
    | move
    | copy
    | create
    | insertdata
    | deletedata
    | deletewhere
    | modify
    ;

/* SPARQL 1.1 [31] */
  	//Load	  ::=  	'LOAD' 'SILENT'? iri ( 'INTO' GraphRef )?
load
    : LOAD SILENT? iri ( INTO graphref )?
    ;

/* SPARQL 1.1 [32] */
//Clear	  ::=  	'CLEAR' 'SILENT'? GraphRefAll
clear
    : CLEAR SILENT? graphRefAll
    ;

/* SPARQL 1.1 [33] */
 // Drop	  ::=  	'DROP' 'SILENT'? GraphRefAll
drop
    : DROP SILENT? graphRefAll
    ;

/* SPARQL 1.1 [34] */
//Create	  ::=  	'CREATE' 'SILENT'? GraphRef
create
    : CREATE SILENT? gaphRef
    ;

/* SPARQL 1.1 [35] */
//Add	  ::=  	'ADD' 'SILENT'? GraphOrDefault 'TO' GraphOrDefault
add
    : ADD SILENT? graphOrDefault TO graphOrDefault
    ;

/* SPARQL 1.1 [36] */
// Move	  ::=  	'MOVE' 'SILENT'? GraphOrDefault 'TO' GraphOrDefault
move
    : MOVE SILIENT? graphOrDefault TO graphOrDefault
    ;

/* SPARQL 1.1 [37] */
//Copy	  ::=  	'COPY' 'SILENT'? GraphOrDefault 'TO' GraphOrDefault
copy
    : COPY SILENT? graphOrDefault TO graphOrDefault
    ;

/* SPARQL 1.1 [38] */
//InsertData	  ::=  	'INSERT DATA' QuadData
insertData
    : INSERT DATA quadData
    ;

/* SPARQL 1.1 [39] */
  	//DeleteData	  ::=  	'DELETE DATA' QuadData
deleteData
    : DELETE DATA quadData
    ;

/* SPARQL 1.1 [40] */
 	//DeleteWhere	  ::=  	'DELETE WHERE' QuadPattern
deleteWhere
    : DELETE WHERE quadPattern
    ;

/* SPARQL 1.1 [41] */
  	//Modify	  ::=  	( 'WITH' iri )? ( DeleteClause InsertClause? | InsertClause ) UsingClause* 'WHERE' GroupGraphPattern
modify
    : ( WITH iri )? ( deleteClause insertClause? | insertClause ) usingClause* WHERE groupGraphPattern
    ;

/* SPARQL 1.1 [42] */
	//DeleteClause	  ::=  	'DELETE' QuadPattern
deleteClause
    : DELETE quadPattern
    ;

/* SPARQL 1.1 [43] */
	//InsertClause	  ::=  	'INSERT' QuadPattern
insertClause
    : INSERT quadPattern
    ;

/* SPARQL 1.1 [44] */
 	//UsingClause	  ::=  	'USING' ( iri | 'NAMED' iri )
usingClause
    : USING ( iri | NAMED iri )
    ;

/* SPARQL 1.1 [45] */
	//GraphOrDefault	  ::=  	'DEFAULT' | 'GRAPH'? iri
graphOrDefault
    : DEFAULT
    | GRAPH? iri
    ;

/* SPARQL 1.1 [46] */
 	//GraphRef	  ::=  	'GRAPH' iri
graphRef
    : GRAPH iri
    ;

/* SPARQL 1.1 [47] */
  	//GraphRefAll	  ::=  	GraphRef | 'DEFAULT' | 'NAMED' | 'ALL'
graphRefAll
    : graphRef
    | DEFAULT
    | NAMED
    | ALL
    ;

/* SPARQL 1.1 [48] */
 	//QuadPattern	  ::=  	OPEN_CURLY_BRACE Quads CLOSE_CURLY_BRACE
quadPattern
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.1 [49] */
 	//QuadData	  ::=  	OPEN_CURLY_BRACE Quads CLOSE_CURLY_BRACE
quadData
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.1 [50] */
  	//Quads	  ::=  	TriplesTemplate? ( QuadsNotTriples '.'? TriplesTemplate? )*
quads
    : triplesTemplate? ( quadsNotTriples DOT? triplesTemplate? )*
    ;

/* SPARQL 1.1 [51] */
  	//QuadsNotTriples	  ::=  	'GRAPH' VarOrIri OPEN_CURLY_BRACE TriplesTemplate? CLOSE_CURLY_BRACE
quadsNotTriples
    : GRAPH varorIri OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE
    ;

/* SPARQL 1.1 [52] */
  	//TriplesTemplate	  ::=  	TriplesSameSubject ( '.' TriplesTemplate? )?
triplesTemplate
    : triplesSameSubject ( DOT triplesTemplate? )?
    ;

/* SPARQL 1.1 [53] */
  	//GroupGraphPattern	  ::=  	OPEN_CURLY_BRACE ( SubSelect | GroupGraphPatternSub ) CLOSE_CURLY_BRACE
groupGraphPattern
 	: OPEN_CURLY_BRACE ( subSelect | groupGraphPatternSub ) CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [54] */
 	//GroupGraphPatternSub	  ::=  	TriplesBlock? ( GraphPatternNotTriples '.'? TriplesBlock? )* SPARQL 1.1
groupGraphPatternSub
 	: triplesBlock? (graphPatternnotTriples DOT? triplesBlock? )*
 	;

/* SPARQL 1.1 [55] */
  	//TriplesBlock	  ::=  	TriplesSameSubjectPath ( '.' TriplesBlock? )?
triplesBlock
 	: triplesSameSubjectPath ( DOT triplesBlock? )?
 	;

/* SPARQL 1.1 [56] */
  	//GraphPatternNotTriples	  ::=  	GroupOrUnionGraphPattern | OptionalGraphPattern | MinusGraphPattern | GraphGraphPattern | ServiceGraphPattern | Filter | Bind | InlineData
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
  	//OptionalGraphPattern	  ::=  	'OPTIONAL' GroupGraphPattern
optionalGraphPattern
 	: OPTIONAL groupGraphPattern
 	;

/* SPARQL 1.1 [58] */
  	//GraphGraphPattern	  ::=  	'GRAPH' VarOrIri GroupGraphPattern
graphGraphPattern
 	: GRAPH varOrIri groupGraphPattern
 	;

/* SPARQL 1.1 [59] */
  	//ServiceGraphPattern	  ::=  	'SERVICE' 'SILENT'? VarOrIri GroupGraphPattern
serviceGraphPattern
 	: SERVICE SILIENT? varOrIri groupGraphPattern
 	;

/* SPARQL 1.1 [60] */
  	//Bind	  ::=  	'BIND' OPEN_BRACE Expression 'AS' Var CLOSE_BRACE
bind
 	: BIND OPEN_BRACE expression AS var CLOSE_BRACE
 	;

/* SPARQL 1.1 [61] */
  	//InlineData	  ::=  	'VALUES' DataBlock
inlineData
 	: VALUES dataBlock
 	;

/* SPARQL 1.1 [62] */
  	//DataBlock	  ::=  	InlineDataOneVar | InlineDataFull
dataBlock
 	: inlineDataOneVar
 	| inlineDataFull
 	;

/* SPARQL 1.1 [63] */
  	//InlineDataOneVar	  ::=  	Var OPEN_CURLY_BRACE DataBlockValue* SPARQL 1.1 CLOSE_CURLY_BRACE
inlineDataOneVar
 	: var OPEN_CURLY_BRACE dataBlockValue* CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [64] */
  	//InlineDataFull	  ::=  	( NIL | OPEN_BRACE Var* SPARQL 1.1 CLOSE_BRACE ) OPEN_CURLY_BRACE ( '(' DataBlockValue* ')' | NIL )* CLOSE_CURLY_BRACE
inlineDataFull
  	: ( NIL | OPEN_BRACE var* CLOSE_BRACE ) OPEN_CURLY_BRACE ( '(' dataBlockValue* ')' | NIL )* CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [65] */
  	//DataBlockValue	  ::=  	iri |	RDFLiteral |	NumericLiteral |	BooleanLiteral |	'UNDEF'
dataBlockValue
 	: iri
 	| rdfLiteral
 	| numericLiteral
 	| booleanLiteral
 	| UNDEF
 	;

/* SPARQL 1.1 [66] */
  	//MinusGraphPattern	  ::=  	'MINUS' GroupGraphPattern
minusGraphPattern
 	: MINUS groupGraphPattern
 	;

/* SPARQL 1.1 [67] */
  	//GroupOrUnionGraphPattern	  ::=  	GroupGraphPattern ( 'UNION' GroupGraphPattern )* SPARQL 1.1
groupOrUnionGraphPattern
 	: groupGraphPattern ( UNION groupGraphPattern )*
 	;

/* SPARQL 1.1 [68] */
 	//Filter	  ::=  	'FILTER' Constraint
filter
 	: FILTER constriant
 	;

/* SPARQL 1.1 [69] */
 	//Constraint	  ::=  	BrackettedExpression | BuiltInCall | FunctionCall
constraint
 	: brackettedExpression
 	| builtInCall
 	| functionCall
 	;

/* SPARQL 1.1 [70] */
  	//FunctionCall	  ::=  	iri ArgList
functionCall
 	: iri argList
 	;

/* SPARQL 1.1 [71] */
  	//ArgList	  ::=  	NIL | OPEN_BRACE 'DISTINCT'? Expression ( ',' Expression )* SPARQL 1.1 CLOSE_BRACE
argList
 	: NIL
 	| OPEN_BRACE DISTINCT? expression ( COMMA expression )* CLOSE_BRACE
 	;

/* SPARQL 1.1 [72] */
  	//ExpressionList	  ::=  	NIL | OPEN_BRACE Expression ( ',' Expression )* SPARQL 1.1 CLOSE_BRACE
expressionList
 	: NIL
 	| OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE
 	;

/* SPARQL 1.1 [73] */
  	//ConstructTemplate	  ::=  	OPEN_CURLY_BRACE ConstructTriples? CLOSE_CURLY_BRACE
constructTemplate
 	: OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE
 	;

/* SPARQL 1.1 [74] */
  	//ConstructTriples	  ::=  	TriplesSameSubject ( '.' ConstructTriples? )?
constructTriples
 	: triplesSameSubject ( DOT constructTriples? )?
 	;

/* SPARQL 1.1 [75] */
  	//TriplesSameSubject	  ::=  	VarOrTerm PropertyListNotEmpty |	TriplesNode PropertyList
triplesSameSubject
 	: varOrTerm propertyListNotEmpty
 	| triplesNode propertyList
 	;

/* SPARQL 1.1 [76] */
  	//PropertyList	  ::=  	PropertyListNotEmpty?
propertyList
 	: propertyListNotEmpty?
 	;

/* SPARQL 1.1 [77] */
  	//PropertyListNotEmpty	  ::=  	Verb ObjectList ( ';' ( Verb ObjectList )? )* SPARQL 1.1
propertyListNotEmpty
 	: verb objectList ( SEMICOLON ( verb objectList )? )*
 	;

/* SPARQL 1.1 [78] */
  	//Verb	  ::=  	VarOrIri | 'a'
verb
 	: varOrIri
 	| A
 	;

/* SPARQL 1.1 [79] */
  	//ObjectList	  ::=  	Object ( ',' Object )* SPARQL 1.1
objectList
 	: object ( COMMA object )*
 	;

/* SPARQL 1.1 [80] */
 	//Object	  ::=  	GraphNode
object
 	: graphNode
 	;

/* SPARQL 1.1 [81] */
 	//TriplesSameSubjectPath	  ::=  	VarOrTerm PropertyListPathNotEmpty |	TriplesNodePath PropertyListPath
triplesSameSubjectPath
 	: varOrTerm propertylistPathNotEmpty
 	| triplesNodePath propertyListPath
 	;

/* SPARQL 1.1 [82] */
 	//PropertyListPath	  ::=  	PropertyListPathNotEmpty?
propertyListPath
 	: propertyListPathNotEmpty?
 	;

/* SPARQL 1.1 [83] */
 	//PropertyListPathNotEmpty	  ::=  	( VerbPath | VerbSimple ) ObjectListPath ( ';' ( ( VerbPath | VerbSimple ) ObjectList )? )* SPARQL 1.1
propertyListPathNotEmpty
 	: ( verbPath | verbSimple ) objectListPath( SEMICOLON ( ( verbPath | verbSimple ) objectList )? )*
 	;

/* SPARQL 1.1 [84] */
 	//VerbPath	  ::=  	Path
verbPath
 	: path
 	;

/* SPARQL 1.1 [85] */
 	//VerbSimple	  ::=  	Var
verbSimple
 	: var
 	;

/* SPARQL 1.1 [86] */
  	//ObjectListPath	  ::=  	ObjectPath ( ',' ObjectPath )* SPARQL 1.1
objectListPath
  	: objectPath ( COMMA objectPath )*
 	;

/* SPARQL 1.1 [87] */
  	//ObjectPath	  ::=  	GraphNodePath
objectPath
 	: graphNodePath
 	;

/* SPARQL 1.1 [88] */
  	//Path	  ::=  	PathAlternative
path
 	: pathAlternative
 	;

/* SPARQL 1.1 [89] */
  	//PathAlternative	  ::=  	PathSequence ( '|' PathSequence )* SPARQL 1.1
pathAlternative
 	: pathSequence ( '|' pathSequence )*
 	;

/* SPARQL 1.1 [90] */
  	//PathSequence	  ::=  	PathEltOrInverse ( '/' PathEltOrInverse )* SPARQL 1.1
pathSequence
 	: pathEltOrInverse ( DIVIDE pathEltOrInverse ) *
 	;

/* SPARQL 1.1 [91] */
  	//PathElt	  ::=  	PathPrimary PathMod?
pathElt
 	: pathPrimary pathMod?
 	;

/* SPARQL 1.1 [92] */
  	//PathEltOrInverse	  ::=  	PathElt | '^' PathElt
pathEltOrInverse
 	: pathElt
 	| HAT pathElt
 	;

/* SPARQL 1.1 [93] */
  	//PathMod	  ::=  	'?' | '* SPARQL 1.1' | '+'
pathMod
 	: QUESTION_MARK
 	| ASTERISK
 	| PLUS
 	;

/* SPARQL 1.1 [94] */
  	//PathPrimary	  ::=  	iri | 'a' | '!' PathNegatedPropertySet | OPEN_BRACE Path CLOSE_BRACE
pathPrimary
 	: iri
 	| A
 	| BANG pathNegatedPropertySet
 	| OPEN_BRACE path CLOSE_BRACE
 	;

/* SPARQL 1.1 [95] */
  	//PathNegatedPropertySet	  ::=  	PathOneInPropertySet | OPEN_BRACE ( PathOneInPropertySet ( '|' PathOneInPropertySet )* SPARQL 1.1 )? CLOSE_BRACE
pathNegatedPropertySet
 	: pathOneInPropetySet
 	| OPEN_BRACE (pathOneInPropetySet ( PIPE pathOneInPropetySet )* )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [96] */
  	//PathOneInPropertySet	  ::=  	iri | 'a' | '^' ( iri | 'a' )
pathOneInPropetySet
 	: iri
 	| A
 	| HAT ( iri | A )
 	;

/* SPARQL 1.1 [97] */
  	//Integer	  ::=  	INTEGER
integer
 	: INTEGER
 	;

/* SPARQL 1.1 [98] */
  	//TriplesNode	  ::=  	Collection |	BlankNodePropertyList
triplesNode
 	: collection
 	| blankNodePropertyList
 	;

/* SPARQL 1.1 [99] */
  	//BlankNodePropertyList	  ::=  	OPEN_SQUARE_BRACE PropertyListNotEmpty CLOSE_SQUARE_BRACE
blankNodePropertyList
 	: OPEN_SQUARE_BRACE propertyListNotEmpty CLOSE_SQUARE_BRACE
 	;

/* SPARQL 1.1 [100] */
  	//TriplesNodePath	  ::=  	CollectionPath |	BlankNodePropertyListPath
triplesNodePath
 	: collecitonPath
 	| blankNodePropertyListPath
 	;

/* SPARQL 1.1 [101] */
  	//BlankNodePropertyListPath	  ::=  	OPEN_SQUARE_BRACE PropertyListPathNotEmpty CLOSE_SQUARE_BRACE
blankNodePropertyListPath
 	: OPEN_SQUARE_BRACE propertyListNotEmpty CLOSE_SQUARE_BRACE
 	;

/* SPARQL 1.1 [102] */
  	//Collection	  ::=  	OPEN_BRACE GraphNode+ CLOSE_BRACE
collection
 	: OPEN_BRACE graphNode+ CLOSE_BRACE
 	;

/* SPARQL 1.1 [103] */
  	//CollectionPath	  ::=  	OPEN_BRACE GraphNodePath+ CLOSE_BRACE
collectionPath
 	: OPEN_BRACE graphNodePath+ CLOSE_BRACE
 	;

/* SPARQL 1.1 [104] */
  	//GraphNode	  ::=  	VarOrTerm |	TriplesNode
graphNode
 	: varOrTerm
 	| triplesNode
 	;

/* SPARQL 1.1 [105] */
  	//GraphNodePath	  ::=  	VarOrTerm |	TriplesNodePath
graphNodePath
 	: varOrTerm
 	| triplesNodePath
 	;

/* SPARQL 1.1 [106] */
  	//VarOrTerm	  ::=  	Var | GraphTerm
varOrTerm
 	: var
 	| graphTerm
 	;

/* SPARQL 1.1 [107] */
  	//VarOrIri	  ::=  	Var | iri
varOrIri
 	: var
 	| iri
 	;

/* SPARQL 1.1 [108] */
  	//Var	  ::=  	VAR1 | VAR2
var
 	: VAR1
 	| VAR2
 	;

/* SPARQL 1.1 [109] */
  	//GraphTerm	  ::=  	iri |	RDFLiteral |	NumericLiteral |	BooleanLiteral |	BlankNode |	NIL
graphTerm
 	: iri
 	| rdfLiteral
 	| numericlLiteral
 	| booleanLiteral
 	| blankNode
 	| NIL
 	;

/* SPARQL 1.1 [110] */
  	//Expression	  ::=  	ConditionalOrExpression
expression
 	: conditionalOrExpression
 	;

/* SPARQL 1.1 [111] */
  	//ConditionalOrExpression	  ::=  	ConditionalAndExpression ( '||' ConditionalAndExpression )* SPARQL 1.1
conditionalOrExpression
 	: conditionalAndExpression ( OR conditionalAndExpression )*
 	;

/* SPARQL 1.1 [112] */
  	//ConditionalAndExpression	  ::=  	ValueLogical ( '&&' ValueLogical )* SPARQL 1.1
conditionalAndExpression
 	: valueLogical ( AND valueLogical )*
 	;

/* SPARQL 1.1 [113] */
  	//ValueLogical	  ::=  	RelationalExpression
valueLogical
 	: relationalExpression
 	;

/* SPARQL 1.1 [114] */
  	//RelationalExpression	  ::=  	NumericExpression ( '=' NumericExpression | '!=' NumericExpression | '<' NumericExpression | '>' NumericExpression | '<=' NumericExpression | '>=' NumericExpression | 'IN' ExpressionList | 'NOT' 'IN' ExpressionList )?
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
  	//NumericExpression	  ::=  	AdditiveExpression
numericExpression
 	: additiveExpression
 	;

/* SPARQL 1.1 [116] */
 	//AdditiveExpression	  ::=  	MultiplicativeExpression ( '+' MultiplicativeExpression | '-' MultiplicativeExpression | ( NumericLiteralPositive | NumericLiteralNegative ) ( ( '* SPARQL 1.1' UnaryExpression ) | ( '/' UnaryExpression ) )* )*
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
  	//MultiplicativeExpression	  ::=  	UnaryExpression ( '* SPARQL 1.1' UnaryExpression | '/' UnaryExpression )*
multiplicativeExpression
 	: unaryExpression ( ASTERISK unaryExpression | DIVIDE unaryExpression )*
 	;

/* SPARQL 1.1 [118] */
  	//UnaryExpression	  ::=  	  '!' PrimaryExpression |	'+' PrimaryExpression |	'-' PrimaryExpression |	PrimaryExpression
unaryExpression
 	: NOT   primaryExpression
 	| PLUS  primaryExpression
 	| MINUS primaryExpression
 	|       primaryExpression
 	;

/* SPARQL 1.1 [119] */
  	//PrimaryExpression	  ::=  	BrackettedExpression | BuiltInCall | iriOrFunction | RDFLiteral | NumericLiteral | BooleanLiteral | Var
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
  	//BrackettedExpression	  ::=  	OPEN_BRACE Expression CLOSE_BRACE
brackettedExpression
 	: OPEN_BRACE expression CLOSE_BRACE
 	;

/* SPARQL 1.1 [121] */
  	/* BuiltInCall	  ::=  	  Aggregate
|	'STR' OPEN_BRACE Expression CLOSE_BRACE
|	'LANG' OPEN_BRACE Expression CLOSE_BRACE
|	'LANGMATCHES' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'DATATYPE' OPEN_BRACE Expression CLOSE_BRACE
|	'BOUND' OPEN_BRACE Var CLOSE_BRACE
|	'IRI' OPEN_BRACE Expression CLOSE_BRACE
|	'URI' OPEN_BRACE Expression CLOSE_BRACE
|	'BNODE' ( OPEN_BRACE Expression CLOSE_BRACE | NIL )
|	'RAND' NIL
|	'ABS' OPEN_BRACE Expression CLOSE_BRACE
|	'CEIL' OPEN_BRACE Expression CLOSE_BRACE
|	'FLOOR' OPEN_BRACE Expression CLOSE_BRACE
|	'ROUND' OPEN_BRACE Expression CLOSE_BRACE
|	'CONCAT' ExpressionList
|	SubstringExpression
|	'STRLEN' OPEN_BRACE Expression CLOSE_BRACE
|	StrReplaceExpression
|	'UCASE' OPEN_BRACE Expression CLOSE_BRACE
|	'LCASE' OPEN_BRACE Expression CLOSE_BRACE
|	'ENCODE_FOR_URI' OPEN_BRACE Expression CLOSE_BRACE
|	'CONTAINS' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'STRSTARTS' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'STRENDS' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'STRBEFORE' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'STRAFTER' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'YEAR' OPEN_BRACE Expression CLOSE_BRACE
|	'MONTH' OPEN_BRACE Expression CLOSE_BRACE
|	'DAY' OPEN_BRACE Expression CLOSE_BRACE
|	'HOURS' OPEN_BRACE Expression CLOSE_BRACE
|	'MINUTES' OPEN_BRACE Expression CLOSE_BRACE
|	'SECONDS' OPEN_BRACE Expression CLOSE_BRACE
|	'TIMEZONE' OPEN_BRACE Expression CLOSE_BRACE
|	'TZ' OPEN_BRACE Expression CLOSE_BRACE
|	'NOW' NIL
|	'UUID' NIL
|	'STRUUID' NIL
|	'MD5' OPEN_BRACE Expression CLOSE_BRACE
|	'SHA1' OPEN_BRACE Expression CLOSE_BRACE
|	'SHA256' OPEN_BRACE Expression CLOSE_BRACE
|	'SHA384' OPEN_BRACE Expression CLOSE_BRACE
|	'SHA512' OPEN_BRACE Expression CLOSE_BRACE
|	'COALESCE' ExpressionList
|	'IF' OPEN_BRACE Expression ',' Expression ',' Expression CLOSE_BRACE
|	'STRLANG' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'STRDT' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'sameTerm' OPEN_BRACE Expression ',' Expression CLOSE_BRACE
|	'isIRI' OPEN_BRACE Expression CLOSE_BRACE
|	'isURI' OPEN_BRACE Expression CLOSE_BRACE
|	'isBLANK' OPEN_BRACE Expression CLOSE_BRACE
|	'isLITERAL' OPEN_BRACE Expression CLOSE_BRACE
|	'isNUMERIC' OPEN_BRACE Expression CLOSE_BRACE
|	RegexExpression
|	ExistsFunc
|	NotExistsFunc
*/
builtInCall
 	: aggregate
    | 'STR' OPEN_BRACE expression CLOSE_BRACE
    | 'LANG' OPEN_BRACE expression CLOSE_BRACE
    | 'LANGMATCHES' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'DATATYPE' OPEN_BRACE expression CLOSE_BRACE
    | 'BOUND' OPEN_BRACE var CLOSE_BRACE
    | 'IRI' OPEN_BRACE expression CLOSE_BRACE
    | 'URI' OPEN_BRACE expression CLOSE_BRACE
    | 'BNODE' ( OPEN_BRACE expression CLOSE_BRACE |  NIL )
    | 'RAND' NIL
    | 'ABS' OPEN_BRACE expression CLOSE_BRACE
    | 'CEIL' OPEN_BRACE expression CLOSE_BRACE
    | 'FLOOR' OPEN_BRACE expression CLOSE_BRACE
    | 'ROUND' OPEN_BRACE expression CLOSE_BRACE
    | 'CONCAT' expressionList
    | substringexpression
    | 'STRLEN' OPEN_BRACE expression CLOSE_BRACE
    | strReplaceexpression
    | 'UCASE' OPEN_BRACE expression CLOSE_BRACE
    | 'LCASE' OPEN_BRACE expression CLOSE_BRACE
    | 'ENCODE_FOR_URI' OPEN_BRACE expression CLOSE_BRACE
    | 'CONTAINS' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'STRSTARTS' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'STRENDS' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'STRBEFORE' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'STRAFTER' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'YEAR' OPEN_BRACE expression CLOSE_BRACE
    | 'MONTH' OPEN_BRACE expression CLOSE_BRACE
    | 'DAY' OPEN_BRACE expression CLOSE_BRACE
    | 'HOURS' OPEN_BRACE expression CLOSE_BRACE
    | 'MINUTES' OPEN_BRACE expression CLOSE_BRACE
    | 'SECONDS' OPEN_BRACE expression CLOSE_BRACE
    | 'TIMEZONE' OPEN_BRACE expression CLOSE_BRACE
    | 'TZ' OPEN_BRACE expression CLOSE_BRACE
    | 'NOW' NIL
    | 'UUID' NIL
    | 'STRUUID' NIL
    | 'MD5' OPEN_BRACE expression CLOSE_BRACE
    | 'SHA1' OPEN_BRACE expression CLOSE_BRACE
    | 'SHA256' OPEN_BRACE expression CLOSE_BRACE
    | 'SHA384' OPEN_BRACE expression CLOSE_BRACE
    | 'SHA512' OPEN_BRACE expression CLOSE_BRACE
    | 'COALESCE' expressionList
    | 'IF' OPEN_BRACE expression ',' expression ',' expression CLOSE_BRACE
    | 'STRLANG' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'STRDT' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'sameTerm' OPEN_BRACE expression ',' expression CLOSE_BRACE
    | 'isIRI' OPEN_BRACE expression CLOSE_BRACE
    | 'isURI' OPEN_BRACE expression CLOSE_BRACE
    | 'isBLANK' OPEN_BRACE expression CLOSE_BRACE
    | 'isLITERAL' OPEN_BRACE expression CLOSE_BRACE
    | 'isNUMERIC' OPEN_BRACE expression CLOSE_BRACE
    | regexexpression
    | existsFunc
    | notExistsFunc
 	;

/* SPARQL 1.1 [122] */
  	//RegexExpression	  ::=  	'REGEX' OPEN_BRACE Expression ',' Expression ( ',' Expression )? CLOSE_BRACE
regexExpression
 	: 'REGEX' OPEN_BRACE expression ',' expression ( ',' expression )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [123] */
 	//SubstringExpression	  ::=  	'SUBSTR' OPEN_BRACE Expression ',' Expression ( ',' Expression )? CLOSE_BRACE
substringExpression
 	: 'SUBSTR' OPEN_BRACE expression ',' expression ( ',' expression )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [124] */
  	//StrReplaceExpression	  ::=  	'REPLACE' OPEN_BRACE Expression ',' Expression ',' Expression ( ',' Expression )? CLOSE_BRACE
strReplaceExpression
 	: 'REPLACE' OPEN_BRACE expression ',' expression ',' expression ( ',' expression )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [125] */
  	//ExistsFunc	  ::=  	'EXISTS' GroupGraphPattern
existsFunc
 	: 'EXISTS' groupGraphPattern
 	;

/* SPARQL 1.1 [126] */
  	//NotExistsFunc	  ::=  	'NOT' 'EXISTS' GroupGraphPattern
notExistsFunc
 	: 'NOT' 'EXISTS' groupGraphPattern
 	;

/* SPARQL 1.1 [127] */
  /*
  	Aggregate	  ::=  	  'COUNT' OPEN_BRACE 'DISTINCT'? ( '*' | Expression ) CLOSE_BRACE
| 'SUM' OPEN_BRACE 'DISTINCT'? Expression CLOSE_BRACE
| 'MIN' OPEN_BRACE 'DISTINCT'? Expression CLOSE_BRACE
| 'MAX' OPEN_BRACE 'DISTINCT'? Expression CLOSE_BRACE
| 'AVG' OPEN_BRACE 'DISTINCT'? Expression CLOSE_BRACE
| 'SAMPLE' OPEN_BRACE 'DISTINCT'? Expression CLOSE_BRACE
| 'GROUP_CONCAT' OPEN_BRACE 'DISTINCT'? Expression ( ';' 'SEPARATOR' '=' String )? CLOSE_BRACE
*/
aggregate
 	: COUNT        OPEN_BRACE DISTINCT? ( ASTERISK | expression ) CLOSE_BRACE
    | SUM          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | MIN          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | MAX          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | AVG          OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | SAMPLE       OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | GROUP_CONCAT OPEN_BRACE DISTINCT? expression ( SEMICOLON SEPARATOR EQUALS string )? CLOSE_BRACE
 	;

/* SPARQL 1.1 [128] */
 	//iriOrFunction	  ::=  	iri ArgList?
iriOrFunction
 	: iri argList?
 	;

/* SPARQL 1.1 [129] */
  	//RDFLiteral	  ::=  	String ( LANGTAG | ( '^^' iri ) )?
rdfLiteral
  	: string ( LANGTAG | ( REFERENCE iri ) )?
  	;

/* SPARQL 1.1 [130] */
  	//NumericLiteral	  ::=  	NumericLiteralUnsigned | NumericLiteralPositive | NumericLiteralNegative
numericLiteral
 	: numericLiteralUnsigned
 	| numericLiteralPositive
 	| numericLiteralNegative
 	;

/* SPARQL 1.1 [131] */
  	//NumericLiteralUnsigned	  ::=  	INTEGER |	DECIMAL |	DOUBLE
numericLiteralUnsigned
 	: INTEGER
 	| DECIMAL
    | DOUBLE
 	;

/* SPARQL 1.1 [132] */
  	//NumericLiteralPositive	  ::=  	INTEGER_POSITIVE |	DECIMAL_POSITIVE |	DOUBLE_POSITIVE
numericLiteralPositive
 	: INTEGER_POSITIVE
 	| DECIMAL_POSITIVE
 	| DOUBLE_POSITIVE
 	;

/* SPARQL 1.1 [133] */
  	//NumericLiteralNegative	  ::=  	INTEGER_NEGATIVE |	DECIMAL_NEGATIVE |	DOUBLE_NEGATIVE
numericLiteralNegative
 	: INTEGER_NEGATIVE
 	| DECIMAL_NEGATIVE
 	| DOUBLE_NEGATIVE
 	;

/* SPARQL 1.1 [134] */
  	//BooleanLiteral	  ::=  	'true' |	'false'
booleanLiteral
 	: TRUE
 	| FALSE
 	;

/* SPARQL 1.1 [135] */
  	//String	  ::=  	STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2
string
 	: STRING_LITERAL1
 	| STRING_LITERAL2
 	| STRING_LITERAL_LONG1
 	| STRING_LITERAL_LONG2
 	;

/* SPARQL 1.1 [136] */
  	//iri	  ::=  	IRIREF |	PrefixedName
iri
 	: IRI_REF
 	| prefixedName
 	;

/* SPARQL 1.1 [137] */
  	//PrefixedName	  ::=  	PNAME_LN | PNAME_NS
prefixedName
 	: PNAME_LN
 	| PNAME_NS
 	;

/* SPARQL 1.1 [138] */
  	//BlankNode	  ::=  	BLANK_NODE_LABEL |	ANON
blankNode
 	: BLANK_NODE_LABEL
 	| ANON
 	;

*/
