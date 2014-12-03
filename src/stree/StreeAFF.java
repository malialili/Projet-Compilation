package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class StreeAFF extends Stree {

    public StreeAFF(Stree left, Stree right){
	super(EnumTag.AFF, left, right, null);
    }   
    
    /*
    public Stm toStm(){
    	return this.build(left.toExp(),right.toExp());  
    }
    
    public Stm build(Exp e1, Exp e2){
    	return new MOVE(e1, e2);
    }
     
    */
}
