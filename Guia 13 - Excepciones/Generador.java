/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author JAVIER
 */
public class Generador {
    
  private static final float CARGA_MAXIMA = Float.MAX_VALUE;
    private float bateria;

    public Generador() {
        bateria = CARGA_MAXIMA;
    }

    public void consumirEnergia(float cantidad) {
        if (cantidad <= bateria) {
            bateria -= cantidad;
        } else {
            bateria = 0;
        }
    }

    public float getPorcentajeBateria() {
        return (bateria / CARGA_MAXIMA) * 100;
    }
}

