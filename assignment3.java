public class assignment3 {

    String name;
    double price;

    static double taxRate = 5.0;
    static int totalProducts = 0;

    public assignment3(String name, double price) {
        this.name = name;
        this.price = price;
        totalProducts++;
    }

    // method overloading - version 1
    double calculateFinalPrice(double price) {
        return price + (price * taxRate / 100);
    }

    // method overloading - version 2
    double calculateFinalPrice(double price, double discountPercent) {
        double discountedPrice = price - (price * discountPercent / 100);
        return discountedPrice + (discountedPrice * taxRate / 100);
    }

    // static method
    static void showStoreInfo() {
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Total Products: " + totalProducts);
    }

    void displayProduct() {
        System.out.println("Product: " + name + " | Base Price: " + price);
    }

    public static void main(String[] args) {

        assignment3 p1 = new assignment3("Laptop", 50000);
        assignment3 p2 = new assignment3("Headphones", 2000);

        p1.displayProduct();
        System.out.println("Final Price (no discount): " + p1.calculateFinalPrice(p1.price));

        p2.displayProduct();
        System.out.println("Final Price (10% discount): " + p2.calculateFinalPrice(p2.price, 10));

        System.out.println();
        assignment3.showStoreInfo();

        System.out.println();
        System.out.println("Store increases tax rate to 8% (affects ALL products):");
        assignment3.taxRate = 8.0;

        System.out.println("Laptop final price with new tax: " + p1.calculateFinalPrice(p1.price));
        System.out.println("Headphones final price with new tax: " + p2.calculateFinalPrice(p2.price, 10));
    }
}
