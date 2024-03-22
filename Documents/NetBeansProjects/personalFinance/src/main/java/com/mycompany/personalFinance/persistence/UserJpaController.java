/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personalFinance.persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.personalFinance.logic.Operation;
import com.mycompany.personalFinance.logic.User;
import com.mycompany.personalFinance.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class UserJpaController implements Serializable {

    public UserJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public UserJpaController(){
        emf = Persistence.createEntityManagerFactory("financePU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(User user) {
        if (user.getOperationList() == null) {
            user.setOperationList(new ArrayList<Operation>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Operation> attachedOperationList = new ArrayList<Operation>();
            for (Operation operationListOperationToAttach : user.getOperationList()) {
                operationListOperationToAttach = em.getReference(operationListOperationToAttach.getClass(), operationListOperationToAttach.getId());
                attachedOperationList.add(operationListOperationToAttach);
            }
            user.setOperationList(attachedOperationList);
            em.persist(user);
            for (Operation operationListOperation : user.getOperationList()) {
                User oldUserOfOperationListOperation = operationListOperation.getUser();
                operationListOperation.setUser(user);
                operationListOperation = em.merge(operationListOperation);
                if (oldUserOfOperationListOperation != null) {
                    oldUserOfOperationListOperation.getOperationList().remove(operationListOperation);
                    oldUserOfOperationListOperation = em.merge(oldUserOfOperationListOperation);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(User user) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            User persistentUser = em.find(User.class, user.getId());
            List<Operation> operationListOld = persistentUser.getOperationList();
            List<Operation> operationListNew = user.getOperationList();
            List<Operation> attachedOperationListNew = new ArrayList<Operation>();
            for (Operation operationListNewOperationToAttach : operationListNew) {
                operationListNewOperationToAttach = em.getReference(operationListNewOperationToAttach.getClass(), operationListNewOperationToAttach.getId());
                attachedOperationListNew.add(operationListNewOperationToAttach);
            }
            operationListNew = attachedOperationListNew;
            user.setOperationList(operationListNew);
            user = em.merge(user);
            for (Operation operationListOldOperation : operationListOld) {
                if (!operationListNew.contains(operationListOldOperation)) {
                    operationListOldOperation.setUser(null);
                    operationListOldOperation = em.merge(operationListOldOperation);
                }
            }
            for (Operation operationListNewOperation : operationListNew) {
                if (!operationListOld.contains(operationListNewOperation)) {
                    User oldUserOfOperationListNewOperation = operationListNewOperation.getUser();
                    operationListNewOperation.setUser(user);
                    operationListNewOperation = em.merge(operationListNewOperation);
                    if (oldUserOfOperationListNewOperation != null && !oldUserOfOperationListNewOperation.equals(user)) {
                        oldUserOfOperationListNewOperation.getOperationList().remove(operationListNewOperation);
                        oldUserOfOperationListNewOperation = em.merge(oldUserOfOperationListNewOperation);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = user.getId();
                if (findUser(id) == null) {
                    throw new NonexistentEntityException("The user with id " + id + " no longer exists.");
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
            User user;
            try {
                user = em.getReference(User.class, id);
                user.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The user with id " + id + " no longer exists.", enfe);
            }
            List<Operation> operationList = user.getOperationList();
            for (Operation operationListOperation : operationList) {
                operationListOperation.setUser(null);
                operationListOperation = em.merge(operationListOperation);
            }
            em.remove(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<User> findUserEntities() {
        return findUserEntities(true, -1, -1);
    }

    public List<User> findUserEntities(int maxResults, int firstResult) {
        return findUserEntities(false, maxResults, firstResult);
    }

    private List<User> findUserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(User.class));
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

    public User findUser(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(User.class, id);
        } finally {
            em.close();
        }
    }

    public int getUserCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<User> rt = cq.from(User.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
