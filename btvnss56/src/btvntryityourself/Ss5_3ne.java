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
public class Ss5_3ne {
    public static void main(String args[]){
        int a ,b;
         Scanner input = new Scanner(System.in);
            System.out.println("nhap vao so a: ");
            a=input.nextInt();
            System.out.println("nhap vao so b: ");
            b=input.nextInt();
            System.out.println("so nguyen to giua hai so la:");
            out:
                for(int i=a;i<=b;i++){
                    int count=0;
                    for(int j=1;j<i;j++){
                        if(i%j==0){
                            count++;
                        }
                    }
                    if(count==1){
                        System.out.println(i);
                    }
                }
    }              
}



