package analizador;
import java.io.*;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%column
D = [0-9]
S = \+|\-
L=[a-z]
LE=[A-Za-z]
SE  =[(\)\=\+\-\>\<\.\*\\\|\&\^\@\%\’\_]
Snp  =[\"\#\$\&\¿\?\¨\[\]\{\}\`\~]

iden={ L } ( { L } | { D } | _ ){ 0 , 31 }

alfabeto = (~{SIMBOLOS_ESP}|~{D}|~{L})

idSimbolo = ({L}|{Snp})+
num = {D}+
enteros = {S}?{num}
numDec =  {S}?{num}?\.{num}
numExp =  {S}?{num}?(\.{num})?e{ enteros }
ideConMayus = ({LE}|D)+
ideEmpNum = {D}({LE}|{D})+
ESCAPE=[ \t\r\n]

cadena = (\')~(\')

errorPuntos = (\.)*{num}?((\.*)|({num}))*

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
    modelos.InformacionLexemaS c = new modelos.InformacionLexemaS();
%}

%%

{ESCAPE} {/*Ignore*/}
"--".* {/*Ignore*/}
"---"~"---" { }

<YYINITIAL> "+" {return new Symbol(sym.OPERADOR_MAS,yychar,yyline,yytext());}
<YYINITIAL> "=" {return new Symbol(sym.ASIGNACION, yychar, yyline, yytext());}
<YYINITIAL> "==" {return new Symbol(sym.OPERADOR_IGUALDAD, yychar, yyline, yytext());}
<YYINITIAL> "-" {return new Symbol(sym.OPERADOR_MENOS, yychar, yyline, yytext());}
<YYINITIAL> "*" {return new Symbol(sym.OPERADOR_POR, yychar, yyline, yytext());}
<YYINITIAL> "/" {return new Symbol(sym.OPERADOR_DIVISION, yychar, yyline, yytext());}
<YYINITIAL> "&" {return new Symbol(sym.OPERADOR_Y, yychar, yyline, yytext());}
<YYINITIAL> "|" {return new Symbol(sym.OPERADOR_O, yychar, yyline, yytext());}
<YYINITIAL> "^" {return new Symbol(sym.OPERADOR_OR, yychar, yyline, yytext());}
<YYINITIAL> "!" {return new Symbol(sym.OPERADOR_NEGACION, yychar, yyline, yytext());}
<YYINITIAL> "%" {return new Symbol(sym.OPERADOR_MODULO, yychar, yyline, yytext());}
<YYINITIAL> ";" {return new Symbol(sym.PUNTO_COMA, yychar, yyline, yytext());}
<YYINITIAL> "(" {return new Symbol(sym.PARENTESIS_IZQ, yychar, yyline, yytext());}
<YYINITIAL> ")" {return new Symbol(sym.PARENTESIS_DER, yychar, yyline, yytext());}
<YYINITIAL> ">" {return new Symbol(sym.MAYOR, yychar, yyline, yytext());}
<YYINITIAL> "<" {return new Symbol(sym.MENOR, yychar, yyline, yytext());}
<YYINITIAL> ">=" {return new Symbol(sym.MAYOR_IGUAL, yychar, yyline, yytext());}
<YYINITIAL> "<=" {return new Symbol(sym.MENOR_IGUAL, yychar, yyline, yytext());}
<YYINITIAL> "<>" {return new Symbol(sym.DESIGUAL, yychar, yyline, yytext());}
<YYINITIAL> ":" {return new Symbol(sym.DOS_PUNTOS, yychar, yyline, yytext());}
<YYINITIAL> "," {return new Symbol(sym.COMA, yychar, yyline, yytext());}
<YYINITIAL> "'" {return new Symbol(sym.COMILLA_SIMPLE, yychar, yyline, yytext());}
<YYINITIAL> "@" {return new Symbol(sym.ARROBA, yychar, yyline, yytext());}

<YYINITIAL> "entero" {return new Symbol(sym.RESERVADA_ENTERO, yychar, yyline, yytext());}
<YYINITIAL> "cadena" {return new Symbol(sym.RESERVADA_CADENA, yychar, yyline, yytext());}
<YYINITIAL> "iniciar" {return new Symbol(sym.RESERVADA_INICIAR, yychar, yyline, yytext());}
<YYINITIAL> "fin" {return new Symbol(sym.RESERVADA_FIN, yychar, yyline, yytext());}
<YYINITIAL> "funcion" {return new Symbol(sym.RESERVADA_FUNCION, yychar, yyline, yytext());}
<YYINITIAL> "si" {return new Symbol(sym.RESERVADA_SI, yychar, yyline, yytext());}
<YYINITIAL> "no" {return new Symbol(sym.RESERVADA_NO, yychar, yyline, yytext());}
<YYINITIAL> "mientras" {return new Symbol(sym.RESERVADA_MIENTRAS, yychar, yyline, yytext());}
<YYINITIAL> "para" {return new Symbol(sym.RESERVADA_PARA, yychar, yyline, yytext());}
<YYINITIAL> "booleano" {return new Symbol(sym.RESERVADA_BOOLEANO, yychar, yyline, yytext());}
<YYINITIAL> "principal" {return new Symbol(sym.RESERVADA_PRINCIPAL, yychar, yyline, yytext());}
<YYINITIAL> "@abajo" {return new Symbol(sym.RESERVADA_ABAJO, yychar, yyline, yytext());}
<YYINITIAL> "@acelerar" {return new Symbol(sym.RESERVADA_ACELERAR, yychar, yyline, yytext());}
<YYINITIAL> "@adelante" {return new Symbol(sym.RESERVADA_ADELANTE, yychar, yyline, yytext());}
<YYINITIAL> "@apagar" {return new Symbol(sym.RESERVADA_APAGAR, yychar, yyline, yytext());}
<YYINITIAL> "arreglo" {return new Symbol(sym.RESERVADA_ARREGLO, yychar, yyline, yytext());}
<YYINITIAL> "@arriba" {return new Symbol(sym.RESERVADA_ARRIBA, yychar, yyline, yytext());}
<YYINITIAL> "@atras" {return new Symbol(sym.RESERVADA_ATRAS, yychar, yyline, yytext());}
<YYINITIAL> "@calibrar" {return new Symbol(sym.RESERVADA_CALIBRAR, yychar, yyline, yytext());}
<YYINITIAL> "@captura" {return new Symbol(sym.RESERVADA_CAPTURA, yychar, yyline, yytext());}
<YYINITIAL> "caracter" {return new Symbol(sym.RESERVADA_CARACTER, yychar, yyline, yytext());}
<YYINITIAL> "@cargar" {return new Symbol(sym.RESERVADA_CARGAR, yychar, yyline, yytext());}
<YYINITIAL> "ciclo" {return new Symbol(sym.RESERVADA_CICLO, yychar, yyline, yytext());}
<YYINITIAL> "corto" {return new Symbol(sym.RESERVADA_CORTO, yychar, yyline, yytext());}
<YYINITIAL> "decimal" {return new Symbol(sym.RESERVADA_DECIMAL, yychar, yyline, yytext());}
<YYINITIAL> "declaracion" {return new Symbol(sym.RESERVADA_DECLARACION, yychar, yyline, yytext());}
<YYINITIAL> "@derecha" {return new Symbol(sym.RESERVADA_DERECHA, yychar, yyline, yytext());}
<YYINITIAL> "@detener" {return new Symbol(sym.RESERVADA_DETENER, yychar, yyline, yytext());}
<YYINITIAL> "@direccionar" {return new Symbol(sym.RESERVADA_DIRECCIONAR, yychar, yyline, yytext());}
<YYINITIAL> "ejecutar" {return new Symbol(sym.RESERVADA_EJECUTAR, yychar, yyline, yytext());}
<YYINITIAL> "@encender" {return new Symbol(sym.RESERVADA_ENCENDER, yychar, yyline, yytext());}
<YYINITIAL> "@esperar" {return new Symbol(sym.RESERVADA_ESPERAR, yychar, yyline, yytext());}
<YYINITIAL> "@fijo" {return new Symbol(sym.RESERVADA_FIJO, yychar, yyline, yytext());}
<YYINITIAL> "@girar" {return new Symbol(sym.RESERVADA_GIRAR, yychar, yyline, yytext());}
<YYINITIAL> "@haz" {return new Symbol(sym.RESERVADA_HAZ, yychar, yyline, yytext());}
<YYINITIAL> "@imprimir" {return new Symbol(sym.RESERVADA_IMPRIMIR, yychar, yyline, yytext());}
<YYINITIAL> "@izquierda" {return new Symbol(sym.RESERVADA_IZQUIERDA, yychar, yyline, yytext());}
<YYINITIAL> "@largo" {return new Symbol(sym.RESERVADA_LARGO, yychar, yyline, yytext());}
<YYINITIAL> "@leer" {return new Symbol(sym.RESERVADA_LEER, yychar, yyline, yytext());}
<YYINITIAL> "nulo" {return new Symbol(sym.RESERVADA_NULO, yychar, yyline, yytext());}
<YYINITIAL> "@parav" {return new Symbol(sym.RESERVADA_PARAV, yychar, yyline, yytext());}
<YYINITIAL> "@pin" {return new Symbol(sym.RESERVADA_PIN, yychar, yyline, yytext());}
<YYINITIAL> "@regresa" {return new Symbol(sym.RESERVADA_REGRESA, yychar, yyline, yytext());}
<YYINITIAL> "@retorno" {return new Symbol(sym.RESERVADA_RETORNO, yychar, yyline, yytext());}
<YYINITIAL> "@ruta" {return new Symbol(sym.RESERVADA_RUTA, yychar, yyline, yytext());}
<YYINITIAL> "@seguir" {return new Symbol(sym.RESERVADA_SEGUIR, yychar, yyline, yytext());}
<YYINITIAL> "@video" {return new Symbol(sym.RESERVADA_VIDEO, yychar, yyline, yytext());}
<YYINITIAL> "falso" {return new Symbol(sym.RESERVADA_FALSO, yychar, yyline, yytext());}
<YYINITIAL> "verdadero" {return new Symbol(sym.RESERVADA_VERDADERO, yychar, yyline, yytext());}
<YYINITIAL> {cadena} {return new Symbol(sym.CADENA_TEXTO, yychar, yyline, yytext());}
<YYINITIAL> {enteros} {return new Symbol(sym.NUMERO, yychar, yyline, yytext());}
<YYINITIAL> {numDec} {return new Symbol(sym.NUMERO_DECIMAL, yychar, yyline, yytext());}
<YYINITIAL> {numExp} {return new Symbol(sym.NUMERO_EXPONENTE, yychar, yyline, yytext());}
<YYINITIAL> {errorPuntos} {return new Symbol(sym.ERROR_PUNTOS, yychar, yyline, yytext());}
<YYINITIAL> {iden} {return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());}
<YYINITIAL> {iden}[\(][\)] {return new Symbol(sym.IDENTIFICADOR_ARREGLO, yychar, yyline, yytext());}
<YYINITIAL> {Snp}+ {return new Symbol(sym.SNP, yychar, yyline, yytext());}
<YYINITIAL> [\@]{iden} {return new Symbol(sym.ERROR_ARROBA, yychar, yyline, yytext());}
<YYINITIAL> {idSimbolo} {return new Symbol(sym.ID_CON_SIMBOLOS, yychar, yyline, yytext());}
<YYINITIAL> [\@]{ideConMayus} {return new Symbol(sym.ERROR_ARROBA_MAYUS, yychar, yyline, yytext());}
<YYINITIAL> [\@]{ideEmpNum} {return new Symbol(sym.ERROR_ARROBA_NUM, yychar, yyline, yytext());}
<YYINITIAL> {ideConMayus} {return new Symbol(sym.ERROR_MAYUS, yychar, yyline, yytext());}
<YYINITIAL> {ideEmpNum} {return new Symbol(sym.ERROR_ID_NUM, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
