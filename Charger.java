public class Charger {
    static int id = 01;
    static String brand = "Ambrane";
    static String type = "USB C";
    static String power = "65 watts";
    static String color = "black";
    static int price = 2500;
    public static void main(String[] args) {
		System.out.println("charger id is :"+id);
        System.out.println("charger brand is :"+brand);
        System.out.println("charger type is :"+type);
        System.out.println("charger power is :"+power);
        System.out.println("charger color is :"+color);
        System.out.println("charge price is :"+price);
		

		updatedCharger();
        System.out.println("charger id is :"+id);
        System.out.println("charger brand is :"+brand);
        System.out.println("charger type is :"+type);
        System.out.println("charger power is :"+power);
        System.out.println("charger color is :"+color);
        System.out.println("charge price is :"+price);   
    }
	public static void updatedCharger(){
		id = 02;
		brand = "Anker";
		type = "USB C PD";
		power = "100 watts";
		color = "White";
		price = 3499;
		
	}
}
    

