package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeSUCC extends Stree {

    public StreeSUCC(Stree left, Stree right){
	super(EnumTag.SUCC, left, right, null);
    }
    
}
