package binario;
import java_cup.runtime.Symbol;

%%
%cupsym Simbolo
%class AnalisisLexico
%cup
%public
%unicode
%line
%char
%ignorecase

%{
//AQUI VA CODIGO EN JAVA
%}

%%

<YYINITIAL>{

    "0" {return new Symbol(Simbolo.cero,yytext());}
    "1" {return new Symbol(Simbolo.uno,yytext());}
    
    
    . { System.out.println("Error lexico: "+yytext()+" en linea: "+yyline+" columna: "+yychar );}

}
