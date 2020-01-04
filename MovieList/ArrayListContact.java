/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
class contact{
    private String Name;
    private int Sdt;

    public contact(String Name, Integer Sdt) {
        this.Name = Name;
        this.Sdt = Sdt;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getSdt() {
        return Sdt;
    }

    public void setSdt(Integer Sdt) {
        this.Sdt = Sdt;
    }

    @Override
    public String toString() {
        return "contact{" + "Name=" + Name + ", Sdt=" + Sdt + '}';
    }
}
public class ArrayListContact {
    
    public static void main(String[] args) {
        List<contact> people = new ArrayList<>();
        people.add(new contact("vanh",12345678));
        people.add(new contact("chị nhân xoăn",23412345));
        people.add(new contact("linh ngáo",234567));
        System.out.println("People :"+ people);        
    }
    
}
