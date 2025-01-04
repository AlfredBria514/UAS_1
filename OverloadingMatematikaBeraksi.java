/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadingMTK;

/**
 *
 * @author tweet
 */
public class OverloadingMatematikaBeraksi {
    public static void main(String[] args) {
        OverloadingMatematikaCanggih mc = new OverloadingMatematikaCanggih();
        // Menguji metode dengan 3 parameter bertipe double
        double hasilPecahan = mc.pertambahan(12.5, 28.7, 14.2);
        System.out.println("Pertambahan dengan tiga parameter (12.5, 28.7, 14.2): " + hasilPecahan);
        // Menguji konsep overloading
        System.out.println("Pertambahan dengan tiga parameter integer (12, 28, 14): " + mc.pertambahan(12, 28) + 14);
        System.out.println("Pertambahan dengan dua parameter integer (23, 34): " + mc.pertambahan(23, 34));
        System.out.println("Pertambahan dengan dua parameter pecahan (3.4, 4.9): " + mc.pertambahan(3.4, 4.9));
    }
}
