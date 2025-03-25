public class AirConditioner {
    static int id = 1001;
    static String brand = "Samsung";
    static String model = "AR12TY3QBBU";
    static String type = "Split AC";
    static boolean isEnergyEfficient = true;
    public static void main(String[] args) {
		System.out.println("Air Conditioner ID is: " + id);
        System.out.println("Air Conditioner brand is: " + brand);
        System.out.println("Air Conditioner model is: " + model);
        System.out.println("Air Conditioner type is: " + type);
        System.out.println("Is it energy efficient: " + isEnergyEfficient);
        
		updatedAirConditioner();
        System.out.println("Air Conditioner ID is: " + id);
        System.out.println("Air Conditioner brand is: " + brand);
        System.out.println("Air Conditioner model is: " + model);
        System.out.println("Air Conditioner type is: " + type);
        System.out.println("Is it energy efficient: " + isEnergyEfficient);
    }
	public static void updatedAirConditioner(){
		id = 1002;
		brand = "LG";
		model = "LS-Q18CNZD";
		type = "Inverter AC";
		isEnergyEfficient = false;
		
		
	}
}
    

