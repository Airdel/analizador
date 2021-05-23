package analizador;
import java.io.*;
import static analizador.Tokens.*;

%%
%class Lexer
%type Tokens
%line
%column
D = [0-9]
S = \+|\-
L=[a-z]
LE=[A-Za-z_]

iden={ L } ( { L } | { D } | _ ){ 0 , 31 }

num = {D}+
enteros = {S}?{num}
numDec =  {S}?{num}?\.{num}
numExp =  {S}?{num}?(\.{num})?e{ enteros }
invalido = ({LE}|{D})*

arroba = @
coma = ,
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
<YYINITIAL> "," {c.linea=yyline; lexeme=yytext(); return COMA;}
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
<YYINITIAL> "abajo" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ABAJO;}
<YYINITIAL> "acelerar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ACELERAR;}
<YYINITIAL> "adelante" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ADELANTE;}
<YYINITIAL> "apagar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_APAGAR;}
<YYINITIAL> "arreglo" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ARREGLO;}
<YYINITIAL> "arriba" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ARRIBA;}
<YYINITIAL> "atras" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ATRAS;}
<YYINITIAL> "calibrar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_CALIBRAR;}
<YYINITIAL> "captura" {c.linea=yyline; lexeme=yytext(); return RESERVADA_CAPTURA;}
<YYINITIAL> "caracter" {c.linea=yyline; lexeme=yytext(); return RESERVADA_CARACTER;}
<YYINITIAL> "cargar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_CARGAR;}
<YYINITIAL> "ciclo" {c.linea=yyline; lexeme=yytext(); return RESERVADA_CICLO;}
<YYINITIAL> "corto" {c.linea=yyline; lexeme=yytext(); return RESERVADA_CORTO;}
<YYINITIAL> "decimal" {c.linea=yyline; lexeme=yytext(); return RESERVADA_DECIMAL;}
<YYINITIAL> "declaracion" {c.linea=yyline; lexeme=yytext(); return RESERVADA_DECLARACION;}
<YYINITIAL> "derecha" {c.linea=yyline; lexeme=yytext(); return RESERVADA_DERECHA;}
<YYINITIAL> "detener" {c.linea=yyline; lexeme=yytext(); return RESERVADA_DETENER;}
<YYINITIAL> "direccionar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_DIRECCIONAR;}
<YYINITIAL> "ejecutar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_EJECUTAR;}
<YYINITIAL> "encender" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ENCENDER;}
<YYINITIAL> "esperar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_ESPERAR;}
<YYINITIAL> "fijo" {c.linea=yyline; lexeme=yytext(); return RESERVADA_FIJO;}
<YYINITIAL> "girar" {c.linea=yyline; lexeme=yytext(); return RESERVADA_GIRAR;}
<YYINITIAL> "haz" {c.linea=yyline; lexeme=yytext(); return RESERVADA_HAZ;}
<YYINITIAL> "imprimir" {c.linea=yyline; lexeme=yytext(); return RESERVADA_IMPRIMIR;}
<YYINITIAL> "izquierda" {c.linea=yyline; lexeme=yytext(); return RESERVADA_IZQUIERDA;}
<YYINITIAL> "largo" {c.linea=yyline; lexeme=yytext(); return RESERVADA_LARGO;}
<YYINITIAL> "leer" {c.linea=yyline; lexeme=yytext(); return RESERVADA_LEER;}
<YYINITIAL> "nulo" {c.linea=yyline; lexeme=yytext(); return RESERVADA_NULO;}
<YYINITIAL> "parav" {c.linea=yyline; lexeme=yytext(); return RESERVADA_PARAV;}
<YYINITIAL> "pin" {c.linea=yyline; lexeme=yytext(); return RESERVADA_PIN;}
<YYINITIAL> "regresa" {c.linea=yyline; lexeme=yytext(); return RESERVADA_REGRESA;}
<YYINITIAL> "retorno" {c.linea=yyline; lexeme=yytext(); return RESERVADA_RETORNO;}
<YYINITIAL> "ruta" {c.linea=yyline; lexeme=yytext(); return RESERVADA_RUTA;}
<YYINITIAL> "seguir" {c.linea=yyline; lexeme=yytext(); return RESERVADA_SEGUIR;}
<YYINITIAL> "video" {c.linea=yyline; lexeme=yytext(); return RESERVADA_VIDEO;}
<YYINITIAL> "falso" {c.linea=yyline; lexeme=yytext(); return RESERVADA_FALSO;}
<YYINITIAL> "verdadero" {c.linea=yyline; lexeme=yytext(); return RESERVADA_VERDADERO;}
<YYINITIAL> {enteros} {c.linea=yyline; lexeme=yytext(); return NUMERO;}
<YYINITIAL> {numDec} {c.linea=yyline; lexeme=yytext(); return NUMERO_DECIMAL;}
<YYINITIAL> {numExp} {c.linea=yyline; lexeme=yytext(); return NUMERO_EXPONENTE;}
<YYINITIAL> {iden} {c.linea=yyline; lexeme=yytext(); return IDENTIFICADOR;}
<YYINITIAL> {invalido} {c.linea=yyline; lexeme=yytext(); return ERROR;}
 . {c.linea=yyline; lexeme=yytext(); return ERROR;}