public class Bagg {
    static int id = 301;
    static String brand = "Gucci";
    static String type = "Tote";
    static String material = "Leather";
    static boolean hasMultipleCompartments = true;
    public static void main(String args[]) {
		System.out.println("Bag ID is: " + id);
        
        System.out.println("Bag brand is: " + brand);
        System.out.println("Bag type is: " + type);
        System.out.println("Bag material is: " + material);
        System.out.println("Does it have multiple compartments: " + hasMultipleCompartments);
        
        

		updateBagg();
        System.out.println("Bag ID is: " + id);
        System.out.println("Bag brand is: " + brand);
        System.out.println("Bag type is: " + type);
        System.out.println("Bag material is: " + material);
        System.out.println("Does it have multiple compartments: " + hasMultipleCompartments);
    }
	public static void updateBagg(){
		id = 302;
		brand = "Louis Vuitton";
		type = "Shoulder Bag";
		material = "Canvas";
		hasMultipleCompartments = false;
        System.out.println("the id is "+id);
		
	}
}
    

