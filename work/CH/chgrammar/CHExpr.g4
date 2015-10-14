grammar CHExpr;
/*
EIF400 loriacarlos@gmail.com
Adaptada del ejemplo de Parrt pag 39
*/
program:   statement+ ;

statement:   expr ';'                # printExpr
           | ID '=' expr ';'         # assign
           | ';'                     # blank
;

expr:     expr op=('*'|'/') expr      # MulDiv
       |  expr op=('+'|'-') expr      # AddSub
       |  NUMBER                      # num
       |  ID (formal)?                # id
       |  '(' expr ')'                # parens
;
formal : '(' expr ')'
;
MUL :   '*' 
; 
DIV :   '/' 
;
ADD :   '+' 
;
SUB :   '-' 
;
ID  :   [a-zA-Z_][a-zA-Z_0-9]* 
;      
NUMBER :   [0-9]+ 
;
// Ignore
CML:   '/*' .*? '*/' -> skip
;
CSL : '//' .*? '\r'?'\n' -> skip
;         
WS  :   [ \t\r\n]+ -> skip
; 
