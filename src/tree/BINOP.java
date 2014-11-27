package tree;

public class BINOP extends Exp {
    public int binop;
    public Exp left, right;
    public BINOP(int b, Exp l, Exp r) {
	super();
      	binop=b; left=l; right=r; 
    }
    public final static int PLUS=0, MINUS=1, MUL=2, DIV=3, 
	AND=4,OR=5,LSHIFT=6,RSHIFT=7,ARSHIFT=8,XOR=9;

    public String toString(){
	String result = new String();
	return result;
    };

    public void toDot(StringBuffer str){
    };
    
}

