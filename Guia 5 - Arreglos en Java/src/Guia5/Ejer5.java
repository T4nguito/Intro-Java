package Guia5;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/*Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa). */

public class Ejer5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matrizA = { { 0, -2, 4 }, { 2, 0, 2 }, { -4, -2, 0 } };
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println(" ");
        }

        boolean mat = true;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] != (matrizA[j][i] * -1)) {
                    mat = false;
                    break;
                }
            }

        }
        if (mat) {
            System.out.println(" La Matriz es antisimetrica!!!");
        } else {
            System.out.println(" La matriz no es antisimetrica!!!");
        }

    }
}
