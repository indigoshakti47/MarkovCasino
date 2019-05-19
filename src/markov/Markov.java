package markov;

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
    public static void main(String[] args) {
        new Markov();
        
        
    }
    public Markov()
    {
        m=new Matriz();
        matriz=m.matriz();
        
        float[][] c=this.multiply(matriz, matriz);
        c=this.multiply(c, matriz);
        this.multiply(c, matriz);
        this.multiply(c, matriz);
        for (int x=0; x < c.length; x++){
            System.out.print(x+"  ");
            
        for (int y=0; y < c[x].length; y++){
              System.out.print(" | " + c[x][y]+ " |     ");   
        }
        System.out.println("\n----------------------------------------");
        }
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
    /**
     * si no se cumple la condición se retorna una matriz vacía
     */
    return c;
}
    
}
