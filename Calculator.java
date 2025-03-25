public class Calculator {

    public static void add(int num1,int num2){

        int total= num1 + num2 ;
        System.out.println("the total is :"+total);
    }
    public static void subtract(int num1,int num2){
        int remainder = num1 - num2;

        System.out.println("the remainder is :"+remainder);
    }
    public static void mod(int num1,int num2){
        int percentage = num1 % num2;
        System.out.println("the % is "+percentage);
    }
    public static void multiply(int num1,int num2){  
        int product = num1 * num2;
        System.out.println("the product is :"+product);
    }

    
}
