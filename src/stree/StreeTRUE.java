package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StreeTRUE extends Stree {

   
	 // str gives type
    public StreeTRUE(String str, int line, int column) {
	super(EnumTag.TRUE, null, null, str);
    }
    
    // type given
    public StreeTRUE(Object object, String str) {
	super(EnumTag.TRUE, null, null, str);
    }
    
    // without str
    public StreeTRUE(Object object) {
	super(EnumTag.TRUE, null, null, null);
    }
	
	
    
}