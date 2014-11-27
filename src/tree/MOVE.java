package tree;


public class MOVE extends Stm {
  public Exp dst, src;
  public MOVE(Exp d, Exp s) {super(); dst=d; src=s;}
  public String toString(){return new String("MOVE("+dst.toString()+","+src.toString()+")");};
}

