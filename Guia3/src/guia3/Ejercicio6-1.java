package guia3;

import java.until.Scanner

public class Ejercicio6-1
{

    public static void main(String[] args) {
        java.util.Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero1: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el numero2:");
        int num2 = leer.nextInt();

        if (num1 != num2) {
            System.out.println("Es mayor a 25");

        }

    }
}
