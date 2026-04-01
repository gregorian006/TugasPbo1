package edu.transport;

public class Motor extends Kendaraan {

    public Motor() {}

    public Motor(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif = kecepatanMaks * 0.90; // 90% dari kecepatan maksimum
        return jarak / kecepatanEfektif;
    }
}
