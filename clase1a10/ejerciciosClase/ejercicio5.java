/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
 * investigar la función Math.sqrt().
 *
 * @author inbane
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble del número es: " + doble);
        System.out.println("El triple del número es: " + triple);
        System.out.println("La raíz cuadrada del número es: " + raizCuadrada);

    }
}