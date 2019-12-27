/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ATM {
    int account;
    String password;
    double amount;
    String customerName;

    public ATM(int account, String password, double amount, String customerName) {
        this.account = account;
        this.password = password;
        this.amount = amount;
        this.customerName = customerName;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
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
    //hàm xử lí login
    public static boolean login(ATM acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number:");
        int accNo = sc.nextInt();
        System.out.println("Enter your password:");
        String pass = sc.next();
        return acc.getAccount()==accNo &&acc.getPassword().equals(pass);
    }
    //hàm xem số dư
    public static void viewAccount(ATM acc) {
        System.out.println("Account number:" + acc.getAccount());
        System.out.println("Account name:" + acc.getCustomerName());
        System.out.println("Amount:" +acc.getaMount());
    }
    //hàm rút tiền
    public static boolean withdraw(ATM acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your amount withdraw:");
        //đọc kiểu double
        double amount = sc.nextDouble();
        if(amount <= acc.getaMount()){
            acc.setaMount(acc.getaMount()- amount);
            return true;
        }else{
            return false;
        }
    }
    //hàm chuyển tiền
    public static boolean transfer(ATM acc1,ATM acc2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your amount to transfer");
        //đọc biến kiểu double
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
        ATM acc1 = new ATM(12345,"12hi",234,"hehehe");
        //login
        if(login(acc1)){
            System.out.println("Login success !");
        }else{
            System.out.println("Login fail !");
        }
        //gọi hàm rút tiền
        if(withdraw(acc1)){
            System.out.println("Withdraw success !");
        }else{
            System.out.println("Login fail");
        }
        //gọi hàm xem số dư
        viewAccount(acc1);
        //them hàm 2 để chuyển tiền
        ATM acc2 = new ATM(5421,"he12",1233,"abc");
        //thủ tục nhận tiền
        if(transfer(acc1, acc2)){
            System.out.println("Transfer success !");
        }else{
            System.out.println("Transfer fail");
        }
    }
}