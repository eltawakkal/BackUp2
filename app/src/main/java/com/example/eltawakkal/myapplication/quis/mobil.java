package com.example.eltawakkal.myapplication.quis;

/**
 * Created by Eltawakkal on 6/16/16.
 */
public class mobil {

    private String nama;
    private int harga;

    private String euro;
    private boolean gps;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getEuro() {
        return euro;
    }

    public void setEuro(String euro) {
        this.euro = euro;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    //behavior
    public void getSpec(){
        System.out.println("nama mobil : " + nama + "\nharga : Rp."+harga);
    }

}
