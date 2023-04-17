package guia3;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
7. Sumar, Restar, Multiplicar, Dividir, Salir, Elija una opcion */

public class Ejer6_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        do {
            System.out.println("Menu");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            System.out.print("Opcion: ");
            int opcion = leer.nextInt();

            while (opcion =< 5) ;

                if (opcion = 1) {
                    System.out.println("Suma: " + (num1 + num2));
                }
                else if (opcion = 2) {
                    System.out.println("Resta: " + (num1 - num2));
                }
                else if (opcion = 3) {
                    System.out.println("Multiplicacion: " + (num1 * num2));
                }
                else if (opcion = 4) {
                    System.out.println("División: " + (num1 / num2));
                }
                else if (opcion = 5) {
                    System.out.println("Salir");
                }
            else {
                System.out.println("Opcion invalida");}
            
        }
    }
}