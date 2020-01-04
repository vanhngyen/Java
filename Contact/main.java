/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;


import java.util.Scanner;

/**
 *
 * @author asus
 */
public class main {

    public static void main(String[] args) {
        ContactList a = new ContactList();
        int pess;
        do{
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bắt Đầu Chương Trình");
        System.out.println("1. Hiển Thị Danh Bạ");
        System.out.println("2. Thêm Mới Danh Bạ");
        System.out.println("3. Thay Đổi Danh Bạ");
        System.out.println("4. Tìm Kiếm Danh Bạ");
        System.out.println("--------------------");
        System.out.println("nhập số :\n");
        System.out.println("");
        pess = sc.nextInt();
        switch (pess) {
            case 1:
                System.out.println("1. Hiển Thị Danh Bạ");
                a.addcontact(new Contact("vanh nè", 0123456));
                a.addcontact(new Contact("ly béo", 0123456));
                a.addcontact(new Contact("linh bi", 034567));
                a.addcontact(new Contact("yến đơ", 345678));
                a.displaycontact();
                System.out.println("-------------------------");
                break;
            case 2:
                System.out.println("2. Thêm Mới Danh Bạ");
                a.updatecontact(1, new Contact("uyên khỉ", 01234567));
                 System.out.println("-------------------------");
                break;
            case 3:
                 System.out.println("3. Thay Đổi Danh Bạ");
                a.removecontact(1);
                a.displaycontact();
                 System.out.println("-------------------------");
                break;
            case 4:
                System.out.println("4. Tìm Kiếm Danh Bạ");
                //System.out.println("search :" + a.findcontact(1).getName());
                System.out.println(a.findContact("vanh nè"));
                 System.out.println("-------------------------");
                break;
            case 0:
                System.out.println("Ket thuc chuong trinh.");
                break;
            default:
                System.out.println("Khong co chuc nang ban lua chon.");
                System.out.println("----- ----- ----- -----\n\n");
        }
        }while(pess!=0);
//        a.addcontact(new Contact("vanh nè", 0123456));
//        a.addcontact(new Contact("ly béo", 0123456));
//        a.addcontact(new Contact("linh bi", 034567));
//        a.addcontact(new Contact("yến đơ", 345678));
//        a.displaycontact();
//        a.updatecontact(1, new Contact("uyên khỉ", 01234567));
//        a.removecontact(1);
//        a.displaycontact();
//        //System.out.println("search :" + a.findcontact(1).getName());
//        System.out.println(a.findContact("vanh nè"));

    }
}
