/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnne;


import java.util.Scanner;

/**
 *
 * @author asus
 */
public class monanmain {
    
    public static void main(String[] args) {
        monanList a = new monanList();
        int food;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------------------------------------");
            System.out.println("Chào mừng bạn đến nhà hàng chúng tôi !!");
            System.out.println("1 . Nhà hàng thêm món vào menu . ");
            System.out.println("2 . Hiển thị menu của nhà hàng . ");
            System.out.println("3 . Thêm tên món , số lượng và tổng tiền của khách hàng . ");
            System.out.println("4 . Xóa món ăn đã đặt ");
            System.out.println("5 . Thay đổi số lượng món ăn");
            System.out.println("-------------------");
            System.out.println("Chọn 1 số để nhà hàng phục vụ :");
            food = sc.nextInt();
            switch(food){
                case 1:
                    System.out.println("Thêm món ăn vào menu");
                    a.themmonanvaomenu();
                    break;
                case 2:
                    System.out.println("hiển thị menu :");
                    a.hienthimonantrongmenu();
                    break;
                case 3:
                    System.out.println("Danh sách món và tổng tiền của khách hàng :");
                    a.themmonan();
                    a.danhsachmonan();
                    break;
                case 4:
                    System.out.println("Xóa món ăn đã chọn :");
                    a.xoamonan();
                    a.danhsachmonan();
                    break;
                case 5:
                    System.out.println("Thay đổi số lượng món ăn đã đặt :"); 
                    a.updatemonan();
                    a.danhsachmonan();
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
