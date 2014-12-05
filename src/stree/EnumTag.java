package stree;

public enum EnumTag {SEQ, AFF, AND, OR, LT, GT, LE, GE, EQ, NOT, 
	PLUS, MINUS, MINUS_U, MULT, DIV,MOD,
	CHARACTER, STRING, FLOAT, INTEGER, BOOLEAN ,IDENTIFIER,
	PROCEDURE, FUNCTION, MAIN, TIMES, AMP,
	COMMA, DOT, TDOT, LIST, IN, OF, 
	TYPE, STRUCTURE, CLASS, ID,
	TABLE, SUCC, PRODUCT,
	PLUSS, MINUSS, LAND, LOR, DIFF, CIRCUMFLEX, ARROW, RETURN, 
	LCRO, RCRO, LPAR, RPAR, LBRACKET, RBRACKET,
	VIR, WHILE, IF, ELSE, FOREACH, REPEAT, NULL, FALSE, TRUE, NE
}

/*
public enum EnumTag { 
    
    IF ("IF"), 
    THENELSE ("THENELSE"), 
    WHILE ("WHILE"), 
    AFF ("="), 
    LDIF ("!"), 
    AND ("&&"), 
    OR ("||"), 
    LAND ("&"), 
    LOR ("|"),
    INF ("<"), 
    SUP (">"), 
    INFEG ("<="), 
    SUPEG (">="), 
    EQ ("=="), 
    DIF ("!=") , 
    PLUS ("+"), 
    MINUS ("-"), 
    MINUS_U ("-"), 
    PLUSS ("++"), 
    MINUSS ("--"),
    MULT ("*"), 
    DIV ("/"), 
    MOD ("%"), 
    VIRGUL (","),
    VIR ("'"),
    DOT ("."),
    TDOT(":"),
    IN ("IN"),
    NULL("NULL"),
    FALSE ("FALSE"),
    TRUE ("TRUE"),
    LIST ("LIST"),
    PROCEDURE("PROCEDURE"),
    STRUCTURE ("STRUCTURE"),
    IDENTIFIER ("IDENTIFIER"),
    FUNCTION ("FUNCTION"),
    TYPE("TYPE"),
    RETURN ("RETURN"), 
    CLASS ("CLASS"),
    CHARACTER ("CHARACTER"), 
    INTEGER ("INTEGER"), 
    FLOAT ("FLOAT"), 
    BOOLEAN ("BOOLEAN"),
	STRING("STRING");
    

    private final String tag;

    EnumTag(String s){
            tag = s;
    }

    public String toString(){
            return tag;
    }


}
*/
