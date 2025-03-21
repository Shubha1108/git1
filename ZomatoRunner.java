public class ZomatoRunner {
    public static void main(String[] args) {
        double price= Zomato.search("paneer butter masala");
        System.out.println(price);
        double price1= Zomato.search("dal makhani");
        System.out.println(price1);
        double price2= Zomato.search("chole bhature");
        System.out.println(price2);
        double price3= Zomato.search("rajma chawal");
        System.out.println(price3);
        double price4= Zomato.search("aloo paratha");
        System.out.println(price4);
    }
    
}
