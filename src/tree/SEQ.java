package tree;
public class SEQ extends Stm {
    public Stm left, right;
    public SEQ(Stm l, Stm r) {super(); left=l; right=r; }


    public String toString(){return new String("SEQ("+left.toString()+","+right.toString()+")");};
}

