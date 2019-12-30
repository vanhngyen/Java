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
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        // Kiểm tra xem một ArrayList có trống không
        System.out.println("Is the topCompanies list empty? :"+ topCompanies.isEmpty());
        
        topCompanies.add("google");
        topCompanies.add("apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        
        // tìm kích thước của một ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world." );
        System.out.println(topCompanies);
        
        // Lấy phần tử tại một chỉ mục đã cho
        String bestcompany = topCompanies.get(0);
        String secondbestcompany = topCompanies.get(1);
        String Lastcompany = topCompanies.get(topCompanies.size()-1);
        
        
        System.out.println("Bestcompany :"+bestcompany);
        System.out.println("Secondbestcompany :" + secondbestcompany);
        System.out.println("Lastcompany :"+ Lastcompany);
        
        // sửa đổi phần tử tại một chỉ mục đã cho
        topCompanies.set(4, "walmart");
        System.out.println("Modify top companies list : "+ topCompanies);
        
    }
}
