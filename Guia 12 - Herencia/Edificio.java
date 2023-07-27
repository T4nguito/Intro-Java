/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ejercicioextra.pkg2.entidad;

/**
 *
 * @author Rocha Paula
 */
public abstract class Edificio {
    protected Double ancho, largo, alto;

    public Edificio(Double ancho, Double largo, Double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }
    
    public abstract double calcularSuperficie();
     public abstract double calcularVolumen();
     
     
}
