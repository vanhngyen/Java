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
public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntergers = initArray(5);
        //in ra cac gia tri trong myIntergers
        for (int i = 0; i < myIntergers.length; i++) {
            System.out.println("Element" + i + ",type value was" + myIntergers[i]);
        }
        //gọi hàm tính giá trị trung bình
        System.out.println("Average is" + getAverage(myIntergers));
    }

    /**
     * khoi tao mang
     *
     * @param size kich co cua mang
     * @return mang gia tri
     */
    public static int[] initArray(int size) {
        int[] values = new int[size];
        System.out.println("Enter" + size + "integer values.");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    /**
     * tinh gia tri trung binh
     *
     * @param array mang can tinh gia tri
     * @return gia tri trung binh
     */
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}
