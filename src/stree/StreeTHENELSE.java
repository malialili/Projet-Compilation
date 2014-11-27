package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeTHENELSE extends Stree {

    public StreeTHENELSE(Stree left, Stree right){
	super(EnumTag.THENELSE, left, right, null);
    }
    
    public StreeTHENELSE(Stree left){
	this(left, null);
    }
    
}
