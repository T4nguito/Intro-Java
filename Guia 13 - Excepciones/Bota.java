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
public class Bota extends Dispositivo {
    
private static final int CONSUMO_BASICO = 10;

    public int usar(int tiempo) {
        return CONSUMO_BASICO * tiempo;
    }
}

