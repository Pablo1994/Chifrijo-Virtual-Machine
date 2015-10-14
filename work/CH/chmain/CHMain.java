/*
EIF400 loriacarlos@gmail.com
CH Controller
*/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class CHMain {
    public static void main(String[] args) throws Exception {
		// Process command line args
        String inputFile = null;
        if (args.length > 0) 
		  inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null){
 		   is = new FileInputStream(inputFile);
		   System.out.println("Reading from "+inputFile);
		} else{
		   System.out.println("Reading from console (enter CTRL-Z+ENTER to finish");
		}
		// Create Lexer and Parser
        ANTLRInputStream input = new ANTLRInputStream(is);
        CHExprLexer lexer = new CHExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CHExprParser parser = new CHExprParser(tokens);
		// Create AST
        ParseTree tree = parser.program(); 
		// Evaluate tree
        System.out.println("CH EVALUATION STARTS");
        CHEval eval = new CHEval();
        eval.visit(tree);
		// Compile tree
		System.out.println("CH COMPILATION STARTS");
		CHCompiler comp = new CHCompiler();
		comp.compile(tree);
		comp.genCode();
		
    }
}
