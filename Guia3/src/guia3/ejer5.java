package guia3;
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial. */

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        int suma = 0;

        System.out.println("Ingrese un numero positivo como numero limite");
        int limite = leer.nextInt();

        do {
            System.out.println("ingrese un numero a sumar");
            int numero = leer.nextInt();

            suma = suma + numero;

        } while (suma <= limite);

        System.out.println("Usted supero el limite: " + suma);
    }
}
