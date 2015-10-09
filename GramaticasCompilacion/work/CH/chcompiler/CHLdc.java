import java.io.*;
public class CHLdc implements CHAst{
    private int k;
    public CHLdc(int k){
	   this.k=k;
	}
    public void genCode(PrintStream out){out.println("LDC "+k+";");}
}