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
public class ADF1 {
    public static void main(String[] args) {
        System.out.println("Số Điểm Mốc : 100Đ");
        System.out.println("nhap diem:");
        int[] diem;
        diem = new int[1];
        for (int i = 0; i <diem.length ; i++) {
            Scanner student = new Scanner(System.in);
               diem[i] = student.nextInt();
        }
     
        int truot = 0;
        int trungbinh = 0;
        int gioi= 0;
        for (int i = 0; i < diem.length; i++) {
          
           if(diem[i]<=40){
               truot++;
               System.out.println("Điểm thấp trượt rùi!!");
           } else if(diem[i]>=40 && diem[i]<=65){
               trungbinh++;
               System.out.println("Điểm này tầm trung bình khá nha^^");
           }else if(diem[i]>65){
               gioi++;
               System.out.println("Điểm giỏi rồi này <3");
           }
        }
    }
}
