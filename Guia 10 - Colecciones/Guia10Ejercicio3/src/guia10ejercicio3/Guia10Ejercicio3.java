
package guia10ejercicio3;

import Entidad.Alumno;
import Servicio.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */

public class Guia10Ejercicio3 {
   
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService aS = new AlumnoService();
        
        
        String opc;
        do{
           listaAlumnos.add(aS.crearAlumno());
            System.out.print("Desea cargar otro alumno S/N: ");
            opc = Leer.next().toLowerCase().substring(0, 1);          
        }while(opc.equals("s"));   
        
        aS.buscarAlumno(listaAlumnos);
        

    }

}
