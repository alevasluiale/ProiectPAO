/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;

/**
 *
 * @author marius
 */
public class Supplier {
    private int ID;
    private String name;
    List<String> products;

    public Supplier() {
        this.ID = 0;
        this.name = null;
        this.products = null;
    }

    public Supplier(int ID,String name, List<String> products) {
        this.ID = ID;
        this.name = name;
        this.products = products;
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

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
