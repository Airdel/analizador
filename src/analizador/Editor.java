package analizador;

import controladores.ControladorEditor;
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
import modelos.ModeloEditor;
import modelos.Simbolos;
import tablas.TablaOperadores;

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
        tablaMensajes.setAutoCreateRowSorter(true);
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
        jLabel1 = new javax.swing.JLabel();
        lbPalabras = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCaracteres = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        miGuardarComo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miIden = new javax.swing.JMenuItem();
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
        txtEditor.setTabSize(3);
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
        if (tablaMensajes.getColumnModel().getColumnCount() > 0) {
            tablaMensajes.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 389));

        jLabel1.setText("Palabras: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        lbPalabras.setText("---");
        getContentPane().add(lbPalabras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jLabel2.setText("Caracteres");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, -1, -1));

        lbCaracteres.setText("---");
        getContentPane().add(lbCaracteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        jMenu2.setText("Archivo");

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miNuevo.setText("Nuevo");
        jMenu2.add(miNuevo);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAbrir.setText("Abrir");
        jMenu2.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miGuardar.setText("Guardar");
        jMenu2.add(miGuardar);

        miGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miGuardarComo.setText("Guardar como");
        jMenu2.add(miGuardarComo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tablas");

        miIden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miIden.setText("Identificadores");
        miIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIdenActionPerformed(evt);
            }
        });
        jMenu3.add(miIden);

        miReservadas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miReservadas.setText("Reservadas");
        jMenu3.add(miReservadas);

        miSimbolo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSimbolo.setText("Operadores");
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

    private void miLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLexicoActionPerformed

        scrollEditor.setBounds(scrollEditor.getX(), scrollEditor.getY(), 495, 390);
        txtEditor.setBounds(txtEditor.getX(), txtEditor.getY(), 495, 390);
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
        lbCaracteres.setText(contarCar() + "");
        lbPalabras.setText(contarPal() + "");
    }//GEN-LAST:event_txtEditorKeyReleased

    private void miIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIdenActionPerformed
        // TODO add your handling code here:
        Collections.sort(simbolos);
        TablaIdentificadores ts = new TablaIdentificadores(simbolos);
        ts.setVisible(true);
    }//GEN-LAST:event_miIdenActionPerformed

    private void limpiar() {
        txtEditor.setText("");
        txtErrores.setText("");
        guardarComo = true;
        scrollEditor.setBounds(0, 0, 960, 560);
        txtEditor.setBounds(0, 0, 960, 560);

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

    private boolean guardarComo = true;
    private boolean guardar = false;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lbCaracteres;
    public javax.swing.JLabel lbPalabras;
    public javax.swing.JMenuItem miAbrir;
    public javax.swing.JMenuItem miGuardar;
    public javax.swing.JMenuItem miGuardarComo;
    public javax.swing.JMenuItem miIden;
    private javax.swing.JMenuItem miLexico;
    public javax.swing.JMenuItem miNuevo;
    public javax.swing.JMenuItem miReservadas;
    public javax.swing.JMenuItem miSimbolo;
    public javax.swing.JScrollPane scrollEditor;
    public javax.swing.JTable tablaMensajes;
    public javax.swing.JTextArea txtEditor;
    public javax.swing.JTextArea txtErrores;
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
            String errores = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
//                    for (Simbolos sim : simbolos) {
//                        m.addRow(new Object[]{sim.getComponente(), sim.getLexema(), sim.getLinea()});
//                    }
                    txtErrores.setText(errores);
                    return;
                }

                switch (tokens) {
                    case ERROR:
                        errores = errores + "Error Lexico: " + lexer.lexema + " " + " "
                                + " Linea: " + (c.linea + 1) + "\n";
                        errores_lexicos = true;
                        m.addRow(new Object[]{tokens.toString(), lexer.lexema, (c.linea) + 1});
                        break;
                    case ERROR_ID_NUM:
                    case ERROR_ARROBA_NUM:
                        errores = errores + "Error Lexico: " + lexer.lexema + " " + " "
                                + " Linea: " + (c.linea + 1) + ". Indentificador no puede comenzar con un dígito\n";
                        ;
                        errores_lexicos = true;
                        m.addRow(new Object[]{tokens.toString(), lexer.lexema, (c.linea) + 1});
                        break;
                    case ERROR_MAYUS:
                    case ERROR_ARROBA_MAYUS:
                        errores = errores + "Error Lexico: " + lexer.lexema + " " + " "
                                + " Linea: " + (c.linea + 1) + ". Las mayúsculas no están permitidas\n";
                        ;
                        errores_lexicos = true;
                        m.addRow(new Object[]{tokens.toString(), lexer.lexema, (c.linea) + 1});
                        break;
                    default:
//                        simbolos.add(new Simbolos(tokens.toString(), lexer.lexema, (c.linea) + 1));
//                        identificadores.add(lexer.lexema);
                        //errores = errores + "Componente Lexico: " + tokens + " Lexema : " + lexer.lexema + "\n";
                        m.addRow(new Object[]{tokens.toString(), lexer.lexema, (c.linea) + 1});
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

    private int contarCar() {
        String cad = txtEditor.getText().replace("\n", "");
        cad = cad.replace(" ", "");
        return cad.length();
    }

    private int contarPal() {
        String cad = txtEditor.getText().replace("\n", " ");
        String A[] = cad.split(" ");
        int p = 0;
        for (int i = 0; i < A.length; i++) {
            if (!A[i].equals("")) {
                p++;
            }
        }
        return p;
    }
}
