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
    private int c;
    public static void main(String[] args) {
        new Markov();
        
        
    }
    
    //patron singleton : quiero probar algo
    private static Markov esto =null;
    
    public static Markov singleton(){
        if(esto == null){
            esto = new Markov();
        }
        return esto;
    }
    
    public Markov()
    {
        m=new Matriz();
        matriz=m.matriz();
        boolean alto=true;
        i=0;
        c++;
        /*float q=probabilidad(i);
        JOptionPane.showMessageDialog(null,"La probabilidad es.."+q);
        do
        {
            int p=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese carta"));
            q=probabilidad(p+i);
            JOptionPane.showMessageDialog(null,"La probabilidad de ganar es.."+q);
            JOptionPane.showMessageDialog(null,"La probabilidad de perder es.."+matriz[i][35]);
            System.out.print(i);
            
        }while(alto);*/
    }
    public float probabilidad(int p)
    {
        int x = p+i;
        float y=0;
        for(int w=0;w<35;w++)
        {
            y=matriz[x][w]+y;
        }
        
        i=x;
        System.out.println(i);
        return (y*100);
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

    public int getI() {
        return i;
    }
    
    public int getC() {
        return c;
    }

    
    
}
