class CoffeeMachine {
	static int CoffeeMachineid = 2420;
	static String brand = "Nespresso";
	static int waterTankCapacity = 1; 
	static boolean isAutomatic = true;
	static int price = 19999;
    static String color = "Red";
	static String  model = "Vertuo Next";
    public static void main(String args[]) {
		System.out.println("CoffeeMachineid is: " + CoffeeMachineid);
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);		
        System.out.println("Water Tank Capacity is: " + waterTankCapacity + " L");
        System.out.println("Is Automatic : " + isAutomatic);
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is : " + color);
		
		updateCoffeeMachine();
		System.out.println("CoffeeMachineid is: " + CoffeeMachineid);
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);		
        System.out.println("Water Tank Capacity is: " + waterTankCapacity + " L");
        System.out.println("Is Automatic : " + isAutomatic);
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is : " + color);
    }
	public static void updateCoffeeMachine(){
		CoffeeMachineid = 2422;
		brand = "Philips";
		waterTankCapacity = 2;
		isAutomatic = true;
		price = 17999;
		color = "Silver";
	}
}