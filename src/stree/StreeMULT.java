package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeMULT extends Stree {

    public StreeMULT(Stree left, Stree right){
	super(EnumTag.MULT, left, right, null);
    }
    
}
