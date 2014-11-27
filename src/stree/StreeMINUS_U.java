package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeMINUS_U extends Stree {

    public StreeMINUS_U(Stree left){
	super(EnumTag.MINUS_U, left, null, null);
    }
    
}
