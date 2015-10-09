import java.io.*;
public class CHStore implements CHAst{
    private int k;
    public CHStore(int k){
	   this.k=k;
	}
    public void genCode(PrintStream out){out.println("STORE "+"#"+k+";");}
}