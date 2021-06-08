package analizador;


import java.io.File;


public class GeneradorAF {

    public static void main(String[] args) {
        String path = "C:/analizador/src/analizador/Lexer.flex";
        generarLexer(path);
    }

    private static void generarLexer(String path) {
        File file = new File(path);
        JFlex.Main.generate(file);
    }        
}
