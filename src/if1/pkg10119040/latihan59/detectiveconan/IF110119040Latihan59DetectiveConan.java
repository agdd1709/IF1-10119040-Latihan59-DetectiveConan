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
public class IF110119040Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karakter karakter =  new DetektifKecil();
        karakter.setNama("Conan Edogawa");
        karakter.tampil();
        karakter.ciri();
         
        Karakter karakter1 =  new TemanShinichi();
        karakter1.setNama("Ran Mouri");
        karakter1.tampil();
        karakter1.ciri();
        
        Karakter karakter2 =  new DetektifDewasa();
        karakter2.setNama("kogoro mouri");
        karakter2.tampil();
        karakter2.ciri();
        
        Karakter karakter3 =  new SahabatRan();
        karakter3.setNama("Sonoko Suzuki");
        karakter3.tampil();
        karakter3.ciri();
    }
    
}
