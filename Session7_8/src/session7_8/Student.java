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
public class Student {
    int rollNo; // Variable to store roll number
    String name; // Variable to store student name
    String address; // Variable to store address
    float marks; // Variable to store marks
    /**
    * No-argument constructor
    *
    */
    public Student(){
    rollNo = 0;
    name = "";
    address = "";
    marks = 0;
    }
    /**
    * Overloaded constructor
    *
    * @param rNo an integer variable storing the roll number
    * @param name a String variable storing student name
    */
    public Student(int rNo, String sname) {
    rollNo = rNo;
    name = sname;
    }
    /**
    * Overloaded constructor
    *
    * @param rNo an integer variable storing the roll number
    * @param score a float variable storing the score
    */
    public Student(int rNo, float score) {
    rollNo = rNo;
    marks = score;
    }
    /**
    * Overloaded constructor
    *
    * @param sName a String variable storing student name
    * @param addr a String variable storing the address
    */
    public Student(String sName, String addr) {
    name = sName;
    address = addr;
    }
    /**
    * Overloaded constructor
    *
    * @param rNo an integer variable storing the roll number
    * @param sName a String variable storing student name
    * @param score a float variable storing the score
    */
    public Student(int rNo, String sname, float score) {
    rollNo = rNo;
    name = sname;
    marks = score;
    }
        /**
    * Displays student details
    *
    * @return void
    */
    public void displayDetails(){
    System.out.println("Rollno :"+ rollNo);
    System.out.println("Student name:"+ name);
    System.out.println("Address "+ address);
    System.out.println("Score "+ marks);
    System.out.println("------------------------");
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    // Instantiate the Student class with two string arguments
    Student objStud1 = new Student("David","302, Washington Street");
    // Invoke the displayDetails() method
    objStud1.displayDetails();
    // Create other Student class objects and pass different
    // parameters to the constructor
    Student objStud2 = new Student(103, 46);
    objStud2.displayDetails();
    Student objStud3 = new Student(104, "Roger", 50);
    objStud3.displayDetails();
    }
}
