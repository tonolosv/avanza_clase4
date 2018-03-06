/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_100_al_50;

/**
 *
 * @author danu
 */
public class Serie_100_al_50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        serie va disminuyendo de 2 en 2, comenzando en 100
        hasta llegar a 50. Se utiliza for
        */
        for (int i = 100; i >= 50; i=i-2) {
            System.out.println(i + " ");
        }
    }
    
}
