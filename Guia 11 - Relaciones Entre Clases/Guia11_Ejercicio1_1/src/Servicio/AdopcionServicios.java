package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AdopcionServicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    
    ArrayList<Perro> listaPerros = new ArrayList<>();
    
    public void crearPerro() {
        
        boolean confirmacion = true;
        
        System.out.println("------------CARGANDO PERROS EN ADOPCIÓN----------");
        do {
            Perro perro = new Perro();
            
            System.out.println("INGRESE NOMBRE DEL PERRO: ");
            perro.setNombre(leer.next());
            System.out.println("INGRESE LA RAZA DE " + perro.getNombre());
            perro.setRaza(leer.next());
            System.out.println("INGRESE EDAD DE " + perro.getNombre());
            perro.setEdad(leer.nextInt());
            System.out.println("INGRESE EL TAMAÑO DE " + perro.getNombre());
            perro.setTamano(leer.next());
            
            listaPerros.add(perro);
            
            System.out.println("DESEA INGRESAR OTRO PERRO? ( S / N )");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion = false;
            }
            
        } while (confirmacion);
        
        System.out.println("");
        
        for (Perro listaP : listaPerros) {
            System.out.println(listaP);
        }
        
    }
    
    public void crearPersona() {
        boolean confirmacion = true;
        
        System.out.println("------------CARGANDO PERSONAS----------");
        do {
            Persona persona = new Persona();
            
            System.out.println("INGRESE NOMBRE: ");
            persona.setNombre(leer.next());
            System.out.println("INGRESE APELLIDO DE: " + persona.getNombre());
            persona.setApellido(leer.next());
            System.out.println("INGRESE EDAD DE: " + persona.getNombre());
            persona.setEdadPersona(leer.nextInt());
            System.out.println("INGRESE EL DNI DE " + persona.getNombre());
            persona.setDni(leer.nextInt());
            System.out.println("LISTADO PERROS EN ADOPCIÓN");
            for (Perro listaP : listaPerros) {
                System.out.println(listaP);
            }
            System.out.println("Ingrese el nombre del perro que desea adoptar: ");
            String nombrep = leer.next();
            for (Perro listaP : listaPerros) {
                if (listaP.getNombre().equals(nombrep)){
                    persona.setPerro(listaP);
                 }   
            }
            Iterator<Perro> it = listaPerros.iterator();
            
            while (it.hasNext()) {
                if (it.next().getNombre().equalsIgnoreCase(nombrep)) {
                    
                    System.out.println(nombrep);
                    
                   it.remove();
                }
               
            }
            System.out.println("El Sr./a " +persona.getNombre()+" "+persona.getApellido()+ " ha adoptado " +"''"+ nombrep+"''");
            System.out.println("Felicitaciones");
            listaPersonas.add(persona);
           
            System.out.println("DESEA INGRESAR OTRO PERSONA? ( S / N )");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion = false;
            }
            
        } while (confirmacion);
        
        System.out.println("");
        
        for (Persona listapersona : listaPersonas) {
            System.out.println(listapersona.toString());
        }
        for (Perro listaP : listaPerros) {
                System.out.println(listaP);
            }
    }
    
   
}
