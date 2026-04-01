package edu.transport;

public abstract class Kendaraan {
    protected String nama;
    protected double kecepatanMaks;

    public Kendaraan() {}

    public Kendaraan(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getKecepatanMaks() { return kecepatanMaks; }
    public void setKecepatanMaks(double kecepatanMaks) { this.kecepatanMaks = kecepatanMaks; }

    // Abstract method yang harus diimplementasikan child class
    public abstract double hitungWaktuTempuh(double jarak);
}
