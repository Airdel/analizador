package analizador;

import controladores.ControladorEditor;
import java.awt.Color;
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
        txtEditor.getCursor();
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
        JM_Principal = new javax.swing.JMenuBar();
        JM_Archivo = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        miGuardarComo = new javax.swing.JMenuItem();
        JM_Tablas = new javax.swing.JMenu();
        miIden = new javax.swing.JMenuItem();
        miReservadas = new javax.swing.JMenuItem();
        miSimbolo = new javax.swing.JMenuItem();
        JM_Lexico = new javax.swing.JMenu();
        miLexico = new javax.swing.JMenuItem();
        JM_Vista = new javax.swing.JMenu();
        JM_Tema = new javax.swing.JMenu();
        rbtn_Claro = new javax.swing.JRadioButtonMenuItem();
        rbtn_Oscuro = new javax.swing.JRadioButtonMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sin titulo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEditor.setColumns(20);
        txtEditor.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtEditor.setRows(2);
        txtEditor.setTabSize(3);
        txtEditor.setMaximumSize(new java.awt.Dimension(220, 38));
        txtEditor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorKeyTyped(evt);
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

        JM_Principal.setMaximumSize(new java.awt.Dimension(178, 21));
        JM_Principal.setName("JM_Principal"); // NOI18N

        JM_Archivo.setText("Archivo");

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miNuevo.setText("Nuevo");
        JM_Archivo.add(miNuevo);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAbrir.setText("Abrir");
        JM_Archivo.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miGuardar.setText("Guardar");
        JM_Archivo.add(miGuardar);

        miGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miGuardarComo.setText("Guardar como");
        JM_Archivo.add(miGuardarComo);

        JM_Principal.add(JM_Archivo);

        JM_Tablas.setText("Tablas");

        miIden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miIden.setText("Identificadores");
        miIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIdenActionPerformed(evt);
            }
        });
        JM_Tablas.add(miIden);

        miReservadas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miReservadas.setText("Reservadas");
        JM_Tablas.add(miReservadas);

        miSimbolo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSimbolo.setText("Operadores");
        JM_Tablas.add(miSimbolo);

        JM_Principal.add(JM_Tablas);

        JM_Lexico.setText("Lexico");

        miLexico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miLexico.setText("Analizar");
        miLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLexicoActionPerformed(evt);
            }
        });
        JM_Lexico.add(miLexico);

        JM_Principal.add(JM_Lexico);

        JM_Vista.setText("Vista");

        JM_Tema.setText("Tema");

        rbtn_Claro.setText("Claro");
        rbtn_Claro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_ClaroMouseClicked(evt);
            }
        });
        rbtn_Claro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ClaroActionPerformed(evt);
            }
        });
        JM_Tema.add(rbtn_Claro);

        rbtn_Oscuro.setText("Oscuro");
        rbtn_Oscuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn_OscuroMouseClicked(evt);
            }
        });
        rbtn_Oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_OscuroActionPerformed(evt);
            }
        });
        JM_Tema.add(rbtn_Oscuro);

        JM_Vista.add(JM_Tema);

        JM_Principal.add(JM_Vista);

        setJMenuBar(JM_Principal);
        JM_Principal.getAccessibleContext().setAccessibleName("");

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
        System.out.println(txtEditor.getSize().width + "-" + txtEditor.getSize().height);
    }//GEN-LAST:event_miLexicoActionPerformed

    private void txtEditorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorKeyReleased
