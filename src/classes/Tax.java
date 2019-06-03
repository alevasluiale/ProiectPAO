/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author marius
 */
public class Tax extends Transaction {
    private Date expiration;
    private boolean paid;

    public Tax(Date expiration, boolean paid) {
        super();
        this.expiration = expiration;
        this.paid = paid;
    }

    public Tax(Date expiration, boolean paid, Date data, Constants.TransType type, String description, String customer, Double value, Double discount,int ID) {
        super(data, type, description, customer, value, discount,ID);
        this.expiration = expiration;
        this.paid = paid;
    }

    public Tax() {
        super();
        this.expiration = null;
        this.paid = false;
    }

    public Tax(Date data, Constants.TransType type, String description, String customer, Double value, Double discount,int ID) {
        super(data, type, description, customer, value, discount,ID);
        this.expiration = null;
        this.paid = false;
    }
    
    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
