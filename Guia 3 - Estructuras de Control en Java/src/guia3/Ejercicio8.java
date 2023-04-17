package guia3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nota");

        int respuesta = leer.nextInt();
        while (respuesta < 0 != respuesta > 10) {
            System.out.println("No es una nota valida");
            respuesta = leer.nextInt();
        }
    }
}
