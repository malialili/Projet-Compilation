package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeGE extends Stree {

    public StreeGE(Stree left, Stree right){
	super(EnumTag.GE, left, right, null);
    }
    
}
