/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG TUNJANGAN
 */

public class Saldo {
    
    private int saldoAwal;
    private int saldoTarget;
    private int saldoAkhir;
    private int bunga;

    public void setAwal(int saldoAwal) {
        this.saldoAwal = saldoAwal;
    }

    public void setTarget(int saldoTarget) {
        this.saldoTarget = saldoTarget;
    }

    public void setBunga(int bunga) {
        this.bunga = bunga;
    }
    
    public void Target(){
        int i = 1;
        
        while(saldoAwal <= saldoTarget){
            saldoAkhir = (saldoAwal * bunga/100) + saldoAwal;
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + String.format("%,d", saldoAkhir).replace(',', '.'));
            saldoAwal = saldoAkhir;
            i++;
        }
    }
}
