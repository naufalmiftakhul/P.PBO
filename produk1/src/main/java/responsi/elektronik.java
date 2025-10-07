/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author axioo
 */
public class elektronik extends Produk1 {
    private int garansi;  // dalam tahun

    public elektronik(String Nama, double Harga, int garansi) {
        super(Nama, Harga);
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public void infoinfo() {
        super.infoinfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
