package edu.university.staff;

public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    public Pegawai() {}

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getGajiPokok() { return gajiPokok; }
    public void setGajiPokok(double gajiPokok) { this.gajiPokok = gajiPokok; }

    public double hitungGaji() {
        return gajiPokok;
    }

    @Override
    public String toString() {
        return String.format("Nama: %-20s | Gaji Pokok: Rp%,.0f | Total Gaji: Rp%,.0f",
                nama, gajiPokok, hitungGaji());
    }
}
