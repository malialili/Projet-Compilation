package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeLT extends Stree {

    public StreeLT(Stree left, Stree right){
	super(EnumTag.LT, left, right, null);
    }
    
}
