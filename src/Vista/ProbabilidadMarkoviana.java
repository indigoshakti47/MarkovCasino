/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
import markov.Markov;
import markov.Matriz;

/**
 *
 * @author Oscar
 */
public class ProbabilidadMarkoviana extends javax.swing.JFrame {
    private float [][] c;
    private int cont;
    /**
     * Creates new form ProbailidadMArkoviana
     */
    public ProbabilidadMarkoviana(int contador,int conteo,String obj, String jug) {
        initComponents();
        
        Markov markov = Markov.singleton();
        Matriz matriz = new Matriz();
        float [][] matri = matriz.matriz();
        
        int ju = Integer.parseInt(jug);
        int ob = Integer.parseInt(obj);
        
        //Para que llegue al 0
        if(ob == 10 && conteo == 0){
            ob = 22;
        }
        
        //Necesito saber como Carlos seleccionó los A para poder hacer lo que hice con el 10 arriba^^
        System.out.println(contador);
        System.out.println(conteo);
        System.out.println(ju);
        System.out.println(ob);
        
        if(ju == 1){
           jLabel6.setText(Float.toString(matri[conteo][ob])); 
        }
        else{
        for(int i=0;i<ju-1;i++){
        c = markov.multiply(matri, matri);
        }
        
        jLabel6.setText(Float.toString(c[conteo][ob]));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 2));

        jLabel5.setText("La probabilidad de que obtenga el resultado es de:");
        getContentPane().add(jLabel5);

        jLabel6.setText("                                  what");
        getContentPane().add(jLabel6);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Inicial().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
