package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreePLUS extends Stree {

    public StreePLUS(Stree left, Stree right){
	super(EnumTag.PLUS, left, right, null);
    }
    
}
