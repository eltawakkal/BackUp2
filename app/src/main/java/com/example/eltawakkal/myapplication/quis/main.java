package com.example.eltawakkal.myapplication.quis;

/**
 * Created by Eltawakkal on 6/16/16.
 */
public class main {

    public static void main(String[] args) {

        body_mobil bodyMobil = new body_mobil("Merah", "Sport");
        bodyMobil.setIndukMethod("Lambo");
        bodyMobil.setIndukMethod(305628199);
        bodyMobil.getSpec();

        transaksi trans = new transaksi("Langsung di kantor", "Fadhli");
        trans.setIndukState("Euro 4");
        trans.setIndukState(true);
        trans.getDetailsTrans();
        trans.bayar(50000000000l);
    }

}
