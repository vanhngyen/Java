/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1812;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class bt1812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập số thứ nhất :");
        int so1 = sc.nextInt();
        
        
        System.out.println("Nhập số thứ 2");
        int so2 = sc.nextInt();
        
        System.out.println("Tổng là :" + (so1+so2));
        System.out.println("Hiệu là :" + (so1-so2));
        System.out.println("Tích là :" + (so1*so2));
        System.out.println("Thương là :" + (so1/so2));
        
       
    }
}
