public class Drone {
    static int Droneid = 4309;
    static String brand = "DJI";
    static String model = "Mavic Air 2";
    static int maxFlightTime = 34; 
    static int cameraResolution = 48; 
    static int price = 7999;
    static String color = "Gray";
    public static void main(String args[]) {
		System.out.println("Droneid is: " + Droneid );
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Max Flight Time is: " + maxFlightTime + " minutes");
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is: " + color);
		/*Droneid = 4310;
		brand = "Autel Robotics";
		model = "Evo Lite+";
		maxFlightTime = 40;
		cameraResolution = 50;
		price = 8999;
		color = "Orange";*/

		
		updateDrone();
		System.out.println("Droneid is: " + Droneid );
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Max Flight Time is: " + maxFlightTime + " minutes");        
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is: " + color);
    }
	public static void updateDrone(){
		Droneid = 4310;
		brand = "Autel Robotics";
		model = "Evo Lite+";
		maxFlightTime = 40;
		cameraResolution = 50;
		price = 8999;
		color = "Orange";
	}
}
    

