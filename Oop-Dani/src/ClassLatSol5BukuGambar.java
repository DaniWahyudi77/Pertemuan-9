/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ClassLatSol5BukuGambar extends ClassLatSol5Barang{
    int HPP,HargaJual,Stok,JumlahJual;

    public ClassLatSol5BukuGambar(String kode,String nama,int HPP, int HargaJual,int Stok,int JumlahJual){
        super(kode,nama);
        this.HPP=HPP;
        this.HargaJual=HargaJual;
        this.Stok=Stok;
        this.JumlahJual=JumlahJual;
    }

    public String TampilBuku(){
        return (super.tampilBarang()+"HPP\t\t: "+HPP+"\nHarga Jual\t: "+HargaJual+
                "\nStok\t\t: "+Stok+"\nJumlah Jual\t: "+JumlahJual+
                "\nOUTPUT:"+"\nStok Sekarang\t: "+(Stok-JumlahJual)+
                "\nTotal Bayar\t: "+(JumlahJual*HargaJual)+"\nLaba\t\t: "+
                ((JumlahJual*HargaJual)-(JumlahJual*HPP)));
    
}
}
