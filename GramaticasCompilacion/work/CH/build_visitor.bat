call antlr4 -o chvisitor -no-listener -visitor chgrammar/CHExpr.g4 %*
javac -sourcepath chvisitor;chcompiler -d lib chmain/*.java


