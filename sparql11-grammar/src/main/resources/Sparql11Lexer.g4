grammar Sparql11Lexer;

import Sparql10Lexer;

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

STR
    : ('S'|'s')('T'|'t')('R'|'r')
    ;

LANG
    :('L'|'l')('A'|'a')('N'|'n')('G'|'g')
    ;

LANGMATCHES
    :('L'|'l')('A'|'a')('N'|'n')('G'|'g')('M'|'m')('A'|'a')('T'|'t')('C'|'c')('H'|'h')('E'|'e')('S'|'s')
    ;

DATATYPE
    :('D'|'d')('A'|'a')('T'|'t')('A'|'a')('T'|'t')('Y'|'y')('P'|'p')('E'|'e')
    ;

BOUND
    :('B'|'b')('O'|'o')('U'|'u')('N'|'n')('D'|'d')
    ;

IRI
    :('I'|'i')('R'|'r')('I'|'i')
    ;

URI
    :('U'|'u')('R'|'r')('I'|'i')
    ;

BNODE
    :('B'|'b')('N'|'n')('O'|'o')('D'|'d')('E'|'e')
    ;

RAND
    :('R'|'r')('A'|'a')('N'|'n')('D'|'d')
    ;

ABS
    :('A'|'a')('B'|'b')('S'|'s')
    ;

CEIL
    :('C'|'c')('E'|'e')('I'|'i')('L'|'l')
    ;

FLOOR
    :('F'|'f')('L'|'l')('O'|'o')('O'|'o')('R'|'r')
    ;

ROUND
    :('R'|'r')('O'|'o')('U'|'u')('N'|'n')('D'|'d')
    ;

CONCAT
    :('C'|'c')('O'|'o')('N'|'n')('C'|'c')('A'|'a')('T'|'t')
    ;

STRLEN
    :('S'|'s')('T'|'t')('R'|'r')('L'|'l')('E'|'e')('N'|'n')
    ;

UCASE
    :('U'|'u')('C'|'c')('A'|'a')('S'|'s')('E'|'e')
    ;

LCASE
    :('L'|'l')('C'|'c')('A'|'a')('S'|'s')('E'|'e')
    ;

ENCODE_FOR_URI
    :('E'|'e')('N'|'n')('C'|'c')('O'|'o')('D'|'d')'_'('F'|'f')('O'|'o')('R'|'r')'_'('U'|'u')('R'|'r')('I'|'i')
    ;

CONTAINS
    :('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s')
    ;

STRSTARTS
    :('S'|'s')('T'|'t')('R'|'r')('S'|'s')('T'|'t')('A'|'a')('R'|'r')('T'|'t')('S'|'s')
    ;

STRENDS
    :('S'|'s')('T'|'t')('R'|'r')('E'|'e')('N'|'n')('D'|'d')('S'|'s')
    ;

STRBEFORE
    :('S'|'s')('T'|'t')('R'|'r')('B'|'b')('E'|'e')('F'|'f')('O'|'o')('R'|'r')('E'|'e')
    ;

STRAFTER
    :('S'|'s')('T'|'t')('R'|'r')('A'|'a')('F'|'f')('T'|'t')('E'|'e')('R'|'r')
    ;

YEAR
    :('Y'|'y')('E'|'e')('A'|'a')('R'|'r')
    ;

MONTH
    :('M'|'m')('O'|'o')('N'|'n')('T'|'t')('H'|'h')
    ;

DAY
    :('D'|'d')('A'|'a')('Y'|'y')
    ;

HOURS
    :('H'|'h')('O'|'o')('U'|'u')('R'|'r')('S'|'s')
    ;

MINUTES
    :('M'|'m')('I'|'i')('N'|'n')('U'|'u')('T'|'t')('E'|'e')('S'|'s')
    ;

SECONDS
    :('S'|'s')('E'|'e')('C'|'c')('O'|'o')('N'|'n')('D'|'d')('S'|'s')
    ;

