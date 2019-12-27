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
public class Ss69 {
    private String name = "John";
    private int age = 12;
    
    void displayDetails() {
    System.out.println("Person Details");
    System.out.println("==============");
    System.out.println("Person Name: " + name);
    System.out.println("Person Age: " + age);
    }
    public static void main(String[] args) {
    Ss69 a = new Ss69();
    a.displayDetails();
}
}
