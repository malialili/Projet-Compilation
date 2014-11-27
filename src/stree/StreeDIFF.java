package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeDIFF extends Stree {

    public StreeDIFF(Stree left, Stree right){
	super(EnumTag.DIFF, left, right, null);
    }

}
