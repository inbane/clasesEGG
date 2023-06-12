/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosMorados;

import java.util.Scanner;

/**
 * EJERCICIO 13 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
 * de compañeros de equipo y define su tipo de dato de tal manera que te permita
 * alojar sus nombres más adelante.
 *
 * EJERCICIO 14 Utilizando un Bucle for, aloja en el vector Equipo, los nombres
 * de tus compañeros de equipo
 *
 * @author inbane
 */
public class ejercicio13y14 {

    public static void main(String[] args) {
        String[] equipo = new String[7];
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre de cada uno de los integrantes de su equipo:");
        for (int i = 0; i < 7; i++) {
            i = i + 1;
            System.out.print(+i + ":  ");
            i = i - 1;
            equipo[i] = leer.next();
        }
        System.out.println("----------------------------");
        System.out.println("nombre del equipo guardados.");
        System.out.println("----------------------------");

    }

}
