package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeWHILE extends Stree {

    public StreeWHILE(Stree left, Stree right){
	super(EnumTag.WHILE, left, right, null);
    }
    
}
