lexer grammar SakeLexer;

INT
    : [0-9]+
    | 'x' [0-9A-F]+
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

/* condition */
SORENARA
    : 'sorenara'
;

SHUKI
    : 'shuki'
;

ID
    : [a-zA-Z][a-zA-Z0-9]*
;

NEWLINE
    : '\r'? '\n' -> skip
;

COMMENT
    : '#' ~( '\r' | '\n' )*
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
