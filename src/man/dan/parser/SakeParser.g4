grammar SakeParser;

import SakeLexer;

program
    : statement+
;

num_assign
    : SEISU ID '=' num_expr ENDEXPR
;

bool_assign
    : RONRI ID '=' bool_expr ENDEXPR
;

rippotai_assign
    : RIPPOTAI ID '=' num_expr ',' num_expr ',' num_expr ',' bool_expr ENDEXPR
;

hairetsu_assign
    : HAIRETSU ID '=' '{' num_expr (',' num_expr (',' num_expr)?)? '}'
;

assignment_stmt
    : num_assign
    | bool_assign
    | rippotai_assign
    | hairetsu_assign
;

declaration_stmt
    : (SEISU | RONRI | RIPPOTAI) ID ENDEXPR
;

jigen_stmt
    : JIGEN ID ENDEXPR
;

nagasa_stmt
    : NAGASA ID ENDEXPR
;

statement
    : assignment_stmt
    | declaration_stmt
    | jigen_stmt
    | nagasa_stmt
    | NEWLINE # blank
;



