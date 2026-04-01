package edu.university.staff;

public class StafAdministrasi extends Pegawai {
    private int jamLembur;

    public StafAdministrasi() {}

    public StafAdministrasi(String nama, double gajiPokok, int jamLembur) {
        super(nama, gajiPokok);
        this.jamLembur = jamLembur;
    }

    public int getJamLembur() { return jamLembur; }
    public void setJamLembur(int jamLembur) { this.jamLembur = jamLembur; }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jamLembur * 50000);
    }

    @Override
    public String toString() {
        return String.format("[Staf]   Nama: %-20s | Lembur: %2d jam | Gaji Pokok: Rp%,.0f | Total Gaji: Rp%,.0f",
                nama, jamLembur, gajiPokok, hitungGaji());
    }
}
