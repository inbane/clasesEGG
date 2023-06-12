/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a converir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 * @author inbane
 */
public class ejercicio14 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        double euros = leer.nextDouble();

        System.out.print("Ingrese la moneda a la que desea convertir (libras, dolares, yenes): ");
        String moneda = leer.next();

        convertirMoneda(euros, moneda);

    }

    public static void convertirMoneda(double euros, String moneda) {
        double cambio = 0.0;
        String nombreMoneda = "";

        switch (moneda) {
            case "libras":
                cambio = 0.86;
                nombreMoneda = "libras";
                break;
            case "dólares":
                cambio = 1.28611;
                nombreMoneda = "dolares";
                break;
            case "yenes":
                cambio = 129.852;
                nombreMoneda = "yenes";
                break;
            default:
                System.out.println("La moneda ingresada no es válida.");
                return;
        }

        double resultado = euros * cambio;
        System.out.println(euros + " euros equivale a " + resultado + " " + nombreMoneda);
    }
}