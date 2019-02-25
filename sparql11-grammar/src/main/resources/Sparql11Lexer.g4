lexer grammar Sparql11Lexer;


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

/* [70]  SPARQL 1.0 */
/* [139] SPARQL 1.1 */
// IRI_REF

/* [71] SPARQL 1.0 */
/* [140] SPARQL 1.1 */
// PNAME_NS

/* [72] SPARQL 1.0 */
/* [141] SPARQL 1.1 */
// PNAME_LN

/* [73] SPARQL 1.0 */
/* [142] SPARQL 1.1 */
// BLANK_NODE_LABEL

/* [74] SPARQL 1.0 */
/* [143] SPARQL 1.1 */
// VAR1

/* [75] SPARQL 1.0 */
/* [144] SPARQL 1.1 */
// VAR2

/* [76] SPARQL 1.0 */
/* [145] SPARQL 1.1 */
// LANGTAG

/* [77] SPARQL 1.0 */
/* [146] SPARQL 1.1 */
// INTEGER

/* [78] SPARQL 1.0 */
/* [147] SPARQL 1.1 */
// DECIMAL

/* [79] SPARQL 1.0 */
/* [148] SPARQL 1.1 */
// DOUBLE

/* [80] SPARQL 1.0 */
/* [149] SPARQL 1.1 */
// INTEGER_POSITIVE

/* [81] SPARQL 1.0 */
/* [150] SPARQL 1.1 */
// DECIMAL_POSITIVE

/* [82] SPARQL 1.0 */
/* [151] SPARQL 1.1 */
// DOUBLE_POSITIVE

/* [83] SPARQL 1.0 */
/* [152] SPARQL 1.1 */
// INTEGER_NEGATIVE

/* [84] SPARQL 1.0 */
/* [153] SPARQL 1.1 */
// DECIMAL_NEGATIVE

/* [85] SPARQL 1.0 */
/* [154] SPARQL 1.1 */
// DOUBLE_NEGATIVE

/* [86] SPARQL 1.0 */
/* [155] SPARQL 1.1 */
// EXPONENT

/* [87] SPARQL 1.0 */
/* [156] SPARQL 1.1 */
// STRING_LITERAL1

/* [88] SPARQL 1.0 */
/* [157] SPARQL 1.1 */
// STRING_LITERAL2

/* [89] SPARQL 1.0 */
/* [158] SPARQL 1.1 */
// STRING_LITERAL_LONG1

/* [90] SPARQL 1.0 */
/* [159] SPARQL 1.1 */
// STRING_LITERAL_LONG2

/* [91] SPARQL 1.0 */
/* [160] SPARQL 1.1 */
// ECHAR

/* [92] SPARQL 1.0 */
/* [161] SPARQL 1.1 */
// NIL

/* [93] SPARQL 1.0 */
/* [162] SPARQL 1.1 */
// WS

/* [94] SPARQL 1.0 */
/* [163] SPARQL 1.1 */
// ANON

/* [95] SPARQL 1.0 */
/* [164] SPARQL 1.1 */
// PN_CHARS_BASE

/* [96] SPARQL 1.0 */
/* [165] SPARQL 1.1 */
//PN_CHARS_U

/* [97] SPARQL 1.0 */
/* [166] SPARQL 1.1 */
// VARNAME

/* [98] SPARQL 1.0 */
/* [167] SPARQL 1.1 */
// PN_CHARS

/* [99] SPARQL 1.0 */
/* [168] SPARQL 1.1 */
// PN_PREFIX

/* [100] SPARQL 1.0 */
/* [169] SPARQL 1.1 */
// PN_LOCAL

/* [170] SPARQL 1.1 */
PLX
    : PERCENT | PN_LOCAL_ESC
    ;

/* [171] SPARQL 1.1 */
PERCENT
    : '%' HEX HEX
    ;

/* [172] SPARQL 1.1 */
HEX
    : ('0'..'9')
    | ('A'..'F')
    | ('a'..'f')
    ;

