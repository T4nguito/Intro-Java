package guia3;

import java.util.Scanner;

public class Ejer6_4_GPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        char opcion = '\0';
        do {
            System.out.print("Ingrese el primer número: ");
            num1 = input.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = input.nextInt();
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = input.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case '2':
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case '3':
                    System.out.println("El producto es: " + (num1 * num2));
                    break;
                case '4':
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        System.out.println("La división es: " + ((double) num1 / num2));
                    }
                    break;
                case '5':
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    char confirmacion = input.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        opcion = '5';
                        System.out.println("Saliendo del programa...");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != '5');
    }
}
