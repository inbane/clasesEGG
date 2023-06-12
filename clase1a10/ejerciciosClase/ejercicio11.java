/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * 11. Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 *
 * MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir Elija opción:
 *
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
 * se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción
 * 5, en vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si
 * el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
 * vuelve a mostrar el menú.
 *
 * @author inbane
 */
public class ejercicio11 {

    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("ingrese dos numeros:");
        System.out.println("-----------------------");
        double num1, num2;
        boolean veldad;
        veldad = true;
        String jaja;
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextDouble();
        num2 = leer.nextDouble();

        do {
            System.out.println("-----------");
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion:");
            System.out.println("-----------");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(sumar(num1, num2));
                    break;
                case 2:
                    System.out.println(restar(num1, num2));
                    break;
                case 3:
                    System.out.println(multiplicacion(num1, num2));
                    break;
                case 4:
                    System.out.println(dividir(num1, num2));
                    break;
                case 5:
                    System.out.println("¿esta seguro que desea salir? S/N");
                    jaja = leer.next();
                    if (jaja.equalsIgnoreCase("S")) {
                        veldad = false;
                    }
                    break;
                default:
                    System.out.println("flaco pone un numerito del 1 al 5");
                    break;

            }

        } while (veldad);

    }

    public static double sumar(double num1, double num2) {
        double suma;
        suma = num1 + num2;
        return suma;
    }

    public static double restar(double num1, double num2) {
        double resta;
        resta = num1 - num2;
        return resta;
    }

    public static double multiplicacion(double num1, double num2) {
        double multi;
        multi = num1 * num2;
        return multi;
    }

    public static double dividir(double num1, double num2) {
        double div;
        div = num1 % num2;
        return div;
    }
}
