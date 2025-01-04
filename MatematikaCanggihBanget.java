/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceMatematikaCanggihBanget;

/**
 *
 * @author tweet
 */
public class MatematikaCanggihBanget extends MatematikaCanggih {
    void pertambahanTiga(int a, int b, int c) {
        hasil = a + b + c;
        System.out.println("Hasil Pertambahan Tiga: "+hasil);
    }
    void modulus (int a,int b){
        hasil = a % b;
        System.out.println("Hasil Modulus: "+hasil); 
    }
}
