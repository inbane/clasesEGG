/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosMorados;

import java.util.Scanner;

/**
 * EJERCICIO 12 Crea un procedimiento EsMultiplo que reciba los dos números
 * pasados por el usuario, validando que el primer numero múltiplo del segundo y
 * e imprima si el primer numero es múltiplo del segundo, sino informe que no lo
 * son.
 *
 * @author inbane
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("ingrese el numero mayor");
        num1 = leer.nextInt();
        System.out.println("ingrese el numero del que desea saber si es multiplo");
        num2 = leer.nextInt();
        
        if (esMultiplo(num1,num2) == 0 ){
            System.out.println("los numeros son multiplos");
        }else {
            System.out.println("los numeros no son multiplos");
        }
        
        
    }

    
    public static int esMultiplo(int num1, int num2){
        int div;
        div = num1 % num2;
        if (div == 0){
            return 0;
        } else {
            return 1;
        }
        
                
        
    }
}
