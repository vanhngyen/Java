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

public class Ss62 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    public Ss62(int customerID ,String custemName ,String customerAddress , int customerAge){
        this.customerID = customerID;
        this.customerName = custemName;
        this.customerAddress = customerAddress;
        this.customerAge = customerAge;
    }
    void changeCustomerAddress(String address) {
        customerAddress = address;
       
    }
    void changecustomerAge(int age){
        customerAge = age;
    }
    void displayCustomerInformation(){ //method
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
    public static void main(String[] args) {
        Ss62 a = new Ss62( 1, "hihi", "so 8 ton that thuyet", 1);
        a.displayCustomerInformation();
        a.changeCustomerAddress("so 7 hehe");//
        a.changecustomerAge(4);
        System.out.println("-----------------------------------------------");
        a.displayCustomerInformation();
    }

}
