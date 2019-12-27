/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvntryityourself;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ss5_1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap:");
             int aNumber = sc.nextInt();
        if (aNumber >= 0){
            if (aNumber == 0){
            System.out.println("first string");
            }else{
            System.out.println("second string");
            }
        }else{    
        System.out.println("third string");
        }
    }
}
