/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Account {
    int accountNo;
    String password;
    double amount;
    String customerName;

    public Account(int accountNo, String password, double amount, String customerName) {
        this.accountNo = accountNo;
        this.password = password;
        this.amount = amount;
        this.customerName = customerName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getaMount() {
        return amount;
    }

    public void setaMount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public static boolean login(Account acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number:");
        int accNo = sc.nextInt();
        System.out.println("Enter your password:");
        String pass = sc.next();
        return acc.getAccountNo()==accNo &&acc.getPassword().equals(pass);
    }
    public static void viewAccount(Account acc) {
        System.out.println("Account number:" + acc.getAccountNo());
        System.out.println("Account name:" + acc.getCustomerName());
        System.out.println("Amount:" +acc.getaMount());
    }
    public static boolean withdraw(Account acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your amount withdraw:");
        double amount = sc.nextDouble();
        if(amount <= acc.getaMount()){
            acc.setaMount(acc.getaMount()- amount);
            return true;
        }else{
            return false;
        }
    }
    public static boolean transfer(Account acc1,Account acc2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your amount to transfer");
        double amount = sc.nextDouble();
        if(acc1.getaMount()>= amount){
            acc1.setaMount(acc1.getaMount() - amount);
            acc2.setaMount(acc2.getaMount() + amount);
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to ATM !!!");
        Account acc1 = new Account(12345,"12hi",234,"hehehe");
        if(login(acc1)){
            System.out.println("Login success !");
        }else{
            System.out.println("Login fail !");
        }
        //
        if(withdraw(acc1)){
            System.out.println("Withdraw success !");
        }else{
            System.out.println("Login fail");
        }
        viewAccount(acc1);
        //
        Account acc2 = new Account(5421,"he12",1233,"abc");
        if(transfer(acc1, acc2)){
            System.out.println("Transfer success !");
        }else{
            System.out.println("Transfer fail");
        }
    }
}
