package edu.university.main;

import edu.university.model.Mahasiswa;

public class MainApp {
    public static void main(String[] args) {
        // Membuat minimal 3 objek Mahasiswa
        Mahasiswa[] mahasiswaArray = new Mahasiswa[5];

        mahasiswaArray[0] = new Mahasiswa("2021001", "Andi Pratama", 3.85);
        mahasiswaArray[1] = new Mahasiswa("2021002", "Budi Santoso", 3.20);
        mahasiswaArray[2] = new Mahasiswa("2021003", "Citra Dewi", 2.75);
        mahasiswaArray[3] = new Mahasiswa("2021004", "Dina Rahayu", 2.30);
        mahasiswaArray[4] = new Mahasiswa("2021005", "Eko Wijaya", 3.50);

        // Menampilkan data mahasiswa beserta kategori IPK
        System.out.println("========================================");
        System.out.println("         DATA MAHASISWA UNIVERSITAS     ");
        System.out.println("========================================");
        for (Mahasiswa m : mahasiswaArray) {
            System.out.println(m);
        }
        System.out.println("========================================");
    }
}
