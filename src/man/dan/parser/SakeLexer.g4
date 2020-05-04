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

SHINRI
    : 'shinri'
;

OSU
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

SHUSHI
    : 'SHUSHI'
;

END_BLOCK
    : SHUSHI ENDEXPR
;