package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeOR extends Stree {

    public StreeOR(Stree left, Stree right){
	super(EnumTag.OR, left, right, null);
    }
    
}
