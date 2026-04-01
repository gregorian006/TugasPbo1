package edu.transport;

public class MainApp {
    public static void main(String[] args) {
        double jarak = 120.0; // km

        Mobil mobil = new Mobil("Toyota Avanza", 120);
        Motor motor = new Motor("Honda Vario", 100);

        double waktuMobil = mobil.hitungWaktuTempuh(jarak);
        double waktuMotor = motor.hitungWaktuTempuh(jarak);

        System.out.println("==========================================");
        System.out.println("       PERHITUNGAN WAKTU TEMPUH          ");
        System.out.println("==========================================");
        System.out.printf("Jarak yang ditempuh : %.0f km%n", jarak);
        System.out.println("------------------------------------------");

        System.out.printf("Kendaraan  : %s%n", mobil.getNama());
        System.out.printf("Jenis      : Mobil%n");
        System.out.printf("Kec. Maks  : %.0f km/jam%n", mobil.getKecepatanMaks());
        System.out.printf("Kec. Efektif: %.0f km/jam (80%%)%n", mobil.getKecepatanMaks() * 0.80);
        System.out.printf("Waktu Tempuh: %.2f jam%n", waktuMobil);
        System.out.println("------------------------------------------");

        System.out.printf("Kendaraan  : %s%n", motor.getNama());
        System.out.printf("Jenis      : Motor%n");
        System.out.printf("Kec. Maks  : %.0f km/jam%n", motor.getKecepatanMaks());
        System.out.printf("Kec. Efektif: %.0f km/jam (90%%)%n", motor.getKecepatanMaks() * 0.90);
        System.out.printf("Waktu Tempuh: %.2f jam%n", waktuMotor);
        System.out.println("==========================================");
    }
}
