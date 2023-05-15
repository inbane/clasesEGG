/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10;
import java.util.Scanner ;
/**
 *
 * @author inbane
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entero1,entero2 ;
        System.out.println("ingrese dos numeros enteros");
        Scanner leer = new Scanner(System.in);
        entero1 = leer.nextInt();
        entero2 = leer.nextInt();
 
        if (entero1 > 25 && entero2 > 25) {
            System.out.println("ambos numeros son mayores a 25");
        }
        
        if (entero1 > 25 && entero2 < 25) {
            System.out.println("el primer numero es mayor a 25");
        }
        
        if (entero2 > 25 && entero1 < 25) {
            System.out.println("el segundo numero es mayor a 25");
        }
        
    }
    
}
