package stree;

import java.lang.String;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;

public class StreeIF extends Stree {

    public StreeIF(Stree left, Stree right){
	super(EnumTag.IF, left, right, null);
    }
    
    private static Stm build(int rel, Exp e1, Exp e2, Stm st1, Stm st2){
	Label l1 = new Label();
	Label l2 = new Label();
	Label l3 = new Label();
	if(st2 != null)
	    return new SEQ(new CJUMP(rel, e1, e2, l1, l2) , 
			   new SEQ(new LABEL(l1), 
				   new SEQ(st1, 
					   new SEQ(new JUMP(l3),
						   new SEQ(new LABEL(l2), 
							   new SEQ(st2, new LABEL(l3)))))));
 	else 
	    return new SEQ(new CJUMP(rel, e1, e2, l1, l2) , 
			   new SEQ(new LABEL(l1), 
				   new SEQ(st1, 
					   new LABEL(l2))));
    }

   /* public Stm build(){
	Exp e1 = getLeft().build();
	Exp e2 = new CONST(0);
	Stm st1 = getRight().getLeft().build();
	Stm st2=null;
	if (getRight().getRight() != null){
	    st2 = getRight().getRight().build();
	}
	
	return build(CJUMP.NE,e1,e2,st1,st2);
    }*/
}
