/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ContactList {
    ArrayList<Contact> people = new ArrayList<>();
    public void addcontact(Contact contact){
        people.add(contact);
    }
    public void displaycontact(){
        System.out.println("thông tin :");
        people.forEach(people->{
            System.out.println("Name :"+people.getName()+"\nNumber: "+people.getNumber() );
        });
    }
    public void updatecontact(int index,Contact contact){
          people.set(index, contact);
          System.out.println("Update : " + "\nName :"+ contact.getName()+"\nNumber :"+contact.getNumber());

    }
    public void removecontact(int index){
        Contact contact = people.get(index);
        people.remove(index);
        System.out.println("Removed :"+ index);
    }
//    public Contact findcontact(int search){
//        int position =search;
//        if(position >= 0){
//            return people.get(position);
//        }
//        return null;
//    }
    public Contact search(String search){
        int position = people.indexOf(search);
        
        if(position >0){
            return people.get(position);
        }
        return null;
    }
    public int findContact(String contactName){
        for (int i = 0; i < this.people.size(); i++) {
            Contact contact = this.people.get(i);
            if(contact.getName().equals(contactName)){
                return i+1;
            }
        }
        return -1;
    }
    
}
