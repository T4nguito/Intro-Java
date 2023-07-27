
package guia15ejercicio1;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;
import tienda.servicios.FabricanteService;

/**
 *
 * @author Sebastián A. Petrini
 */

public class Guia15Ejercicio1 {
   
    public static void main(String[] args) throws Exception {
        Collection<Fabricante> ListaFabricantes;
        FabricanteService fS = new FabricanteService();
        FabricanteDAO fD = new FabricanteDAO();
        ListaFabricantes = fD.listarFabricante();
        for (Fabricante Fabricante : ListaFabricantes) {
            System.out.println("Código: " + Fabricante.getCodigo() + "   Nombre: " + Fabricante.getNombre());
        }
        Fabricante f = fS.crearFabricante();
        fD.guardarFabricante(f);
        System.out.println("----------------------------"
                + "");
        ListaFabricantes = fD.listarFabricante();
        for (Fabricante Fabricante : ListaFabricantes) {
            System.out.println("Código: " + Fabricante.getCodigo() + "   Nombre: " + Fabricante.getNombre());
        }
        
        
    }

}
