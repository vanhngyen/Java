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
public class Ex2 {
    float length = 0.1f;
    float width = 0.1f;

 
    public float getLenght(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public void setLenght(float le){
        length = le;
    }
    public void setWidth(float wi){
        width = wi;
    }
    public float getArea(){
        return length * width;
    }
    public float getPerimeter(){
        return (length+width)*2;
    }
    public String toString(){
        return "Rectangle: width "+width+"\nlength"+length+"\nArea"+getArea()+"\nPerimeter"+getPerimeter();
    }
    public static void main(String[] args) {
        Ex2 a = new Ex2();
        a.setLenght(0.5f);
        a.setWidth(0.7f);
        System.out.println("Width "+a.getWidth()+"\nLength"+a.getLenght()+"\nPerimeter"+a.getPerimeter());
        System.out.println("====================");
        System.out.println(a.toString());
    }
}
