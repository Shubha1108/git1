public class Cosmetics {
    String productName;
    double price;
    String brand;

    Cosmetics() {
        System.out.println("\nCosmetics Details");
    }

    Cosmetics(String productName, double price, String brand) {
        this.productName = productName;
        this.price = price;
        this.brand = brand;
    }
    
}
