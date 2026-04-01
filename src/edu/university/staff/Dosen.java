package edu.university.staff;

public class Dosen extends Pegawai {
    private int jumlahSKS;

    public Dosen() {}

    public Dosen(String nama, double gajiPokok, int jumlahSKS) {
        super(nama, gajiPokok);
        this.jumlahSKS = jumlahSKS;
    }

    public int getJumlahSKS() { return jumlahSKS; }
    public void setJumlahSKS(int jumlahSKS) { this.jumlahSKS = jumlahSKS; }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahSKS * 150000);
    }

    @Override
    public String toString() {
        return String.format("[Dosen]  Nama: %-20s | SKS: %2d | Gaji Pokok: Rp%,.0f | Total Gaji: Rp%,.0f",
                nama, jumlahSKS, gajiPokok, hitungGaji());
    }
}
