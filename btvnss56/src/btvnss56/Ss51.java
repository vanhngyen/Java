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
public class Ss51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=1;
        int product = 0;
        while (num <= 5) {
            product = num * 10;
            System.out.printf("\n %d * 10 = %d", num, product);
            num++; // Equivalent to n = n + 1
            System.out.println("\n Outside the Loop");
        }
    }
    
}
