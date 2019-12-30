/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        
        //tạo một ArrayList từ bộ sưu tập khác
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        
        // thêm toàn bộ bộ sưu tập vào một ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
                
    }
}
