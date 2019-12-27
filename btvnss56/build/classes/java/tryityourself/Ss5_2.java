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

public class Ss5_2 {
    public static void main(String[] args) {
        out:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.println("nhap vao mot so: ");
            int a=input.nextInt();
            System.out.printf("so ban vua nhap la: %d\n",a);
            System.out.println("do you want to input more ? yes or no");
            Scanner input1=new Scanner(System.in);
            String st=input1.nextLine();
            if(st.equals("yes")){
                continue out;
            }else{
                break;
            }
        }
    }
}
