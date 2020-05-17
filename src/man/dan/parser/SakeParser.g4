grammar SakeParser;

import SakeLexer;

program
    : statement+
;

statement
    : assignment_stmt
    | declaration_stmt
    | return_stmt
    | def_simp_stmt
    | jigen_stmt
    | call_stmt
    | senden_stmt
    | function
    | condition
    | cycle
    | robo_stmt
    | COMMENT
    | NEWLINE
;


constant
    : INT
    | SHINRI
    | OSU
;

expr
    : '-' expr                          #unMin
    | '~' expr                          #not
    | expr op=(PLUS|MINUS) expr         #plusMin
    | expr op=(LESS|GREATER) expr       #grLess
    | expr '^' expr                     #or
    | expr 'v' expr                     #and
    | constant                          #const
    | appeal                            #app
    | function_call                     #funCall
    | nagasa_expr                       #nagasa
    | '(' expr ')'                      #brackets
    | type_comp                         #ruikei
;

num_assign
    : SEISU ID '=' expr ENDEXPR
;

bool_assign
    : RONRI ID '=' expr ENDEXPR
;

block_coub
    : '[' expr ',' expr ',' expr ',' expr ']'
;

rippotai_assign
    : RIPPOTAI ID '=' (expr|block_coub) ENDEXPR
;

order
    : expr (',' expr)*
;

array_vals
    : '{' order '}'
;

hairetsu_assign
    : HAIRETSU ID '=' (expr|array_vals|robo_do) ENDEXPR
;

cube_attr
    : FIELD
    hand=(TOX
    | TOY
    | TOZ
    | TOKABE)
;

appeal
    : ID    (('[' order ']'
            | cube_attr)
            | ('[' order ']'
            cube_attr))?
;

assignment_stmt
    : num_assign
    | bool_assign
    | rippotai_assign
    | hairetsu_assign
;

type
    : t=(SEISU | RONRI | RIPPOTAI | HAIRETSU)
;

declaration_stmt
    : type ID ENDEXPR
;

r_value
    : (expr|array_vals|block_coub|robo_do)
;

def_simp_stmt
    : appeal '=' r_value ENDEXPR
;

jigen_stmt
    : JIGEN appeal ENDEXPR
;

nagasa_expr
    : NAGASA appeal
;

type_to_comp
    : (r_value|type|UNDEFINED)
;

type_comp
    : RUIKEI type_to_comp type_to_comp
;

senden_stmt
    : SENDEN (expr|r_value) ENDEXPR
;

call_stmt
    : function_call ENDEXPR
;

return_stmt
    : MODORU expr ENDEXPR
;

one_param
    : type ID
;

params
    : (one_param (',' one_param)*)?
;

function
    : type KANSU ID '(' params ')' KIDO statement+ END_BLOCK
;

arguments
    : (r_value (',' r_value)*)?
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

robo_action
    : UP
    | DOWN
    | LEFTWARD
    | RIGHTWARD
    | FORWARD
    | BACK
    | BREAK
    | LOOKUP
    | LOOKDOWN
    | LOOKLEFT
    | LOOKRIGHT
    | LOOKFW
    | LOOKBACK
;

robo_do
    : (robo_action | '{' robo_action (';' robo_action)* '}')
;

robo_stmt
    : robo_do ENDEXPR
;