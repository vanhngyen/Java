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
public class Ss66 {
    int width;
    int height;
    Ss66(){
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }
    Ss66(int wid,int heig){
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimensions(){
    System.out.println("Width: " + width);
    System.out.println("Width: " + height);
    }
    public static void main(String[] args) {
        Ss66 c = new Ss66(10, 20);
        Ss66 d = new Ss66(6, 9);
        System.out.println("\nRectangle1 Details");
        System.out.println("===================");
        c.displayDimensions();
        System.out.println("\nRectangle2 Details");
        System.out.println("===================");
        d.displayDimensions();
    
    }
}
