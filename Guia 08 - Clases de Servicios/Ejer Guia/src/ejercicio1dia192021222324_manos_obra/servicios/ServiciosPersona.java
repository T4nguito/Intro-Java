/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1dia192021222324_manos_obra.servicios;

import ejercicio1dia192021222324_manos_obra.Persona;
import java.util.Scanner;

/**
 *
 * @author Lautaro
 */
public class ServiciosPersona {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        public Persona crearPersona(){
        System.out.println("Ingrese el nombre y edad");
        return new Persona(leer.next(),leer.nextInt());
}
}


