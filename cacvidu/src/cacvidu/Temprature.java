/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacvidu;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Temprature {
    public static void main(String[] args) {
        //init object
        Scanner console = new Scanner(System.in);
        System.out.println("How many day tempratures?");
        int numDays = console.nextInt();
        int [] temps = new int[numDays];
        //nhap gia tri vao và tìm giá trị trung binh
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day"+(i+1) + "'high temp:");
            temps[i] = console.nextInt();
            sum +=temps[i];        
        }
        double average = (double)sum/numDays;
        //
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            int temp = temps[i];
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println("");
        System.out.println("Average =" + average);
        System.out.println(above +" day above average");
    }
}
