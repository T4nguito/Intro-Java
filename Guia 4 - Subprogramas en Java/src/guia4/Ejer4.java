package guia4;

import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean primo = true;

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if (numPrimo(num) == true) {
            System.out.println("El numero es primo");

        } else {
            System.out.println("El numero no es primo");
        }
    }

    public static boolean numPrimo(int num) {
        boolean primo = true;
        int cont = 0;

        for (int i = 1; i <= num; i++) {


            if (num % i == 0) {
                cont++;

                if (num == 1) {
                    primo = false;
                    break;

                }
                if (cont > 2) {
                    primo = false;

                    break;
                } else {
                    primo = true; }
            }
        } return primo;
    }
}