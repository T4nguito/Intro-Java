/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RevolverDeAgua;

/**
 *
 * @author jorwa
 */
public class ServicioRevolver {

    RevolverDeAgua rev = new RevolverDeAgua();

    public void llenarRevolver() {

        double aux = Math.random() * 10;
        rev.setPosicionActual((int) aux);
        double aux1 = Math.random() * 10;
        rev.setPosicionAgua((int) aux1);

        System.out.println("Posicion Actual: " + rev.getPosicionActual());
        System.out.println("Posicion Agua: " + rev.getPosicionAgua()
    

    );

    }
    
    public boolean mojar() {

        return (rev.getPosicionActual() == rev.getPosicionAgua());

    }

    public void siguienteChorro() {

        rev.setPosicionActual(rev.getPosicionActual() + 1);

    }

    @Override
    public String toString() {
        return "ServicioRevolver{" + "rev=" + rev + '}';
    }

}
