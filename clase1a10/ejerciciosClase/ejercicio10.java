/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 * @author inbane
 */
public class ejercicio10 {

 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un valor límite positivo: ");
        int limite = leer.nextInt();

        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = leer.nextInt();
            suma += numero;
        } while (suma <= limite);

        System.out.println("La suma de los números ingresados supera el límite inicial de " + limite);

    }
}
