package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeELSE extends Stree {

    public StreeELSE(Stree left, Stree right){
	super(EnumTag.ELSE, left, right, null);
    }
    
   public StreeELSE(Stree left){
	this(left, null);
    }
    
}
