package tree;
public class JUMP extends Stm {
  public Exp exp;
  public LabelList targets;
  public JUMP(Exp e, LabelList t) {super(); exp=e; targets=t;}
  public JUMP(Label target) {
      this(new NAME(target), new LabelList(target,null));
  }
  public String toString(){return new String("JUMP("+exp.toString()+")");};
}

