import java.io.FileReader;
import java_cup.runtime.Symbol;
import stree.*;
import tree.*;
import env.*;
import type.*;

public class Main {
	static int id=0;
	static Env workingEnv=null;
	static Env currentEnv=null;
	static Env firstEnv=null;
	static Env currentTypedef=null;
	static Env firstTypedef=null;
	public static void main(String[] args) {
		try {
			// On ouvre le fichier à lire
			FileReader file = new FileReader(args[0]);
			DmLexer lexer = new DmLexer(file);
			DmParser parser = new DmParser(lexer);
			Symbol result=null;
			try {
				// On parse
				result=parser.parse();
			    try {
					SyntAbstr root=(SyntAbstr)result.value;
					// On produit data/arbreSynt.dot, l'arbre de syntaxe abstraite en dot (graphviz)
					root.toDot("data/syntAbstr");
				}
				catch (Exception e) {
					System.err.println("semantic error...");
				}
			}
			catch (Exception e) {
				System.err.println("parse error...");
			}
		}
		catch (Exception e){
			System.err.println("invalid file");	    
		}
	}
}
