package Guia5;

import java.util.Scanner;
import java.util.Random;

public class Ejer3_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, digitos;
        int[] numeros;
        int[] vector = new int[n];

        System.out.print("Ingrese la cantidad de números a procesar: ");
        n = leer.nextInt();

        numeros = new int[n];

        Random numAleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numAleatorio.nextInt(100000);
        }

        // Contamos los números con 1, 2, 3, 4 o 5 dígitos
        for (int i = 0; i < n; i++) {
            digitos = contarDigitos(numeros[i]);
            if (digitos > 0 && digitos <= 5) {
                contadores[digitos - 1]++;
            }
        }

        // Imprimimos los resultados
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de números con " + (i + 1) + " dígitos: " + contadores[i]);
        }
    }

    // Función para contar los dígitos de un número
    public static int contarDigitos(int numero) {
        if (numero < 0) {
            numero = -numero;
        }
        if (numero == 0) {
            return 1;
        }
        int contador = 0;
        while (numero > 0) {
            contador++;
            numero /= 10;
        }
        return contador;
    }
}
