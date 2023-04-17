package Guia5;

import java.util.Scanner;
import java.util.Random;

public class Ejer2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del Vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        Random numAleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = numAleatorio.nextInt(100 + 1);
            /*
             * vector[i] = (int) (Math.random() * 10);
             * 
             */
        }

        System.out.println(" Ingrese el numero a buscar entre 0 y 10 ");
        int n1 = leer.nextInt();
        int cont = 0;

        for (int i = 0; i < vector.length; i++) {

            if (n1 == vector[i]) {
                System.out.println(" Su numero se encuentra en la posicion " + i + " del vector");
                cont++;
            }

        }
        System.out.println("La cantidad de veces que se repite su numero es " + cont);

    }
}
