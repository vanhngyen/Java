/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvntest;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ASM2List {

    
    ArrayList<ASM2> restaurant = new ArrayList<>();
    
    public void addfood(ASM2 food){
        restaurant.add(food);
    }
    
    public void DisplayFood(){
        System.out.println("Có tất cả  "+ restaurant.size()+" món ăn cho bạn lưa chọn :");
        restaurant.forEach(restaurant ->{
            System.out.println("-----------------");
            System.out.println("Food :"+restaurant.food +"\nAmount:"+restaurant.amount +"\nMoney:"+restaurant.money);
            
        });
    }
    public void updatefood(int index , ASM2 food){
        restaurant.set(index, food);
        System.out.println("thêm món ăn vào danh sách :" );
        System.out.println("món ăn "+ (index + 1)+""+ food.getFood());
    }
    public void removefood(int index){
        ASM2 food = restaurant.get(index);
        restaurant.remove(index);
        System.out.println("Removed :"+index);
    }
    
}
