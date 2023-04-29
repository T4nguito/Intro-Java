/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;


public class Prueba {


    public static void main(String[] args) {
        
        
       int num;
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        do {
            System.out.println("Ingrese un número entero positivo");
            num = leer.nextInt();
            if (num > 1000) {
                System.out.println("Este programa ");
                String confirmar = leer.next ();
                if (confirmar.equals("s")) {
                    break;
                    
        
                }
            }        
        } while (num <= 0 || num > 1000);
        
        int j, suma;
        for (int i = 1; i <=num; i++) {
            if (i%2 != 0) 
                continue;
                    
            suma = 0;
            j = 1;
            while(j <= i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los " + i + " numeros naturales es: " + suma);
                        
        }
    }
    
}
