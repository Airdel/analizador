/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class Simbolos {
    
    private String componente;
    private String lexema;
    private int linea;

    public Simbolos(String componente, String lexema, int linea) {
        this.componente = componente;
        this.lexema = lexema;
        this.linea = linea;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Simbolos{" + "componente=" + componente + ", lexema=" + lexema + ", linea=" + linea + '}';
    }    
}
