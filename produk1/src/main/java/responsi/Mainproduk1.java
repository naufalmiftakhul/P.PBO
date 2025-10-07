/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author axioo
 */
public class Mainproduk1 {
    
    public static void main(String[] args) {
       Produk1 p1 = new elektronik("laptop", 1000000, 2);
       Produk1 p2 = new makanan("Roti", 20000, "05-09-2006");
       
       p1.infoinfo();
       System.out.println("-------------------");
       p2.infoinfo();
    }
}
