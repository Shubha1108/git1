public class Mat {
    String material;
    double price;
    String size;

    Mat() {
        System.out.println("\nMat Details");
    }

    Mat(String material, double price, String size) {
        this.material = material;
        this.price = price;
        this.size = size;
    }
    
}
