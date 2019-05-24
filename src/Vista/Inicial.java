/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import markov.Markov;

/**
 *
 * @author LENOVO
 */
public class Inicial extends javax.swing.JFrame {
    
    private Image imagen=null;
    int carta;

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JPanel1 = new javax.swing.JPanel();
        btnSubirImagen = new javax.swing.JButton();
        boxCarta = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        labelCarta = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnMarkov = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        btnNext1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRE DE LA EMPRESA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubirImagen.setText("Subir Imagen");
        btnSubirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirImagenActionPerformed(evt);
            }
        });

        boxCarta.setModel(new javax.swing.DefaultComboBoxModel(new Item[] {new Item(1,"A - AS"), new Item(2,"2 - DOS"), new Item(3,"3 - TRES"), new Item(4,"4 - CUATRO"), new Item(5,"5 - CINCO"), new Item(6,"6 - SEIS"), new Item(7,"7 - SIETE"), new Item(8,"8 - OCHO"), new Item(9,"9 - NUEVE"), new Item(10,"10 - DIEZ"), new Item(10,"J - JACK"), new Item(10,"Q - REINA"), new Item(10,"K - REY")}));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Número objetivo");

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Next-Button-PNG-Clipart.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnMarkov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5a4613ddd099a2ad03f9c994.png"))); // NOI18N
        btnMarkov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkovActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre de nuestra empresa");

        jScrollPane2.setViewportView(jTextPane1);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Probabilidad de ganar");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Carta jugada");

        jScrollPane1.setViewportView(jTextPane2);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Número de jugadas");

        btnNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Next-Button-PNG-Clipart.png"))); // NOI18N
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnNext1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                                        .addComponent(boxCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74))))
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addComponent(btnMarkov)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSubirImagen)
                                .addGap(118, 118, 118)
                                .addComponent(btnNext)))
                        .addGap(26, 26, 26))))
            .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(boxCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addComponent(labelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNext)
                            .addComponent(btnSubirImagen)
                            .addComponent(btnMarkov)))
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext1)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarkovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkovActionPerformed
        // TODO add your handling code here:
        new ProbabilidadMarkoviana().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMarkovActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if(this.imagen!= null){
            //meter codigo para leer imagen, y returnar el numero, blah blah
            carta = 0; //en esta variable metan el numero
        }else{
            Item cartas = (Item) boxCarta.getSelectedItem();
            carta = cartas.getValor();
        }

        Markov markov = Markov.singleton();
        float probabilidad = markov.probabilidad(carta);
        new Principal(probabilidad, markov.getI()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSubirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirImagenActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter(".jpg",".png"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = chooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File name = chooser.getSelectedFile();
            ImageIcon imagen = new ImageIcon(name.getPath());
            this.imagen = imagen.getImage();
            labelCarta.setIcon(imagen);
            //codigo faltante para guardar imagen para procesar
        }
    }//GEN-LAST:event_btnSubirImagenActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        // TODO add your handling code here:
        
        String ob = jTextPane1.getText();
        String ju = jTextPane2.getText();
    }//GEN-LAST:event_btnNext1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JComboBox boxCarta;
    private javax.swing.JButton btnMarkov;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnSubirImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel labelCarta;
    // End of variables declaration//GEN-END:variables
}
