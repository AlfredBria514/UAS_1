/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author tweet
 */
public class ACBeraksi {
    public static void main(String[] args) {
        
        AC AirConditioner = new AC();
        
        System.out.println("Satus sekarang AC sedang Mati dan Suhu Panas");
        
        AirConditioner.hidupkanAC();
        AirConditioner.matikanAC();
        AirConditioner.matikanAC();
        AirConditioner.hidupkanAC();
        AirConditioner.hidupkanAC();
        AirConditioner.dinginkanAC();
        AirConditioner.panaskanAC();
        AirConditioner.panaskanAC();
        AirConditioner.dinginkanAC();
        AirConditioner.dinginkanAC();
    }
}
