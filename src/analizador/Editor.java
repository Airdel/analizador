package analizador;

import java.awt.Toolkit;
import modelos.InformacionLexema;
import tablas.TablaIdentificadores;
import tablas.TablaIdentificadores;
import tablas.TablaReservadas;
import tablas.TablaReservadas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Simbolos;
import tablas.TablaSimbolos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author teodoro
 */
public class Editor extends javax.swing.JFrame {

    NumeroLinea numeroLinea;
    private ArrayList<String> identificadores = new ArrayList<String>();
    private ArrayList<Simbolos> simbolos = new ArrayList<Simbolos>();
    private boolean errores_lexicos;
    private DefaultTableModel m = new DefaultTableModel();

    public Editor() {
        initComponents();
        setLocationRelativeTo(null);
        m = (DefaultTableModel) tablaMensajes.getModel();
        numeroLinea = new NumeroLinea(txtEditor);
        scrollEditor.setRowHeaderView(numeroLinea);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/icono.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        scrollEditor = new javax.swing.JScrollPane();
        txtEditor = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtErrores = new javax.swing.JTextArea();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMensajes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        miGuardarComo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miReservadas = new javax.swing.JMenuItem();
        miSimbolo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miLexico = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sin titulo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEditor.setColumns(20);
        txtEditor.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtEditor.setRows(2);
        txtEditor.setTabSize(4);
        txtEditor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditorKeyReleased(evt);
            }
        });
        scrollEditor.setViewportView(txtEditor);

        getContentPane().add(scrollEditor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        txtErrores.setEditable(false);
        txtErrores.setColumns(20);
        txtErrores.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtErrores.setForeground(new java.awt.Color(255, 51, 51));
        txtErrores.setRows(5);
        jScrollPane3.setViewportView(txtErrores);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 395, 924, 159));
        getContentPane().add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        tablaMensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Comp Lex", "Lexema", "Línea"
            }
        ));
        jScrollPane2.setViewportView(tablaMensajes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 389));

        jMenu2.setText("Archivo");

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miNuevo.setText("Nuevo");
        miNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoActionPerformed(evt);
            }
        });
        jMenu2.add(miNuevo);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAbrir.setText("Abrir");
        miAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirActionPerformed(evt);
            }
        });
        jMenu2.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miGuardar.setText("Guardar");
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        jMenu2.add(miGuardar);

        miGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miGuardarComo.setText("Guardar como");
        miGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarComoActionPerformed(evt);
            }
        });
        jMenu2.add(miGuardarComo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tablas");

        miReservadas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miReservadas.setText("Reservadas");
        miReservadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReservadasActionPerformed(evt);
            }
        });
        jMenu3.add(miReservadas);

        miSimbolo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSimbolo.setText("Simbolos");
        miSimbolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSimboloActionPerformed(evt);
            }
        });
        jMenu3.add(miSimbolo);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Lexico");

        miLexico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miLexico.setText("Analizar");
        miLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLexicoActionPerformed(evt);
            }
        });
        jMenu1.add(miLexico);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miReservadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReservadasActionPerformed
        TablaReservadas tr = new TablaReservadas();
        tr.setVisible(true);
    }//GEN-LAST:event_miReservadasActionPerformed

    private void miSimboloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSimboloActionPerformed
        Collections.sort(simbolos);      
        TablaSimbolos ts = new TablaSimbolos(simbolos);
        ts.setVisible(true);
    }//GEN-LAST:event_miSimboloActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        // TODO add your handling code here:        
        int resp = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar el Archivo?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (resp == 0) {
            miGuardar.doClick();
            limpiar();
            abrirArchivo();
        }
        if (resp == 1) {
            limpiar();
            abrirArchivo();
        }
    }//GEN-LAST:event_miAbrirActionPerformed

    private void miGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_miGuardarComoActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        if (guardarComo) {
            guardarComo();
        } else {
            guardar();
        }

    }//GEN-LAST:event_miGuardarActionPerformed

    private void miLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLexicoActionPerformed
        // TODO add your handling code here:
