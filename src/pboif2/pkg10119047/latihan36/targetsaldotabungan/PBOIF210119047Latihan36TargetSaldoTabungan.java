/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan36.targetsaldotabungan;
import data.Saldo;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG TARGET TABUNGAN
 */

public class PBOIF210119047Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Saldo saldo = new Saldo();
        
        saldo.setAwal(3500000);
        saldo.setTarget(6000000);
        saldo.setBunga(8);
        
        saldo.Target();
    }
}
