/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2712;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Student {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] diem = initArray(6);
        for (int i = 0; i <diem.length ; i++) {
            System.out.println("Học Sinh " + i + " được " + diem[i]+" điểm. ");
        }
        getAverage(diem);
    }
    public static int[] initArray(int size) {
        int[] values = new int[size];
        System.out.println("điền " + size + " điểm của học sinh vào đi nè");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void getAverage(int[] array) {
        int truot = 0;
        int trungbinh = 0;
        int gioi= 0;
        for (int i = 0; i <array.length; i++) {
           if(array[i]<=40){
               truot++;
               System.out.println("Điểm thấp trượt rùi!!");
           } else if(array[i]>=40 && array[i]<=65){
               trungbinh++;
               System.out.println("Điểm này tầm trung bình khá nha^^");
           }else if(array[i]>65){
               gioi++;
               System.out.println("Điểm giỏi rồi này <3");
           }
        }
    }    
}
