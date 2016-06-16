package com.example.eltawakkal.myapplication.backUp5;

/**
 * Created by Eltawakkal on 6/16/16.
 */
public class manusia {

    private String nama;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void dataLengkap(){
        System.out.println("nama saya : " + nama +"\numurku : "+umur);
    }
}
