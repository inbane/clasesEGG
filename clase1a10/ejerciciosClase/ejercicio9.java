/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 *
 * @author inbane
 */
public class ejercicio9 {

     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra que empiece con 'A': ");
        String entrada = leer.nextLine();

        if (entrada.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }
}
