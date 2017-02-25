/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg24.feb.pkg17;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class Actividad24Feb17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       
       
        Long[] databas = new Long [10];

        Long numtel;
        for (int i = 1; i < databas.length; i++ ) {
            System.out.println("Introduce el numero de usuario " + i);
            
            databas [i] = kb.nextLong();
        
       
        }
        
        
        for (int i = 0; i < databas.length; i++) {
            
            System.out.println("Introduce el numero del usuario para obtener telefono.");
            i = kb.nextInt();
            if (i < 10) {
            System.out.println("El telefono del usuario " + i + " es " + databas[i]);
            }
            else {System.out.println("Usuario no disponible");}
           
            
        
        }
     
    }
    
}
