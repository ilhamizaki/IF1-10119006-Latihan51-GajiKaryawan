/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : subclass Manager
 */

public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        return tunjanganKehadiran = kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan) {
        tunjanganJabatan = 0;
        if("Manager".equals(jabatan)) {
            tunjanganJabatan = 2000000;
        } else if("Kabag".equals(jabatan)) {
            tunjanganJabatan = 1000000;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan) {
        tunjanganGolongan = 0;
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
