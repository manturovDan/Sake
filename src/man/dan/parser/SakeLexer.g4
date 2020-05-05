lexer grammar SakeLexer;

fragment

INT_NON_NEG
    : [0-9]+
    | 'x' [0-9A-F]+
;

INT
    : ('-'|'+')? INT_NON_NEG
;

/* int */
SEISU
    : 'seisu'
;

/* bool */
RONRI
    : 'ronri'
;

/* true */
SHINRI
    : 'shinri'
;

/* false */
OSU
    : 'osu'
;

/* coube */
RIPPOTAI
    : 'rippotai'
;

/* array */
HAIRETSU
    : 'hairetsu'
;

/* dimension */
JIGEN
    : 'jigen'
;

/* size */
NAGASA
    : 'nagasa'
;

SHUSHI
    : 'shushi'
;

KIDO
    : 'kido'
;

/* function */
KANSU
    : 'kansu'
;

ID
    : [a-zA-Z][a-zA-Z0-9]*
;

NEWLINE
    : '\r'? '\n' -> skip
;

ENDEXPR
    : ';'
;

WS
    : [ \t]+ -> skip
;

END_BLOCK
    : SHUSHI ENDEXPR
;
