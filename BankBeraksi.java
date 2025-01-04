/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author tweet
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(100000);
        bank.getSaldo();
        bank.simpanUang();
        bank.ambilUang();
    }
}
