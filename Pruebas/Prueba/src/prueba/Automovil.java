/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Maika
 */
public class Automovil {
    static private String color, marca, modelo;
    static private int caballosMotor;

    public Automovil(String color, String marca, String modelo){ 
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Se ha creado un objeto de la clase Automovil de color "+this.color+" Marca "+this.marca+" y es modelo: "+this.modelo);
    }
    
    public Automovil(int caballosMotor){
        System.out.println("Se ha creado un objeto Automovil con "+caballosMotor+" caballos de fuerza");
    }
void arrancar(){
    System.out.println("Nos Fuimos...");
    }
void acelerar(int km){
    System.out.println("Vamos a "+km+" km por hora");
}
void frenar(){
    System.out.println("Esta frenando....");
}


    
}
