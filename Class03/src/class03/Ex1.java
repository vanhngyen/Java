/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class03;

/**
 *
 * @author asus
 */
public class Ex1 {
    private double radius;
    public Ex1(){
        radius = 3.0;
    }
    public Ex1(double r){
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return radius*Math.PI;
    }
    
    @Override
    public String toString() {
         return "Ex1[radius=" + radius+ "\nArea:"+ getArea() +"\nCircumference:"+ getCircumference() + "]";
    }        
    public static void main(String[] args) {
        Ex1 c1 = new Ex1();
        c1.getArea();
        c1.getCircumference();
        System.out.println(c1.toString());
        
        
    }
}
