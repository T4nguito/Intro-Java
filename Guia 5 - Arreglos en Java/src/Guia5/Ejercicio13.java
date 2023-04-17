package Guia5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Maika
 */
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt() ;
        
        String[] equipo = new String[n];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("ingrese el nombre de cada integrante del equipo");
            equipo[i] = leer.next();
            
        }
    }
    
}
