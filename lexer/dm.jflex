import java_cup.runtime.*;

%%
%class DmLexer
%cupsym DmSymbol
%line
%column
%cup

%{
    StringBuffer string = new StringBuffer();
    
    private Symbol symbol (int type) {
	return new Symbol (type, yyline, yycolumn);
    }
    
    private Symbol symbol (int type, Object value) {
	return new Symbol (type, yyline, yycolumn, value);
    }
%}

LineTerminator	= \r|\n|\r\n
WhiteSpace	= {LineTerminator} | [ \t\f]
Integer		= [0-9]+
String 		= [a-zA-z0-9]([a-zA-z0-9]|'_')+
ID		=[a-zA-Z]([a-zA-z0-9]|'_')*
%state STRING

%%

<YYINITIAL> { 

	/* Keywords */
	main 		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.MAIN, yytext());}
					
	procedure	{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.PROCEDURE, yytext());}
					
	integer		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.INTEGER, yytext());}
	
	string		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.STRING, yytext());}				
	
	of			{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.OF, yytext());}
					
	list 		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.LIST, yytext());}
												
	function 	{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.FUNCTION, yytext());}
					
	class	 	{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.CLASS, yytext());}
					
	return 		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.RETURN, yytext());}
					
	type	 	{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.TYPE, yytext());}
					
	structure 	{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.STRUCTURE, yytext());}
					
	character	{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.CHARACTER, yytext());}
					
	float 		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.FLOAT, yytext());}
					
	boolean 	{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.BOOLEAN, yytext());}
					
	true		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.TRUE, yytext());}
					
	false 		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.FALSE, yytext());}
					
	null 		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.NULL, yytext());}
					
	foreach		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.FOREACH, yytext());}
					
	in			{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.IN, yytext());}
					
	if 			{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.IF, yytext());}
					
	else 		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.THENELSE, yytext());}
					
	while		{System.out.println("KEYWORD: " +  yytext());
					return symbol(DmSymbol.WHILE, yytext());}
	
	/* Operators */
	
	"++"	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.PLUSS, yytext());}
				
	"--"	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.MINUSS, yytext());}
				
	"&"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.LAND, yytext());}
				
	"|"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.LOR, yytext());}
				
	"~"		{System.out.println("OPERATOR: " +  yytext());}
	
	"!"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.NOT, yytext());}
				
	"%"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.MOD, yytext());}
				
	"<<"	{System.out.println("OPERATOR: " +  yytext());}
	
	">>"	{System.out.println("OPERATOR: " +  yytext());}
	
	"<"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.LT, yytext());}
				
	">"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.GT, yytext());}
				
	"<="	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.LE, yytext());}
				
	">="	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.GE, yytext());}
				
	"=="	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.EQ, yytext());}
				
	"!="	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.DIFF, yytext());}
				
	"^"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.CIRCUMFLEX, yytext());}
				
	"&&"	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.AND, yytext());}
				
	"||"	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.OR, yytext());}
				
	"["		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.RBRACKET, yytext());}
				
	"]"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.RBRACKET, yytext());}
	
	"'"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.VIR, yytext());}
							
	"."		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.DOT, yytext());}
				
	"->"	{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.ARROW, yytext());}			
				
	"{"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.LCRO, yytext());}
				
	"}"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.RCRO, yytext());}
				
	":"		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.TDOT, yytext());}
				
	","		{System.out.println("OPERATOR: " +  yytext());
				return symbol(DmSymbol.COMMA, yytext());}
	   
	   
	"("		{ System.err.printf("***Keyword: LPAR ***Line: %d  ***Col: %d\n", yyline,yycolumn);		
	    	  	return symbol(DmSymbol.LPAR, yytext()); }
	    	  	
	")"		{ System.err.printf("***Keyword: RPAR ***Line: %d  ***Col: %d\n", yyline,yycolumn); 	
	    		return symbol(DmSymbol.RPAR , yytext()); }
	    		
	"+"		{ System.err.printf("***Keyword: PLUS ***Line: %d  ***Col: %d\n", yyline,yycolumn); 	
	    		return symbol(DmSymbol.PLUS, yytext()); }
	    		
	"-"		{ System.err.printf("***Keyword: MINUS ***Line: %d  ***Col: %d\n", yyline,yycolumn); 	
	    		return symbol(DmSymbol.MINUS, yytext()); }
	    		
	"*"		{ System.err.printf("***Keyword: MULT ***Line: %d  ***Col: %d\n", yyline,yycolumn); 	
	    		return symbol(DmSymbol.MULT, yytext()); }
	    		
	"/"		{ System.err.printf("***Keyword: DIV ***Line: %d  ***Col: %d\n", yyline,yycolumn); 		
	    		return symbol(DmSymbol.DIV, yytext()); }
	    		
	";"		{ System.err.printf("***Keyword: SEMIC ***Line: %d  ***Col: %d\n", yyline,yycolumn); 	
	    		return symbol(DmSymbol.SEMIC, yytext()); }
	    		
	"="		{ System.err.printf("***Keyword: AFF ***Line: %d  ***Col: %d\n", yyline,yycolumn); 		
	    		return symbol(DmSymbol.AFF, yytext()); }
	    		
	\"		{ string.setLength(0); yybegin(STRING); }
    
    /* -------------------------------------------------
       litteraux
       ------------------------------------------------- */
    
    {Integer}     { 
	System.err.printf("***Integer: %s ***Line: %d  ***Col: %d\n", yytext(), yyline,yycolumn );
	return symbol(DmSymbol.INTEGER, yytext()); 
    }

    {ID}     { 
	System.err.printf("***Variable: %s ***Line: %d  ***Col: %d\n", yytext(), yyline,yycolumn );
	return symbol(DmSymbol.TOK_ID, yytext()); 
    }
    
    {String}     { 
	System.err.printf("***String: %s ***Line: %d  ***Col: %d\n", yytext(), yyline,yycolumn );
	return symbol(DmSymbol.STRING, yytext()); 
    }
  
    
    /* -------------------------------------------------
       Commentaires - Caracteres non pris en compte
       ------------------------------------------------- */
    
    {WhiteSpace}                   {   /* ignore */ }
    
    "//".*	     {/*System.out.println("COMMENTAIRES: " +  yytext());*/}
	"/*"~"*/"    {/*System.out.println("COMMENTAIRES: " +  yytext());*/}
}

<STRING> {
    [^\n\r\"\\]+                   { string.append( yytext() ); }
    \\t                            { string.append('\t'); }
    \\n                            { string.append('\n'); }
    \\r                            { string.append('\r'); }
    \\\"                           { string.append('\"'); }
    \\                             { string.append('\\'); }
    \"                             {
	System.err.printf("***String: %s\n", string.toString());
	yybegin(YYINITIAL); 
	return symbol(DmSymbol.STRING_LITERAL, string.toString()); }
 }
    
/* -------------------------------------------------
	Autre
   ------------------------------------------------- */
.                   {   /* ignore */ }