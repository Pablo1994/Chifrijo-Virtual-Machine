public interface CHEmiter {
  final CHAdd ADD = new CHAdd();
  final CHMinus MINUS = new CHMinus();
  final CHPrint PRINT = new CHPrint();
  final CHReturn RET = new CHReturn();
  final CHMul MUL = new CHMul();
  final CHDiv DIV = new CHDiv();
  final CHLeq LEQ = new CHLeq();
  final CHEqu EQU = new CHEqu();
  final CHDif DIF = new CHDif();
  final CHNot NOT = new CHNot();
  final CHCall CALL = new CHCall();
  final CHTrue TRUE = new CHTrue();
  final CHFalse FALSE = new CHFalse();
  default CHLdic LDIC(int k){return new CHLdic(k);}
  default CHLdbc LDBC(boolean k){return new CHLdbc(k);}
  default CHLoad LD(int k){return new CHLoad(k);}
  default CHStore STORE(int k){return new CHStore(k);}
    
}