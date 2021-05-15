package analizador;


import java.io.File;


public class PrincipalAnalizador {

    public static void main(String[] args) {
        String path = "C:/Users/danyc/Downloads/numeroLineas-master/src/analizador/Lexer.flex";
        generarLexer(path);
    }

    private static void generarLexer(String path) {
        File file = new File(path);
        JFlex.Main.generate(file);
    }
        
}
