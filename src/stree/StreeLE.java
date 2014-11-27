package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeLE extends Stree {

    public StreeLE(Stree left, Stree right){
	super(EnumTag.LE, left, right, null);
    }
    
}
