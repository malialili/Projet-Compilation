package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeAND extends Stree {

    public StreeAND(Stree left, Stree right){
	super(EnumTag.AND, left, right, null);
    }
    
}
