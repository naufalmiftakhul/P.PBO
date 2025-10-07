/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

/**
 *
 * @author axioo
 */
public class pegawaikontrak extends pegawai {
    private int kontrak;
    
    public pegawaikontrak(String Namapegawai, double gaji, int kontrak){
       super(Namapegawai, gaji);
       this.kontrak = kontrak;
    }
    
    public int getkontrak(){
       return kontrak;
    }
    
    public void setkontrak(int kontrak){
       this.kontrak = kontrak;
    }
    
    @Override
    public void infoinfo(){
       super.infoinfo();
       System.out.println("Lama Kontrak: "+ kontrak + " bulan");
    }
}
