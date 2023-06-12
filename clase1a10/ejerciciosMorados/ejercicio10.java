/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosMorados;

import java.util.Scanner;

/**
 * EJERCICIO 10 Realizar un programa que lea 4 números (comprendidos entre 1 y
 * 20) e imprima el número ingresado seguido de tantos asteriscos como indique
 * su valor. Por ejemplo:
 * 5 ***** 
 * 3 *** 
 * 11 *********** 
 * 2 **
 *
 * @author inbane
 */
public class ejercicio10 {

    public static void main(String[] args) {
        System.out.println("---------");
        System.out.println("ingrese 4 numeros:");
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[4];

        for (int i = 0; i < 4; i++) {
            vector[i] = leer.nextInt();

            while (vector[i] < 1 || vector[i] > 20) {
                System.out.println("ingrese otro numero entre 1 y 20");
                System.out.println("↓");
                vector[i] = leer.nextInt();
            }

            for (int j = 0; j < vector[i]; j++) {
                if (j == 0) {
                    System.out.print(vector[i]);
                }
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }

}
