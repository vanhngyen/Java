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
public class TwoDimension3 {
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
      public void displayMarks(){
        System.out.println("Marks are:");

        // Display the marks using nested for loop

        // outer loop
        for (int row = 0; row < marks.length; row++) {
        System.out.println("Roll no." + (row+1));
        // inner loop
            for (int col = 0; col < marks[row].length; col++) {
            System.out.println(marks[row][col]);
            }
        }
      }
    public void totalMarks() {
        System.out.println("Total Marks are:");

        // Display the marks using for loop and enhanced for loop
        for (int row = 0; row < marks.length; row++) {
        System.out.println("Roll no." + (row+1));
        int sum = 0;

        // enhanced for loop

        for(int value:marks[row]) {
        sum = sum + value;
        }
        System.out.println(sum);
        }
        }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    //Instantiate class TwoDimension
    TwoDimension3 twoDimenObj = new TwoDimension3(); // line 4
    //Invoke the storeMarks() method
    twoDimenObj.storeMarks();
    //Invoke the displayMarks() method
    twoDimenObj.displayMarks();
    twoDimenObj.totalMarks();
    }
}
