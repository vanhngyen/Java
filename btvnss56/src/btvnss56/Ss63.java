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
public class Ss63 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
  
    public Ss63(int customerID, String custemName, String customerAddress, int customerAge){
        this.customerID = customerID;
        this.customerName = custemName;
        this.customerAddress = customerAddress;
        this.customerAge = customerAge;
    }
    void changeCustomerAddress(String address) {
        customerAddress = address;
    }
    void displayCustomerInformation(){
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
    public static void main(String[] args) {
        // Creates an object of the class
        Ss63 objCustomer = new Ss63( 5, "hiii", "so 6 ton that thuyet", 4);

        // Initialize the object
        objCustomer.customerID = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.customerAge = 30;
        objCustomer.displayCustomerInformation();
        objCustomer.changeCustomerAddress("123 Fort, Main Street");
        System.out.println("-----------------------------------");
        objCustomer.displayCustomerInformation();
        
     
    }    
}

   
    
