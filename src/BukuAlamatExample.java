/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasya_021222;

/**
 *
 * @author User
 */
public class BukuAlamatExample {
    public static void main(String[] args) {
        BukuAlamat person1 = new BukuAlamat ("Afi", "Padang", "081234567890", "ani123@gmail.com");
        System.out.println("Nama                : " +person1.getName());
        System.out.println("Alamat              : " +person1.getAddress());
        System.out.println("No Telepon          : " +person1.getNotelp());
        System.out.println("Email               : " +person1.getEmail());
        
        System.out.println("");
        
        BukuAlamat person2 = new BukuAlamat ("tasya", "Padang", "082286832388", "nindyamori516@gmail.com");
        System.out.println("Nama                : " +person2.getName());
        System.out.println("Alamat              : " +person2.getAddress());
        System.out.println("No Telepon          : " +person2.getNotelp());
        System.out.println("Email               : " +person2.getEmail());
    }
    
}
