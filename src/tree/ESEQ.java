package tree;


public class ESEQ extends Exp {
  public Stm stm;
  public Exp exp;
  public ESEQ(Stm s, Exp e) {super();
      stm=s; exp=e;}
}

