
package Guia5;

import java.util.Scanner;
import java.util.Random;

/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
public class Ejer_Extra2 {
    public static void rellenarVector(int[] vec) {
        Random numAleatorio = new Random();
        for (int i = 0; i < vec.length; i++) {
            vec[i] = numAleatorio.nextInt(100 + 1);
            // vector[i] = (int)(Math.random()*100);
        }
    }

    public static void main(String[] args) {
        // Ingresamos tamaño de vectores de N
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores: ");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        rellenarVector(vector1);
        rellenarVector(vector2);

        /*
         * // Ingresamos elementos vector 1
         * System.out.println("Ingrese los elementos Vector1: ");
         * for (int i = 0; i < n; i++) {
         * vector1[i] = leer.nextInt();
         * }
         * // Ingresamos elementos vector 2
         * System.out.println("Ingrese los elementos Vector2: ");
         * for (int i = 0; i < n; i++) {
         * vector2[i] = leer.nextInt();
         * Comprobamos si los elementos son iguales
         * if (vector1.equals(vector2)) {
         * System.out.println("Los elementos son iguales");
         * }
         * 
         * /*
         * Forma incorrecta de hacerlo:
         * int recurrencia = 0;
         * for (int i = 0; i < vector1.length; i++) {
         * if (vector1 == vector2 && recurrencia == 0) {
         * System.out.println("El número se encontró en la posición [" + i + "]");
         * recurrencia = 1;
         * } else if (vector1 == vector2)
         * System.out.println("El número se repite en [" + i + "]");
         * 
         * }
         */

        boolean igual = true;
        for (int i = 0; i < vector2.length; i++) {
            if (vector1[i] != vector2[i]) {
                igual = false;
                System.out.println("Los vectores no son igules, en el indice [" + i + "] tiene valores diferentes!!");
                break;
            }

        }

    }
}