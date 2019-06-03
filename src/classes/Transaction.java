/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;
import classes.Constants.TransType;

/**
 *
 * @author marius
 */
public class Transaction {
    private Date data;
    private TransType type;
    private String description, client;
    private Double value, discount;
    private int ID;
    public Transaction()
    {
        this.data = null;
        this.description = this.client = null;
        this.value = this.discount = 0.0; 
        this.type = null;
        this.ID = 0;
    }

    public Transaction(Date data, TransType type, String description, String customer, Double value, Double discount,int ID) {
        this.data = data;
        this.type = type;
        this.description = description;
        this.client = customer;
        this.value = value;
        this.discount = discount;
        this.ID = ID;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Transaction{" + "Data=" + data + ", Type=" + type + ", Description=" + description + ", Customer=" + client + ", Value=" + value + ", Discount=" + discount + '}';
    }
    public Object[] toObject() {
        return new Object[]{ID,data, type, description,client,value,discount,value-discount};
    }
    public String[] toArray() {
        return new String[] {String.valueOf(ID),String.valueOf(data),Constants.getType(type),description,client,String.valueOf(value),
                            String.valueOf(discount),String.valueOf(value-discount)};
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date Data) {
        this.data = Data;
    }

    public TransType getType() {
        return type;
    }

    public void setType(TransType Type) {
        this.type = Type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String Customer) {
        this.client = Customer;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double Value) {
        this.value = Value;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double Discount) {
        this.discount = Discount;
    }
    
}
