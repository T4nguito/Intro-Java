/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author jorwa
 */
public class Perro {
    
    private Persona persona;
    
    private String nombre;
    private String raza;
    private int edad;
    private int tamano;

    public Perro() {
    }

    public Perro(Persona persona, String nombre, String raza, int edad, int tamano) {
        this.persona = persona;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "persona=" + persona + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + '}';
    }
   
    
}
