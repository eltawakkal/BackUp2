package com.example.eltawakkal.myapplication.quis;

/**
 * Created by Eltawakkal on 6/16/16.
 */
public class transaksi extends mobil implements lain_lain{

    private String jenisTransaksi;
    private String namaPembeli;

    public transaksi(String jenisTransaksi, String namaPembeli) {
        this.jenisTransaksi = jenisTransaksi;
        this.namaPembeli = namaPembeli;
    }

    public void setIndukState(String euro){
        super.setEuro(euro);
    }

    public void setIndukState(boolean gps){
        super.setGps(gps);
    }

    public void getDetailsTrans(){
        System.out.println("Jenis Transaksi : " + jenisTransaksi);
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("Euro : " + super.getEuro());
        System.out.println("GPS : " + super.isGps());
    }

    @Override
    public void bayar(long bayar) {
        long hasil=0;
        hasil=bayar-super.getHarga();
        System.out.println("Harga : Rp."+ super.getHarga() + "\nBayar : Rp." + bayar + "\nKembalian : " + hasil);
    }
}
