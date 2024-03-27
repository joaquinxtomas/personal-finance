
package com.mycompany.personalFinance.logic;

import com.mycompany.personalFinance.persistence.PersistenceController;
import java.util.Date;
import java.util.List;


public class Controller {
    PersistenceController pControl = new PersistenceController();
    User validUser;

    public User validateUser(String email, String password) {
        validUser = null;
        List<User> usersList = pControl.getUsers();
        for (User user : usersList) {
            if(user.getEmail().equals(email)){
                if(user.getPassword().equals(password)){
                    validUser = user;
                    return validUser;
                } else {
                    validUser = null;
                    return validUser;
                } 
            } else {
                validUser = null;
            }
        }
        return validUser;
    }

    public List<Operation> getOperations() {
        return pControl.getOperations();
    }

    public void createOp(String descr,String type,String category, Double amount, Date selectedDate) {
        Operation op = new Operation();
        op.setAmount(amount);
        op.setDescr(descr);
        op.setType(type);
        op.setCategory(category);
        op.setDate(selectedDate);
        op.setUser(validUser);
        pControl.createOperation(op);
    }

    private int searchId() {
        List<Operation> opList = pControl.getOperations();
        Operation op = opList.get(opList.size()-1);
        return op.getId();
    }

    public void createUser(String name, String email, String password) {
        User usr = new User();
        usr.setName(name);
        usr.setEmail(email);
        usr.setPassword(password);
        pControl.createUser(usr);
    }

    public void deleteOperation(int idOp) {
        pControl.deleteOp(idOp);
    }

    public List<User> getUsers() {
        return pControl.getUsers();
    }


    
}
