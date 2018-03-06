/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion_50;

/**
 *
 * @author danu
 */
public class Multiplicacion_50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Multiplicacion desde el 1*2*3*4*5*....*50
        usando for
        */
        double prodt=1;
        for (int i=1; i<=50; i++) 
        {
            prodt=prodt*1;
            System.out.println("El producto es: "+prodt);
        }
    }
    
}
