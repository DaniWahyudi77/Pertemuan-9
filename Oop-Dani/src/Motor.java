/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Motor {
   private String merk, tipe;
    private int tangki;
    private long harga;
    void inputMerk (String merk) {
        this.merk = merk;
    }
    void inputTipe (String tipe) {
        this.tipe = tipe;
    }
    void inputTangki(int tangki) {
        this.tangki = tangki;
    }
    void inputHarga(long harga) {
        this.harga = harga;
    }
    public String tampilMerk(){
        return merk;
    }
    public String tampilTipe(){
        return tipe;
    }
    public int tampilTangki(){
        return tangki;
    }
    public long tampilHarga(){
        return harga;
    }
}
 

