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
public class AutoUnbox {
    public static void main(String args[]) {
        Character chBox = 'A'; // Autoboxing a character
        char chUnbox = chBox; // Unboxing a character

        // Print the values
        System.out.println("Character after autoboxing is:"+ chBox) ;
        System.out.println("Character after unboxing is:" + chUnbox);
    }
}
