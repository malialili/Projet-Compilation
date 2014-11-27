package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeTABLE extends Stree {

    public StreeTABLE(Stree left, String str, int line, int column) {
	super(EnumTag.TABLE, left, null, str);
    }
    
}
