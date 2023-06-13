package Sevicios;

import java.util.Scanner;
import Cadena.Cadena;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    int cont = 0;


    public void vocales(Cadena Frase){
        String frase = Frase.getFrase();
        int cont = 0;
        for (int i = 0; 1 < frase.length(); i++){
            switch (Frase.getFrase().toLowerCase().substring(i, i + 1)){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                cont - cont + 1;
                break;
            }
        }
        System.out.println("La cantidad de vocales de su frase es " + cont);
    }
    public void invertirFrase(Cadena Frase){
        String frase = Frase.getFrase();
        System.out.println("Su frase invertida es ");
        for (int i = frase.length()-1); i >= 0 ; i--) {
            System.out.println(Frase.getFrase().charAt(i));
        }
    }
    public void vecesRepetido (Cadena Frase){
        String frase= Frase.getFrase();
        System.out.println("Ingrese la vocal a evaluar:");
        char respuesta =leer.next().charAt(0);
        int cont=0;
        for (int i=0; i< frase.length(); i++){

            if (frase.charAt(i)==respuesta){
                cont++;
            }
        }
        if (cont ==0){
            System.out.println("No se encontro la letra");

        }else{
            System.out.println("La letra se encontro "+cont+" veces");
        }
    }
    }
}
