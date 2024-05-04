package principal;
import static principal.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
int {lexeme=yytext(); return Int;}
Integer {lexeme=yytext(); return Integer;}
String {lexeme=yytext(); return String;}
if {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
while {lexeme=yytext(); return While;}
End {lexeme=yytext(); return End;}
Module {lexeme=yytext(); return Module;}
Main {lexeme=yytext(); return Main;}
Sub {lexeme=yytext(); return Sub;}
As {lexeme=yytext(); return As;}
Dim {lexeme=yytext(); return Dim;}
ReadLine {lexeme=yytext(); return ReadLine;}
WriteLine {lexeme=yytext(); return WriteLine;}
Console {lexeme=yytext(); return Console;}
ReadKey {lexeme=yytext(); return ReadKey;}
{espacio} {/*ignore*/}
"//".* {/*ignore*/}
"\n" {return Linea;}
"=" {lexeme=yytext(); return Igual;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}

"!" {lexeme=yytext(); return Signo_Exclamacion;}
"#" {lexeme=yytext(); return Signo_Numeral;}
"\"" {lexeme=yytext(); return Signo_Comillas;}
"$" {lexeme=yytext(); return Signo_Dolar;}
"%" {lexeme=yytext(); return Signo_Porcentaje;}
"&" {lexeme=yytext(); return Op_AND;}
"(" {lexeme=yytext(); return Signo_Parentesis_Abierto;}
")" {lexeme=yytext(); return Signo_Parentesis_Cerrado;}
"?" {lexeme=yytext(); return Signo_Interrogacion;}
"'" {lexeme=yytext(); return Signo_Apostrofe;}
"¡" {lexeme=yytext(); return Signo_Exclamacion_Invertida;}
"¿" {lexeme=yytext(); return Signo_Interrogacion_Invertida;}
"{" {lexeme=yytext(); return Signo_Llave_Abierta;}
"}" {lexeme=yytext(); return Signo_Llave_Cerrada;}
"[" {lexeme=yytext(); return Signo_Corchete_Abierto;}
"]" {lexeme=yytext(); return Signo_Corchete_Cerrado;}
">" {lexeme=yytext(); return Signo_Mayor;}
"<" {lexeme=yytext(); return Signo_Menor;}
"_" {lexeme=yytext(); return Signo_Guion_Bajo;}

"^" {lexeme=yytext(); return Signo_Potencia;}
"°" {lexeme=yytext(); return Signo_Grado;}
"|" {lexeme=yytext(); return Op_OR;}
"." {lexeme=yytext(); return Signo_punto;}
"," {lexeme=yytext(); return Signo_coma;}
";" {lexeme=yytext(); return Signo_puntoycoma;}
":" {lexeme=yytext(); return Signo_doblepunto;}


{L} ({L}|{D})* {lexeme=yytext(); return Identificador;}
("{-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
