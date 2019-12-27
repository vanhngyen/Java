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
public class Ex4 {
    String id;
    String desc;
    int qty;
    double unitPrice;
    public Ex4( String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setQty(int qt){
        this.qty = qt;
    }
    public void setUnitPrice(double unitPri){
        this.unitPrice = unitPri;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "InvoiceItem[\nid : "+ id +"\ndesc : "+ desc +"\nqty :" + qty +"\nUnitPrice : "+ unitPrice + "]";
    }
    public static void main(String[] args) {
        Ex4 a = new Ex4("1","hihi",234,3.0);
        System.out.println(a.toString());
        System.out.println(a.getTotal());
        
    }
}