/* [173] SPARQL 1.1 */
PN_LOCAL_ESC
    : '\\' ( '_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | '/' | '?' | '#' | '@' | '%' )
    ;

QUESTION_MARK
    : '?'
    ;

PIPE
    : '|'
    ;

HAT
    : '^'
    ;

BANG
    : '!'
    ;

IRI
    : ('I'|'i')('R'|'r')('I'|'i')
    ;

URI
    : ('U'|'u')('R'|'r')('I'|'i')
    ;

BNODE
    : ('B'|'b')('N'|'n')('O'|'o')('D'|'d')('E'|'e')
    ;

RAND
    : ('R'|'r')('A'|'a')('N'|'n')('D'|'d')
    ;

ABS
    : ('A'|'a')('B'|'b')('S'|'s')
    ;

CEIL
    : ('C'|'c')('E'|'e')('I'|'i')('L'|'l')
    ;

FLOOR
    : ('F'|'f')('L'|'l')('O'|'o')('O'|'o')('R'|'r')
    ;

ROUND
    : ('R'|'r')('O'|'o')('U'|'u')('N'|'n')('D'|'d')
    ;

CONCAT
    : ('C'|'c')('O'|'o')('N'|'n')('C'|'c')('A'|'a')('T'|'t')
    ;

STRLEN
    : ('S'|'s')('T'|'t')('R'|'r')('L'|'l')('E'|'e')('N'|'n')
    ;

UCASE
    : ('U'|'u')('C'|'c')('A'|'a')('S'|'s')('E'|'e')
    ;

LCASE
    : ('L'|'l')('C'|'c')('A'|'a')('S'|'s')('E'|'e')
    ;

ENCODE_FOR_URI
    : ('E'|'e')('N'|'n')('C'|'c')('O'|'o')('D'|'d')'_'('F'|'f')('O'|'o')('R'|'r')'_'('U'|'u')('R'|'r')('I'|'i')
    ;

CONTAINS
    : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s')
    ;

STRSTARTS
    : ('S'|'s')('T'|'t')('R'|'r')('S'|'s')('T'|'t')('A'|'a')('R'|'r')('T'|'t')('S'|'s')
    ;

STRENDS
    : ('S'|'s')('T'|'t')('R'|'r')('E'|'e')('N'|'n')('D'|'d')('S'|'s')
    ;

STRBEFORE
    : ('S'|'s')('T'|'t')('R'|'r')('B'|'b')('E'|'e')('F'|'f')('O'|'o')('R'|'r')('E'|'e')
    ;

STRAFTER
    : ('S'|'s')('T'|'t')('R'|'r')('A'|'a')('F'|'f')('T'|'t')('E'|'e')('R'|'r')
    ;

YEAR
    : ('Y'|'y')('E'|'e')('A'|'a')('R'|'r')
    ;

MONTH
    : ('M'|'m')('O'|'o')('N'|'n')('T'|'t')('H'|'h')
    ;

DAY
    : ('D'|'d')('A'|'a')('Y'|'y')
    ;

HOURS
    : ('H'|'h')('O'|'o')('U'|'u')('R'|'r')('S'|'s')
    ;

MINUTES
    : ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('T'|'t')('E'|'e')('S'|'s')
    ;

SECONDS
    : ('S'|'s')('E'|'e')('C'|'c')('O'|'o')('N'|'n')('D'|'d')('S'|'s')
    ;

TIMEZONE
    : ('T'|'t')('I'|'i')('M'|'m')('E'|'e')('Z'|'z')('O'|'o')('N'|'n')('E'|'e')
    ;

TZ
    : ('T'|'t')('Z'|'z')
    ;

NOW
    : ('N'|'n')('O'|'o')('W'|'w')
    ;

UUID
    : ('U'|'u')('U'|'u')('I'|'i')('D'|'d')
    ;

STRUUID
    : ('S'|'s')('T'|'t')('R'|'r')('U'|'u')('U'|'u')('I'|'i')('D'|'d')
    ;

MD5
    : ('M'|'m')('D'|'d')'5'
    ;

SHA1
    : ('S'|'s')('H'|'h')('A'|'a')'1'
    ;

SHA256
    : ('S'|'s')('H'|'h')('A'|'a')'2''5''6'
    ;

SHA384
    : ('S'|'s')('H'|'h')('A'|'a')'3''8''4'
    ;

SHA512
    : ('S'|'s')('H'|'h')('A'|'a')'5''1''2'
    ;

COALESCE
    : ('C'|'c')('O'|'o')('A'|'a')('L'|'l')('E'|'e')('S'|'s')('C'|'c')('E'|'e')
    ;

IF
    : ('I'|'i')('F'|'f')
    ;

STRLANG
    : ('S'|'s')('T'|'t')('R'|'r')('L'|'l')('A'|'a')('N'|'n')('G'|'g')
    ;

STRDT
    : ('S'|'s')('T'|'t')('R'|'r')('D'|'d')('T'|'t')
    ;

ISNUMERIC
    : ('I'|'i')('S'|'s')('N'|'n')('U'|'u')('M'|'m')('E'|'e')('R'|'r')('I'|'i')('C'|'c')
    ;

SUBSTR
    : ('S'|'s')('U'|'u')('B'|'b')('S'|'s')('T'|'t')('R'|'r')
    ;

REPLACE
    : ('R'|'r')('E'|'e')('P'|'p')('L'|'l')('A'|'a')('C'|'c')('E'|'e')
    ;

EXISTS
    : ('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('S'|'s')
    ;

NOT
    : ('N'|'n')('O'|'o')('T'|'t')
    ;

COUNT
    : ('C'|'c')('O'|'o')('U'|'u')('N'|'n')('T'|'t')
    ;

SUM
    : ('S'|'s')('U'|'u')('M'|'m')
    ;

MIN
    : ('M'|'m')('I'|'i')('N'|'n')
    ;

MAX
    : ('M'|'m')('A'|'a')('X'|'x')
    ;

AVG
    : ('A'|'a')('V'|'v')('G'|'g')
    ;

SAMPLE
    : ('S'|'s')('A'|'a')('M'|'m')('P'|'p')('L'|'l')('E'|'e')
    ;

GROUP_CONCAT
    : ('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p')'_'('C'|'c')('O'|'o')('N'|'n')('C'|'c')('A'|'a')('T'|'t')
    ;

SEPARATOR
    : ('S'|'s')('E'|'e')('P'|'p')('A'|'a')('R'|'r')('A'|'a')('T'|'t')('O'|'o')('R'|'r')
    ;

LOAD
    : ('L'|'l')('O'|'o')('A'|'a')('D'|'d')
    ;

ADD
    : ('A'|'a')('D'|'d')('D'|'d')
    ;

CLEAR
    : ('C'|'c')('L'|'l')('E'|'e')('A'|'a')('R'|'r')
    ;

DROP
    : ('D'|'d')('R'|'r')('O'|'o')('P'|'p')
    ;

CREATE
    : ('C'|'c')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e')
    ;

COPY
    : ('C'|'c')('O'|'o')('P'|'p')('Y'|'y')
    ;

INSERT
    : ('I'|'i')('N'|'n')('S'|'s')('E'|'e')('R'|'r')('T'|'t')
    ;

DELETE
    : ('D'|'d')('E'|'e')('L'|'l')('E'|'e')('T'|'t')('E'|'e')
    ;

SILENT
    : ('S'|'s')('I'|'i')('L'|'l')('E'|'e')('N'|'n')('T'|'t')
    ;

GROUP
    : ('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p')
    ;

HAVING
    : ('H'|'h')('A'|'a')('V'|'v')('I'|'i')('N'|'n')('G'|'g')
    ;

VALUES
    : ('V'|'v')('A'|'a')('L'|'l')('U'|'u')('E'|'e')('S'|'s')
    ;

INTO
    : ('I'|'i')('N'|'n')('T'|'t')('O'|'o')
    ;

TO
    : ('T'|'t')('O'|'o')
    ;

MOVE
    : ('M'|'m')('O'|'o')('V'|'v')('E'|'e')
    ;

DATA
    : ('D'|'d')('A'|'a')('T'|'t')('A'|'a')
    ;

USING
    : ('U'|'u')('S'|'s')('I'|'i')('N'|'n')('G'|'g')
    ;

DEFAULT
    : ('D'|'d')('E'|'e')('F'|'f')('A'|'a')('U'|'u')('L'|'l')('T'|'t')
    ;

ALL
    : ('A'|'a')('L'|'l')('L'|'l')
    ;

SERVICE
    : ('S'|'s')('E'|'e')('R'|'r')('V'|'v')('I'|'i')('C'|'c')('E'|'e')
    ;

BIND
    : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')
    ;

UNDEF
    : ('U'|'u')('N'|'n')('D'|'d')('E'|'e')('F'|'f')
    ;

IN
    : ('I'|'i')('N'|'n')
    ;

WITH
    : ('W'|'w')('I'|'i')('T'|'t')('H'|'h')
    ;
