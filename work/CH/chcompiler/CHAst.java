import java.io.*;
public interface CHAst{
  default void genCode(){
    genCode(System.out);
  }
  void genCode(PrintStream out);
}