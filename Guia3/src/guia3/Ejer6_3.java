package guia3;

import java.util.Scanner;

public class Ejer6_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc;
        String conf = "N";

        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("ingrese otro numero");
        num2 = leer.nextInt();

        do {
            System.out.println("Opcion 1=sumar");
            System.out.println("Opcion 2=Resta");
            System.out.println("Opcion 3=Multiplicar");
            System.out.println("Opcion 4=Dividir");
            System.out.println("Opcion 5=Salir");
            System.out.println("Elija una opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma de sus numeros es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de sus numeros es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La Multiplicacion de sus numeros es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La Division de sus numeros es " + (num1 / num2));
                    break;
                case 5:
                    do {
                        System.out.println("Esta seguro desea salir del programa (S/N)? ");
                        conf = leer.next();
                        if (conf.equalsIgnoreCase("S")) {
                            System.exit(0);
                        }

                    } while (conf.equalsIgnoreCase("N"));

            }

        } while (conf.equalsIgnoreCase("N"));

    }

}
