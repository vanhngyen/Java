/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_8;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Temprature {
    public static void main(String[] args) {
        int n ;
        Scanner nhap = new Scanner(System.in);
            System.out.println("Nhap so ngay: ");
            n = nhap.nextInt();
        
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            
            Scanner input = new Scanner(System.in);
            System.out.printf("Nhap nhiet do:",i);
            ar[i] = input.nextInt();
        }
        int sum =0;
        for (int i=0;i<n;i++){
        sum+= ar[i];
        
        }
        System.out.printf("Nhiet do trung binh la:%d",(sum/n));
    }
}
    