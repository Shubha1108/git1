public class Chain {
    String material;
    double length;
    double price;

    Chain() {
        System.out.println("\nChain Details");
    }

    Chain(String material, double length, double price) {
        this.material = material;
        this.length = length;
        this.price = price;
    }
    
}
