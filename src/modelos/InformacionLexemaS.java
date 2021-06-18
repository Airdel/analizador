package modelos;


public class InformacionLexemaS {
    
    public static int linea;
    public static int columna;
    public static String token;
    
    public static void guardarInformacionCodigo(int lineaG,int columnaG, String tokenG){
        linea = lineaG;
        columna = columnaG;
        token = tokenG;
    }
}
