/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej2nespresso.entidades;

/**
 *
 * @author CDRCONS02
 */
public class Cafetera {
    private double capacidadMaxima;
    private double cantidaActual;

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidaActual() {
        return cantidaActual;
    }

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidaActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidaActual = cantidaActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidaActual(double cantidaActual) {
        this.cantidaActual = cantidaActual;
    }
    
    
    
}
