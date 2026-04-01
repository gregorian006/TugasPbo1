package edu.ecommerce;

public class MainApp {
    public static void main(String[] args) {
        // Membuat objek Order
        Order order = new Order("ORD-2024-001", "Andi Pratama");

        // Membuat minimal 3 OrderItem menggunakan inner class
        Order.OrderItem[] items = new Order.OrderItem[4];
        items[0] = order.new OrderItem("Laptop ASUS VivoBook", 8500000, 1);
        items[1] = order.new OrderItem("Mouse Wireless", 250000, 2);
        items[2] = order.new OrderItem("Keyboard Mechanical", 750000, 1);
        items[3] = order.new OrderItem("HDMI Cable 2m", 85000, 3);

        // Menampilkan rincian pesanan (hitungTotal dipanggil di dalamnya)
        order.tampilkanRincian(items);
    }
}
