/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class03;

/**
 *
 * @author asus
 */
//date
public class Ex6 {
    int day;
    int month;
    int year;
    public Ex6(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setEx6(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }
    public static void main(String[] args) {
        Ex6 a = new Ex6(2,2,2001);
        System.out.println(a.toString());
    }
}
