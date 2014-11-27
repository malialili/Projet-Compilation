package tree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract public class Exp {
    protected int id;   // used in toDot
    protected static int uniqId=0;

    public Exp(){
	id=uniqId++;
    }
    public String toString(){return new String("EXP");};
    public void toDot(StringBuffer str){
	str.append("a_"+id+" [shape=\"ellipse\", label=\"EXP\"];\n");
    }

    public void toDot(String file){
	try {
	    BufferedWriter out = new BufferedWriter(new FileWriter(file));
	    out.write("digraph Stree {\n");
	    StringBuffer str = new StringBuffer();
	    toDot(str);
	    out.write(str.toString());
	    out.write("}\n");
	    out.close();
	} catch (IOException e) {
	    System.err.println("ERROR: build dot");
	}		
    }
}
