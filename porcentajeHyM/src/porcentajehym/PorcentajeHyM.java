/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentajehym;

/**
 *
 * @author danu
 */
import java.util.Scanner;
public class PorcentajeHyM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Ingresar la cantidad hombres y mujeres que hay,
        para luego sacar el porcentaje que hay entre ellos
        //Scanner
        //for, if, else
        */
        Scanner scan= new Scanner(System.in);
        int n,x, cv=0, cm=0;
        double h=0,m=0;
        System.out.println("Ingrese la cantidad de personas:");
        n=scan.nextInt();
        System.out.println("Ingrese sexo "
                + "[1]Hombres,"
                + " [2]Mujeres");
        for (int i = 1; i <=n; i++)
        {
            System.out.println("Persona " + i + " : ");
            x=scan.nextInt();
                    if (x==1)
                        cv++;
                    else
                    {
                        if(x==2)
                        cm++;
        }
            
        }
        cv=(cv*100)/n;
        cm=(cm*100)/n;
        System.out.println("El porcentaje de hombres es: "+ cv+"%");
        System.out.println("El porcentaje de mujeres es: " +cm+"%");
    }
    
}
