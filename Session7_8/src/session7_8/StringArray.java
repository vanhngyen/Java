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
public class StringArray {
    // Instantiate a String array
    String[] empID = new String[5];
    /**
    * Creates a String array
    * @return void
    */
    public void createArray() {
    System.out.println("Creating Array. Please wait...");

    // Use a for loop to initialize the array
        for(int count = 1; count < empID.length; count++){
        empID[count]= "E00"+count; // storing values in the array
        }
    }
    /**
    * Displays the elements of a String array
    * @return void
    */
    public void printArray() {
    System.out.println("The Array is:");
    // Use a for loop to print the array
        for(int count = 1; count < empID.length; count++){
        System.out.println("Employee ID is: "+ empID[count]);
        }
    }
    public static void main(String[] args) {
    //Instantiate class Strings
    StringArray objStrArray = new StringArray(); // line 1
    //Invoke createArray() method
    objStrArray.createArray();

    //Invoke printArray() method
    objStrArray.printArray();
    }
}
