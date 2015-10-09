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
        int value = visit(ctx.expr());   
        memory.put(id, value);        
        return value;
    }

    
    @Override
    public Integer visitPrintExpr(CHExprParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr());
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
    public Integer visitParens(CHExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
