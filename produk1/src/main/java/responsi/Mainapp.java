/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author axioo
 */
public class Mainapp {
    public static void main(String[] args) {
        // Polimorfisme pada Produk
        Produk1 p1 = new makanan("Roti", 15000, "01-12-2025");

        // Polimorfisme pada Pegawai
        pegawai peg1 = new pegawaikontrak("Ani", 3000000, 12);

        // Tampilkan Info Produk
        System.out.println("=== Data Produk ===");
        p1.infoinfo();
        // Tampilkan Info Pegawai
        System.out.println("\n=== Data Pegawai ===");
        peg1.infoinfo();
    }
}
