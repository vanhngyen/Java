/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnss56;

/**
 *
 * @author asus
 */
public class Ss61 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    public static void main(String[] args) {
        Ss61 objCustomer1 = new Ss61();
        objCustomer1.customerID = 100;
        objCustomer1.customerName = "John";
        objCustomer1.customerAddress = "123 Street";
        objCustomer1.customerAge = 30;
        System.out.println("Customer Identification Number:"  + objCustomer1.customerID);
        System.out.println("Customer Name: " + objCustomer1.customerName);
        System.out.println("Customer Address: " + objCustomer1.customerAddress);
        System.out.println("Customer Age: " + objCustomer1.customerAge);
        
    }
}
