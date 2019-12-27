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
class Circle {
    public double getPI(){
        return 3.14;
    }
}    
//Xác định một lớp khác PassByRef
public class PassByRef{
    //Phương pháp tính diện tích hình tròn mà
    // lấy đối tượng của lớp Circle làm tham số
    public void calcArea(Circle objPi, double rad){
    // Sử dụng phương thức getPI () để lấy giá trị PI
    double area= objPi.getPI() * rad * rad;
    // In giá trị diện tích hình tròn
    System.out.println("Area of the circle is "+ area);
    }
    public static void main(String[] args){
    // Khởi tạo lớp PassByRef
    PassByRef p1 = new PassByRef();
    // Gọi phương thức calcArea () với đối tượng của lớp Circle là
    // một tham số
    p1.calcArea(new Circle(), 2);
    }
}
