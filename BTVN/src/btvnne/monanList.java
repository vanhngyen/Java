/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnne;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class monanList {
    ArrayList<Monan> menu = new ArrayList<>();
    Monan a = new Monan();
    
    public void hienthimonantrongmenu(){
        for (int i = 0; i < menu.size(); i++) {
            a = menu.get(i);
            a.displaymonan();
        }
    }
    public void themmonanvaomenu(){
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên món ăn :");
        String ten_monan = sc.nextLine();
        System.out.println("Tên món ăn :"+ten_monan);
        
        for (int i = 0; i < menu.size(); i++) {
           a = menu.get(i);
           if(a.getTenmonan().equals(ten_monan)){
                count++;
            }
        }
        if(count == 0){
            this.themmonmenu(ten_monan);
        }
    }    
    public void themmonmenu(String ten_monan){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá tiền :");
        int giatien = sc.nextInt();
        System.out.println("Giá tiền :"+giatien);
        a = new Monan(ten_monan, giatien);
        menu.add(a);
    }
    
    /////////////////////////////////
    public void danhsachmonan(){
        for (int i = 0; i < menu.size(); i++) {
            a = menu.get(i);
            a.thongtinmon();
        }
    }
    
    public void themmonan(){
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn đặt món :");
        String ten_monan = sc.nextLine();
        for (int i = 0; i < menu.size(); i++) {
            a = menu.get(i);
            if(a.getTenmonan().equals(ten_monan)){
                this.them_soluong(ten_monan);
                count++;
            }
        }
        if(count == 0){
            this.themmon(ten_monan);
            System.out.println("bạn thêm thành công!");
        }
    }
    public void themmon(String ten_monan){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn thêm bao nhiêu xuât nữa nhỉ ?");
        int soluong = sc.nextInt();
        System.out.println("Giá tiền :");
        int giatien = sc.nextInt();
        a = new Monan(ten_monan,soluong,giatien);
        menu.add(a);
    }
    
    public void them_soluong(String ten_monan){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.size(); i++) {
            a = menu.get(i);
            if(a.getTenmonan().equals(ten_monan)){
                System.out.println("Số lượng bạn muốn đặt là ?");
                int soluongnew = sc.nextInt();
                a.setSoluong(a.getSoluong()+soluongnew);
                menu.set(i, a);
            }
        }
    }
    ///////////////////////////////////////
    public void xoamonan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Nhap ten mon an: ");
        String ten_monan = scanner.nextLine();
        for (int i = 0; i < menu.size(); i++) {
            a = menu.get(i);
            if (a.getTenmonan().equals(ten_monan)) {
                menu.remove(i);
                System.out.println("Da xoa " + ten_monan + " trong menu.");
            } else {
                System.out.println("Khong tim thay mon " + ten_monan + " trong thuc don.");
            }
        }
    }
    ////////////////////////////////////
    public void updatemonan(){
        for (int i = 0; i < menu.size(); i++) {
            Scanner sc = new Scanner(System.in);
            a = menu.get(i);
            System.out.println("Món ăn đã đặt :");
            String ten_monan = sc.nextLine();
            if(a.getTenmonan().equals(ten_monan)){
                System.out.println("Số lượng bạn muốn thay đổi là :");
                int soluongnew = sc.nextInt();
                a.setSoluong(soluongnew);
                menu.set(i, a);
            }
        }
    }
}
