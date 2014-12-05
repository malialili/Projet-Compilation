package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeFUNCTION extends Stree {

    public StreeFUNCTION(Stree left){
	super(EnumTag.FUNCTION, left, null, null);
    }
    
}
