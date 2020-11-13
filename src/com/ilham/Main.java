/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class Main Karyawan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.println("========Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukkan NIK : ");
        String inputNik = scanner.nextLine();
        manager.setNik(inputNik);
        
        System.out.print("Masukkan Nama : ");
        String inputNama = scanner.nextLine();
        manager.setNama(inputNama);
        
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int inputGolongan = scanner.nextInt();
        manager.setGolongan(inputGolongan);
        
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String inputJabatan = scanner.next();
        manager.setJabatan(inputJabatan);
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int inputKehadiran = scanner.nextInt();
        manager.setKehadiran(inputKehadiran);
        
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("NIK : " + manager.getNik());
        System.out.println("NAMA : " + manager.getNama());
        System.out.println("GOLONGAN : " + manager.getGolongan());
        System.out.println("JABATAN : " + manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN : " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("\nGAJI TOTAL : " + manager.gajiTotal());
    }
    
}