//        lbCaracteres.setText(contarCar() + "");
//        lbPalabras.setText(contarPal() + "");
//        System.out.println(txtEditor.getSize().width+"-"+txtEditor.getSize().height);
    }//GEN-LAST:event_txtEditorKeyReleased

    private void miIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIdenActionPerformed
        // TODO add your handling code here:
        Collections.sort(simbolos);
        TablaIdentificadores ts = new TablaIdentificadores(simbolos);
        ts.setVisible(true);
    }//GEN-LAST:event_miIdenActionPerformed

    private void rbtn_ClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ClaroActionPerformed
        if (rbtn_Claro.isSelected()) {
            //---------------------------------
            rbtn_Claro.setEnabled(false);
            rbtn_Oscuro.setEnabled(true);
            rbtn_Oscuro.setSelected(false);
            System.out.print("Tema Claro aplicado! ");
            //---------------------------------

            txtEditor.setBackground(Color.white);
            txtEditor.setForeground(Color.black);

            JM_Principal.setBackground(Color.white);
            JM_Principal.setForeground(Color.black);
            JM_Archivo.setBackground(Color.white);
            JM_Archivo.setForeground(Color.black);
            JM_Lexico.setBackground(Color.white);
            JM_Lexico.setForeground(Color.black);
            JM_Tablas.setBackground(Color.white);
            JM_Tablas.setForeground(Color.black);
            JM_Tema.setBackground(Color.white);
            JM_Tema.setForeground(Color.black);
            JM_Vista.setBackground(Color.white);
            JM_Vista.setForeground(Color.black);

            miAbrir.setBackground(Color.white);
            miAbrir.setForeground(Color.black);
            miGuardar.setBackground(Color.white);
            miGuardar.setForeground(Color.black);
            miGuardarComo.setBackground(Color.white);
            miGuardarComo.setForeground(Color.black);
            miIden.setBackground(Color.white);
            miIden.setForeground(Color.black);
            miLexico.setBackground(Color.white);
            miLexico.setForeground(Color.black);
            miNuevo.setBackground(Color.white);
            miNuevo.setForeground(Color.black);
            miReservadas.setBackground(Color.white);
            miReservadas.setForeground(Color.black);
            miSimbolo.setBackground(Color.white);
            miSimbolo.setForeground(Color.black);
            rbtn_Claro.setBackground(Color.white);
            rbtn_Claro.setForeground(Color.black);
            rbtn_Oscuro.setBackground(Color.white);
            rbtn_Oscuro.setForeground(Color.black);
            tablaMensajes.setBackground(Color.white);
            tablaMensajes.setForeground(Color.black);

        }
        if (rbtn_Claro.isSelected() == false) {
            System.out.print("Invalido");
        }
    }//GEN-LAST:event_rbtn_ClaroActionPerformed

    private void rbtn_ClaroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_ClaroMouseClicked
    }//GEN-LAST:event_rbtn_ClaroMouseClicked

    private void rbtn_OscuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn_OscuroMouseClicked

    }//GEN-LAST:event_rbtn_OscuroMouseClicked


    private void rbtn_OscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_OscuroActionPerformed
        if (rbtn_Oscuro.isSelected()) {
            rbtn_Oscuro.setEnabled(false);

            rbtn_Claro.setEnabled(true);
            rbtn_Claro.setSelected(false);
            System.out.print("Tema Oscuro aplicado! ");
            //--------------------------------------------
            txtEditor.setBackground(Color.black);
            txtEditor.setForeground(Color.white);
            txtErrores.setBackground(Color.black);
            txtErrores.setForeground(Color.white);

            JM_Principal.setBackground(Color.black);
            JM_Principal.setForeground(Color.white);
            JM_Archivo.setBackground(Color.black);
            JM_Archivo.setForeground(Color.white);
            JM_Lexico.setBackground(Color.black);
            JM_Lexico.setForeground(Color.white);
            JM_Tablas.setBackground(Color.black);
            JM_Tablas.setForeground(Color.white);
            JM_Tema.setBackground(Color.black);
            JM_Tema.setForeground(Color.white);
            JM_Vista.setBackground(Color.black);
            JM_Vista.setForeground(Color.white);

            miAbrir.setBackground(Color.black);
            miAbrir.setForeground(Color.white);
            miGuardar.setBackground(Color.black);
            miGuardar.setForeground(Color.white);
            miGuardarComo.setBackground(Color.black);
            miGuardarComo.setForeground(Color.white);
            miIden.setBackground(Color.black);
            miIden.setForeground(Color.white);
            miLexico.setBackground(Color.black);
            miLexico.setForeground(Color.white);
            miNuevo.setBackground(Color.black);
            miNuevo.setForeground(Color.white);
            miReservadas.setBackground(Color.black);
            miReservadas.setForeground(Color.white);
            miSimbolo.setBackground(Color.black);
            miSimbolo.setForeground(Color.white);
            rbtn_Claro.setBackground(Color.black);
            rbtn_Claro.setForeground(Color.white);
            rbtn_Oscuro.setBackground(Color.black);
            rbtn_Oscuro.setForeground(Color.white);
            tablaMensajes.setBackground(Color.black);
            tablaMensajes.setForeground(Color.white);
        }
        if (rbtn_Claro.isSelected() == false) {
            System.out.print("Invalido");
        }
    }//GEN-LAST:event_rbtn_OscuroActionPerformed

    private void txtEditorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorKeyTyped
