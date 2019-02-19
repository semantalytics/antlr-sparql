/*https://www.w3.org/TR/rdf-sparql-query/*/

/*
A.8 Grammar

The EBNF notation used in the grammar is defined in Extensible Markup Language (XML) 1.1 [XML11] section 6 Notation.

Keywords are matched in a case-insensitive manner with the exception of the keyword 'a' which, in line with Turtle and N3, is used in place of the IRI rdf:type (in full, http://www.w3.org/1999/02/22-rdf-syntax-ns#type).

Keywords:

Escape sequences are case sensitive.

When choosing a rule to match, the longest match is chosen.
*/

lexer grammar Sparql10Lexer;

//keywords

BASE
    : ('B'|'b')('A'|'a')('S'|'s')('E'|'e')
    ;

SELECT
    : ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t')
    ;

ORDER
    : ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r')
    ;

BY
    : ('B'|'b')('Y'|'y')
    ;

FROM
    : ('F'|'f')('R'|'r')('O'|'o')('M'|'m')
    ;

GRAPH
    : ('G'|'g')('R'|'r')('A'|'a')('P'|'p')('H'|'h')
    ;

STR
    : ('S'|'s')('T'|'t')('R'|'r')
    ;

ISURI
    : ('I'|'i')('S'|'s')('U'|'u')('R'|'r')('I'|'i')
    ;

PREFIX
    : ('P'|'p')('R'|'r')('E'|'e')('F'|'f')('I'|'i')('X'|'x')
    ;

CONSTRUCT
    : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('R'|'r')('U'|'u')('C'|'c')('T'|'t')
    ;

LIMIT
    : ('L'|'l')('I'|'i')('M'|'m')('I'|'i')('T'|'t')
    ;

ASC
    : ('A'|'a')('S'|'s')('C'|'c')
    ;

DESC
    : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')
    ;

NAMED
    : ('N'|'n')('A'|'a')('M'|'m')('E'|'e')('D'|'d')
    ;

OPTIONAL
    : ('O'|'o')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l')
    ;

LANG
    : ('L'|'l')('A'|'a')('N'|'n')('G'|'g')
    ;

ISIRI
    : ('I'|'i')('S'|'s')('I'|'i')('R'|'r')('I'|'i')
    ;

DESCRIBE
    : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('R'|'r')('I'|'i')('B'|'b')('E'|'e')
    ;

OFFSET
    : ('O'|'o')('F'|'f')('F'|'f')('S'|'s')('E'|'e')('T'|'t')
    ;

WHERE
    : ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e')
    ;

UNION
    : ('U'|'u')('N'|'n')('I'|'i')('O'|'o')('N'|'n')
    ;

LANGMATCHES
    : ('L'|'l')('A'|'a')('N'|'n')('G'|'g')('M'|'m')('A'|'a')('T'|'t')('C'|'c')('H'|'h')('E'|'e')('S'|'s')
    ;

ISLITERAL
    : ('I'|'i')('S'|'s')('L'|'l')('I'|'i')('T'|'t')('E'|'e')('R'|'r')('A'|'a')('L'|'l')
    ;

ASK
    : ('A'|'a')('S'|'s')('K'|'k')
    ;

DISTINCT
    : ('D'|'d')('I'|'i')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('C'|'c')('T'|'t')
    ;

FILTER
    : ('F'|'f')('I'|'i')('L'|'l')('T'|'t')('E'|'e')('R'|'r')
    ;

DATATYPE
    : ('D'|'d')('A'|'a')('T'|'t')('A'|'a')('T'|'t')('Y'|'y')('P'|'p')('E'|'e')
    ;

REGEX
    : ('R'|'r')('E'|'e')('G'|'g')('E'|'e')('X'|'x')
    ;

REDUCED
    : ('R'|'r')('E'|'e')('D'|'d')('U'|'u')('C'|'c')('E'|'e')('D'|'d')
    ;
A
    : ('a')
    ;

BOUND
    : ('B'|'b')('O'|'o')('U'|'u')('N'|'n')('D'|'d')
    ;

TRUE
    : ('T'|'t')('R'|'r')('U'|'u')('E'|'e')
    ;

SAMETERM
    : ('S'|'s')('A'|'a')('M'|'m')('E'|'e')('T'|'t')('E'|'e')('R'|'r')('M'|'m')
    ;

FALSE
    : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e')
    ;

AS
	: ('A'|'a')('S'|'s')
	;

ISBLANK
    : ('I'|'i')('S'|'s')('B'|'b')('L'|'l')('A'|'a')('N'|'n')('K'|'k')
    ;


COMMENT
    : '#' .*? EOL -> channel(HIDDEN)
    ;

ASTERISK
    : '*'
    ;

DOT
    : '.'
    ;

OPEN_CURLY_BRACE
	: '{'
	;

CLOSE_CURLY_BRACE
	: '}'
	;

SEMICOLON
    : ';'
    ;

COMMA
    : ','
    ;

OPEN_BRACE
    : '('
    ;

CLOSE_BRACE
    : ')'
    ;

OPEN_SQUARE_BRACE
    : '['
    ;

CLOSE_SQUARE_BRACE
    : ']'
    ;

LESS_EQUAL
    : '<='
    ;

GREATER_EQUAL
    : '>='
    ;

NOT_EQUAL
    : '!='
    ;

NOT_SIGN
    : '!'
    ;
