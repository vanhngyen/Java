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
public class Ss67 {
    int width;
    int height;
    Ss67(){
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }
    Ss67(int wid,int heig){
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimensions(){
    System.out.println("Width: " + width);
    System.out.println("Width: " + height);
    }
    
    public static void main(String[] args) {
        Ss67 a = new Ss67(10, 20);
        Ss67 b;
        b = a;
        System.out.println("\nRectangle1 Details");
        System.out.println("===================");
        a.displayDimensions();
        System.out.println("\nRectangle2 Details");
        System.out.println("===================");
        b.displayDimensions();
    }
}
