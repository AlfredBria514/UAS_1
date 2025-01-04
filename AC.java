/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author tweet
 */
public class AC implements ACInterface {
    int statusAC;
    
    @Override
    public void hidupkanAC(){
    if(statusAC == KEADAAN_MATI){
        statusAC = KEADAAN_HIDUP;
        System.out.println("Hidupkan AC : AC Hidup");
    }else{
        System.out.println("Hidupkan AC : AC sudah Hidup");
    }
    }
    
    @Override
    public void matikanAC(){
    if(statusAC == KEADAAN_HIDUP){
        statusAC = KEADAAN_MATI;
        System.out.println("Matikan AC : AC Mati");
    }else{
        System.out.println("Matikan AC : AC sudah Mati");
    }
    }
    
    @Override
    public void dinginkanAC(){
    if(statusAC == SUHU_PANAS){
        statusAC = SUHU_DINGIN;
        System.out.println("Dinginkan AC : AC Dingin");
    }else{
        System.out.println("Dinginkan AC : AC sudah Dingin");
    }
    }   
    
    @Override
    public void panaskanAC(){
    if(statusAC == SUHU_DINGIN){
        statusAC = SUHU_PANAS;
        System.out.println("Panaskan AC : AC Panas");
    }else{
        System.out.println("Panaskan AC : AC sudah Panas");
    }
    }
}