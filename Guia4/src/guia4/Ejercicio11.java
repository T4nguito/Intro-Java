/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
 se mantienen sin cambios.
aeiou
@#$%*
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Maika
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String pal = cambiar("Ayer, lunes, salimos a las once y 10");
        System.out.println("La palabra queda: " + pal);

    }

    public static String cambiar(String palabra) {
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {

            switch (palabra.substring(i, i + 1)) {
                case "A":
                case "a":
                    resultado = resultado + "@";
                    break;
                case "E":
                case "e":
                    resultado = resultado + "#";
                    break;
                case "I":
                case "i":
                    resultado = resultado + "$";
                    break;
                case "O":
                case "o":
                    resultado = resultado + "%";
                    break;
                case "U":
                case "u":
                    resultado = resultado + "*";
                    break;
                default:
                    resultado = resultado + palabra.substring(i, i + 1);
            }

        }
        return resultado;
    }
}