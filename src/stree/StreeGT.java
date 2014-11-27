package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeGT extends Stree {

    public StreeGT(Stree left, Stree right){
	super(EnumTag.GT, left, right, null);
    }
    
}
