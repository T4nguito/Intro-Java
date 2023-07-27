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
public abstract class Dispositivo {
    
  private boolean danado;

    public boolean estaDanado() {
        return danado;
    }

    public void revisar() {
        danado = false;
    }

    public void reparar() {
        danado = false;
    }

    public abstract int usar(int tiempo);

    void reparar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
