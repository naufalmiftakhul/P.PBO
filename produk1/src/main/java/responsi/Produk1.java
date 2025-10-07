 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsi;

/**
 *
 * @author axioo
 */
public class Produk1 {

    private String Nama;
    private double Harga;
    
    public Produk1(String Nama, double Harga){
        this.Nama = Nama;
        this.Harga = Harga;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public double getHarga() {
        return Harga;
    }
    
    public void getHarga(double Harga) {
        this.Harga = Harga;
    }
    
    public void infoinfo() {
        System.out.println("Nama Produk: " + Nama);
        System.out.println("Harga: Rp." + Harga);
    }
}
