/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author asus
 */
public class RemoreElementsFromArrayListExample {

    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List :" + programmingLanguages);

        // xóa phần tử tại chỉ mục '5'
        programmingLanguages.remove(5);
        System.out.println("After remove(5):" + programmingLanguages);

        // xóa lần xuất hiện đầu tiên của phần tử đã cho khỏi ArrayList
        // (Phương thức remote () trả về false nếu phần tử không tồn tại trong ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove (\"Kotlin\"):" + programmingLanguages);

        // Xóa tất cả các thành phần tồn tại trong một bộ sưu tập nhất định
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages):" + programmingLanguages);

        // Xóa tất cả các phần tử thỏa mãn vị từ đã cho
        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");

            }
        });

        /**
         * Cuộc gọi remove If () ở trên cũng có thể được viết bằng biểu thức
         * lambda như thế này - lập trìnhLacular.remove If (s -> s.startsWith
         * ("C"))
         */
        System.out.println("After Removing all elements that start with \"C\":" + programmingLanguages);
        //// xóa tất cả các phần tử khỏi ArrayList
        programmingLanguages.clear();
        System.out.println("After clear():" + programmingLanguages);

    }
}
