package Guia5;

import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario. */

public class Ejer1 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        // Llenar el array con los números del 1 al 100
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar los números en orden descendente con un for mejorado
        for (int num : numeros) {
            System.out.println(numeros[99 - num]);
        }
    }
}
