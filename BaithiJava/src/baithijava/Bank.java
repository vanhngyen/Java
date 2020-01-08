/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithijava;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Bank {
    double balance;
    double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
     public double calculateinterest(){
        double interest;
        return interest = balance *(rate /1200);
     }
     public static void main(String[] args) {
        double balance, rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance:");
        balance = sc.nextDouble();
        System.out.println("Enter rate:");
        rate = sc.nextDouble();
        Bank obj = new Bank(balance, rate);
        obj.calculateinterest();
        System.out.println("Interest is: "+obj.calculateinterest());
    }
            
}
