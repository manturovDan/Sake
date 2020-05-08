grammar SakeParser;

program
    : statement+
;

statement
    : assignment_stmt
    | declaration_stmt
    | return_stmt
    | def_stmt
    | jigen_stmt
    | nagasa_stmt
    | call_stmt
    | function
    | condition
    | cycle
    | COMMENT
    | NEWLINE
;


constant
    : INT
    | SHINRI
    | OSU
;

expr
    : '-' expr
    | '~' expr
    | expr ('+'|'-') expr
    | expr ('<'|'>') expr
    | expr '^' expr
    | expr 'v' expr
    | constant
    | appeal
    | function_call
    | '(' expr ')'
;

num_assign
    : SEISU ID '=' expr ENDEXPR
;

bool_assign
    : RONRI ID '=' expr ENDEXPR
;

rippotai_assign
    : RIPPOTAI ID '=' expr ',' expr ',' expr ',' expr ENDEXPR
;

order
    : expr (',' expr)*
;

hairetsu_assign
    : HAIRETSU ID '=' '{' order '}'
;

appeal
    : ID ('[' order ']')?
;

assignment_stmt
    : num_assign
    | bool_assign
    | rippotai_assign
    | hairetsu_assign
;

type
    : SEISU | RONRI | RIPPOTAI | HAIRETSU
;

declaration_stmt
    : type ID ENDEXPR
;

def_stmt
    : appeal '=' expr ENDEXPR
;

jigen_stmt
    : JIGEN appeal ENDEXPR
;

nagasa_stmt
    : NAGASA appeal ENDEXPR
;

call_stmt
    : function_call ENDEXPR
;

return_stmt
    : MODURU expr ENDEXPR
;

params
    : (type ID (',' type ID)*)?
;

function
    : type KANSU ID '(' params ')' KIDO statement+ END_BLOCK
;

arguments
    : (expr (',' expr)*)?
;

condition
    : SORENARA expr KIDO statement+ END_BLOCK
;

cycle
    : SHUKI ID '=' expr ':' expr KIDO statement+ END_BLOCK
;

function_call
    : ID '(' arguments ')'
;

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
MODURU
    : 'modoru'
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
