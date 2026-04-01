package edu.smartdevice;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("          DEMO SMARTWATCH                ");
        System.out.println("==========================================");

        // Membuat objek SmartWatch dengan baterai awal 20%
        SmartWatch watch = new SmartWatch(20);
        System.out.println("SmartWatch dibuat. Baterai awal: " + watch.getBatteryLevel() + "%");
        System.out.println();

        // Mengisi baterai
        System.out.println(">> Mengisi baterai...");
        watch.chargeBattery(50);
        watch.chargeBattery(40); // Total harusnya 110%, tapi akan di-cap di 100%
        System.out.println();

        // Mencoba koneksi WiFi dengan SSID kosong
        System.out.println(">> Mencoba koneksi dengan SSID kosong...");
        watch.connectWifi("");
        System.out.println();

        // Mencoba koneksi WiFi yang valid
        System.out.println(">> Mencoba koneksi dengan SSID valid...");
        watch.connectWifi("Rumahku_WiFi");
        System.out.println();

        // Menampilkan status akhir
        watch.tampilkanStatus();
    }
}
