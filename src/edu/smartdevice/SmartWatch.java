package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {
    private int batteryLevel;
    private boolean connected;
    private String ssid;

    public SmartWatch() {
        this.batteryLevel = 0;
        this.connected = false;
        this.ssid = "";
    }

    public SmartWatch(int batteryLevel) {
        this.batteryLevel = batteryLevel;
        this.connected = false;
        this.ssid = "";
    }

    // Implementasi Rechargeable
    @Override
    public void chargeBattery(int menit) {
        batteryLevel += menit; // 1 menit = 1%
        if (batteryLevel > 100) {
            batteryLevel = 100; // Maksimal 100%
        }
        System.out.printf("Mengisi baterai selama %d menit... Baterai sekarang: %d%%%n", menit, batteryLevel);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Implementasi Connectable
    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.isEmpty()) {
            this.ssid = ssid;
            this.connected = true;
            System.out.printf("Berhasil terhubung ke WiFi: %s%n", ssid);
        } else {
            this.connected = false;
            this.ssid = "";
            System.out.println("Gagal terhubung: SSID tidak boleh kosong.");
        }
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    public String getSsid() { return ssid; }

    public void tampilkanStatus() {
        System.out.println("------------------------------------------");
        System.out.println("         STATUS SMARTWATCH                ");
        System.out.println("------------------------------------------");
        System.out.printf("Baterai   : %d%%%n", batteryLevel);
        System.out.printf("WiFi      : %s%n", connected ? "Terhubung" : "Tidak Terhubung");
        if (connected) {
            System.out.printf("SSID      : %s%n", ssid);
        }
        System.out.println("------------------------------------------");
    }
}
