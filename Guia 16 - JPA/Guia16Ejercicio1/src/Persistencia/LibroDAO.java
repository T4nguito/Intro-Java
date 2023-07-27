

package Persistencia;

import Entidades.Libro;

/**
 *
 * @author Sebastián A. Petrini
 */

public class LibroDAO extends DAO<Libro>{

    protected void borrarLibro(Libro objeto) {
        super.borrar(objeto); 
    }

    protected void reemplazarLibro(Libro objeto) {
        super.reemplazar(objeto);
    }

    public void guardarLibro(Libro objeto) {
        super.guardar(objeto);
    }
    
    public Libro buscarLibro(Integer id){
        conectar(); 
        em.getTransaction().begin();
        Libro resultado;
        resultado = em.find(Libro.class, id);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }

}
