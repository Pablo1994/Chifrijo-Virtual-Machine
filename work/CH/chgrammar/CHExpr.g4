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

expr:     expr op=('*'|'/') expr            # MulDiv
       |  expr op=('+'|'-') expr            # AddSub
       |  expr op=('<='|'=='|'!=') expr     # relExpr
       |  NUMBER                            # num
       |  ID (formal)?                      # id
       |  '(' expr ')'                      # parens
       |  '!' '(' relExp ')'                # Not
;
relExp:
    expr op=('<='|'=='|'!=') expr
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
LEQ :   '<='
;
NOT :   '!'
;
EQU :   '=='
;
DIF :   '!='
;
ID  :   [a-zA-Z_][a-zA-Z_0-9]* 
;      
NUMBER :   [0-9]+ 
;
constant: NUMBER | 'true' #ExprTrue | 'false' #ExprFalse
;
// Ignore
CML:   '/*' .*? '*/' -> skip
;
CSL : '//' .*? '\r'?'\n' -> skip
;         
WS  :   [ \t\r\n]+ -> skip
; 
