/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author axioo
 */
public class makanan extends Produk1 {
    private String kadaluarsa;
    
    public makanan(String Nama, double Harga, String kadaluarsa) {
        super(Nama, Harga);
        this.kadaluarsa = kadaluarsa;
    }
    
    public String getkadaluarsa(){
        return kadaluarsa;
    }
    
    public void kadaluarsa(String kadaluarsa){
       this.kadaluarsa = kadaluarsa;
    }
    
    public void infoinfo(){
        super.infoinfo();
        System.out.println("kadaluarsa : " + kadaluarsa);
    } 
}
