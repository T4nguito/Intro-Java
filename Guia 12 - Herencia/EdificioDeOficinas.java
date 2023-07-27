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
public class EdificioDeOficinas extends Edificio{
    
    private Integer numeroOficinas, personasPorOficina, numerosPisos;

    public EdificioDeOficinas(Integer numeroOficinas, Integer personasPorOficina, Integer numerosPisos, Double ancho, Double largo, Double alto) {
        super(ancho, largo, alto);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numerosPisos = numerosPisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public Integer getPersonasPorOficina() {
        return personasPorOficina;
    }

    public Integer getNumerosPisos() {
        return numerosPisos;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public Double getAlto() {
        return alto;
    }
    
    

    @Override
    public double calcularSuperficie() {
       return ancho* largo;
    }

    @Override
    public double calcularVolumen() {
       return ancho * largo* alto;
    }
    
    public void cantPersonas(){
        int personasEnPiso= numeroOficinas *  personasPorOficina;
        int personasEnEdificio= personasEnPiso * numerosPisos;
        System.out.println("Personas en Piso: " +personasEnPiso);
        System.out.println("Personas en el Edificio: "+personasEnEdificio);
    }
     
}
