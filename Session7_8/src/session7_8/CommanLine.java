/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_8;

/**
 *
 * @author asus
 */
public class CommanLine {
    public static void main(String[] args) {
        if(args.length==3) {
        // Display the values of individual arguments
        System.out.println("First Name is "+args[0]);
        System.out.println("Last Name is "+args[1]);
        System.out.println("Designation is "+args[2]);
        }
        else {
        System.out.println("Specify the First Name, Last Name, and Designation");
        }
    }
}
