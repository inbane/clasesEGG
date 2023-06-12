/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
 * después toda en minúsculas. Nota: investigar la función toUpperCase() y
 * toLowerCase() en Java.
 *
 * @author inbane
 */
public class ejercicio3 {

      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();

        String enMayusculas = frase.toUpperCase();
        String enMinusculas = frase.toLowerCase();

        System.out.println("Frase en mayúsculas: " + enMayusculas);
        System.out.println("Frase en minúsculas: " + enMinusculas);

    }
}
