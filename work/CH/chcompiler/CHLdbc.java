import java.io.*;
public class CHLdbc implements CHAst{
    private boolean k;
    public CHLdbc(boolean k){
	   this.k=k;
	}
    public void genCode(PrintStream out){out.println("ldbc "+k+";");}
}