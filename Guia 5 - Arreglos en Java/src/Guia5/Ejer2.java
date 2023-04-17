package Guia5;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
                        
        }

        System.outprintln(" Ingrese el numero a buscar entre 0 y 10 ");
        int nl = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (nl == vector[i]) {
                System.out.println(" Su numero se encuentra en la posicion " + i + " del vector");
                int 
            }
        }
    
        
    }

}
