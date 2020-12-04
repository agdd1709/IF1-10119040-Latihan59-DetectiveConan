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
public class TemanShinichi extends Karakter{
    @Override
     public void tampil(){
        System.out.println("nama : "+nama);
     }
    @Override
      public void ciri(){  
        System.out.println("deskripsi : Ran Mouri teman Shinichi Kudo sejak kecil."
                + " Ran dan Shinichi tidak pernah berani mengungkapkan perasaannya kepada Ran.");
        System.out.println("");
    }
}
