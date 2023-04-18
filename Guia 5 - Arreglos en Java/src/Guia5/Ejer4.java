package Guia5;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);

            }

        }
        System.out.println("La Matriz es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // matrizB[i][j]=matrizA[j][i];
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
        System.out.println("La Matriz transpuesta es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizB[i][j] + "]");

            }
            System.out.println("");

        }

    }
}
