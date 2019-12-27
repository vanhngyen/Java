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
public class Circle7 {
    // Variable to store radius of a circle
    private float rad; // line 1
    private float PI; // Variable to store value of PI
    /**
    * no-argument constructor
    *
    */
    public Circle7(){
    PI = 3.14f;
    }
    /**
    * overloaded constructor
    *
    * @param rad a float variable to store the value of radius
    */
    public Circle7(float rad) { // line2
    this();
    this.rad = rad; // line3
    }
    public static void main(String[] args) {
        
    }
}
