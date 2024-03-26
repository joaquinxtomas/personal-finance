package com.mycompany.personalFinance.persistence;

import com.mycompany.personalFinance.logic.Operation;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.personalFinance.logic.User;
import com.mycompany.personalFinance.persistence.exceptions.NonexistentEntityException;
import com.mycompany.personalFinance.persistence.exceptions.PreexistingEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OperationJpaController implements Serializable {

    public OperationJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public OperationJpaController() {
        emf = Persistence.createEntityManagerFactory("financePU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Operation operation) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User user = operation.getUser();
            if (user != null) {
                user = em.getReference(user.getClass(), user.getId());
                operation.setUser(user);
            }
            em.persist(operation);
            if (user != null) {
                user.getOperationList().add(operation);
                user = em.merge(user);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findOperation(operation.getId()) != null) {
                throw new PreexistingEntityException("Operation " + operation + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Operation operation) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Operation persistentOperation = em.find(Operation.class, operation.getId());
            User userOld = persistentOperation.getUser();
            User userNew = operation.getUser();
            if (userNew != null) {
                userNew = em.getReference(userNew.getClass(), userNew.getId());
                operation.setUser(userNew);
            }
            operation = em.merge(operation);
            if (userOld != null && !userOld.equals(userNew)) {
                userOld.getOperationList().remove(operation);
                userOld = em.merge(userOld);
            }
            if (userNew != null && !userNew.equals(userOld)) {
                userNew.getOperationList().add(operation);
                userNew = em.merge(userNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = operation.getId();
                if (findOperation(id) == null) {
                    throw new NonexistentEntityException("The operation with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Operation operation;
            try {
                operation = em.getReference(Operation.class, id);
                operation.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The operation with id " + id + " no longer exists.", enfe);
            }
            User user = operation.getUser();
            if (user != null) {
                user.getOperationList().remove(operation);
                user = em.merge(user);
            }
            em.remove(operation);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Operation> findOperationEntities() {
        return findOperationEntities(true, -1, -1);
    }

    public List<Operation> findOperationEntities(int maxResults, int firstResult) {
        return findOperationEntities(false, maxResults, firstResult);
    }

    private List<Operation> findOperationEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Operation.class));
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

    public Operation findOperation(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Operation.class, id);
        } finally {
            em.close();
        }
    }

    public int getOperationCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Operation> rt = cq.from(Operation.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
