package tree;

public class TEMP extends Exp {
  public Temp temp;
  public TEMP(Temp t) {super(); temp=t;}
  public String toString(){return new String("temporaire("+temp.toString()+")");};
}

