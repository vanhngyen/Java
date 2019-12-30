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
public class Minmax {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntergers = initArray(5);
        //in ra cac gia tri trong myIntergers
        for (int i = 0; i < myIntergers.length; i++) {
            System.out.println("Element" + i + ",type value was" + myIntergers[i]);
        }
            System.out.println("max là"+getMax(myIntergers));
            System.out.println("min la"+getMin(myIntergers));
    }
    public static int[] initArray(int size) {
        int[] values = new int[size];
        System.out.println("Enter" + size + "integer values.");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
}

