/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class MainMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Motor mtr = new Motor();
    mtr.inputMerk("Yamaha");
    mtr.inputTipe("Mx - 125cc");
    mtr.inputTangki(4);
    mtr.inputHarga(15000000);
    System.out.println("Rincian Motor : ");
    System.out.println("Merk : " + mtr.tampilMerk());
    System.out.println("Tipe : " + mtr.tampilTipe());
    System.out.println("Tangki : " + mtr.tampilTangki());
    System.out.println("Harga : " + mtr.tampilHarga());
    }
    
}

    
    

