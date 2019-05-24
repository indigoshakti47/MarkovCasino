
package org.nd4j.examples;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.util.Arrays;

/**
 * @author oscar
 */
public class Modelo {

    public static void main(String[] args) {



        //Let's start by creating a basic 2d array: a matrix with 3 rows and 5 columns. All elements are 0.0
        int nRows = 35;
        int nColumns = 35;
        INDArray myArray = Nd4j.zeros(nRows, nColumns);

        //We can print the array itself using toString method:
        System.out.println("\nArray Contents:\n" + myArray);
        
        
        //Les pongo valores
        //0
        myArray.putScalar(0, 1, 0.077);           
        myArray.putScalar(0, 2, 0.077);
        myArray.putScalar(0, 3, 0.077);           
        myArray.putScalar(0, 4, 0.077);
        myArray.putScalar(0, 5, 0.077);           
        myArray.putScalar(0, 6, 0.077);
        myArray.putScalar(0, 7, 0.077);           
        myArray.putScalar(0, 8, 0.077);
        myArray.putScalar(0, 21, 0.307);           
        myArray.putScalar(0, 22, 0.077);
        //2
        myArray.putScalar(1, 3, 0.077);           
        myArray.putScalar(1, 4, 0.077);
        myArray.putScalar(1, 5, 0.077);           
        myArray.putScalar(1, 6, 0.077);
        myArray.putScalar(1, 7, 0.077);           
        myArray.putScalar(1, 8, 0.077);
        myArray.putScalar(1, 9, 0.077);           
        myArray.putScalar(1, 10, 0.077);
        myArray.putScalar(1, 11, 0.307);           
        myArray.putScalar(1, 24, 0.077);
        //3
        myArray.putScalar(2, 4, 0.077);           
        myArray.putScalar(2, 5, 0.077);
        myArray.putScalar(2, 6, 0.077);           
        myArray.putScalar(2, 7, 0.077);
        myArray.putScalar(2, 8, 0.077);           
        myArray.putScalar(2, 9, 0.077);
        myArray.putScalar(2, 10, 0.077);           
        myArray.putScalar(2, 11, 0.077);
        myArray.putScalar(2, 12, 0.307);           
        myArray.putScalar(2, 25, 0.077);
        //4
        myArray.putScalar(3, 5, 0.077);           
        myArray.putScalar(3, 6, 0.077);
        myArray.putScalar(3, 7, 0.077);           
        myArray.putScalar(3, 8, 0.077);
        myArray.putScalar(3, 9, 0.077);           
        myArray.putScalar(3, 10, 0.077);
        myArray.putScalar(3, 11, 0.077);           
        myArray.putScalar(3, 12, 0.077);
        myArray.putScalar(3, 13, 0.307);           
        myArray.putScalar(3, 26, 0.077);
        //5
        myArray.putScalar(4, 6, 0.077);           
        myArray.putScalar(4, 7, 0.077);
        myArray.putScalar(4, 8, 0.077);           
        myArray.putScalar(4, 9, 0.077);
        myArray.putScalar(4, 10, 0.077);           
        myArray.putScalar(4, 11, 0.077);
        myArray.putScalar(4, 12, 0.077);           
        myArray.putScalar(4, 13, 0.077);
        myArray.putScalar(4, 14, 0.307);           
        myArray.putScalar(4, 27, 0.077);
        //6
        myArray.putScalar(5, 7, 0.077);           
        myArray.putScalar(5, 8, 0.077);
        myArray.putScalar(5, 9, 0.077);           
        myArray.putScalar(5, 10, 0.077);
        myArray.putScalar(5, 11, 0.077);           
        myArray.putScalar(5, 12, 0.077);
        myArray.putScalar(5, 13, 0.077);           
        myArray.putScalar(5, 14, 0.077);
        myArray.putScalar(5, 15, 0.307);           
        myArray.putScalar(5, 28, 0.077);
        //7
        myArray.putScalar(6, 8, 0.077);           
        myArray.putScalar(6, 9, 0.077);
        myArray.putScalar(6, 10, 0.077);           
        myArray.putScalar(6, 11, 0.077);
        myArray.putScalar(6, 12, 0.077);           
        myArray.putScalar(6, 13, 0.077);
        myArray.putScalar(6, 14, 0.077);           
        myArray.putScalar(6, 15, 0.077);
        myArray.putScalar(6, 16, 0.307);           
        myArray.putScalar(6, 29, 0.077);
        //8
        myArray.putScalar(7, 9, 0.077);           
        myArray.putScalar(7, 10, 0.077);
        myArray.putScalar(7, 11, 0.077);           
        myArray.putScalar(7, 12, 0.077);
        myArray.putScalar(7, 13, 0.077);           
        myArray.putScalar(7, 14, 0.077);
        myArray.putScalar(7, 15, 0.077);           
        myArray.putScalar(7, 16, 0.077);
        myArray.putScalar(7, 17, 0.307);           
        myArray.putScalar(7, 30, 0.077);
        //9
        myArray.putScalar(8, 10, 0.077);           
        myArray.putScalar(8, 11, 0.077);
        myArray.putScalar(8, 12, 0.077);           
        myArray.putScalar(8, 13, 0.077);
        myArray.putScalar(8, 14, 0.077);           
        myArray.putScalar(8, 15, 0.077);
        myArray.putScalar(8, 16, 0.077);           
        myArray.putScalar(8, 17, 0.077);
        myArray.putScalar(8, 18, 0.307);           
        myArray.putScalar(8, 31, 0.077);
        //10
        myArray.putScalar(9, 11, 0.077);           
        myArray.putScalar(9, 12, 0.077);
        myArray.putScalar(9, 13, 0.077);           
        myArray.putScalar(9, 14, 0.077);
        myArray.putScalar(9, 15, 0.077);           
        myArray.putScalar(9, 16, 0.077);
        myArray.putScalar(9, 17, 0.077);           
        myArray.putScalar(9, 18, 0.077);
        myArray.putScalar(9, 19, 0.307);           
        myArray.putScalar(9, 32, 0.077);
        //11
        myArray.putScalar(10, 11, 0.077);  
        myArray.putScalar(10, 12, 0.077);           
        myArray.putScalar(10, 13, 0.077);
        myArray.putScalar(10, 14, 0.077);           
        myArray.putScalar(10, 15, 0.077);
        myArray.putScalar(10, 16, 0.077);           
        myArray.putScalar(10, 17, 0.077);
        myArray.putScalar(10, 18, 0.077);           
        myArray.putScalar(10, 19, 0.077);
        myArray.putScalar(10, 20, 0.307);
        //12
        myArray.putScalar(11, 12, 0.077);  
        myArray.putScalar(11, 13, 0.077);           
        myArray.putScalar(11, 14, 0.077);
        myArray.putScalar(11, 15, 0.077);           
        myArray.putScalar(11, 16, 0.077);
        myArray.putScalar(11, 17, 0.077);           
        myArray.putScalar(11, 18, 0.077);
        myArray.putScalar(11, 19, 0.077);           
        myArray.putScalar(11, 20, 0.077);
        myArray.putScalar(11, 34, 0.307);
        //13
        myArray.putScalar(12, 13, 0.077);  
        myArray.putScalar(12, 14, 0.077);           
        myArray.putScalar(12, 15, 0.077);
        myArray.putScalar(12, 16, 0.077);           
        myArray.putScalar(12, 17, 0.077);
        myArray.putScalar(12, 18, 0.077);           
        myArray.putScalar(12, 19, 0.077);
        myArray.putScalar(12, 20, 0.077);           
        myArray.putScalar(12, 34, 0.384);
        //14
        myArray.putScalar(13, 14, 0.077);           
        myArray.putScalar(13, 15, 0.077);
        myArray.putScalar(13, 16, 0.077);           
        myArray.putScalar(13, 17, 0.077);
        myArray.putScalar(13, 18, 0.077);           
        myArray.putScalar(13, 19, 0.077);
        myArray.putScalar(13, 20, 0.077);           
        myArray.putScalar(13, 34, 0.461);
        //15        
        myArray.putScalar(14, 15, 0.077);
        myArray.putScalar(14, 16, 0.077);           
        myArray.putScalar(14, 17, 0.077);
        myArray.putScalar(14, 18, 0.077);           
        myArray.putScalar(14, 19, 0.077);
        myArray.putScalar(14, 20, 0.077);           
        myArray.putScalar(14, 34, 0.538);
        //16
        myArray.putScalar(15, 16, 0.077);           
        myArray.putScalar(15, 17, 0.077);
        myArray.putScalar(15, 18, 0.077);           
        myArray.putScalar(15, 19, 0.077);
        myArray.putScalar(15, 20, 0.077);           
        myArray.putScalar(15, 34, 0.615);
        //17
        myArray.putScalar(16, 16, 1.0);
        //18
        myArray.putScalar(17, 17, 1.0);
        //19
        myArray.putScalar(18, 18, 1.0);
        //20
        myArray.putScalar(19, 19, 1.0);
        //21
        myArray.putScalar(20, 20, 1.0);
        //Cara
        myArray.putScalar(21, 11, 0.077);           
        myArray.putScalar(21, 12, 0.077);
        myArray.putScalar(21, 13, 0.077);           
        myArray.putScalar(21, 14, 0.077);
        myArray.putScalar(21, 15, 0.077);           
        myArray.putScalar(21, 16, 0.077);
        myArray.putScalar(21, 17, 0.077);           
        myArray.putScalar(21, 18, 0.077);
        myArray.putScalar(21, 19, 0.307);           
        myArray.putScalar(21, 33, 0.077);
        //s11
        myArray.putScalar(22, 23, 0.077);           
        myArray.putScalar(22, 24, 0.077);
        myArray.putScalar(22, 25, 0.077);           
        myArray.putScalar(22, 26, 0.077);
        myArray.putScalar(22, 27, 0.077);           
        myArray.putScalar(22, 28, 0.077);
        myArray.putScalar(22, 29, 0.077);           
        myArray.putScalar(22, 30, 0.077);
        myArray.putScalar(22, 31, 0.077);           
        myArray.putScalar(22, 33, 0.307);
        //s12
        myArray.putScalar(23, 11, 0.307);
        myArray.putScalar(23, 24, 0.077);
        myArray.putScalar(23, 25, 0.077);           
        myArray.putScalar(23, 26, 0.077);
        myArray.putScalar(23, 27, 0.077);           
        myArray.putScalar(23, 28, 0.077);
        myArray.putScalar(23, 29, 0.077);           
        myArray.putScalar(23, 30, 0.077);
        myArray.putScalar(23, 31, 0.077); 
        myArray.putScalar(23, 32, 0.077); 
        //s13
        myArray.putScalar(24, 11, 0.077);
        myArray.putScalar(24, 12, 0.307);
        myArray.putScalar(24, 25, 0.077);           
        myArray.putScalar(24, 26, 0.077);
        myArray.putScalar(24, 27, 0.077);           
        myArray.putScalar(24, 28, 0.077);
        myArray.putScalar(24, 29, 0.077);           
        myArray.putScalar(24, 30, 0.077);
        myArray.putScalar(24, 31, 0.077); 
        myArray.putScalar(24, 32, 0.077); 
        //s14
        myArray.putScalar(25, 11, 0.077); 
        myArray.putScalar(25, 12, 0.077);
        myArray.putScalar(25, 13, 0.307);  
        myArray.putScalar(25, 26, 0.077);
        myArray.putScalar(25, 27, 0.077);           
        myArray.putScalar(25, 28, 0.077);
        myArray.putScalar(25, 29, 0.077);           
        myArray.putScalar(25, 30, 0.077);
        myArray.putScalar(25, 31, 0.077); 
        myArray.putScalar(25, 32, 0.077); 
        //s15
        myArray.putScalar(26, 11, 0.077);
        myArray.putScalar(26, 12, 0.077); 
        myArray.putScalar(26, 13, 0.077);
        myArray.putScalar(26, 14, 0.307);  
        myArray.putScalar(26, 27, 0.077);           
        myArray.putScalar(26, 28, 0.077);
        myArray.putScalar(26, 29, 0.077);           
        myArray.putScalar(26, 30, 0.077);
        myArray.putScalar(26, 31, 0.077); 
        myArray.putScalar(26, 32, 0.077);
        //s16
        myArray.putScalar(27, 11, 0.077);
        myArray.putScalar(27, 12, 0.077);
        myArray.putScalar(27, 13, 0.077); 
        myArray.putScalar(27, 14, 0.077);
        myArray.putScalar(27, 15, 0.307);    
        myArray.putScalar(27, 28, 0.077);
        myArray.putScalar(27, 29, 0.077);           
        myArray.putScalar(27, 30, 0.077);
        myArray.putScalar(27, 31, 0.077); 
        myArray.putScalar(27, 32, 0.077);
        //s17
        myArray.putScalar(28, 28, 1.0);
        //s18
        myArray.putScalar(29, 29, 1.0);
        //s19
        myArray.putScalar(30, 30, 1.0);
        //s20
        myArray.putScalar(31, 31, 1.0);
        //s21
        myArray.putScalar(32, 32, 1.0);
        //BJ//s20
        myArray.putScalar(33, 33, 1.0);
        //Pérdida
        myArray.putScalar(34, 34, 1.0);
        
        
        
        
        
        
        System.out.println("\nArray after putScalar operations:");
        System.out.println(myArray);

        //multiply two 2 x 2 matrices

        
        System.out.println("\nMultiplicado:");
        INDArray ndv = myArray.mmul(myArray);
        System.out.println(ndv);
    }

}
