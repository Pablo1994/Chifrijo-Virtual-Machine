grammar CHExpr;
/*
EIF400 loriacarlos@gmail.com
Adaptada del ejemplo de Parrt pag 39
*/
program:   statement+ ;

statement:   rexpr ';'                # printExpr
           | ID '=' rexpr ';'         # assign
           | ';'                     # blank
;
rexpr:
    expr (op=('<='|'=='|'!=') expr)?           # relExpr  
;
expr:     expr op=('*'|'/') expr            # MulDiv
       |  expr op=('+'|'-') expr            # AddSub
       |  NUMBER                            # num
       |  ID (formal)?                      # id
       |  '(' expr ')'                      # parens
       |  '!' '(' rexpr ')'                 # Not
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
