

package Persistencia;

import Entidades.Autor;

/**
 *
 * @author Sebastián A. Petrini
 */

public class AutorDAO extends DAO<Autor> {

    public void borrarAutor(Autor objeto) {
        super.borrar(objeto);
    }

  
    public void reemplazarAutor(Autor objeto) {
        super.reemplazar(objeto); 
    }


    public void guardarAutor(Autor objeto) {
        super.guardar(objeto); 
    }

    public Autor buscaAutor(Integer id){
        conectar(); 
        em.getTransaction().begin();
        Autor resultado;
        resultado = em.find(Autor.class, id);
        em.getTransaction().commit();     
        desconectar();
        return resultado;
    }
}
