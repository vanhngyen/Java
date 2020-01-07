/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnne;

/**
 *
 * @author asus
 */
public class Monan {

    String tenmonan;
    int soluong;
    int giatien;
    int tongtien;

    public Monan() {

    }

    public Monan(String tenmonan, int giatien) {
        this.tenmonan = tenmonan;
        this.giatien = giatien;
    }

    public Monan(String tenmonan, int soluong, int giatien) {
        this.tenmonan = tenmonan;
        this.soluong = soluong;
        this.giatien = giatien;
    }

    public Monan(String tenmonan, int soluong, int giatien, int tongtien) {
        this.tenmonan = tenmonan;
        this.soluong = soluong;
        this.giatien = giatien;
        this.tongtien = tongtien;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public void thongtinmon() {
        this.tongtien = this.soluong * this.giatien;
        String info = "Tên món ăn :" + this.tenmonan + "\nSố lượng :" + this.soluong + "\nGía Tiền :" + this.giatien + "\nTổng tiền :" + this.tongtien;
        System.out.println(info);
    }

    public void displaymonan() {
        String thucdon = "Tên món ăn :" + this.tenmonan + " | Giá tiền :" + this.giatien;
        System.out.println(thucdon);
    }
}
