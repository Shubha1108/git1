public class TeaStall { 
    static String name= "baba tea stall";

    public static void main(String args[]){
        System.out.println("tea stall name is "+name);
        
        name = "babi tea stall";
        System.out.println("name after re-int");
        System.out.println("the tea stall name is "+name);
        updateName();


    }
    public static void updateName(){
        name = "babu tea stall";
        System.out.println("the tea stall name is "+name);

    }
    
}

