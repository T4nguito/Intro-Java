package guia4;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        String moneda = null;
        int euros = 0;

        cambio(0, moneda);

    }

    public static void cambio(int euros, String moneda) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros a convertir");
        euros = leer.nextInt();
        System.out
                .println("Ingrese la moneda a la cual quiere convertir los euros: yenes, dólares o libras únicamente");
        moneda = leer.next();

        switch (moneda) {
            case "dolares":

                System.out.println("la cantidad ingresada: " + euros + " es " + (euros * 1.28611) + " dolares");

                break;
            case "libras":
                System.out.println("la cantidad ingresada: " + euros + " es " + (euros * 0.86) + " libras");
                break;
            case "yenes":
                System.out.println("la cantidad ingresada: " + euros + " es " + (euros * 129.852) + " yenes");
                break;
            default:

                System.out.println("El valor ingresado es incorrecto");
        }

    }
}
