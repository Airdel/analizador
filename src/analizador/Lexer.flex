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

ESPACIO=[ \t\r\n]

%{
    public String lexema;
    InformacionAnalisis c = new InformacionAnalisis();
%}

%%

{ESPACIO} {/*Ignore*/}
"--".* {/*Ignore*/}
<YYINITIAL> "+" {c.linea=yyline; lexema=yytext(); return OPERADOR_MAS;}
<YYINITIAL> "=" {c.linea=yyline; lexema=yytext(); return ASIGNACION;}
<YYINITIAL> "==" {c.linea=yyline; lexema=yytext(); return OPERADOR_IGUALDAD;}
<YYINITIAL> "-" {c.linea=yyline; lexema=yytext(); return OPERADOR_MENOS;}
<YYINITIAL> "*" {c.linea=yyline; lexema=yytext(); return OPERADOR_POR;}
<YYINITIAL> "/" {c.linea=yyline; lexema=yytext(); return OPERADOR_DIVISION;}
<YYINITIAL> "&" {c.linea=yyline; lexema=yytext(); return OPERADOR_Y;}
<YYINITIAL> "|" {c.linea=yyline; lexema=yytext(); return OPERADOR_O;}
<YYINITIAL> "%" {c.linea=yyline; lexema=yytext(); return OPERADOR_MODULO;}
<YYINITIAL> ";" {c.linea=yyline; lexema=yytext(); return PUNTO_COMA;}
<YYINITIAL> "(" {c.linea=yyline; lexema=yytext(); return PARENTESIS_IZQ;}
<YYINITIAL> ")" {c.linea=yyline; lexema=yytext(); return PARENTESIS_DER;}
<YYINITIAL> ">" {c.linea=yyline; lexema=yytext(); return MAYOR;}
<YYINITIAL> "<" {c.linea=yyline; lexema=yytext(); return MENOR;}
<YYINITIAL> ">=" {c.linea=yyline; lexema=yytext(); return MAYOR_QUE;}
<YYINITIAL> "<=" {c.linea=yyline; lexema=yytext(); return MENOR_QUE;}
<YYINITIAL> ":" {c.linea=yyline; lexema=yytext(); return DOS_PUNTOS;}
<YYINITIAL> "@" {c.linea=yyline; lexema=yytext(); return ARROBA;}
<YYINITIAL> "entero" {c.linea=yyline; lexema=yytext(); return RESERVADA_ENTERO;}
<YYINITIAL> "cadena" {c.linea=yyline; lexema=yytext(); return RESERVADA_CADENA;}
<YYINITIAL> "iniciar" {c.linea=yyline; lexema=yytext(); return RESERVADA_INICIAR;}
<YYINITIAL> "fin" {c.linea=yyline; lexema=yytext(); return RESERVADA_FIN;}
<YYINITIAL> "funcion" {c.linea=yyline; lexema=yytext(); return RESERVADA_FUNCION;}
<YYINITIAL> "si" {c.linea=yyline; lexema=yytext(); return RESERVADA_SI;}
<YYINITIAL> "no" {c.linea=yyline; lexema=yytext(); return RESERVADA_NO;}
<YYINITIAL> "mientras" {c.linea=yyline; lexema=yytext(); return RESERVADA_MIENTRAS;}
<YYINITIAL> "para" {c.linea=yyline; lexema=yytext(); return RESERVADA_PARA;}
<YYINITIAL> "booleano" {c.linea=yyline; lexema=yytext(); return RESERVADA_BOOLEANO;}
<YYINITIAL> "principal" {c.linea=yyline; lexema=yytext(); return RESERVADA_PRINCIPAL;}
<YYINITIAL> "abajo" {c.linea=yyline; lexema=yytext(); return RESERVADA_ABAJO;}
<YYINITIAL> "acelerar" {c.linea=yyline; lexema=yytext(); return RESERVADA_ACELERAR;}
<YYINITIAL> "adelante" {c.linea=yyline; lexema=yytext(); return RESERVADA_ADELANTE;}
<YYINITIAL> "apagar" {c.linea=yyline; lexema=yytext(); return RESERVADA_APAGAR;}
<YYINITIAL> "arreglo" {c.linea=yyline; lexema=yytext(); return RESERVADA_ARREGLO;}
<YYINITIAL> "arriba" {c.linea=yyline; lexema=yytext(); return RESERVADA_ARRIBA;}
<YYINITIAL> "atras" {c.linea=yyline; lexema=yytext(); return RESERVADA_ATRAS;}
<YYINITIAL> "calibrar" {c.linea=yyline; lexema=yytext(); return RESERVADA_CALIBRAR;}
<YYINITIAL> "captura" {c.linea=yyline; lexema=yytext(); return RESERVADA_CAPTURA;}
<YYINITIAL> "caracter" {c.linea=yyline; lexema=yytext(); return RESERVADA_CARACTER;}
<YYINITIAL> "cargar" {c.linea=yyline; lexema=yytext(); return RESERVADA_CARGAR;}
<YYINITIAL> "ciclo" {c.linea=yyline; lexema=yytext(); return RESERVADA_CICLO;}
<YYINITIAL> "corto" {c.linea=yyline; lexema=yytext(); return RESERVADA_CORTO;}
<YYINITIAL> "decimal" {c.linea=yyline; lexema=yytext(); return RESERVADA_DECIMAL;}
<YYINITIAL> "declaracion" {c.linea=yyline; lexema=yytext(); return RESERVADA_DECLARACION;}
<YYINITIAL> "derecha" {c.linea=yyline; lexema=yytext(); return RESERVADA_DERECHA;}
<YYINITIAL> "detener" {c.linea=yyline; lexema=yytext(); return RESERVADA_DETENER;}
<YYINITIAL> "direccionar" {c.linea=yyline; lexema=yytext(); return RESERVADA_DIRECCIONAR;}
<YYINITIAL> "ejecutar" {c.linea=yyline; lexema=yytext(); return RESERVADA_EJECUTAR;}
<YYINITIAL> "encender" {c.linea=yyline; lexema=yytext(); return RESERVADA_ENCENDER;}
<YYINITIAL> "esperar" {c.linea=yyline; lexema=yytext(); return RESERVADA_ESPERAR;}
<YYINITIAL> "fijo" {c.linea=yyline; lexema=yytext(); return RESERVADA_FIJO;}
<YYINITIAL> "girar" {c.linea=yyline; lexema=yytext(); return RESERVADA_GIRAR;}
<YYINITIAL> "haz" {c.linea=yyline; lexema=yytext(); return RESERVADA_HAZ;}
<YYINITIAL> "imprimir" {c.linea=yyline; lexema=yytext(); return RESERVADA_IMPRIMIR;}
<YYINITIAL> "izquierda" {c.linea=yyline; lexema=yytext(); return RESERVADA_IZQUIERDA;}
<YYINITIAL> "largo" {c.linea=yyline; lexema=yytext(); return RESERVADA_LARGO;}
<YYINITIAL> "leer" {c.linea=yyline; lexema=yytext(); return RESERVADA_LEER;}
<YYINITIAL> "nulo" {c.linea=yyline; lexema=yytext(); return RESERVADA_NULO;}
<YYINITIAL> "parav" {c.linea=yyline; lexema=yytext(); return RESERVADA_PARAV;}
<YYINITIAL> "pin" {c.linea=yyline; lexema=yytext(); return RESERVADA_PIN;}
<YYINITIAL> "regresa" {c.linea=yyline; lexema=yytext(); return RESERVADA_REGRESA;}
<YYINITIAL> "retorno" {c.linea=yyline; lexema=yytext(); return RESERVADA_RETORNO;}
<YYINITIAL> "ruta" {c.linea=yyline; lexema=yytext(); return RESERVADA_RUTA;}
<YYINITIAL> "seguir" {c.linea=yyline; lexema=yytext(); return RESERVADA_SEGUIR;}
<YYINITIAL> "video" {c.linea=yyline; lexema=yytext(); return RESERVADA_VIDEO;}
<YYINITIAL> "falso" {c.linea=yyline; lexema=yytext(); return RESERVADA_FALSO;}
<YYINITIAL> "verdadero" {c.linea=yyline; lexema=yytext(); return RESERVADA_VERDADERO;}
<YYINITIAL> {enteros} {c.linea=yyline; lexema=yytext(); return NUMERO;}
<YYINITIAL> {numDec} {c.linea=yyline; lexema=yytext(); return NUMERO_DECIMAL;}
<YYINITIAL> {numExp} {c.linea=yyline; lexema=yytext(); return NUMERO_EXPONENTE;}
<YYINITIAL> {iden} {c.linea=yyline; lexema=yytext(); return IDENTIFICADOR;}
<YYINITIAL> {invalido} {c.linea=yyline; lexema=yytext(); return ERROR;}
 . {c.linea=yyline; lexema=yytext(); return ERROR;}
