/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosDeVideos;
import java.util.Scanner;
/**
 *
 * @author inbane
 */
public class ejercicioBucles {
    


    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        do {
           System.out.println("Ingrese un numero entero positivo");
           num = leer.nextInt();
           if (num > 1000) {
               System.out.println("Este programa podria tardar, ¿esta seguro? (s/n)");
               String confirma = leer.next();
               if (confirma.equals("s")) {
                   break;
               }
           }
        } while (num <= 0 || num > 1000);
        
        int j,suma,i;
        for( i=1 ; i <= num ; i++){ //para i = 1 hasta que i <= num con paso 1(++ significa incremento)
            
            if( i%2 != 0 )
                continue;
            
            suma = 0;
            j = 1;
            while(j<=i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los " + i + " numeros naturales es: " + suma);
        }
        }
        
}
