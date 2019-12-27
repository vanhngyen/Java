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
public class StringBuilders {
    // Instantiate a StringBuilder object
    StringBuilder str = new StringBuilder("JAVA");
    /**
    * Displays strings using various StringBuilder methods
    *
    * @return void
    */
    public void displayStrings(){

    // Use the various methods of the StringBuilder class
    System.out.println("Appended String is "+ str.append("7"));
    System.out.println("Inserted String is "+ str.insert(5, "SE "));
    System.out.println("Deleted String is "+ str.delete(4,7));
    System.out.println("Reverse String is "+ str.reverse());
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    //Instantiate the StringBuilders class
    StringBuilders objStrBuild = new StringBuilders(); // line 1

    //Invoke the displayStrings() method
    objStrBuild.displayStrings();
    }
}
