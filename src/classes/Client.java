/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author marius
 */
public class Client {
    private String FirstName,LastName,CI,CNP,CardNumber;
    private int ID;
    private Card creditCard;

    public Client(String FirstName,String LastName, String CI, String CNP, String CardNumber, int ID, Card creditCard) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CI = CI;
        this.CNP = CNP;
        this.CardNumber = CardNumber;
        this.ID = ID;
        this.creditCard = creditCard;
    }
    public Client()
    {
        this.FirstName = null;
        this.LastName = null;
        this.CI = null;
        this.CNP = null;
        this.CardNumber = null;
        this.ID = 0;
        this.creditCard = null;
    }
    public Object[] toObject()
    {
        return new Object[]{ID,FirstName,LastName,CI,CNP, 0,0};
    }
    public String[] toArray()
    {
        return new String[]{String.valueOf(ID),FirstName,LastName,CI,CNP,"0","0"};
    }
    
    public Card getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String Name) {
        this.FirstName = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
