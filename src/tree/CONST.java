package tree;


public class CONST extends Exp {
  public int value;
  public CONST(int v) {super();
      value=v;}

    public String toString(){return new String("constante("+value+")");};
}

