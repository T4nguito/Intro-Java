package guia2;

import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla. */

public class Ejer2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); // Creamos el Scanner

        System.out.println("Ingrese un nombre"); // Leer una cadena
        String cadena = leer.nextLine(); // Ingresamos una cadena en la variable cadena

        System.out.println("Tu nombre es: " + cadena); // Leer una cadena
    }

}