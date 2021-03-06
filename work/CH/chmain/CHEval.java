/*
EIF400 loriacarlos@gmail.com
Ch evaluator
*/
import java.util.HashMap;
import java.util.Map;

public class CHEval extends CHExprBaseVisitor<Integer> {
    
    Map<String, Integer> memory = new HashMap<String, Integer>();

    
    @Override
    public Integer visitAssign(CHExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();  
        int value = visit(ctx.rexpr());   
        memory.put(id, value);        
        return value;
    }

    
    @Override
    public Integer visitPrintExpr(CHExprParser.PrintExprContext ctx) {
        Integer value = visit(ctx.rexpr());
        System.out.println(value);         
        return 0;                         
    }

    
    @Override
    public Integer visitNum(CHExprParser.NumContext ctx) {
        return Integer.valueOf(ctx.NUMBER().getText());
    }

    
    @Override
    public Integer visitId(CHExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) 
		   return memory.get(id);
        return 0;
    }

    
    @Override
    public Integer visitMulDiv(CHExprParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0)); 
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == CHExprParser.MUL) 
		   return left * right;
        return left / right; 
    }

    
    @Override
    public Integer visitAddSub(CHExprParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0)); 
        int right = visit(ctx.expr(1));
        if ( ctx.op.getType() == CHExprParser.ADD ) 
		   return left + right;
        return left - right; 
    }

    @Override 
    public Integer visitRelExpr(CHExprParser.RelExprContext ctx){
            int left = visit(ctx.rexpr(0)); 
            int right = visit(ctx.rexpr(1));
            if ( ctx.op.getType() == CHExprParser.LEQ ){
                if (left <= right) return 1;
                else return 0;
            }
            else 
                if( ctx.op.getType() == CHExprParser.EQU ) {
                    if(left == right) return 1;
                    else return 0;
                }
                else {
                    if(left == right) return 0;
                    else return 1;
                }
    }
    
    
    @Override 
    public Integer visitArith(CHExprParser.ArithContext ctx){
        return visit(ctx.expr());
    }
    
    @Override 
    public Integer visitTrue(CHExprParser.TrueContext ctx){
        return 1;
    }
    
    @Override 
    public Integer visitFalse(CHExprParser.FalseContext ctx){
        return 0;
    }
    
    @Override 
    public Integer visitNot(CHExprParser.NotContext ctx){
        if(visit(ctx.rexpr()) == 1)
            return 0;
        else
            return 1;
    }
    
    @Override
    public Integer visitParens(CHExprParser.ParensContext ctx) {
        return visit(ctx.rexpr());
    }
}
