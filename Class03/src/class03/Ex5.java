/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class03;

/**
 *
 * @author asus
 */
//Account
public class Ex5 {
    String id;
    String Name;
    int balence = 0;
    public Ex5(String id,String Name){
        this.id = id;
        this.Name = Name;
    }
    public Ex5(String id, String Name , int balence){
        this.id = id;
        this.Name = Name;
        this.balence = balence;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public int getBalence(){
        return balence;
    }
    public int credit(int amount){
        return balence;
    }
    public int debit(int amount){
        if(amount<= balence){
            System.out.println("subtract amount from balance");
        }else{
            System.out.print("amount exceeded balence");
        }
        return balence;
    }
    public int transferTo( Ex5 another,int amount ){
        if(amount<= balence){
            System.out.println("transfer amount to the given Account");
        }else{
            System.out.print("amount exceeded balence");
        }
        return balence;
    }
    public String toString(){
        return "Account[\nid :"+ id +"\nName :"+ Name+"\nBalence :"+ balence +"]";
    }
    public static void main(String[] args) {
        Ex5 a = new Ex5("1","hhhi",1);
        System.out.println(a.toString());
        System.out.println(a.credit(1));
        System.out.println(a.debit(1));
        System.out.println(a.transferTo(a,0));
    }
}
