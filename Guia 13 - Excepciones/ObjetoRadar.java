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
public class ObjetoRadar {
    
 private float resistencia;
    private int x;
    private int y;
    private int z;
    private boolean hostil;

    public ObjetoRadar(float resistencia, int x, int y, int z, boolean hostil) {
        this.resistencia = resistencia;
        this.x = x;
        this.y = y;
        this.z = z;
        this.hostil = hostil;
    }

    public float getResistencia() {
        return resistencia;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void recibirDanio(int potencia) {
        resistencia -= potencia;
    }

    public void destruir() {
        resistencia = 0;
    }
}

