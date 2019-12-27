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
public class Circle4 {
    float area; // variable to store area of a circle
    /**
    * Returns the value of PI
    *
    * @return float
    */
    public float getPI(){
        return 3.14f;
    }
    /**
    * Calculates area of a circle
    * @param rad an integer to store the radius
    * @return void
    */
    public void calcArea(int rad) {
    this.area = getPI() * rad * rad;
    }
    public static void main(String[] args) {
        
    }
}
