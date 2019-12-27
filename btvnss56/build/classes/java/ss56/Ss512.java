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
public class Ss512 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 5; i++) {
        for (int j = 1; j < 5; j++) {
        if (j > i) {
        System.out.println();
        continue outer;
        } // End of if statement
        System.out.print(j);
        } // End of inner for loop
        System.out.println("\nThis is the outer loop.");
        } //End of outer for loop
        System.out.println("Good-Bye");
    }    
}
