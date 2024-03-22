
package com.mycompany.personalFinance.persistence;

import com.mycompany.personalFinance.logic.Operation;
import com.mycompany.personalFinance.logic.User;
import com.mycompany.personalFinance.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {
    
    OperationJpaController opJpa = new OperationJpaController();
    UserJpaController usrJpa = new UserJpaController();

    public List<User> getUsers() {
        return usrJpa.findUserEntities();
    }

    public List<Operation> getOperations() {
        return opJpa.findOperationEntities();
    }

    public void createOperation(Operation op) {
        try {
            opJpa.create(op);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createUser(User usr) {
        usrJpa.create(usr);
    }

    public void deleteOp(int idOp) {
        try {
            opJpa.destroy(idOp);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Operation getOperation(int idOp) {
        return opJpa.findOperation(idOp);
    }

    public void modifyOp(Operation op) {
        try {
            opJpa.edit(op);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
