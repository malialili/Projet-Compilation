package tree;
public class LABEL extends Stm { 
  public Label label;
  public LABEL(Label l) {super(); label=l;}
  public String toString(){return new String("LABEL("+label.toString()+")");};
}

