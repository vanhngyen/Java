/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author asus
 */
public class ArrayListSortExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Name :" + names);
        /**
         * Sắp xếp một ArrayList bằng phương thức sort () của nó. bạn phải
         * truyền một Trình so sánh cho phương thức ArrayList.sort ().
         */
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
         // lệnh gọi phương thức 'sort ()' ở trên cũng có thể được viết đơn giản bằng cách sử dụng biểu thức lambda
         names.sort((name1,name2)->name1.compareTo(name2));
         // Sau đây là một giải pháp ngắn gọn hơn
         names.sort(Comparator.naturalOrder());
         
         System.out.println("Sorted Names :"+names);
    }
}
