 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author axioo
 */
public class pegawai {
   private String Namapegawai;
   private double gaji;
   
   public pegawai(String Namapegawai, double gaji) {
      this.Namapegawai = Namapegawai;
      this.gaji = gaji;
   }
   
   public String getNamapegawai(){
      return Namapegawai;
   }
   
   public void setNamapegawai(String Namapegawai){
      this.Namapegawai = Namapegawai;
   }
   
   public double getgaji(){
      return gaji;
   }
   
   public void setgaji(double gaji){
      this.gaji = gaji;
   }
   
   public void infoinfo(){
       System.out.println("Nama Pegawai: " + Namapegawai);
       System.out.println("Gaji: Rp." + gaji);
   }
}
