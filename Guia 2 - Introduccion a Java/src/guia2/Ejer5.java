
package guia2;

import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt(). */

public class Ejer5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingres un Numero Entero: ");
        int num = in.nextInt();
        System.out.println("El doble es: " + (num + num));
        System.out.println("El triple es: " + (num * 3));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));

    }

}
