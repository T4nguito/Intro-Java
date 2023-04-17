package guia3;

import java.until.Scanner;

/* Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25. */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = leer.nextInt();

        if (num1 > 25 != num2 > 25) {
            System.out.println("Es Mayor a 25");
        } else if (num1 > 25 == num2 > 25) {
            System.out.println("Es Mayor a 25");
        } else {
            System.out.println("Su numero no es mayor a 25");
        }
    }

}
