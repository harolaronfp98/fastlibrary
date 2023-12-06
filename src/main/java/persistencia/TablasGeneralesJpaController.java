/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.TablasGenerales;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Harol
 */
public class TablasGeneralesJpaController implements Serializable {

    public TablasGeneralesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TablasGenerales tablasGenerales) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tablasGenerales);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TablasGenerales tablasGenerales) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tablasGenerales = em.merge(tablasGenerales);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tablasGenerales.getIdTblGen();
                if (findTablasGenerales(id) == null) {
                    throw new NonexistentEntityException("The tablasGenerales with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TablasGenerales tablasGenerales;
            try {
                tablasGenerales = em.getReference(TablasGenerales.class, id);
                tablasGenerales.getIdTblGen();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tablasGenerales with id " + id + " no longer exists.", enfe);
            }
            em.remove(tablasGenerales);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TablasGenerales> findTablasGeneralesEntities() {
        return findTablasGeneralesEntities(true, -1, -1);
    }

    public List<TablasGenerales> findTablasGeneralesEntities(int maxResults, int firstResult) {
        return findTablasGeneralesEntities(false, maxResults, firstResult);
    }

    private List<TablasGenerales> findTablasGeneralesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TablasGenerales.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TablasGenerales findTablasGenerales(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TablasGenerales.class, id);
        } finally {
            em.close();
        }
    }

    public int getTablasGeneralesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TablasGenerales> rt = cq.from(TablasGenerales.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