//        mensajes.setText("");
        scrollEditor.setBounds(scrollEditor.getX(),scrollEditor.getY(),495,390);
        txtEditor.setBounds(txtEditor.getX(),txtEditor.getY(),495,390);
        int rowCount = m.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            m.removeRow(i);
        }
        simbolos.clear();
        txtErrores.setText("");
        identificadores.removeAll(identificadores);
        probarLexer();
    }//GEN-LAST:event_miLexicoActionPerformed

    private void txtEditorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorKeyReleased

    }//GEN-LAST:event_txtEditorKeyReleased

    private void miNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoActionPerformed
        int resp = JOptionPane.showConfirmDialog(null,
                "¿Desea guardar el Archivo?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (resp == 0) {
            miGuardar.doClick();
            limpiar();
        }
        if (resp == 1) {
            limpiar();
        }
    }//GEN-LAST:event_miNuevoActionPerformed

    private void limpiar() {
        txtEditor.setText("");
        txtErrores.setText("");
        guardarComo = true; 
        scrollEditor.setBounds(0,0,960,560);
        txtEditor.setBounds(0,0,960,560);
            
    }

    private void abrirArchivo(){
        ArrayList<String> linea = null;
        int resp = 0;
        String codigo = "";
        txtEditor.setText("");
        resp = jFileChooser1.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            linea = leerArchivo(jFileChooser1.getSelectedFile().toString());
            if (linea.size() > 0) {
                for (int i = 0; i < linea.size(); i++) {
                    codigo = (String) linea.get(i);
                    txtEditor.append(codigo + "\n");
                }
            }
            scrollEditor.setBounds(0,0,960,560);
            txtEditor.setBounds(0,0,960,560);
            
            guardarComo = false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    private File archivo;
    private java.io.FileOutputStream out;
    private java.io.FileInputStream in;
    private java.io.DataOutputStream fdw;
    private java.io.DataInputStream fdr;

    private boolean guardarComo = true;
    private boolean guardar = false;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miGuardarComo;
    private javax.swing.JMenuItem miLexico;
    private javax.swing.JMenuItem miNuevo;
    private javax.swing.JMenuItem miReservadas;
    private javax.swing.JMenuItem miSimbolo;
    private javax.swing.JScrollPane scrollEditor;
    private javax.swing.JTable tablaMensajes;
    private javax.swing.JTextArea txtEditor;
    private javax.swing.JTextArea txtErrores;
    // End of variables declaration//GEN-END:variables

    private void probarLexer() {
        InformacionLexema c = new InformacionLexema();

        File fichero = new File("fichero.and");
        PrintWriter writer;

        try {
            writer = new PrintWriter(fichero);
            writer.print(txtEditor.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }

        Reader reader;
        try {
            reader = new BufferedReader(new FileReader("fichero.and"));
            Lexer lexer = new Lexer(reader);
            String text = "";
            String errores = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    if (errores_lexicos) {
                        text += "\n¡¡¡ Terminado con errores !!! Revisar";
                    } else {
                        text += "\nRevisado sin errores";
                    }
                    for (Simbolos sim : simbolos) {
                        m.addRow(new Object[]{sim.getComponente(), sim.getLexema(), sim.getLinea()});
                    }
                    txtErrores.setText(errores);
                    errores_lexicos = false;
                    return;
                }

                switch (tokens) {
                    case ERROR:
                        errores = errores + "Error Lexico: " + lexer.lexema + " " + " "
                                + " Linea: " + (c.linea + 1) + " Columna: " + (c.columna + 1) + "\n";
                        errores_lexicos = true;
                        break;
//                    case IDENTIFICADOR:
//                        simbolos.add(new Simbolos(tokens.toString(),lexer.lexema,c.linea));
//                        identificadores.add(lexer.lexema);
//
//                        text = text + "Componente Lexico: " + tokens + " Lexema: " + lexer.lexema + "\n";
//                        break;
                    default:
                        simbolos.add(new Simbolos(tokens.toString(), lexer.lexema, (c.linea) + 1));
                        identificadores.add(lexer.lexema);
                        text = text + "Componente Lexico: " + tokens + " Lexema : " + lexer.lexema + "\n";
                        break;

                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
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
            setTitle(nombre);
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

    private void guardar() {
        FileWriter save = null;
        try {
            save = new FileWriter(archivo.getAbsolutePath());
            save.write(txtEditor.getText());
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
            if (file.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                archivo = file.getSelectedFile();
                if (archivo != null) {
                    FileWriter save = new FileWriter(archivo.getAbsolutePath() + ".lya");
                    String nombre = archivo.getName();
                    setTitle(nombre);
                    save.write(txtEditor.getText());
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

}
