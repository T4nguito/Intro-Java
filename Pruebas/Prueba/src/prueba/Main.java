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
public class Main {
    public static void main (String[] args){
        Automovil carrito = new Automovil("Azul", "BMW","2017");
        Automovil carrito2 = new Automovil(140);
        carrito.arrancar();
        int km = 100;
        carrito.acelerar(km);
        carrito.frenar();
        
    }
      
          
    
}
