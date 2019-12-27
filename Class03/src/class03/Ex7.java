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
public class Ex7 {
    int hour;
    int minute;
    int second;
    public Ex7(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public int getSecond(){
        return second ;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public String toString(){
        return "day la class time";
    }
    public Ex7 nextSecond(){
        return new Ex7(hour , minute , second+1);
     
    }
    public Ex7 previousSecond(){
       return new Ex7(hour , minute , second-1);
    }
    //integer la object
    public static void main(String[] args) {
        Ex7 a = new Ex7(1,20,4);
        System.out.println(a.getSecond());
        Ex7 b = a.nextSecond();
        Ex7 c = a.previousSecond();
        System.out.println(b.getSecond());
        System.out.println(c.getSecond());
    }
}
