/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.database;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import classes.Client;
import classes.Constants;
import classes.Product;
import classes.Transaction;

/**
 *
 * @author marius
 */
public class DataManager {
    private static Connection conn = null;
    private static String dbUrl = "";
    private static String dbUser = "";
    private static String dbPass = "";
    public static ResultSet rezultat;
    public static void Connect()
    {
        File configFile = new File(System.getProperty("user.dir") + File.separator + "conf.xml");
        if(configFile.exists()) {
            try {
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                org.w3c.dom.Document document = documentBuilder.parse(configFile);
                dbUrl 		  	  		      = "jdbc:mysql://" + document.getElementsByTagName("ServerUrl").item(0).getTextContent();
                dbUser 		      		      = document.getElementsByTagName("Username").item(0).getTextContent();
                dbPass 	      		          = document.getElementsByTagName("Password").item(0).getTextContent();
                
                Class.forName("com.mysql.jdbc.Driver");  
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                return;
            } catch (Exception ex) {
                System.out.println("Could not read conf file: ");
                ex.printStackTrace();
                return ;
            }
        } else
            System.out.println("The file conf.xml was not found in the directory "
                    + System.getProperty("user.dir"));
        return;
    }
    public static ResultSet getTransactions()
    {
        Statement stmt = null;
        String query = "SELECT * from Transactions";
        
        try {
            stmt = conn.createStatement();
            stmt.execute(query);
            rezultat = stmt.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rezultat;
        
    }
    public static ResultSet getClients()
    {
        Statement stmt = null;
        String query = "SELECT * from Clients";
        
        try {
            stmt = conn.createStatement();
            stmt.execute(query);
            rezultat = stmt.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rezultat;
        
    }
    public static ResultSet getProducts()
    {
        Statement stmt = null;
        String query = "SELECT * from Products";
        
        try {
            stmt = conn.createStatement();
            stmt.execute(query);
            rezultat = stmt.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rezultat;
        
    }
    public static ResultSet getClientsNames()
    {
        Statement stmt = null;
        String query = "SELECT CONCAT(IFNULL(LastName,''),' ',IFNULL(FirstName,'')) from Clients";
        
        try {
            stmt = conn.createStatement();
            stmt.execute(query);
            rezultat = stmt.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rezultat;
    }
    public static void addTransaction(Transaction trans)
    {   
        SimpleDateFormat pff = new SimpleDateFormat("yyyy-MM-dd");
        String query = "INSERT INTO ProiectPao.Transactions\n" +
                        "(`Data`, `Type`, Description, Client, Value, Discount)\n" +
                            "VALUES('"+pff.format(trans.getData())+"', '"+Constants.getType(trans.getType())+"', '"+
                trans.getDescription()+"', '"+trans.getClient()+"', "+String.valueOf(trans.getValue())+", "+String.valueOf(trans.getDiscount())+");";
        CallableStatement cerere = null;
        try {
            cerere = conn.prepareCall(query);
            cerere.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void addProduct(Product product)
    {   
        SimpleDateFormat pff = new SimpleDateFormat("yyyy-MM-dd");
        String query = "INSERT INTO ProiectPao.Products\n" +
                        "(Name, Stock, Price, Expiration, Supplier, SupplierID)\n" +
                        "VALUES('"+product.getName()+"', "+String.valueOf(product.getStock())+", "+product.getPrice()+", '"+
                                        pff.format(product.getExpiration())+"', '"+"-"+"', "+"0"+");";
        CallableStatement cerere = null;
        try {
            cerere = conn.prepareCall(query);
            cerere.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void addClient(Client client)
    {   
        SimpleDateFormat pff = new SimpleDateFormat("yyyy-MM-dd");
        String query = "INSERT INTO ProiectPao.Clients\n" +
                        "(FirstName, LastName, CI, CNP, CardNumber, CardID)\n" +
                        "VALUES('"+client.getFirstName()+"', '"+client.getLastName()+"', '"+client.getCI()+"', '"+
                client.getCNP()+"', '"+client.getCardNumber()+"', 0);";
        CallableStatement cerere = null;
        try {
            cerere = conn.prepareCall(query);
            cerere.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void deleteTransaction(String ID )
    {   
        SimpleDateFormat pff = new SimpleDateFormat("yyyy-MM-dd");
        String query = "DELETE FROM ProiectPao.Transactions WHERE ID="+ID;
        CallableStatement cerere = null;
        try {
            cerere = conn.prepareCall(query);
            cerere.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void modifyTransaction(Transaction trans)
    {   
        SimpleDateFormat pff = new SimpleDateFormat("yyyy-MM-dd");
        String query = "UPDATE ProiectPao.Transactions\n" +
"SET `Data`='"+pff.format(trans.getData())+"', `Type`='"+Constants.getType(trans.getType())+"', Description='"+
                trans.getDescription()+"', Client='"+trans.getClient()+"', Value="+String.valueOf(trans.getValue())+", Discount="+String.valueOf(trans.getDiscount())+"\n" +
"WHERE ID=" +String.valueOf(trans.getID()) + ";" ;
        System.out.println(query);
        CallableStatement cerere = null;
        try {
            cerere = conn.prepareCall(query);
            cerere.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void log(String comanda)
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String query = "INSERT INTO ProiectPao.Logger\n" +
                    "(Actiune, `TimeStamp`)\n" +
                    "VALUES('"+comanda+"', '"+timestamp.toString()+"');";
        CallableStatement cerere = null;
        try {
            cerere = conn.prepareCall(query);
            cerere.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
