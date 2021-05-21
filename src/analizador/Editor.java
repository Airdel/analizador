package analizador;

import tablas.TablaIdentificadores;
import tablas.TablaIdentificadores;
import tablas.TablaReservadas;
import tablas.TablaReservadas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

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
    private ArrayList<Identificador> ids = new ArrayList<Identificador>();
    private boolean errores_lexicos;
    
    public Editor() {
        initComponents();
        numeroLinea = new NumeroLinea(editor);
        jScrollPane1.setRowHeaderView(numeroLinea);
        //numLine.setText(numeroLinea.getTextLineNumber(PROPERTIES));
        scrollMensajes.setLocation(400, 40);
        scrollMensajes.setSize(10, 40);
        mensajes.setSize(10, 40);
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
        scrollMensajes = new javax.swing.JScrollPane();
        mensajes = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtErrores = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        editor = new javax.swing.JTextArea();
        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        miGuardarComo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miLexico = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensajes.setEditable(false);
        mensajes.setColumns(20);
        mensajes.setRows(5);
        scrollMensajes.setViewportView(mensajes);

        txtErrores.setEditable(false);
        txtErrores.setColumns(20);
        txtErrores.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtErrores.setForeground(new java.awt.Color(255, 51, 51));
        txtErrores.setRows(5);
        jScrollPane3.setViewportView(txtErrores);

        editor.setColumns(20);
        editor.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        editor.setRows(2);
        editor.setTabSize(4);
        editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(editor);

        jMenu2.setText("Archivo");

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

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Reservadas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Identificadores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        scrollMensajes.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TablaReservadas tr = new TablaReservadas();
        tr.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        TablaIdentificadores ti = new TablaIdentificadores(identificadores);
        ti.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        // TODO add your handling code here:
        ArrayList<String> linea = null;
        int resp = 0;
        String codigo = "";
        
        resp = jFileChooser1.showOpenDialog(this);
        if(resp == JFileChooser.APPROVE_OPTION){
            linea = leerArchivo(jFileChooser1.getSelectedFile().toString());
            if(linea.size()>0)
                for(int i = 0;i<linea.size();i++){
                    codigo = (String) linea.get(i);
                    editor.append(codigo+"\n");
                }
        }       
    }//GEN-LAST:event_miAbrirActionPerformed

    private void miGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarComoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miGuardarComoActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miGuardarActionPerformed

    private void miLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLexicoActionPerformed
        // TODO add your handling code here:
        mensajes.setText("");
        txtErrores.setText("");
        identificadores.removeAll(identificadores);
        probarLexer();
        identificadores.toString();
    }//GEN-LAST:event_miLexicoActionPerformed

    private void editorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorKeyReleased
   
    }//GEN-LAST:event_editorKeyReleased

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea editor;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea mensajes;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miGuardarComo;
    private javax.swing.JMenuItem miLexico;
    private javax.swing.JScrollPane scrollMensajes;
    private javax.swing.JTextArea txtErrores;
    // End of variables declaration//GEN-END:variables

    private void probarLexer(){
        InformacionAnalisis c = new InformacionAnalisis();
        
        File  fichero = new File("fichero.and");
        PrintWriter writer;
        
        try {
            writer = new PrintWriter(fichero);
            writer.print(editor.getText());
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
            while(true){
                Tokens tokens = lexer.yylex();
                if(tokens == null){
                    if(errores_lexicos)
                        text += "\n¡¡¡ Terminado con errores !!! Revisar";
                    else 
                        text += "\nRevisado sin errores" ;
                    mensajes.setText(text);
                    txtErrores.setText(errores);
                    errores_lexicos = false;
                    return;
                }
                
                switch(tokens){
                    case ERROR:
                        errores = errores+"Error Lexico: "+lexer.lexeme+" "+" "
                                +" Linea: "+(c.linea+1)+"\n";
                        errores_lexicos = true;
                        break;
                    case IDENTIFICADOR:
                        identificadores.add(lexer.lexeme);
                        
                        text = text+"Componente Lexico: "+tokens+" Lexema: "+ lexer.lexeme+"\n";
                        break;
                    default:
                         text = text+"Componente Lexico: "+tokens+" Lexema : "+ lexer.lexeme+"\n";
                        break;
                   
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
    
    private ArrayList<String> leerArchivo(String file){
        ArrayList<String> texto = null;
        FileReader fr = null;
        BufferedReader br = null;
        File f = null;
        String line = "";
        try{
            texto = new ArrayList<String>();
            f = new File(file);
            
            if(f.exists()){
                if(f.isFile()){
                    fr = new FileReader(f);
                    br = new BufferedReader(fr);
                    line = br.readLine();
                    while(line!=null){
                        if(!line.equalsIgnoreCase(""))
                            texto.add(line);
                        line = br.readLine();
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return texto;
    }
}
