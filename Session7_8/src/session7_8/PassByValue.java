/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_8;

/**
 *
 * @author asus
 */
public class PassByValue {
    public void setVal(int num1) {
        num1 = num1 + 10;
    }
        public static void main(String[] args) {
        int num1 = 10;
        PassByValue obj = new PassByValue();
        obj.setVal(num1);
        System.out.println("Value of num1 after invoking setVal is "+ num1);
    }
}
