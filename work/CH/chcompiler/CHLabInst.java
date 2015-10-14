import java.io.*;
public class CHLabInst implements CHAst{
	static final int NULL = -1;
	int lab; CHAst inst;
	
	public CHLabInst(int lab, CHAst inst){
		this.lab = lab;
		this.inst = inst;
	}
	public CHLabInst(CHAst inst){
		this(NULL, inst);
	}
	public int getLab(){
		return this.lab;
	}
	public void setLab(int lab){
		this.lab = lab;
	}
    public void genCode(PrintStream out){
		if(this.lab != NULL)
		  out.print(this.lab + " : ");
		this.inst.genCode(out);
    }
}