grammar CHExpr;
/*
EIF400 loriacarlos@gmail.com
Adaptada del ejemplo de Parrt pag 39
*/
program:   statement+ ;

statement:   rexpr ';'                # stexpr
           | 'print' rexpr ';'        # printExpr
           | ID '=' rexpr ';'         # assign
           | ';'                      # blank
;
rexpr:
          expr                                      # Arith
        | '!' rexpr                                 # Not
        | rexpr (op=('<='|'=='|'!=') rexpr)         # relExpr 
        | '(' rexpr ')'                             # parens 
        | 'true'                                    # True
		| 'false'                                   # False
;
expr:     expr op=('*'|'/') expr            # MulDiv
       |  expr op=('+'|'-') expr            # AddSub
       |  NUMBER                            # num
       |  ID (formal)?                      # id
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
