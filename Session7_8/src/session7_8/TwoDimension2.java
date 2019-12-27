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
public class TwoDimension2 {
    // Khai báo một mảng hai chiều có tên là mark
    int marks[][]; //line 1
   /**
     * Lưu trữ các dấu trong một mảng hai chiều
     *
     * @return khoảng trống
     */
    public void storeMarks() {
    // Khởi tạo mảng
    marks = new int[4][2]; // line 2
    System.out.println("Storing Marks. Please wait...");

    // Khởi tạo các phần tử mảng
    marks[0][0] = 23; // line 3
    marks[0][1] = 65;
    marks[1][0] = 42;
    marks[1][1] = 47;
    marks[2][0] = 60;
    marks[2][1] = 75;
    marks[3][0] = 75;
    marks[3][1] = 50;
    }
    /**
    * Displays marks from a two-dimensional array
    *
    * @return void
    */
   public void displayMarks() {
    System.out.println("Marks are:");
    // Display the marks using for loop
        for(int count = 0; count < marks.length; count++) {
        System.out.println(marks[count]);
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    //Instantiate class TwoDimension
    TwoDimension twoDimenObj = new TwoDimension(); // line 4
    //Invoke the storeMarks() method
    twoDimenObj.storeMarks();
    //Invoke the displayMarks() method
    twoDimenObj.displayMarks();
    }
}
