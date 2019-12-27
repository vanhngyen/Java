/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacvidu;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 *
 * @author asus
 */
public class Person {
    
    //cac thuoc tinh cua person
        private int personId;
        private String personName;
        private int personAge;
      
    //construcor - khoi tao doi tuong
         public Person(){
             personId = 0;
             personName = "vanh";
             personAge = 12;
            
         }
         public  Person( int id, String name, int age){
             personId = id;
             personName = name;
             personAge = age;
         }
         public int getPersonId(){
             return personId;
            }
         public void setpersonId(int id){
             personId = id;
         }
         public String getPersonName(){
             return personName;
            }
         public  void setpersonName(String name){
             personName = name;
         }
         public int getPersonAge(){
             return personAge;
            }
         public void setpersonAge(int Age){
             personAge = Age;
         }
         
         public static void main(String[] args) {
             //khai bao bien
              Person person;
             //khoi tao doi tuong
             person  = new Person();
             person.setpersonId(10);
             
             System.out.println("person id" + person.getPersonId());
             System.out.println("person name" + person.getPersonName());
             System.out.println("person Age" + person.getPersonAge());
        
             //nhap thong tin cho user ==> in ra thong tin da nhap 
             
             Person a = new Person(2,"hehe",34);
             System.out.println("Person info id:"+ a.getPersonId() + "\nFull name:" + a.getPersonName() + "\nAge:" + a.getPersonAge());
        }
}
        
    
