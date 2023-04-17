package guia4;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {

        String nom = null;
        int edad = 0;

        datos(edad, nom);

    }

    public static void datos(int edad, String nom) {
        Scanner leer = new Scanner(System.in);
        String mayoríaEdad;
        String opc;

        do {
            System.out.println("ingrese el nombre de la persona, seguida de su edad");

            nom = leer.nextLine();

            edad = leer.nextInt();

            if (edad > 18) {
                System.out.println("Es mayor de edad");

            } else {
                System.out.println("No es mayor de edad");
            }
            leer.nextLine();
            System.out.println("Desea seguir ingresando personas? si/no");
            opc = leer.nextLine();

        } while (opc.equalsIgnoreCase("si"));

    }
}
