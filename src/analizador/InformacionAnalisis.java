package analizador;


public class InformacionAnalisis {
    
    public static int linea;
    public static String token;
    
    public static void guardarInformacionCodigo(int lineaG, String tokenG){
        linea = lineaG;
        token = tokenG;
    }
}
