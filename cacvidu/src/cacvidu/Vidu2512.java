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
public class Vidu2512 {
    public static void main(String[] args) {
    int [] Ar = new int [10];
        //
        for(int i = 0 ;i < Ar.length ;i++){
            Ar[i] = i;
        }
        for(int i : Ar){
            System.out.println(i);
        }
        //tim max
        int max = Ar[0];
        for(int i= 1;i<Ar.length; i++){
            if(max<Ar[i]){
              max = Ar[i];
            }
        }
        System.out.println("so lơn nhat la:"+max);
        //tim min
        int min = Ar[0];
        for(int i=1; i>Ar.length;i++){
            if(min<Ar[i]){
                min = Ar[i];            
            }
        }
        System.out.println("so nho nhat la:"+min);
        
        //tim sum
        int sum = 0;
        for(int i=0;i<Ar.length;i++){
            sum+=Ar[i];
        }
        System.out.println("sum la:"+sum);
        System.out.println("trung binh :"+ (sum/Ar.length));
        //
        char data[]={'a','b','c'};
        String str =new String(data);
        System.out.println("chuoi la:"+str);
        
       //
        String empName;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Employee name:");
        empName = a.nextLine();
        System.out.println("Employee name :"+ empName);
        
    }
}
