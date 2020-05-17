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

/* cube */
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

/* return */
MODORU
    : 'modoru'
;

SHUKI
    : 'shuki'
;

/* print */
SENDEN
    : 'senden'
;

/* types comparison */
RUIKEI
    : 'ruikei'
;

FIELD
    : '=>'
;

TOX
    : 'X'
;

TOY
    : 'Y'
;

TOZ
    : 'Z'
;

TOKABE
    : 'kabe'
;

PLUS
    : '+'
;

MINUS
    : '-'
;

GREATER
    : '>'
;

LESS
    : '<'
;

ID
    : [a-zA-Z_][a-zA-Z0-9_]*
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

UP
    : '^-^'
;

DOWN
    : 'v-v'
;

LEFTWARD
    : '<-<'
;

RIGHTWARD
    : '>->'
;

FORWARD
    : 'o-o'
;

BACK
    : '~-~'
;

BREAK
    : '>-<'
;

LOOKUP
    : '^-0'
;

LOOKDOWN
    : 'v-0'
;

LOOKLEFT
    : '<-0'
;

LOOKRIGHT
    : '>-0'
;

LOOKFW
    : 'o-0'
;

LOOKBACK
    : '~-0'
;