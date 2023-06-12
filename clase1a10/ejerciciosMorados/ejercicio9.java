/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosMorados;

import java.util.Scanner;

/**
 * EJERCICIO 9 Escriba un programa que lea 20 números. Si el número leído es
 * igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el
 * numero cero". El programa deberá calcular y mostrar el resultado de la suma
 * de los números leídos, pero si el número es negativo no debe sumarse. Nota:
 * recordar el uso de la sentencia break.
 *
 * @author inbane
 */
public class ejercicio9 {

    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("ingrese 20 numeros");
        System.out.println("--------------------");
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        boolean jaja = false;
        int[] vector = new int[20];
        for (int i = 0; i < 20; i++) {
            i = i + 1;
            System.out.println("ingrese el " + i + " numero");
            i = i - 1;
            vector[i] = leer.nextInt();
            if (vector[i] == 0) {
                System.out.println("SE ENCONTRO EL NUMERO 0");
                System.out.println("-----------------");
                System.out.println("----cerrando----");
                System.out.println("---");
                break;
            }
            if (vector[i] < 0) {
                continue;
            }

            suma = suma + vector[i];

        }

        System.out.println("la suma de los numeros es: " + suma);

    }

}
