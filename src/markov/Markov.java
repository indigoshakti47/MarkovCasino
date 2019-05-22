package markov;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Markov {

    /**
     * @param args the command line arguments
     */
    private float[][]matriz;
    private Matriz m;
    private int i;
    private int p;
    public static void main(String[] args) {
        new Markov();
        
        
    }
    public Markov()
    {
        m=new Matriz();
        matriz=m.matriz();
        boolean alto=true;
        i=0;
        do
        {
            int p=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese carta"));
            float m=probabilidad(p);
            JOptionPane.showMessageDialog(null,"La probabilidad es.."+m);
            
        }while(alto);
    }
    private float probabilidad(int x)
    {
        float y=0;
        
        y=matriz[i][x];
        i=i+x;
        return y;
    }
    public float[][] multiply(float[][] a, float[][] b) {
    float[][] c = new float[a.length][b[0].length];
    // se comprueba si las matrices se pueden multiplicar
    if (a[0].length == b.length) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    // aquí se multiplica la matriz
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    
    return c;
}
    
}
