/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaParameter;
/**
 *
 * @author tweet
 */
public class Matematika {
// attribut atau variable
    int tambah = 0;
    int kurang = 0;
    int kali = 0;
    int bagi = 0;
// method pertambahan
    void pertambahan(int a,int b){ 
        tambah = a+b;
        System.out.println("Pertambahan :"+a+"+"+b+"="+tambah);
    }
// method pengurangan    
    void penguranan(int a,int b){ 
        kurang = a-b;
        System.out.println("Pengurangan :"+a+"-"+b+"="+kurang);
    }
// method perkalian    
    void perkalian(int a,int b){ 
        kali = a*b;
        System.out.println("Perkalian :"+a+"x"+b+"="+kali);
    }
// method pembahian    
    void pembagian(int a,int b){ 
        bagi = a/b;
        System.out.println("Pembagian :"+a+"/"+b+"="+bagi);
    }
}