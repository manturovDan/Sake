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
    : '^_^'
;

DOWN
    : 'v_v'
;

LEFTWARD
    : '<_<'
;

RIGHTWARD
    : '>_>'
;

FORWARD
    : 'o_o'
;

BACK
    : '~_~'
;

BREAK
    : '>_<'
;

LOOKUP
    : '^_0'
;

LOOKDOWN
    : 'v_0'
;

LOOKLEFT
    : '<_0'
;

LOOKRIGHT
    : '>_0'
;

LOOKFW
    : 'o_0'
;

LLOKBACK
    : '~_0'
;