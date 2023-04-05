package guia2;

import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java. */

public class Ejer3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        // Toda la frase en Mayuscula
        System.out.println(frase.toUpperCase());

        // Toda la frase en Minuscula
        System.out.println(frase.toLowerCase());

    }

}