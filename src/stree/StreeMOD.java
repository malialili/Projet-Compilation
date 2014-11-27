package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeMOD extends Stree {

    public StreeMOD(Stree left, Stree right){
	super(EnumTag.MOD, left, right, null);
    }
    
}
