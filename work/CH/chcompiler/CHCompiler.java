
import java.util.*;
import java.util.stream.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


public class CHCompiler extends CHExprBaseVisitor<CHAst> implements CHEmiter{
     
    private CHProgram prog = new CHProgram();
	public CHProgram getProg(){return this.prog;}
	private Map<String, Integer> symbolTable = new HashMap<>();
	private int symbols = 0;
    CHProgram compile(ParseTree t){
	   this.visit(t);
	   return this.prog;
	}
	public void genCode(){
	   prog.genCode();
	}
    @Override
    public CHAst visitPrintExpr(CHExprParser.PrintExprContext ctx) {
        CHAst value = visit(ctx.expr());
        prog.add(PRINT);        
        return PRINT;                         
    }

    
    @Override
    public CHAst visitNum(CHExprParser.NumContext ctx) {
        CHAst ldc = LDC(Integer.valueOf(ctx.NUMBER().getText()));
		prog.add(ldc);
		return ldc; 
    }

    private int findSymbol(String id){
	   int k;
	   if (symbolTable.containsKey(id)) 
		   k = symbolTable.get(id);
		else {
		   k = symbols++;
		   symbolTable.put(id, k);
		}
		return k;
	}
	
    @Override
    public CHAst visitId(CHExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
		int k = findSymbol(id);
		CHExprParser.FormalContext fctx = ctx.formal();
		if(fctx != null)
		   visit(fctx);
        CHAst ld = LD(k);
		prog.add(ld);
		if(fctx != null){
		   CHAst c = CALL;
		   prog.add(c);
		   return c;
		}
		return ld;
    }

    @Override
    public CHAst visitAddSub(CHExprParser.AddSubContext ctx) {
        CHAst left = visit(ctx.expr(0)); 
        CHAst right = visit(ctx.expr(1));
		CHAst a = ( ctx.op.getType() == CHExprParser.ADD )? ADD : MINUS;
        prog.add(a);
		return a;
    }
	
	@Override
    public CHAst visitMulDiv(CHExprParser.MulDivContext ctx) {
        CHAst left = visit(ctx.expr(0)); 
        CHAst right = visit(ctx.expr(1));
		CHAst a = ( ctx.op.getType() == CHExprParser.MUL )?MUL:DIV;
        prog.add(a);
		return a;
    }

    @Override
    public CHAst visitAssign(CHExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();
		int k = findSymbol(id);
        CHAst value = visit(ctx.expr());   
        CHAst store = STORE(k);
        prog.add(store);		
        return store;
    }
    @Override
    public CHAst visitParens(CHExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
