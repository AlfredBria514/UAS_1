/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author tweet
 */
public class Handphone {
    public void hidupkan(String merek, String warna) {
        System.out.println("Handphone " + merek + " berwarna " + warna + " POWER ON.");
    }
    public void lakukanPanggilan(String merek) {
        System.out.println("Telolet...Telolet...Telolet - Melakukan panggilan menggunakan handphone " + merek + ".");
    }
    public void kirimSMS(String merek) {
        System.out.println("Ommm...Ommm...Ommm - Mengirim SMS menggunakan handphone " + merek + ".");
    }
    public void matikan(String merek) {
        System.out.println("Handphone " + merek + " POWER OFF.");
    }
}
