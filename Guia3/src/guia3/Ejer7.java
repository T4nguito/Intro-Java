package guia3;

import java.util.Scanner;
/*
 * Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */

public class Ejer7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una cadena de palabra de 5 caracteres");
        String frase = leer.nextLine().toUpperCase();
        int correcto = 0;
        int incorrecto = 0;

        while (!(frase.equals("&&&&&")))
            if (((frase.substring(0, 1).equals("X")) && (frase.substring(4, 5).equals("O")))
                    && (frase.length() == 5))
                correcto++;
            else {
                incorrecto++;
            }

        System.out.println("Cadena correctas: " + correcto);
        System.out.println("Cadena incorrectas: " + incorrecto);
    }
}