DIVIDE
    : '/'
    ;

EQUAL
    : '='
    ;

LESS
	: '<'
	;

GREATER
	: '>'
	;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

AND
    : '&&'
    ;

OR
    : '||'
    ;

REFERENCE
    : '^^'
    ;

/* fragments */

fragment
DIGIT
    : '0'..'9'
    ;

fragment
TAB
    : '\t'
    ;

fragment
EOL
    : EOL1 | EOL2
    ;

fragment
EOL1
    : '\n'
    ;

fragment
EOL2
    : '\r'
    ;

/* SPARQL 1.0 [70] */
IRI_REF
    : '<' ( ~( '<' | '>' | '"' | '{' | '}' | '|' | '^' | '\\' | '`' | '\u0000'..'\u0020') )*? '>'
    ;

/* SPARQL 1.0 [71] */
PNAME_NS
    : PN_PREFIX? ':'
    ;

/* SPARQL 1.0 [72] */
PNAME_LN
    : PNAME_NS PN_LOCAL
    ;

/* SPARQL 1.0 [73] */
BLANK_NODE_LABEL
    : '_:' PN_LOCAL
    ;

/* SPARQL 1.0 [74] */
VAR1
    : '?' VARNAME
    ;

/* SPARQL 1.0 [75] */
VAR2
    : '$' VARNAME
    ;

/* SPARQL 1.0 [76] */
LANGTAG
    : '@' (('a'..'z' | 'A'..'Z'))+ ('-' (('a'..'z' | 'A'..'Z')('0'..'9'))+)*?
    ;

/* SPARQL 1.0 [77] */
INTEGER
    : (DIGIT)+
    ;

/* SPARQL 1.0 [78] */
DECIMAL
    : (DIGIT)+ DOT (DIGIT)*
    | DOT (DIGIT)+
    ;

/* SPARQL 1.0 [79] */
DOUBLE
    : DIGIT+ DOT DIGIT* EXPONENT
    | DOT DIGIT+ EXPONENT
    | DIGIT+ EXPONENT
    ;

/* SPARQL 1.0 [80] */
INTEGER_POSITIVE
    : '+' INTEGER
    ;


/* SPARQL 1.0 [81] */
DECIMAL_POSITIVE
    : '+' DECIMAL
    ;

/* SPARQL 1.0 [82] */
DOUBLE_POSITIVE
    : '+' DOUBLE
    ;

/* SPARQL 1.0 [83] */
INTEGER_NEGATIVE
    : '-' INTEGER
    ;

/* SPARQL 1.0 [84] */
DECIMAL_NEGATIVE
    : '-' DECIMAL
    ;

/* SPARQL 1.0 [85] */
DOUBLE_NEGATIVE
    : '-' DOUBLE
    ;

/* SPARQL 1.0 [86] */
EXPONENT
    : ('e' | 'E') ('+' | '-')? ('0'..'9')+
    ;

/* SPARQL 1.0 [87] */
STRING_LITERAL1
    : '\'' ( ~('\u0027' | '\u005C' | '\u000A' | '\u000D') | ECHAR )*? '\''
    ;

/* SPARQL 1.0 [88] */
STRING_LITERAL2
    : '"'  ( ~('\u0022' | '\u005C' | '\u000A' | '\u000D') | ECHAR )*? '"'
    ;

/* SPARQL 1.0 [89] */
STRING_LITERAL_LONG1
    :   '\'\'\'' ( ( '\'' | '\'\'' )? ( ~( '\'' | '\\' ) | ECHAR ) )*? '\'\'\''
    ;

/* SPARQL 1.0 [90] */
STRING_LITERAL_LONG2
    : '"""' ( ( '"' | '""' )? ( ~( '"' | '\\' ) | ECHAR ) )*? '"""'
    ;

/* SPARQL 1.0 [91] */
ECHAR
    : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'')
    ;

/* SPARQL 1.0 [92] */
NIL
    : '(' WS*? ')'
    ;

/* SPARQL 1.0 [93] */
WS
    : (' ' | TAB | EOL) -> channel(HIDDEN)
    ;


/* SPARQL 1.0 [94] */
ANON
    : '[' WS*? ']'
    ;

/* SPARQL 1.0 [95] */
PN_CHARS_BASE
    : 'A'..'Z'
    | 'a'..'z'
    | '\u00C0'..'\u00D6'
    | '\u00D8'..'\u00F6'
    | '\u00F8'..'\u02FF'
    | '\u0370'..'\u037D'
    | '\u037F'..'\u1FFF'
    | '\u200C'..'\u200D'
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

/* SPARQL 1.0 [96] */
PN_CHARS_U
    : PN_CHARS_BASE | '_'
    ;

/* SPARQL 1.0 [97] */
VARNAME
    : ( PN_CHARS_U | ('0'..'9') ) ( PN_CHARS_U | ('0'..'9') | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' )*
    ;

/* SPARQL 1.0 [98] */
PN_CHARS
    : PN_CHARS_U
    | '-'
    | ('0'..'9')
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

/* SPARQL 1.0 [99] */
PN_PREFIX
    : PN_CHARS_BASE ((PN_CHARS|DOT)* PN_CHARS)?
    ;

/* SPARQL 1.0 [100] */
PN_LOCAL
    : ( PN_CHARS_U | ('0'..'9') ) (( PN_CHARS | DOT)* PN_CHARS)?
    ;
