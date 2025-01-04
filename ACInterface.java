/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceAC;

/**
 *
 * @author tweet
 */
interface ACInterface {
    public static final int KEADAAN_HIDUP=1;
    public static final int KEADAAN_MATI=0;
    public static final int SUHU_DINGIN=1;
    public static final int SUHU_PANAS=0;
    
    public abstract void matikanAC();
    public abstract void hidupkanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
}
