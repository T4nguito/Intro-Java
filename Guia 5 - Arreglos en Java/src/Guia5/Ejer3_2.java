package Guia5;

import java.util.Scanner;

public class Ejer3_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor para para N");
        int n = leer.nextInt();
        int digito = 0;
        int cont = 0;
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 1000);
            System.out.print("[" + vector[i] + "]");

        }
        int[] veccont = new int[4];

        for (int i = 0; i < n; i++) {

            if (vector[i] >= 0 && vector[i] < 10) {
                veccont[0]++;
            }

            if (vector[i] >= 10 && vector[i] < 100) {
                veccont[1]++;
            }

            if (vector[i] >= 100 && vector[i] < 1000) {
                veccont[2]++;
            }

            if (vector[i] >= 1000 && vector[i] <= 9999) {
                veccont[3]++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < veccont.length; i++) {
            System.out.println(" La cantidad de numeros de " + (i + 1) + " es " + veccont[i]);

        }
    }

}
