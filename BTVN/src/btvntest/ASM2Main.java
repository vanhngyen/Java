/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvntest;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ASM2Main {

    private static ASM2 food;
    public static void main(String[] args) {
        ASM2List a = new ASM2List();
        int food;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Chào mừng bạn đến nhà hàng chúng tôi !!");
            System.out.println("1 . Thực đơn bao gồm ");
            System.out.println("2 . Thêm món mới vào thực đơn  ");
            System.out.println("3 . Hóa đơn thanh toán của khách");
            System.out.println("4 . Xóa món ăn đã đặt ");
            System.out.println("5 . Thay đổi số lượng món ăn");
            System.out.println("------------------------------------------");
            System.out.println("Chọn 1 số để nhà hàng phục vụ :");
            food = sc.nextInt();
            switch(food){
                case 1:
                    System.out.println("Thực đơn bao gồm :");
                    a.addfood(new ASM2("toboki",2,12000));
                    a.addfood(new ASM2("banh mi",3,12340));
                    a.addfood(new ASM2("cơm rang",1,30000));
                    a.addfood(new ASM2("banh mi que",5,12000));
                    a.DisplayFood();
                    break;
                case 2:
                    System.out.println("Thêm tên móm và số lượng vào danh sách :");
                    a.addfood(new ASM2("mì sào",3,20000));
                    a.DisplayFood();
                    break;
                case 3:
                    System.out.println("Danh sách món và tổng tiền của khách hàng :");
                    
                    break;
                case 4:
                    System.out.println("Xóa món ăn đã chọn :");
                    a.removefood(0);
                    a.DisplayFood();
                    break;
                case 5:
                    System.out.println("Thay đổi số lượng món ăn đã đặt :"); 
                    a.updatefood(3,new ASM2("cơm rang",3,30000));
                    a.DisplayFood();
                    break;
                case 6 :
                    System.out.println("the end !");
                    break;
                default:
                    System.out.println("không có phục vụ này vui lòng chọn lại!");
                    System.out.println("---------------------------------------");
            }
        }while(food!=0);
        
    }
}
