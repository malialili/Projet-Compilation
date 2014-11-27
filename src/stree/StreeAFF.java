package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class StreeAFF extends Stree {

    public StreeAFF(Stree left, Stree right){
	super(EnumTag.AFF, left, right, null);
    }   
}
