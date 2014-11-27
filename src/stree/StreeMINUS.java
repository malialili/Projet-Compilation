package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeMINUS extends Stree {

    public StreeMINUS(Stree left, Stree right){
	super(EnumTag.MINUS, left, right, null);
    }
    
}
