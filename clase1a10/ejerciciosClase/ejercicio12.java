/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosClase;

import java.util.Scanner;

/**
 * 12. Realizar un programa que simule el funcionamiento de un dispositivo
 * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
 * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5
 * caracteres de largo, el primer carácter tiene que ser X y el último tiene que
 * ser una O. Las secuencias leídas que respeten el formato se consideran
 * correctas, la secuencia especial “&&&&&” marca el final de los envíos
 * (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato
 * se considera incorrecta. Al finalizar el proceso, se imprime un informe
 * indicando la cantidad de lecturas correctas e incorrectas recibidas. Para
 * resolver el ejercicio deberá investigar cómo se utilizan las siguientes
 * funciones de Java Substring(), Length(), equals().
 *
 * @author inbane
 */
public class ejercicio12 {

 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        String secuencia;

        do {
            System.out.print("Ingrese una secuencia: ");
            secuencia = leer.nextLine();

            if (secuencia.equals("&&&&&")) {
                break;
            }

            if (secuencia.length() == 5 && secuencia.charAt(0) == 'X' && secuencia.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }

        } while (true);

        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);

    }
}
