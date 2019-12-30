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
public class CreateArrayListExample {
    public static void main(String[] args) {
        // tạo một ArrayList của chuỗi
        List<String> animals = new ArrayList<>();
        // thêm các phần tử mới vào ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("dog");
        
        System.out.println(animals);
        // thêm các phần tử mới vào một chỉ mục cụ thể trong một ArrayList
        animals.add(4,"Elephant");
        System.out.println(animals);
    }
}
