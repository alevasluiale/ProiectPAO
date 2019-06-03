/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marius
 */
public class ServiceClass {
    private List<Client> clients;
    private List<Transaction> transactions;
    private List<Employee> employees;
    private List<Product> products;
    private List<Tax> taxes;
    private List<Supplier> suppliers;
    private List<Food> foods;
    private List<Card> cards;

    public ServiceClass() {
        this.clients = null;
        this.transactions = null;
        this.employees = null;
        this.products = null;
        this.taxes = null;
        this.suppliers = null;
        this.foods = null;
        this.cards = null;
    }
    
    public void addClient(Client client)
    {   
        if(this.clients == null) this.clients = new ArrayList<Client>();
        this.clients.add(client);
    }
    public void addTransaction(Transaction transaction)
    {
        if(this.transactions == null) this.transactions = new ArrayList<Transaction>();
        this.transactions.add(transaction);
    }
    public void addEmployee(Employee employee)
    {
        if(this.employees == null) this.employees = new ArrayList<Employee>();
        this.employees.add(employee);
    }
    public void addProduct(Product product)
    {
        if(this.products == null) this.products = new ArrayList<Product>();
        this.products.add(product);
    }
    public void addTax(Tax tax)
    {
        if(this.taxes == null) this.taxes = new ArrayList<Tax>();
        this.taxes.add(tax);
    }
    public void addSupplier(Supplier supplier)
    {
        if(this.suppliers == null) this.suppliers = new ArrayList<Supplier>();
        this.suppliers.add(supplier);
    }
    public void addFood(Food food)
    {
        if(this.foods == null) this.foods = new ArrayList<Food>();
        this.foods.add(food);
    }
    public void addCard(Card card)
    {
        if(this.cards == null) this.cards = new ArrayList<Card>();
        this.cards.add(card);
    }
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    
}
