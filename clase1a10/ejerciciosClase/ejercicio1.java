/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 *
 * @author inbane
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();

        int suma = numero1 + numero2;
        System.out.println("La suma de los dos números es: " + suma);
    }
}
    

