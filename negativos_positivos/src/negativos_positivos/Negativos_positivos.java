/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negativos_positivos;

/**
 *
 * @author danu
 */
import java.util.Scanner;
public class Negativos_positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        se van a reportar la cantidad de numeros que se registran
        y para ellos pueden ser positivos, negativos o ceros
        //hacemos uso del scanner
        //del for, if y else
        */
        Scanner scan = new Scanner(System.in);
        int n, np=0, ng=0,x, c=0;
        System.out.println("Ingrese la cantidad de numeros a revisar: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese un numero: ");
            x=scan.nextInt();
            if(x==0) 
                np++;
            else
            {
                if(x>0)
                    np++;
                else
                    ng++;
            }
        }
        System.out.println("la cantidad de positivos son: "+np);
        System.out.println("la cantidad de negativos son: "+ng);
        System.out.println("la cantidad de ceros son: "+c);
    }
    
}
