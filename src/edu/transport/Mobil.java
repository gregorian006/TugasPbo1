package edu.transport;

public class Mobil extends Kendaraan {

    public Mobil() {}

    public Mobil(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif = kecepatanMaks * 0.80; // 80% dari kecepatan maksimum
        return jarak / kecepatanEfektif;
    }
}
