

package Persistencia;

import Entidades.Editorial;

/**
 *
 * @author Sebastián A. Petrini
 */

public class EditorialDAO extends DAO<Editorial> {

    
    public void borrarEditorial(Editorial objeto) {
        super.borrar(objeto);
    }

   
    public void reemplazarEditorial(Editorial objeto) {
        super.reemplazar(objeto); 
    }

    
    public void guardarEditorial(Editorial objeto) {
        super.guardar(objeto); 
    }

    public Editorial busca(Integer id){
        conectar(); 
        em.getTransaction().begin();
        Editorial resultado;
        resultado = em.find(Editorial.class, id);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }
    
}
