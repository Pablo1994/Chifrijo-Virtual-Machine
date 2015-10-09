import java.io.*;
public class CHLoad implements CHAst{
    private int k;
    public CHLoad(int k){
	   this.k=k;
	}
    public void genCode(PrintStream out){out.println("LD "+"#"+k+";");}
}