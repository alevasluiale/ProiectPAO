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
public class Constants {
    public enum TransType {
        SALE, REGISTER_INFLOW, REGISTER_OUTFLOW, PRODUCT_RETURN, PRICE_CORRECTION, SUPPLY, CLIENT_DEPOSIT;
    }
    public static TransType getType(String type)
    {
        if(type.equals("SALE")) return TransType.SALE;
        if(type.equals("REGISTER_INFLOW")) return TransType.REGISTER_INFLOW;
        if(type.equals("REGISTER_OUTFLOW")) return TransType.REGISTER_OUTFLOW;
        if(type.equals("PRODUCT_RETURN")) return TransType.PRODUCT_RETURN;
        if(type.equals("PRICE_CORRECTION")) return TransType.PRICE_CORRECTION;
        if(type.equals("SUPPLY")) return TransType.SUPPLY;
        if(type.equals("CLIENT_DEPOSIT")) return TransType.CLIENT_DEPOSIT;
        return null;
    }
    public static String getType(TransType type)
    {
        if(type == TransType.SALE) return "SALE";
        if(type == TransType.REGISTER_INFLOW) return "REGISTER_INFLOW";
        if(type == TransType.REGISTER_OUTFLOW) return "REGISTER_OUTFLOW";
        if(type == TransType.PRODUCT_RETURN) return "PRODUCT_RETURN";
        if(type == TransType.PRICE_CORRECTION) return "PRICE_CORRECTION";
        if(type == TransType.SUPPLY) return "SUPPLY";
        if(type == TransType.CLIENT_DEPOSIT) return "CLIENT_DEPOSIT";
        return null;
    }
}
