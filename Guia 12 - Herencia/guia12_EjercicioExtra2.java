
package guia12_ejercicioextra.pkg2;

import guia12_ejercicioextra.pkg2.entidad.Edificio;
import guia12_ejercicioextra.pkg2.entidad.EdificioDeOficinas;
import guia12_ejercicioextra.pkg2.entidad.Polideportivo;
import java.util.ArrayList;

/**
 *Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico. 
Estos métodos serán abstractos y los implementarán las siguientes clases: 
* 
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre. 
* 
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.
16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas
 * 
 */
public class Guia12_EjercicioExtra2 {

  
    public static void main(String[] args) {
       
        ArrayList<Edificio> edificios = new ArrayList<>();
       // Polideportivo p1 = new Polideportivo();
        Edificio p1 = new Polideportivo( "p1", "Techado",20d, 10d, 30d);
        Edificio p2 = new Polideportivo( "P2", "Abierto",25d, 12d, 35d);
        Edificio edificioOficinas1 = new EdificioDeOficinas(50, 30, 100, 5d, 10d, 4d);
        Edificio edificioOficinas2 = new EdificioDeOficinas(40, 25, 80, 3d, 8d, 6d);
        
        edificios.add(p1);
        edificios.add(p2);
        
        edificios.add(edificioOficinas1);
        edificios.add(edificioOficinas2);
        
        for (Edificio edificio : edificios) {
            
            System.out.println("Superficie del Edificio: "+edificio.calcularSuperficie());
            System.out.println("Volumen del Edificio: "+edificio.calcularVolumen());
            System.out.println("");
        }
        
        int techado=0;
        int abierto=0;
        
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                
                Polideportivo polideportivo= (Polideportivo) edificio;
                
                if (polideportivo.getTipoInstalacion().equals("Techado")) {
                    
                    techado++;
                }
                else{
                    abierto++;
                }
            }
        }
        System.out.println("Polideportivos techados: " +techado);
        System.out.println("Polideportivos Abiertos: " + abierto);
        
        for (Edificio edificio : edificios) {
            
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.cantPersonas();
                System.out.println("");
            }
        }
    }
    
   
}
