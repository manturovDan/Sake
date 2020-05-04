lexer grammar SakeLexer;

ID
    : [a-zA-Z][a-zA-Z0-9]*
;

fragment
INT_NON_NEG
    : [0-9]+
    | 'x' [0-9A-F]+
;

INT
    : ('-'|'+') INT_NON_NEG
;

/* int */
SEISU
    : 'seisu'
;

/* bool */
RONRI
    : 'ronri'
;

SHINRI
    : 'shinri'
;

USO
    : 'osu'
;

RIPPOTAI
    : 'rippotai'
;

HAIRETSU
    : 'hairetsu'
;

JIGEN
    : 'jigen'
;

NAGASA
    : 'nagasa'
;

NEWLINE
    : '\r'? '\n' -> skip
;

END_EXPR
    : ';'
;

WS
    : [ \t]+ -> skip
;

SHUSHI
    : 'SHUSHI'
;

END_BLOCK
    : SHUSHI END_EXPR
;