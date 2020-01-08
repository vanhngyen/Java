/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithijava;

/**
 *
 * @author asus
 */
public class Flight {
    int number;
    String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    
    public void display(){
        System.out.println("Destintion :" + destination + " | Number :" + number);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }
    
    public static void main(String[] args) {
        Flight g1 = new Flight(857, "Toronto");
        g1.display();
        System.out.println("-----------------------");
        System.out.println("Destination :"+g1.getDestination());
        System.out.println("Number :"+ g1.getNumber());
    }
}
