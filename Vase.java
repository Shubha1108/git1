public class Vase {
    String material;
    double height;
    String color;

    Vase() {
        System.out.println("Vase Details");
    }

    Vase(String material, double height, String color) {
        this.material = material;
        this.height = height;
        this.color = color;
    }
}
