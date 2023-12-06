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
import model.TablasGeneralesDetalles;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Harol
 */
public class TablasGeneralesDetallesJpaController implements Serializable {

    public TablasGeneralesDetallesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TablasGeneralesDetalles tablasGeneralesDetalles) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tablasGeneralesDetalles);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TablasGeneralesDetalles tablasGeneralesDetalles) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tablasGeneralesDetalles = em.merge(tablasGeneralesDetalles);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tablasGeneralesDetalles.getIdTblGenDet();
                if (findTablasGeneralesDetalles(id) == null) {
                    throw new NonexistentEntityException("The tablasGeneralesDetalles with id " + id + " no longer exists.");
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
            TablasGeneralesDetalles tablasGeneralesDetalles;
            try {
                tablasGeneralesDetalles = em.getReference(TablasGeneralesDetalles.class, id);
                tablasGeneralesDetalles.getIdTblGenDet();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tablasGeneralesDetalles with id " + id + " no longer exists.", enfe);
            }
            em.remove(tablasGeneralesDetalles);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TablasGeneralesDetalles> findTablasGeneralesDetallesEntities() {
        return findTablasGeneralesDetallesEntities(true, -1, -1);
    }

    public List<TablasGeneralesDetalles> findTablasGeneralesDetallesEntities(int maxResults, int firstResult) {
        return findTablasGeneralesDetallesEntities(false, maxResults, firstResult);
    }

    private List<TablasGeneralesDetalles> findTablasGeneralesDetallesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TablasGeneralesDetalles.class));
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

    public TablasGeneralesDetalles findTablasGeneralesDetalles(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TablasGeneralesDetalles.class, id);
        } finally {
            em.close();
        }
    }

    public int getTablasGeneralesDetallesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TablasGeneralesDetalles> rt = cq.from(TablasGeneralesDetalles.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