//        lbCaracteres.setText(contarCar() + "");
//        lbPalabras.setText(contarPal() + "");
//        System.out.println(txtEditor.getSize().width+"-"+txtEditor.getSize().height);
    }//GEN-LAST:event_txtEditorKeyTyped

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
    private javax.swing.JMenu JM_Archivo;
    private javax.swing.JMenu JM_Lexico;
    private javax.swing.JMenuBar JM_Principal;
    private javax.swing.JMenu JM_Tablas;
    private javax.swing.JMenu JM_Tema;
    private javax.swing.JMenu JM_Vista;
    public javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
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
    private javax.swing.JRadioButtonMenuItem rbtn_Claro;
    private javax.swing.JRadioButtonMenuItem rbtn_Oscuro;
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
                    case RESERVADA_SI:
                         m.addRow(new Object[]{"Empieza condicional si", lexer.lexema, (c.linea) + 1});
                        break;
                    case RESERVADA_NO:
                         m.addRow(new Object[]{"Empieza condicional no", lexer.lexema, (c.linea) + 1});
                        break;
                    case RESERVADA_PARA:
                        m.addRow(new Object[]{"Empieza ciclo para", lexer.lexema, (c.linea) + 1});
                        break;
                    case RESERVADA_MIENTRAS:
                        m.addRow(new Object[]{"Empieza ciclo mientras", lexer.lexema, (c.linea) + 1});
                        break;
                    case RESERVADA_ENTERO:
                         m.addRow(new Object[]{"Declara variable tipo Entero", lexer.lexema, (c.linea) + 1});
                        break;
                    case RESERVADA_CADENA:
                         m.addRow(new Object[]{"Declara variable tipo Cadena", lexer.lexema, (c.linea) + 1});
                        break;
                    case RESERVADA_BOOLEANO:
                         m.addRow(new Object[]{"Declara variable tipo booleana", lexer.lexema, (c.linea) + 1});
                         break;
                    case RESERVADA_INICIAR:
                        m.addRow(new Object[]{"Iniciar programa", lexer.lexema, (c.linea) + 1});
                        break;
                    case DOS_PUNTOS:
                        m.addRow(new Object[]{"Simbolo de inicio : ", lexer.lexema, (c.linea) + 1});
                        break;
                    case PUNTO_COMA:
                        m.addRow(new Object[]{"Simbolo de fin de sentenia ; ", lexer.lexema, (c.linea) + 1});
                        break;
                    case ERROR:
                        errores = errores + "Error Lexicoen linea: " + (c.linea + 1) + ". El símbolo '" + lexer.lexema + "' no pertenece al lenguaje\n";
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
                        simbolos.add(new Simbolos(tokens.toString(), lexer.lexema, (c.linea) + 1));
                        identificadores.add(lexer.lexema);
//                        errores = errores + "Componente Lexico: " + tokens + " Lexema : " + lexer.lexema + "\n";
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
