package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StreeFALSE extends Stree {

   
	 // str gives type
    public StreeFALSE(String str, int line, int column) {
	super(EnumTag.FALSE, null, null, str);
    }
    
    // type given
    public StreeFALSE(Object object, String str) {
	super(EnumTag.FALSE, null, null, str);
    }
    
    // without str
    public StreeFALSE(Object object) {
	super(EnumTag.FALSE, null, null, null);
    }
	
	
    
}