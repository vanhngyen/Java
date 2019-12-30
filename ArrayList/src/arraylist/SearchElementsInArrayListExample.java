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
public class SearchElementsInArrayListExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Kiểm tra xem một ArrayList có chứa phần tử đã cho không
        System.out.println("Does names array contain \"Bob\"?:" + names.contains("Bob"));

        // tìm chỉ mục xuất hiện đầu tiên của một phần tử trong ArrayList
        System.out.println("indexOf \"Steve\":" + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\":" + names.indexOf("Mark"));

        // tìm chỉ mục xuất hiện đầu tiên của một phần tử trong ArrayList\
        System.out.println("lastIndexOf \"John\":" + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\":" + names.lastIndexOf("Bill"));
    }
}
