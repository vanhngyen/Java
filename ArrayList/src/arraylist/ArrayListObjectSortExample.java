/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author asus
 */
class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
}

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin",47));
        people.add(new Person("Chris",34));
        people.add(new Person("Rajeev", 25));
        people.add(new Person("David", 31));
        
        System.out.println("Person List:" + people);
        
        // Sắp xếp mọi người theo tuổi của họ
        people.sort((person1,person2)->{
            return person1.getAge()-person2.getAge();
        });
        
        // một cách ngắn gọn hơn để viết hàm sắp xếp ở trên
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted Person List by Age:"+ people);
        
        // Bạn cũng có thể sắp xếp bằng cách sử dụng phương thức Collections.sort () bằng cách chuyển Trình so sánh tùy chỉnh
        Collections.sort(people, Comparator.comparing(Person::getAge));
        System.out.println("Sorted Person List By Name:" + people);
        
    }
}
