package Guia5;

import java.util.Scanner;

public class Ejer4_1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matrizb = new int[4][4];
        int[][] matriza = { { 0, -2, 4, 0 }, { 2, 0, 2, 4 }, { -4, -2, 0, 6 }, { 1, 5, 6, 8 } };
        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                System.out.print("[" + matriza[i][j] + "]");

            }
            System.out.println(" ");

        }

        for (int i = 0; i < matriza.length; i++) {
            for (int j = 0; j < matriza.length; j++) {
                matrizb[j][i] = matriza[i][j];
            }
        }
        for (int i = 0; i < matrizb.length; i++) {
            for (int j = 0; j < matrizb.length; j++) {
                System.out.print(" ");
                System.out.print("[" + matrizb[i][j] + "]");

            }
            System.out.println(" ");

        }
    }

}
