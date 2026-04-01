# Tugas PBO 

Nama : Gregorian Goclio Sinaga
NIM  : 241401087


## Struktur 

```
src/
├── edu/university/
│   ├── model/
│   │   └── Mahasiswa.java          # Soal 1 - Encapsulation
│   ├── main/
│   │   └── MainApp.java            # Soal 1 - Runner
│   └── staff/
│       ├── Pegawai.java            # Soal 2 - Base class
│       ├── Dosen.java              # Soal 2 - Subclass
│       ├── StafAdministrasi.java   # Soal 2 - Subclass
│       └── MainApp.java            # Soal 2 - Runner
├── edu/transport/
│   ├── Kendaraan.java              # Soal 3 - Abstract class
│   ├── Mobil.java                  # Soal 3 - Child class
│   ├── Motor.java                  # Soal 3 - Child class
│   └── MainApp.java                # Soal 3 - Runner
├── edu/smartdevice/
│   ├── Rechargeable.java           # Soal 4 - Interface
│   ├── Connectable.java            # Soal 4 - Interface
│   ├── SmartWatch.java             # Soal 4 - Implementasi
│   └── MainApp.java                # Soal 4 - Runner
└── edu/ecommerce/
    ├── Order.java                  # Soal 5 - Outer + Inner class
    └── MainApp.java                # Soal 5 - Runner
```

## Output Program

### Soal 1 - Data Mahasiswa
```
========================================
         DATA MAHASISWA UNIVERSITAS     
========================================
NIM: 2021001 | Nama: Andi Pratama         | IPK: 3.85 | Kategori: Cumlaude
NIM: 2021002 | Nama: Budi Santoso         | IPK: 3.20 | Kategori: Sangat Memuaskan
NIM: 2021003 | Nama: Citra Dewi           | IPK: 2.75 | Kategori: Memuaskan
NIM: 2021004 | Nama: Dina Rahayu          | IPK: 2.30 | Kategori: Perlu Perbaikan
NIM: 2021005 | Nama: Eko Wijaya           | IPK: 3.50 | Kategori: Cumlaude
========================================
```

### Soal 2 - Data Pegawai
```
=============================================================
                  DATA PEGAWAI UNIVERSITAS                  
=============================================================
[Dosen]  Nama: Dr. Ahmad Fauzi      | SKS: 12 | Gaji Pokok: Rp5,000,000 | Total Gaji: Rp6,800,000
[Dosen]  Nama: Prof. Siti Nurhaliza | SKS: 18 | Gaji Pokok: Rp8,000,000 | Total Gaji: Rp10,700,000
[Dosen]  Nama: Dr. Bambang Irawan   | SKS: 10 | Gaji Pokok: Rp6,000,000 | Total Gaji: Rp7,500,000
[Staf]   Nama: Hendra Gunawan       | Lembur:  8 jam | Gaji Pokok: Rp3,500,000 | Total Gaji: Rp3,900,000
[Staf]   Nama: Ratna Sari           | Lembur:  5 jam | Gaji Pokok: Rp3,000,000 | Total Gaji: Rp3,250,000
[Staf]   Nama: Yusuf Maulana        | Lembur: 12 jam | Gaji Pokok: Rp3,200,000 | Total Gaji: Rp3,800,000
=============================================================
```

### Soal 3 - Waktu Tempuh Kendaraan
```
==========================================
       PERHITUNGAN WAKTU TEMPUH          
==========================================
Jarak yang ditempuh : 120 km
------------------------------------------
Kendaraan  : Toyota Avanza
Jenis      : Mobil
Kec. Maks  : 120 km/jam
Kec. Efektif: 96 km/jam (80%)
Waktu Tempuh: 1.25 jam
------------------------------------------
Kendaraan  : Honda Vario
Jenis      : Motor
Kec. Maks  : 100 km/jam
Kec. Efektif: 90 km/jam (90%)
Waktu Tempuh: 1.33 jam
==========================================
```

### Soal 4 - SmartWatch
```
==========================================
          DEMO SMARTWATCH                
==========================================
SmartWatch dibuat. Baterai awal: 20%

>> Mengisi baterai...
Mengisi baterai selama 50 menit... Baterai sekarang: 70%
Mengisi baterai selama 40 menit... Baterai sekarang: 100%

>> Mencoba koneksi dengan SSID kosong...
Gagal terhubung: SSID tidak boleh kosong.

>> Mencoba koneksi dengan SSID valid...
Berhasil terhubung ke WiFi: Rumahku_WiFi

------------------------------------------
         STATUS SMARTWATCH                
------------------------------------------
Baterai   : 100%
WiFi      : Terhubung
SSID      : Rumahku_WiFi
------------------------------------------
```

### Soal 5 - Rincian Order
```
==========================================
           RINCIAN PESANAN               
==========================================
Order ID     : ORD-2024-001
Customer     : Andi Pratama
------------------------------------------
Produk                 Harga         Qty       Subtotal
------------------------------------------
Laptop ASUS VivoBook  Rp8,500,000  x   1  Rp8,500,000
Mouse Wireless        Rp250,000    x   2  Rp500,000
Keyboard Mechanical   Rp750,000    x   1  Rp750,000
HDMI Cable 2m         Rp85,000     x   3  Rp255,000
------------------------------------------
TOTAL                                      Rp10,005,000
==========================================
```
