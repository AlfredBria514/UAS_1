/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author tweet
 */
public class Bank {
     int saldo;
     int hasil;
     public Bank (int saldo){
         this.saldo = saldo;
     }
     public void simpanUang(){
         int simpan = 500000;
         hasil = simpan + saldo;
         System.out.println("Simpan Uang : Rp. " + simpan+ "\nSaldo saat ini : Rp."+ hasil);
     }
     public void ambilUang(){
         int ambil = 150000;
         hasil = hasil - ambil;
         System.out.println("Ambil Uang : Rp. " + ambil+ "\nSaldo saat ini : Rp."+ hasil);
     }
     public void getSaldo(){
         System.out.println("Selamat datang di Bank BTN\nSaldo saat ini : Rp."+ saldo);
     }
}
