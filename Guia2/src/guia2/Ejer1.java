package guia2;

import java.util.Scanner;

/* Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/

public class Ejer1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); // Creamos el Scanner

        System.out.println("Ingrese un numero Entero"); // sout para ingresar un numero1 en la variable
        int n1 = leer.nextInt();

        System.out.println("Ingrese un numero Entero"); // sout para ingresar un numero2 en la variable
        int n2 = leer.nextInt();

        System.out.println("La suma de los 2 numeros Enteros es: " + (n1 + n2)); // Resultado de las dos variables
    }
}