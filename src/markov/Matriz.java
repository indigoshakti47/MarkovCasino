/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markov;

/**
 *
 * @author gaspar
 */
public class Matriz {
    private float[][] matriz;
    
    
    public Matriz()
    {
        matriz=new float[36][36];
        llenarDatos();
    }
    private void llenarDatos()
    {
        int p=4;
        matriz[0][0]=0;
        matriz[0][1]=0;
        matriz[0][2]=(float)1/13;
        matriz[0][3]=(float)1/13;
        matriz[0][4]=(float)1/13;
        matriz[0][5]=(float)1/13;
        matriz[0][6]=(float)1/13;
        matriz[0][7]=(float)1/13;
        matriz[0][8]=(float)1/13;
        matriz[0][9]=(float)1/13;
        for(int i=10;i<12;i++)
        {
            matriz[0][i]=0;
        }
        for(int i=2;i<11;i++)
        {
            for(int j=p;j<(p+8);j++)
            {
                matriz[i][j]=(float)1/13;
            }
            p++;
        }
        int q=9;
        for(int j=p-1;j<(p+9);j++)
        {
            matriz[11][j]=(float)1/13;
        }
        
        for(int i=12;i<17;i++)
        {
            for(int j=p;j<(p+q);j++)
            {
                matriz[i][j]=(float)1/13;
            }
            p++;
            q--;
        }
        p=12;
        for(int i=2;i<12;i++)
        {
            for(int j=p;j<(p+1);j++)
            {
                matriz[i][j]=(float)4/13;
            }
            p++;
        }
        p=17;
        for(int i=17;i<22;i++)
        {
            for(int j=p;j<(p+1);j++)
            {
                matriz[i][j]=(float)13/13;
            }
            p++;
        }
        matriz[0][22]=(float)4/13;
        matriz[0][23]=(float)1/13;
        p=25;
        for(int i=2;i<11;i++)
        {
            for(int j=p;j<(p+1);j++)
            {
                matriz[i][j]=(float)1/13;
            }
            p++;
        }
        matriz[12][35]=(float)4/13;
        matriz[13][35]=(float)5/13;
        matriz[14][35]=(float)6/13;
        matriz[15][35]=(float)7/13;
        matriz[16][35]=(float)8/13;
        
        for(int i=12;i<20;i++)
        {
            
          matriz[22][i]=(float)1/13; 
        }
        matriz[22][20]=(float)4/13;
        matriz[22][34]=(float)1/13; 
        
        p=12;
        for(int i=24;i<29;i++)
        {
            for(int j=p;j<(p+1);j++)
            {
                matriz[i][j]=(float)4/13;
            }
            p++;
        }
         int r=12;
         q=1;
        for(int i=25;i<29;i++)
        {
            for(int j=12;j<(r+q);j++)
            {
                matriz[i][j]=(float)1/13;
                
            }
            
            q++;
        }
        
         p=24;
        for(int i=23;i<29;i++)
        {
            for(int j=p;j<33;j++)
            {
                matriz[i][j]=(float)1/13;
            }
            p++;
        }
        p=29;
        for(int i=29;i<36;i++)
        {
            for(int j=p;j<(p+1);j++)
            {
                matriz[i][j]=(float)13/13;
            }
            p++;
        }
        matriz[23][24]=(float)4/13;
        
        
    }
    public float[][] matriz()
    {
        
        return matriz;
    }
}
