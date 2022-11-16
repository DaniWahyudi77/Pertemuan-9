/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Manusia {
    public String nama, hobby, pekerjaan;
    public Manusia (String nm, String hobby, String kerja) {
        this.nama = nm;
        this.hobby = hobby;
        this.pekerjaan = kerja;
    }
    public String tampilManusia() {
        return ("Nama\t\t: " + nama + "\n" + "Hobby\t\t: " + hobby + "\n" + "Pekerjaan\t\t: " + pekerjaan + "\n");
    }
}
class programmer extends Manusia {
    public programmer(String nm, String hobby, String kerja) {
        super(nm, hobby, kerja);
    }
    
}
class polisi extends Manusia {
    public polisi(String nm, String hobby, String kerja) {
        super(nm, hobby, kerja);
    }
    
}


