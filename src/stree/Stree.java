package stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import stree.*;
import tree.*;

// Abstract Syntax Tree
// decorated with attributs 
// tag: node label (cf EnumTag)

public class Stree {

    protected EnumTag tag;	// node label
    protected Stree left;
    protected Stree right;
    protected Object object;
    protected int id;   // used in toDot
    protected static int uniqId=0;

    public Stree(EnumTag tag, Stree left, Stree right, Object object) {
    	this.left=left;
    	this.right=right;
    	this.id=uniqId++;
    	this.tag=tag;
    	this.object=object;
   }
    
    public EnumTag getTag() {
        return tag;
    }    
    
    public int getId() {
        return id;
    }    
    
    public Stree getLeft() {
	return left;
    }
    
    public Stree getRight() {
	return right;
    }
    
    public Object getObject() {
	return object;
    }
    
    public String toString() {
	String result = new String();
	result += tag.toString();
	if ((left != null) || (right != null)){
	    result +="(";
	    if (left != null)
	    	result += left.toString();
	    if (right != null){
                result+=",";
                if (right.tag==EnumTag.SUCC || right.tag==EnumTag.ELSE)
                    result+="\n\n\t";
	    	result += right.toString();
            }
	    result+=")";
	}
	return result;
    }
    
    public void toDot(StringBuffer str) {
	str.append("a_"+id+" [");
	str.append("shape=\"ellipse\", label=\""+tag.toString()); 
	if (object!=null)
	  str.append("\\nobject: "+object.toString()); 
	str.append("\"];\n");
	if (left != null){
	    left.toDot(str);
	    str.append("a_"+id+" -> a_"+left.id+";\n");
	}
	if (right != null){
	    right.toDot(str);
	    str.append("a_"+id+" -> a_"+right.id+";\n");
	}
    }
    
    public void toDot(String file) {
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
