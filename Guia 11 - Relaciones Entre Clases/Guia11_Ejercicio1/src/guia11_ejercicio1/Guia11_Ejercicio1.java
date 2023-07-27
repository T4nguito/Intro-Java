/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_ejercicio1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author jorwa
 */
public class Guia11_Ejercicio1 {

    /**
     * @param args the command line arguments
     *
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
     * contar de dos clases. Perro, que tendrá como atributos: nombre, raza,
     * edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad,
     * documento y Perro. Ahora deberemos en el main crear dos Personas y dos
     * Perros. Después, vamos a tener que pensar la lógica necesaria para
     * asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
     * Persona, la información del Perro y de la Persona.
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNombre("Iona");
        persona1.setApellido("Romero");
        persona1.setEdad(30);
        persona1.setDocumento(12345678);

        persona2.setNombre("D3mian");
        persona2.setApellido("Roldan");
        persona2.setEdad(31);
        persona2.setDocumento(1234);

        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        perro1.setNombre("Cartucho");
        perro1.setRaza("Collie");
        perro1.setEdad(5);
        perro1.setTamano(90);

        perro2.setNombre("Chiquito");
        perro2.setRaza("salchicha");
        perro2.setEdad(3);
        perro2.setTamano(30);

        persona1.setPerro(perro2);
        persona2.setPerro(perro1);

        89System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }

}
