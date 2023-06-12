/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 *
 * @author inbane
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }
}
