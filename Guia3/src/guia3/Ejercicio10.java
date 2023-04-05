package guia3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int numero;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();

            System.out.print(numero + " ");
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
