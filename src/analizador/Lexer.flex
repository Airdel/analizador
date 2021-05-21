package analizador;
import java.io.*;
import static analizador.Tokens.*;

%%
%class Lexer
%type Tokens
%line
%column
MAYUS = [A-Z]
DIGITO = [0-9]
SIGNO = \+|\-
ENTERO = D+
LETRA=[a-z]+
CA="\""[^*]~"\"" + "\""
ESPACIO=[ \t\r\n]

%{
    public String lexeme;
    InformacionAnalisis c = new InformacionAnalisis();
%}

%%

{ESPACIO} {/*Ignore*/}
"--".* {/*Ignore*/}
<YYINITIAL> "+" {c.linea=yyline; lexeme=yytext(); return MAS;}
<YYINITIAL> "=" {c.linea=yyline; lexeme=yytext(); return ASIGNACION;}
<YYINITIAL> "==" {c.linea=yyline; lexeme=yytext(); return IGUAL;}
<YYINITIAL> "-" {c.linea=yyline; lexeme=yytext(); return MENOS;}
<YYINITIAL> "*" {c.linea=yyline; lexeme=yytext(); return POR;}
<YYINITIAL> "/" {c.linea=yyline; lexeme=yytext(); return DIVISION;}
<YYINITIAL> "&" {c.linea=yyline; lexeme=yytext(); return Y;}
<YYINITIAL> "|" {c.linea=yyline; lexeme=yytext(); return O;}
<YYINITIAL> "%" {c.linea=yyline; lexeme=yytext(); return MODULO;}
<YYINITIAL> ";" {c.linea=yyline; lexeme=yytext(); return PUNTO_COMA;}
<YYINITIAL> "(" {c.linea=yyline; lexeme=yytext(); return PARENTESIS_IZQ;}
<YYINITIAL> ")" {c.linea=yyline; lexeme=yytext(); return PARENTESIS_DER;}
<YYINITIAL> ">" {c.linea=yyline; lexeme=yytext(); return MAYOR;}
<YYINITIAL> "<" {c.linea=yyline; lexeme=yytext(); return MENOR;}
<YYINITIAL> ":" {c.linea=yyline; lexeme=yytext(); return DOS_PUNTOS;}
<YYINITIAL> "@" {c.linea=yyline; lexeme=yytext(); return ARROBA;}
<YYINITIAL> "entero" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ENTERO;}
<YYINITIAL> "cadena" {c.linea=yyline; lexeme=yytext(); return RESERVADA_CADENA;}
<YYINITIAL> "iniciar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_INICIAR;}
<YYINITIAL> "fin" {c.linea=yyline; lexeme=yytext(); return RESERVADA_FIN;}
<YYINITIAL> "funcion" {c.linea=yyline; lexeme=yytext(); return RESERVADA_FUNCION;}
<YYINITIAL> "si" {c.linea=yyline; lexeme=yytext(); return RESERVADA_SI;}
<YYINITIAL> "no" {c.linea=yyline; lexeme=yytext(); return RESERVADA_NO;}
<YYINITIAL> "mientras" {c.linea=yyline; lexeme=yytext(); return RESERVADA_MIENTRAS;}
<YYINITIAL> "para" {c.linea=yyline; lexeme=yytext(); return RESERVADA_PARA;}
<YYINITIAL> "booleano" {c.linea=yyline; lexeme=yytext(); return RESERVADA_BOOLEANO;}
<YYINITIAL> "principal" {c.linea=yyline; lexeme=yytext(); return RESERVADA_PRINCIPAL;}
<YYINITIAL> \-?{DIGITO}+ {c.linea=yyline; lexeme=yytext(); return NUMERO;}
<YYINITIAL> (\-?{DIGITO})+(\.{DIGITO})+ {c.linea=yyline; lexeme=yytext(); return NUMERO_DECIMAL;}
<YYINITIAL> (\-?{DIGITO})+((\.{DIGITO})+)?(e{DIGITO}+) {c.linea=yyline; lexeme=yytext(); return NUMERO_EXPONENTE;}
<YYINITIAL> {LETRA} ({LETRA}|{DIGITO})* {c.linea=yyline; lexeme=yytext(); return IDENTIFICADOR;}
<YYINITIAL> {DIGITO}({LETRA}|{DIGITO})* {c.linea=yyline; lexeme=yytext(); return ERROR;}
<YYINITIAL> {MAYUS}({LETRA}|{MAYUS})* {c.linea=yyline; lexeme=yytext(); return ERROR;}
 . {c.linea=yyline; lexeme=yytext(); return ERROR;}