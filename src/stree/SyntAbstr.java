package stree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Process;
import java.util.Vector;

import stree.*;
import type.*;
import tree.*;

// Arbre de syntaxe abstraite
// L'arbre est décoré:
//    tag: l'étiquette du noeud (cf EnumTag)
//    type: le type du noeud (pour les expressions)


public class SyntAbstr {

	private int id;
	private static int uniquid = 0;
	private SyntAbstr left;
	private SyntAbstr right;
	private EnumTag tag;	
	private Type type;


	public SyntAbstr(SyntAbstr left, SyntAbstr right, EnumTag tag) {
		this.left=left;
		this.right=right;
		this.id=uniquid++;
		this.tag=tag;
		this.type=null;
	}

	public SyntAbstr(SyntAbstr left, EnumTag tag) {
		this.left=left;
		this.right=null;
		this.id=uniquid++;
		this.tag=tag;
		this.type=null;
	}

	public SyntAbstr(EnumTag tag) {
		this.left=null;
		this.right=null;
		this.id=uniquid++;
		this.tag=tag;
		this.type=null;
	}

	public SyntAbstr(EnumTag tag, String str) {
		this.left=null;
		this.right=null;
		this.id=uniquid++;
		this.tag=tag;
		this.type=null;
	}

	public SyntAbstr getLeft() {
		return left;
	}

	public void setLeft(SyntAbstr left) {
		this.left = left;
	}

	public SyntAbstr getRight() {
		return right;
	}

	public void setRight(SyntAbstr right) {
		this.right = right;
	}

	public Type getType() {
		return type;
	}

	public void putType(Type type) {
		this.type = type;
	}

	public String tagToString() {
		String result = new String();
		switch (tag){
		case AFF: result += "AFF"; break;
		case SEQ: result += "SEQ"; break;
		case AND: result += "AND"; break; 
		case OR: result += "OR"; break;
		case LAND: result += "LAND"; break; 
		case LOR: result += "LOR"; break;
		case LT: result += "LT"; break;
		case GT: result += "GT"; break;
		case LE: result += "LE"; break;
		case GE: result += "GE"; break;
		case EQ: result += "EQ"; break; 
		case NOT: result += "NOT"; break;
		case PLUS: result += "PLUS"; break;
		case MINUS: result += "MINUS"; break;
		case PLUSS: result += "PLUSS"; break;
		case MINUSS: result += "MINUSS"; break;
		case MINUS_U: result += "MINUS_U"; break;
		case MULT: result += "MULT"; break;
		case DIV: result += "DIV"; break;
		case MOD: result += "MOD"; break;
		case DIFF: result += "DIFF"; break;
		case RCRO: result += "RCRO"; break;
		case LCRO: result += "LCRO"; break;
		case RBRACKET: result += "RBRACKET"; break;
		case LBRACKET: result += "LBRACKET"; break;
		case RPAR: result += "RPAR"; break;
		case LPAR: result += "LPAR"; break;
		case CIRCUMFLEX: result += "CIRCUMFLEX"; break;
		case ARROW: result += "ARROW"; break;
		case VIR: result += "VIR"; break;
		case CHARACTER: result += "CHARACTER"; break;
		case STRING: result += "STRING"; break;
		case FLOAT: result += "FLOAT"; break;
		case INTEGER: result += "INTEGER"; break; 
		case ID: result += "ID"; break;
		case DOT: result += "DOT"; break;
		case TDOT: result += "TDOT"; break;
		case COMMA: result += "COMMA"; break;
		case FUNCTION: result += "FUNCTION"; break;
		case MAIN: result += "MAIN"; break;
		case PROCEDURE: result += "PROCEDURE"; break;
		case RETURN: result += "RETURN"; break;
		case LIST: result += "LIST"; break;
		case OF: result += "OF"; break;
		case IN: result += "IN"; break;
		case IF: result += "IF"; break;
		case ELSE: result += "ELSE"; break;
		case TRUE: result += "TRUE"; break;
		case FALSE: result += "FALSE"; break;
		case WHILE: result += "WHILE"; break;
		case CLASS: result += "CLASS"; break;
		case STRUCTURE: result += "STRUCTURE"; break;
		case TYPE: result += "TYPE"; break;
		case TIMES: result += "TIMES"; break;
		case AMP: result += "AMP"; break;
		case PRODUCT: result += "PRODUCT"; break;
		case TABLE: result += "TABLE"; break;
		case SUCC: result += "SUCC"; break;
		default: System.err.print("error"); break;
		}
		return result;
	}

	public String toString() {
		String result = new String();
		result += tagToString();
		if ((left != null) || (right != null)){
			result +="(";
			if (left != null)
				result += left.toString();
			result+=",";
			if (right != null)
				result += right.toString();
			result+=")";
		}
		result += ":";
		result += type.toString();
		return result;
	}

	public void toDot(StringBuffer str) {
		str.append(this.id+" [label=\""+tagToString()+":");
		if (type!=null){
			str.append(" (");
			str.append(type.toString());
			str.append(")");
		}
		str.append("\"];\n");
		if (left != null){
			left.toDot(str);
			str.append(this.id+" -> "+left.id+" [label=\"\"];\n");
		}
		if (right != null){
			right.toDot(str);
			str.append(this.id+" -> "+right.id+" [label=\"\"];\n");
		}

	}

	public void toDot(String file) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("./"+file+".dot"));
			out.write("digraph ArbreSyntAbstr {");
			StringBuffer str = new StringBuffer();
			toDot(str);
			out.write(str.toString());
			out.write("}");
			out.close();
		} catch (IOException e) {
			System.out.println("ERROR: build dot");
		}		
	}
}
