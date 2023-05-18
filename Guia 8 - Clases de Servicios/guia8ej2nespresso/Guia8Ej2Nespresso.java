/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2nespresso;

import guia8ej2nespresso.entidades.Cafetera;
import guia8ej2nespresso.servicios.CafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author CDRCONS02
 */
public class Guia8Ej2Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner(System.in);
        CafeteraServicios cS = new CafeteraServicios();
        int opc;
        new math()
        do {
            System.out.println("ingrese una opcion");
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
                    cS.servirTaza();
                    break;
                case 4:
                    cS.vaciarCafetera();
                    break;
                case 5:
                    cS.agregarCafe();
                    break;

                default:
                   System.out.println("Opcion no validad, vuelva a intentar");
            }

        }while (opc != 6);
       
    }

}


