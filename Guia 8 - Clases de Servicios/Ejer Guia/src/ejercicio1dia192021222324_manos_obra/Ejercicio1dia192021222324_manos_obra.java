/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1dia192021222324_manos_obra;

import ejercicio1dia192021222324_manos_obra.servicios.ServiciosPersona;

/**
 *
 * @author Lautaro
 */
public class Ejercicio1dia192021222324_manos_obra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosPersona m2 = new ServiciosPersona();
        
        Persona m3 = m2.crearPersona();
        System.out.println("Nombre "+m3.getNombre());
        System.out.println("Edad "+m3.getEdad());
        
    }
    
}
