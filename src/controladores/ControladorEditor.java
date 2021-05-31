/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import analizador.Editor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelos.ModeloEditor;
import modelos.Simbolos;
import tablas.TablaIdentificadores;
import tablas.TablaOperadores;
import tablas.TablaReservadas;

/**
 *
 * @author danyc
 */
public class ControladorEditor implements ActionListener {

    private Editor vista;
    private ModeloEditor modelo;

    private File archivo;
    private ArrayList<String> identificadores = new ArrayList<String>();
    private ArrayList<Simbolos> simbolos = new ArrayList<Simbolos>();
    private boolean guardarComo = true;

    public ControladorEditor(Editor vista, ModeloEditor modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.miAbrir.addActionListener(this);
        this.vista.miGuardar.addActionListener(this);
        this.vista.miGuardarComo.addActionListener(this);
        this.vista.miNuevo.addActionListener(this);
        this.vista.miIden.addActionListener(this);
        this.vista.miReservadas.addActionListener(this);
        this.vista.miSimbolo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.miAbrir) {
            int resp = JOptionPane.showConfirmDialog(null,
                    "¿Desea guardar el Archivo?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if (resp == 0) {
                vista.miGuardar.doClick();
                limpiar();
                abrirArchivo();
            }
            if (resp == 1) {
                limpiar();
                abrirArchivo();
            }
        }
        if (e.getSource() == vista.miGuardar) {
            if (guardarComo) {
                guardarComo();
            } else {
                guardar();
            }
        }
        if (e.getSource() == vista.miGuardarComo) {
            guardarComo();
        }

        if (e.getSource() == vista.miNuevo) {
            int resp = JOptionPane.showConfirmDialog(null,
                    "¿Desea guardar el Archivo?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if (resp == 0) {
                this.vista.miGuardar.doClick();
                limpiar();
            }
            if (resp == 1) {
                limpiar();
            }
        }

        if (e.getSource() == vista.miSimbolo) {
            Collections.sort(simbolos);
            TablaOperadores ts = new TablaOperadores();
            ts.setVisible(true);
        }
        if(e.getSource() == vista.miReservadas){
            TablaReservadas tr = new TablaReservadas();
            tr.setVisible(true);
        }

    }

    private void abrirArchivo() {
        ArrayList<String> linea = null;
        int resp = 0;
        String codigo = "";
        this.vista.txtEditor.setText("");
        resp = this.vista.jFileChooser1.showOpenDialog(this.vista);
        if (resp == JFileChooser.APPROVE_OPTION) {
            linea = leerArchivo(this.vista.jFileChooser1.getSelectedFile().toString());
            if (linea.size() > 0) {
                for (int i = 0; i < linea.size(); i++) {
                    codigo = (String) linea.get(i);
                    this.vista.txtEditor.append(codigo + "\n");

                }
            }
            this.vista.scrollEditor.setBounds(0, 0, 960, 560);
            this.vista.txtEditor.setBounds(0, 0, 960, 560);
            this.vista.lbCaracteres.setText(contarCar() + "");
            this.vista.lbPalabras.setText(contarPal() + "");
            guardarComo = false;
        }
    }

    private int contarCar() {
        String cad = this.vista.txtEditor.getText().replace("\n", "");
        cad = cad.replace(" ", "");
        return cad.length();
    }

    private int contarPal() {
        String cad = this.vista.txtEditor.getText().replace("\n", " ");
        String A[] = cad.split(" ");
        int p = 0;
        for (int i = 0; i < A.length; i++) {
            if (!A[i].equals("")) {
                p++;
            }
        }
        return p;
    }

    private void guardar() {
        FileWriter save = null;
        try {
            save = new FileWriter(archivo.getAbsolutePath());
            save.write(this.vista.txtEditor.getText());
            save.close();
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                save.close();
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void guardarComo() {
        try {
            JFileChooser file = new JFileChooser();
            if (file.showSaveDialog(this.vista) == JFileChooser.APPROVE_OPTION) {
                archivo = file.getSelectedFile();
                if (archivo != null) {
                    FileWriter save = new FileWriter(archivo.getAbsolutePath() + ".lya");
                    String nombre = archivo.getName();
                    this.vista.setTitle(nombre);
                    save.write(this.vista.txtEditor.getText());
                    save.close();
                    guardarComo = false;
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private ArrayList<String> leerArchivo(String file) {
        ArrayList<String> texto = null;
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        try {
            texto = new ArrayList<String>();
            archivo = new File(file);
            String nombre = archivo.getName();
            this.vista.setTitle(nombre);
            if (archivo.exists()) {
                if (archivo.isFile()) {
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    line = br.readLine();
                    while (line != null) {
                        if (!line.equalsIgnoreCase("")) {
                            texto.add(line);
                        }
                        line = br.readLine();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return texto;
    }

    private void limpiar() {
        this.vista.txtEditor.setText("");
        this.vista.txtErrores.setText("");
        guardarComo = true;
        this.vista.scrollEditor.setBounds(0, 0, 960, 560);
        this.vista.txtEditor.setBounds(0, 0, 960, 560);
    }
}
