public class ColdDrink {
    String name;
    double price;
    String flavor;

    ColdDrink() {
        System.out.println("\nCold Drink Details");
    }

    ColdDrink(String name, double price, String flavor) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }
    
}
