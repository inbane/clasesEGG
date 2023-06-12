/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosMorados;

import java.util.Scanner;

/**
 *
 * EJERCICIO 11 Escribir un programa que procese una secuencia de caracteres
 * ingresada por teclado y terminada en punto, y luego codifique la palabra o
 * frase ingresada de la siguiente manera: cada vocal se reemplaza por el
 * carácter que se indica en la tabla y el resto de los caracteres (incluyendo a
 * las vocales acentuadas) se mantienen sin cambios.
 *
 * a e i o u
 *
 * @ # $ % *
 *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10.
 * @author inbane
 */
public class ejercicio11 {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("ingrese una frase");
        System.out.println("------------------");

        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
        System.out.println("----------------------");
        System.out.println("esta es la frase normal");
        System.out.println(frase);
        System.out.println("----------------------");
        System.out.println("y esta es la frase modificada");
        System.out.println(jaja(frase));
        System.out.println("----------------------");

    }

    public static String jaja(String frase) {
        String jiji = "";

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a') {
                jiji = jiji + "@";
                continue;
            }
            if (frase.charAt(i) == 'e') {
                jiji = jiji + "#";
                continue;
            }
            if (frase.charAt(i) == 'i') {
                jiji = jiji + "$";
                continue;
            }
            if (frase.charAt(i) == 'o') {
                jiji = jiji + "%";
                continue;
            }
            if (frase.charAt(i) == 'u') {
                jiji = jiji + "*";
                continue;
            }
            
            

            jiji = jiji + frase.charAt(i);

        }
        return jiji;
    }

}
