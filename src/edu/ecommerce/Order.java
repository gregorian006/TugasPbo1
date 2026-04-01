package edu.ecommerce;

public class Order {
    private String orderId;
    private String customerName;
    private double total;

    public Order() {}

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.total = 0;
    }

    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getTotal() { return total; }

    // Menghitung total dari semua item
    public double hitungTotal(OrderItem[] items) {
        double totalHarga = 0;
        for (OrderItem item : items) {
            totalHarga += item.getSubtotal();
        }
        this.total = totalHarga;
        return this.total;
    }

    // Menampilkan rincian pesanan
    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("==========================================");
        System.out.println("           RINCIAN PESANAN               ");
        System.out.println("==========================================");
        System.out.printf("Order ID     : %s%n", orderId);
        System.out.printf("Customer     : %s%n", customerName);
        System.out.println("------------------------------------------");
        System.out.printf("%-20s %6s %12s %14s%n", "Produk", "Harga", "Qty", "Subtotal");
        System.out.println("------------------------------------------");
        for (OrderItem item : items) {
            System.out.printf("%-20s Rp%,.0f  x%4d  Rp%,.0f%n",
                    item.getProductName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getSubtotal());
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-20s %22s Rp%,.0f%n", "TOTAL", "", hitungTotal(items));
        System.out.println("==========================================");
    }

    // =====================
    // Inner Class OrderItem
    // =====================
    public class OrderItem {
        private String productName;
        private double price;
        private int quantity;

        public OrderItem() {}

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getProductName() { return productName; }
        public void setProductName(String productName) { this.productName = productName; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }

        public double getSubtotal() {
            return price * quantity;
        }
    }
}
