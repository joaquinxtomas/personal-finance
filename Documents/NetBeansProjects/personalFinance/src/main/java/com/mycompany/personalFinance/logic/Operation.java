
package com.mycompany.personalFinance.logic;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelSheet;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@ExcelSheet("Sheet0")
public class Operation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    @ExcelCell(1)
    private String descr;
    private String type;
    private String category;
    @ExcelCell(4)
    private Double amount;
    
    @Temporal(TemporalType.DATE)
    @ExcelCell(0)
    private Date date;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Operation() {
    }

    public Operation(int id, String descr, String type, String category, Double amount, Date date, User user) {
        this.id = id;
        this.descr = descr;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Operation{" + "id=" + id + ", descr=" + descr + ", type=" + type + ", category=" + category + ", amount=" + amount + ", date=" + date + ", user=" + user + '}';
    }
    
}
