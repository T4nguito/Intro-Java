
/*Programa Nespresso.
    Desarrolle una clase Cafetera en el paquete
        Entidades con los atributos capacidadMáxima (la cantidad máxima de
        café que puede contener la cafetera) y cantidadActual (la cantidad
        actual de café que hay en la cafetera). Agregar constructor vacío y con
        parámetros así como setters y getters.
        Crear clase CafeteraServicio en
        el paquete Servicios con los siguiente:
        a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
        capacidad máxima.
        b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
        método recibe el tamaño de la taza y simula la acción de servir la
        taza con la capacidad indicada. Si la cantidad actual de café “no
        alcanza” para llenar la taza, se sirve lo que quede. El método le
        informará al usuario si se llenó o no la taza, y de no haberse llenado
        en cuanto quedó la taza.
        c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
        d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
        el método lo recibe y se añade a la cafetera la cantidad de café
        indicada.*/

import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CafeteraServicio cS = new CafeteraServicio();
        int opc;
        do {
            System.out.println("Opciones: ");
            System.out.println("1- Inciar Cafetera");
            System.out.println("2- Llenar Cafetera");
            System.out.println("3- Servir Taza");
            System.out.println("4- Vaciar Cafetera");
            System.out.println("5- Agregar Cafe");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cS.iniciarCafetera();
                    break;
                case 2:
                    cS.llenarCafetera();
                    break;
                case 3:
                    cS.llenarCafetera();
                    break;
                case 4:
                    cS.servirTaza();
                    break;
                case 5:
                    cS.vaciarCafetera();
                    break;
                case 6:
                    cS.agregarCafe();
                    break;

                default:
                    System.out.println("Opcion no validad, vuelva a intentar");
            }

        }while (opc != 7);

    }

}