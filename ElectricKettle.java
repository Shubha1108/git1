public class ElectricKettle {
    static int kettleid = 355;
    static String brand = "Hamilton Beach";
    static String model = "Glass Electric Kettle";
    static double capacity = 1; 
    static boolean hasAutoShutOff = true;
    static int power = 1500; 
    static int price = 1999;
    static String color = "Clear Glass";
    public static void main(String args[]) {
		System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Capacity is: " + capacity + " L");
        System.out.println("Has Auto Shut-Off is: " + hasAutoShutOff);
        System.out.println("Power is: " + power + " W");
        System.out.println("Price is: Rs" + price);
        System.out.println("Color is: " + color);
		

		
		updateElectricKettle();
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Capacity is: " + capacity + " L");
        System.out.println("Has Auto Shut-Off is: " + hasAutoShutOff);
        System.out.println("Power is: " + power + " W");
        System.out.println("Price is: Rs" + price);
        System.out.println("Color is: " + color);
    }
	public static void updateElectricKettle(){
		kettleid = 356;
		brand = "Philips";
		model = "Daily Collection Kettle";
		capacity = 1.5;
		hasAutoShutOff = true;
		power = 1800;
		price = 2499;
		color = "Stainless Steel";
		
	}
}
    

