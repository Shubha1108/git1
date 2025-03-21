public class AmazonRunner {
    public static void main(String[] args) {
        Amazon ref = new Amazon();
        ref.id = 1;
        ref.name="shubha";
        ref.phoneNumber=8050526929L;
        ref.password="shubha@123";

        System.out.println("Amazon id "+ref.id);
        System.out.println("user name "+ref.name);
        System.out.println("user phone number "+ref.phoneNumber);
        System.out.println("user password "+ref.password);



        Amazon ref1 = new Amazon();
        ref1.id =2;
        ref1.name="monisha";
        ref1.phoneNumber=9483752890L;
        ref1.password="monisha@123";

        System.out.println("Amazon id "+ref1.id);
        System.out.println("user name "+ref1.name);
        System.out.println("user phone number "+ref1.phoneNumber);
        System.out.println("user password "+ref1.password);


        
    }
    
}
