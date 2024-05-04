package principal;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value)
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn)
    }
%}
%%
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
Integer {return new Symbol(sym.Integer, yychar, yyline, yytext());}
String {return new Symbol(sym.String, yychar, yyline, yytext());}
if {return new Symbol(sym.If, yychar, yyline, yytext());}
else {return new Symbol(sym.Else, yychar, yyline, yytext());}
while {return new Symbol(sym.While, yychar, yyline, yytext());}
End {return new Symbol(sym.End, yychar, yyline, yytext());}
Module {return new Symbol(sym.Module, yychar, yyline, yytext());}
Main {return new Symbol(sym.Main, yychar, yyline, yytext());}
Sub {return new Symbol(sym.Sub, yychar, yyline, yytext());}
As {return new Symbol(sym.As, yychar, yyline, yytext());}
Dim {return new Symbol(sym.Dim, yychar, yyline, yytext());}
ReadLine {return new Symbol(sym.ReadLine, yychar, yyline, yytext());}
WriteLine {return new Symbol(sym.WriteLine, yychar, yyline, yytext());}
Console {return new Symbol(sym.Console, yychar, yyline, yytext());}
ReadKey {return new Symbol(sym.ReadKey, yychar, yyline, yytext());}
{espacio} {/*ignore*/}
"//".* {/*ignore*/}
"=" {return new Symbol(sym.Igual, yychar, yyline, yytext());;}
"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}

"!" {return new Symbol(sym.Signo_Exclamacion, yychar, yyline, yytext());}
"#" {return new Symbol(sym.Signo_Numeral, yychar, yyline, yytext());}
"\"" {return new Symbol(sym.Signo_Comillas, yychar, yyline, yytext());}
"$" {return new Symbol(sym.Signo_Dolar, yychar, yyline, yytext());}
"%" {return new Symbol(sym.Signo_Porcentaje, yychar, yyline, yytext());}
"&" {return new Symbol(sym.Op_AND, yychar, yyline, yytext());}
"(" {return new Symbol(sym.Signo_Parentesis_Abierto, yychar, yyline, yytext());}
")" {return new Symbol(sym.Signo_Parentesis_Cerrado, yychar, yyline, yytext());}
"?" {return new Symbol(sym.Signo_Interrogacion, yychar, yyline, yytext());}
"'" {return new Symbol(sym.Signo_Apostrofe, yychar, yyline, yytext());}
"¡" {return new Symbol(sym.Signo_Exclamacion_Invertida, yychar, yyline, yytext());}
"¿" {return new Symbol(sym.Signo_Interrogacion_Invertida, yychar, yyline, yytext());}
"{" {return new Symbol(sym.Signo_Llave_Abierta, yychar, yyline, yytext());}
"}" {return new Symbol(sym.Signo_Llave_Cerrada, yychar, yyline, yytext());}
"[" {return new Symbol(sym.Signo_Corchete_Abierto, yychar, yyline, yytext());}
"]" {return new Symbol(sym.Signo_Corchete_Cerrado, yychar, yyline, yytext());}
">" {return new Symbol(sym.Signo_Mayor, yychar, yyline, yytext());}
"<" {return new Symbol(sym.Signo_Menor, yychar, yyline, yytext());}
"_" {return new Symbol(sym.Signo_Guion_Bajo, yychar, yyline, yytext());}

"^" {return new Symbol(sym.Signo_Potencia, yychar, yyline, yytext());}
"°" {return new Symbol(sym.Signo_Grado, yychar, yyline, yytext());}
"|" {return new Symbol(sym.Op_OR, yychar, yyline, yytext());}
"." {return new Symbol(sym.Signo_punto, yychar, yyline, yytext());}
"," {return new Symbol(sym.Signo_coma, yychar, yyline, yytext());}
";" {return new Symbol(sym.Signo_puntoycoma, yychar, yyline, yytext());}
":" {return new Symbol(sym.Signo_doblepunto, yychar, yyline, yytext());}


{L} ({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("{-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());return ERROR;}