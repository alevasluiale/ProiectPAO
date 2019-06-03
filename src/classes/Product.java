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
public class Product {
    private String name;
    private Supplier supplier;
    private double price,stock;
    private int ID;
    private Date expiration;

    public Product(String name, Supplier supplier, double price, double stock, Date expiration,int ID) {
        this.name = name;
        this.supplier = supplier;
        this.price = price;
        this.stock = stock;
        this.expiration = expiration;
        this.ID = ID;
    }
    public Product()
    {
        this.name = null;
        this.supplier = null;
        this.price = 0;
        this.stock = 0;
        this.expiration = null;
        this.ID = 0;
    }
    public Object[] toObject() {
        return new Object[]{ID,name, "", expiration,stock, price};
    }
    public String[] toArray() {
        return new String[] {String.valueOf(ID),name,"",String.valueOf(expiration),String.valueOf(stock),String.valueOf(price)};
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
    
}
