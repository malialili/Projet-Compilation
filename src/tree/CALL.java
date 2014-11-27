package tree;
public class CALL extends Exp {
  public Exp func;
  public ExpList args;
  public CALL(Exp f, ExpList a) {
      super();
      func=f; args=a;
  }
  
}

