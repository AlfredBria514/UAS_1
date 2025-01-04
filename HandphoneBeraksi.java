/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author tweet
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        // Membuat objek Handphone
        Handphone hp = new Handphone();
        String merek = "Xiaomi";
        String warna = "Biru";
        hp.hidupkan(merek, warna);
        hp.lakukanPanggilan(merek);
        hp.kirimSMS(merek);
        hp.matikan(merek);
    }
}
