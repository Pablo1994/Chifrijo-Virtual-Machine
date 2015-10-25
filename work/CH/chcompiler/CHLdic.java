import java.io.*;
public class CHLdic implements CHAst{
    private int k;
    public CHLdic(int k){
	   this.k=k;
	}
    public void genCode(PrintStream out){out.println("ldic "+k+";");}
}