TIMEZONE
    :('T'|'t')('I'|'i')('M'|'m')('E'|'e')('Z'|'z')('O'|'o')('N'|'n')('E'|'e')
    ;

TZ
    :('T'|'t')('Z'|'z')
    ;

NOW
    :('N'|'n')('O'|'o')('W'|'w')
    ;

UUID
    :('U'|'u')('U'|'u')('I'|'i')('D'|'d')
    ;

STRUUID
    :('S'|'s')('T'|'t')('R'|'r')('U'|'u')('U'|'u')('I'|'i')('D'|'d')
    ;

MD5
    :('M'|'m')('D'|'d')'5'
    ;

SHA1
    :('S'|'s')('H'|'h')('A'|'a')'1'
    ;

SHA256
    :('S'|'s')('H'|'h')('A'|'a')'2''5''6'
    ;

SHA384
    :('S'|'s')('H'|'h')('A'|'a')'3''8''4'
    ;

SHA512
    :('S'|'s')('H'|'h')('A'|'a')'5''1''2'
    ;

COALESCE
    :('C'|'c')('O'|'o')('A'|'a')('L'|'l')('E'|'e')('S'|'s')('C'|'c')('E'|'e')
    ;

IF
    :('I'|'i')('F'|'f')
    ;

STRLANG
    :('S'|'s')('T'|'t')('R'|'r')('L'|'l')('A'|'a')('N'|'n')('G'|'g')
    ;

STRDT
    :('S'|'s')('T'|'t')('R'|'r')('D'|'d')('T'|'t')
    ;

SAMETERM
    :('S'|'s')('A'|'a')('M'|'m')('E'|'e')('T'|'t')('E'|'e')('R'|'r')('M'|'m')
    ;

ISIRI
    :('I'|'i')('S'|'s')('I'|'i')('R'|'r')('I'|'i')
    ;

ISURI
    :('I'|'i')('S'|'s')('U'|'u')('R'|'r')('I'|'i')
    ;

ISBLANK
    :('I'|'i')('S'|'s')('B'|'b')('L'|'l')('A'|'a')('N'|'n')('K'|'k')
    ;

ISLITERAL
    :('I'|'i')('S'|'s')('L'|'l')('I'|'')('T'|'t')('E'|'e')('R'|'r')('A'|'a')('L'|'l')
    ;

ISNUMERIC
    :('I'|'i')('S'|'s')('N'|'n')('U'|'u')('M'|'m')('E'|'e')('R'|'r')('I'|'i')('C'|'c')
    ;

REGEX
    :('R'|'r')('E'|'e')('G'|'g')('E'|'e')('X'|'x')
    ;

SUBSTR
    :('S'|'s')('U'|'u')('B'|'b')('S'|'s')('T'|'t')('R'|'r')
    ;

REPLACE
    :('R'|'r')('E'|'e')('P'|'p')('L'|'l')('A'|'a')('C'|'c')('E'|'e')
    ;

EXISTS
    :('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('S'|'s')
    ;

NOT
    :('N'|'n')('O'|'o')('T'|'t')
    ;

COUNT
    :('C'|'c')('O'|'o')('U'|'u')('N'|'n')('T'|'t')
    ;

SUM
    :('S'|'s')('U'|'u')('M'|'m')
    ;

MIN
    :('M'|'m')('I'|'i')('N'|'n')
    ;

MAX
    :('M'|'m')('A'|'a')('X'|'x')
    ;

AVG
    :('A'|'a')('V'|'v')('G'|'g')
    ;

SAMPLE
    :('S'|'s')('A'|'a')('M'|'m')('P'|'p')('L'|'l')('E'|'e')
    ;

GROUP_CONCAT
    :('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p')'_'('C'|'c')('O'|'o')('N'|'n')('C'|'c')('A'|'a')('T'|'t')
    ;

SEPARATOR
    :('S'|'s')('E'|'e')('P'|'p')('A'|'a')('R'|'r')('A'|'a')('T'|'t')('O'|'o')('R'|'r')
    ;

