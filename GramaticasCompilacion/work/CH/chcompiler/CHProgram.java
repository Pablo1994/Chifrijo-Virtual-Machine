import java.util.*;
import java.io.*;

class CHProgram extends ArrayList<CHAst> implements CHAst{
	protected int instrucction = 0;
	protected int inc(){
		return instrucction++;
	}
	public boolean add(CHAst inst){
		return super.add(new CHLabInst(inc() ,inst));
	}
	
	public void genCode(PrintStream out){
	   this.stream().forEach(a -> a.genCode(out));
	}
}