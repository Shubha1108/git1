public class SwiggyRunner {
    public static void main(String[] args) {
        double price= Swiggy.search("spring rolls");
        System.out.println(price);
        double price1= Swiggy.search("chilli paneer");
        System.out.println(price1);
        double price2= Swiggy.search("manchurian");
        System.out.println(price2);
        double price3= Swiggy.search("dragon chicken");
        System.out.println(price3);
        double price4= Swiggy.search("pepper chicken");
        System.out.println(price4);
    
    }}
