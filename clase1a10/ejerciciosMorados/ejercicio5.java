/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1a10.ejerciciosMorados;

import java.io.IOException;
import java.util.Scanner;

/**
 * EJERCICIO 5
 *
 * 20 Define una variable de tipo boolean, double y char. Guarda información en
 * ellas a través del Scanner.
 *
 * @author inbane
 */
public class ejercicio5 {


    public static void main(String[] args) throws IOException {
        boolean veldad;
        double jaja;
        char jiji;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el boolean");
        veldad = leer.nextBoolean();
        System.out.println("ingrese el double");
        jaja = leer.nextDouble();
        System.out.println("ingrese el char");
        jiji = (char)System.in.read();
                
                
    }
    

}
