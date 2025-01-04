/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceMatematika;

/**
 *
 * @author tweet
 */
public class InheritanceMatematika {
    int hasil;
    double hasilPecahan;
// membuat method tambahan
void pertambahan (int a, int b){
    hasil = a + b;
    System.out.println("hasil pertambahan: "+hasil );
}
//membuat tambahan dengan pecahan
void pertambahan (double a, double b, double c){
    hasilPecahan = a + b + c;
    System.out.println("hasil pertambahan: "+hasilPecahan );
}
//membuat method pengurangan
void pengurangan (int a, int b){
    hasil = a - b;
    System.out.println("hasil pengurangan: "+hasil );
}
//membuat method pengurangan dengan pecahan
void pengurangan (double a, double b, double c){
    hasilPecahan = a - b - c;
    System.out.println("hasil pengurangan: "+hasilPecahan );
}
//membuat method perkalian
void perkalian (int a, int b){
    hasil = a * b;
    System.out.println("hasil perkalian: "+hasil );
}
//membuat method perkalian dengan pecahan
void perkalian (double a, double b, double c){
    hasilPecahan = a * b * c;
    System.out.println("hasil perkalian: "+hasilPecahan );
}
//membuat method pembagian
void pembagian (int a, int b){
    hasil = a / b;
    System.out.println("hasil pembagian: "+hasil );
}
//membuat method pembagian dengan pecahan
void pembagian (double a, double b, double c){
    hasilPecahan = a / b / c;
    System.out.println("hasil pembagian: "+hasilPecahan );
}
}