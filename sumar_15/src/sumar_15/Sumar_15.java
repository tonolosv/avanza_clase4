/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumar_15;

/**
 *
 * @author danu
 */
public class Sumar_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Sumar los primeros quince números naturales
         */
        int i, sc=0;
        for(i=1;i<=15;i++)
            sc=sc+i*i;
        System.out.println("La suma de los cuadrados de los primeros 15 \n números es: ");
    }
    
}
