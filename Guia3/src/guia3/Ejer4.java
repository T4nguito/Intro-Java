package guia3;

/*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java. */

import java.rmi.server.ExportException;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una frase");
        String frase = leer.nextLine().toLowerCase();

        if (frase.substring(0, 1).equals("a")) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}
