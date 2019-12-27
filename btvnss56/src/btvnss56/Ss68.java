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
public class Ss68 {
    private int width;
    private int height;
        public Ss68() {
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
        }
        public Ss68 (int wid, int heig) {
        System.out.println("Parameterized Constructor Invoked...");
        width = wid;
        height = heig;
        }
        public void displayDimensions(){
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
        }
        public static void main(String[] args) {
        Ss68 a = new Ss68();
        a.displayDimensions();
    }
}
