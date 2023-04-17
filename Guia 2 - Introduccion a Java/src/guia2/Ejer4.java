package guia2;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5). */

public class Ejer4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");
        Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese la cantidad de grados Centrigrados");
        int n = leer.nextInt();
        System.out.println(32 + (n * 9 / 5));

    }

}