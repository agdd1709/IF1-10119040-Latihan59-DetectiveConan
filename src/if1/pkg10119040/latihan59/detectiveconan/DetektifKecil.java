/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan59.detectiveconan;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menempilkan karakter yang terdapat di anime detective conan
 * dengan metode pendekatan berbasis objek
 */
public class DetektifKecil extends Karakter{
  @Override
    public void tampil() {
        System.out.println("nama: "+nama);
    }
    @Override
        public void ciri(){
            
        System.out.println("deskripsi : Edogawa Konan adalah seorang anggota Grup Detektif Cilik. ");
             System.out.println("Identitas asli Conan Edogawa adalah Shinichi Kudo yang badannya menyusut karena racun APTX 4869 yang diberikan oleh Organisasi Hitam di Tropical Land.");
        System.out.println("");
        
    }  
}
