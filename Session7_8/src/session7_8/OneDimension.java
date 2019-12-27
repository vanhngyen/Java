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
public class OneDimension {
        // Khai báo một mảng một chiều có tên là mark
    int marks[]; // line 1

    /**
     * Khởi tạo và khởi tạo một mảng một chiều
     *
     * @return khoảng trống
     */
    public void storeMarks() {
    // Khởi tạo mảng

    marks = new int[4]; // line 2
    System.out.println("Storing Marks. Please wait...");

    // Khởi tạo các phần tử mảng

    marks[0] = 65; // line 3
    marks[1] = 47;
    marks[2] = 75;
    marks[3] = 50;
    }
    /**
     * Hiển thị nhãn hiệu từ một mảng một chiều
     *
     * @return khoảng trống
     */
    public void displayMarks() {
    System.out.println("Marks are:");

    // Hiển thị các dấu
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    }
    /**
     * @param lập luận các đối số dòng lệnh
     */
    public static void main(String[] args) {

    // Khởi tạo lớp OneDimension

    OneDimension oneDimenObj = new OneDimension(); //line 4

    // Gọi phương thức storeMarks ()
    oneDimenObj.storeMarks(); // line 5

    //Invoke the displayMarks() method
    oneDimenObj.displayMarks(); // line 6
    }

}
