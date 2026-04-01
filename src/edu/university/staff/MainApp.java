package edu.university.staff;

public class MainApp {
    public static void main(String[] args) {
        // Array bertipe Pegawai berisi Dosen dan StafAdministrasi
        Pegawai[] pegawaiArray = new Pegawai[6];

        pegawaiArray[0] = new Dosen("Dr. Ahmad Fauzi", 5000000, 12);
        pegawaiArray[1] = new Dosen("Prof. Siti Nurhaliza", 8000000, 18);
        pegawaiArray[2] = new Dosen("Dr. Bambang Irawan", 6000000, 10);
        pegawaiArray[3] = new StafAdministrasi("Hendra Gunawan", 3500000, 8);
        pegawaiArray[4] = new StafAdministrasi("Ratna Sari", 3000000, 5);
        pegawaiArray[5] = new StafAdministrasi("Yusuf Maulana", 3200000, 12);

        // Menampilkan semua data
        System.out.println("=============================================================");
        System.out.println("                  DATA PEGAWAI UNIVERSITAS                  ");
        System.out.println("=============================================================");
        for (Pegawai p : pegawaiArray) {
            System.out.println(p);
        }
        System.out.println("=============================================================");
    }
}
