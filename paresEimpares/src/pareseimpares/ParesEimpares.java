/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pareseimpares;

/**
 *
 * @author danu
 */
import java.util.Scanner;
public class ParesEimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Se ingresan una "x" cantidad de numeros, y determinar si son
        impares o pares. 
        Utilizamos: java.util.scanner
        for, una condicion if y else
        */
     Scanner scan = new Scanner(System.in);
     int n, x, cp=0,ci=0;
        System.out.println("Ingrese una cantidad de numeros a revisar: ");
        n= scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+") Ingrese un numero: ");
            x=scan.nextInt();
            if (x%2==0) 
                cp++;
            else
                ci++;
            }
        System.out.println("la cantidad de pares son: "+ cp);
        System.out.println("la cantidad de impares son: " +ci);
        }
    }
   
