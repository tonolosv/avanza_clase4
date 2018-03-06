/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_del_1_al_100;

/**
 *
 * @author danu
 */
public class Suma_del_1_al_100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Sumar del uno al cien, haciendo uso del for
         */
        int sum=0;
        for (int i=1; i<=100; i++)
            sum=sum+1;
        System.out.println("La suma es: "+sum);
    }
    
}
