import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresar los nombres");
        String[] Equipo = new String [6];
        for (int i = 0; i < Equipo.length; i++) {
            Equipo[i] = leer.nextLine();
        }
        String aux = " ";
        System.out.println("*Equipo");

        for (String nombre: Equipo) {
            aux = aux + "  " + nombre;
        }
        System.out.println(aux);
    }

}



