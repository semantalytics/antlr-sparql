grammar SparqlLexer;

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
