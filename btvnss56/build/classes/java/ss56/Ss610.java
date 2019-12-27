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
public class Ss610 {
    private int accountID;
    private String holderName;
    private String accountType;
    {
        accountID = 100;
        holderName = "John Anderson";
        accountType = "Savings";
    }
        public void displayAccountDetails() {
            System.out.println("Account Details");
            System.out.println("===============");
            System.out.println("Account ID: " + accountID + "\nAccount Type: " +accountType);
        }
        public static void main(String[] args) {
        Ss610 objAccount = new Ss610();
        objAccount.displayAccountDetails();
        }
}
