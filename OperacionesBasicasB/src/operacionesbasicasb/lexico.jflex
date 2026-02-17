package operacionesbasicasb;
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

    [0-9]+ {return new Symbol(Simbolo.num,yytext());}
    "(" {return new Symbol(Simbolo.para,yychar,yyline);}
    ")" {return new Symbol(Simbolo.parc,yychar,yyline);}
    "+" {return new Symbol(Simbolo.mas,yychar,yyline);}
    "-" {return new Symbol(Simbolo.menos,yychar,yyline);}
    "*" {return new Symbol(Simbolo.por,yychar,yyline);}

    . { System.out.println("Error lexico: "+yytext());}

}
