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
public class Varargs {
    public void addNumber(int...num) {
        int sum=0;
        // Sử dụng vòng lặp để lặp qua num
        for(int i:num) {
        // Thêm các giá trị
        sum = sum + i;
        }
        // In tổng
        System.out.println("Sum of numbers is "+ sum);
        }
        public static void main(String[] args) {
        // Khởi tạo lớp Varargs
        Varargs obj = new Varargs();
        // Gọi phương thức addNumber () với nhiều đối số
        obj.addNumber(10,30,20,40);
        }
}
