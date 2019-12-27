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
public class Ss64 {
    int width;
    int height;
    Ss64(){
    width = 10;
    height = 10;
    }
    void display() {
        System.out.println(width +" "+ height);
    } 
    public static void main(String[] args) {
        Ss64 s = new Ss64();
        s.display();
        System.out.println("Width: " + s.width);
        System.out.println("Height:" + s.height);
    }
}
