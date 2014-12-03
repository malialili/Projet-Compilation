package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeWHILE extends Stree {

    public StreeWHILE(Stree left, Stree right){
	super(EnumTag.WHILE, left, right, null);
    }
    
    /*
     
     private static Stm build(int rel, Exp e1, Exp e2, Stm st){
		Label L1=new Label();
		Label L2= new Label();
		Label end=new Label("end");	
		SEQ s= new SEQ(new LABEL(L1),
					new SEQ(new CJUMP(rel,e1,e2,L2,end),
						new SEQ(new LABEL(L2),
							new SEQ(st,
								new SEQ(new JUMP(L1),
										new LABEL(end))))));

		return s;

	}

	public Stm toStm(){
		int rel = 0;
		switch(left.getTag()){
			case EQ: rel=CJUMP.EQ;break;
			case LT: rel=CJUMP.LT;break;
			case GE: rel=CJUMP.GE;break;
			case GT: rel=CJUMP.GT;break;
			case LE: rel=CJUMP.LE;break;
			case DIFF: rel=CJUMP.NE;break;
		default: try {
				throw new Exception("bad relop in stren");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Exp e1= left.getLeft().toExp();
		Exp e2= left.getRight().toExp();
		Stm st= right.toStm();
		return StreeWHILE.build(rel, e1, e2, st);

	}

     
     
     */
}
