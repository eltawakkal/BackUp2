package com.example.eltawakkal.myapplication.quis;

/**
 * Created by Eltawakkal on 6/16/16.
 */
public class body_mobil extends mobil {

    private String warna;
    private String jenis;

    public body_mobil(String warna, String jenis) {
        this.warna = warna;
        this.jenis = jenis;
    }

    public void setIndukMethod(String nama){
        super.setNama(nama);
    }

    public void setIndukMethod(int harga){
        super.setHarga(harga);
    }

    @Override
    public void getSpec() {
        super.getSpec();
        System.out.println("Warna : " + warna + "\nJenis : " + jenis);
    }
}
