package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;

public class StreeFOREACH extends Stree {

    public StreeFOREACH(Stree left, Stree right){
	super(EnumTag.FOREACH, left, right, null);
    }
}   