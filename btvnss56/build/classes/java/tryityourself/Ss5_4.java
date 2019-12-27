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
public class Ss5_4 {
    static int getSum(int n){	 
        int sum = 0; 
            while (n != 0){ 
                sum = sum + n % 10; 
                n = n/10; 
            } 
	return sum; 
	}
    public static void main(String[] args){ 
        int n = 647; 
        System.out.println(getSum(n));
    } 
}