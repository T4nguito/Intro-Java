

package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Sebastián A. Petrini
 * 
 */

public abstract class DAO<T> {
    
    
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Guia16Ejercicio1PU");
    protected EntityManager em = EMF.createEntityManager();
    
    protected void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }
    
    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
    protected void guardar(T objeto){
        conectar(); 
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();     
        desconectar();
    }
    
    protected void reemplazar(T objeto){
        conectar(); 
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();     
        desconectar();
    }
    
    protected void borrar(T objeto){
        conectar(); 
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();     
        desconectar();
    }
    
}
