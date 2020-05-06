grammar SakeParser;

import SakeLexer;

program
    : statement+
;

statement
    : assignment_stmt
    | declaration_stmt
    | def_stmt
    | jigen_stmt
    | nagasa_stmt
    | call_stmt
    | function
    | COMMENT
    | NEWLINE
;


constant
    : INT
    | SHINRI
    | OSU
;

expr
    :
    | '~' expr
    | expr ('+'|'-') expr
    | expr ('<'|'>') expr
    | expr '^' expr
    | expr 'v' expr
    | ID
    | constant
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
    : ID '=' expr ENDEXPR
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

params
    : (type ID (',' type ID)*)?
;

function
    : KANSU type ID '(' params ')' KIDO statement+ END_BLOCK
;

arguments
    : (expr (',' expr)*)?
;

function_call
    : ID '(' arguments ')'
;