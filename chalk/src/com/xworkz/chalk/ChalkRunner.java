package com.xworkz.chalk;

import com.xworkz.chalk.chalk.Chalk;

public class ChalkRunner {
    public static void main(String[] args) {
        Chalk ref1 = new Chalk();
        ref1.setChalkId(1);
        ref1.setBrand("Camlin");
        ref1.setColor("White");
        ref1.setType("Board Chalk");
        ref1.setPrice(20.0);
        ref1.setIsDustFree(true);
        ref1.setIsEcoFriendly(true);

        System.out.println("Chalk ID: " + ref1.getChalkId());
        System.out.println("Brand: " + ref1.getBrand());
        System.out.println("Color: " + ref1.getColor());
        System.out.println("Type: " + ref1.getType());
        System.out.println("Price: " + ref1.getPrice());
        System.out.println("Dust Free: " + ref1.getIsDustFree());
        System.out.println("Eco Friendly: " + ref1.getIsEcoFriendly());
        System.out.println();

        Chalk ref2 = new Chalk();
        ref2.setChalkId(2);
        ref2.setBrand("Faber Castell");
        ref2.setColor("Yellow");
        ref2.setType("Sidewalk Chalk");
        ref2.setPrice(30.0);
        ref2.setIsDustFree(false);
        ref2.setIsEcoFriendly(true);

        System.out.println("Chalk ID: " + ref2.getChalkId());
        System.out.println("Brand: " + ref2.getBrand());
        System.out.println("Color: " + ref2.getColor());
        System.out.println("Type: " + ref2.getType());
        System.out.println("Price: " + ref2.getPrice());
        System.out.println("Dust Free: " + ref2.getIsDustFree());
        System.out.println("Eco Friendly: " + ref2.getIsEcoFriendly());
        System.out.println();

        Chalk ref3 = new Chalk();
        ref3.setChalkId(3);
        ref3.setBrand("Crayola");
        ref3.setColor("Blue");
        ref3.setType("Colored Chalk");
        ref3.setPrice(25.0);
        ref3.setIsDustFree(true);
        ref3.setIsEcoFriendly(false);

        System.out.println("Chalk ID: " + ref3.getChalkId());
        System.out.println("Brand: " + ref3.getBrand());
        System.out.println("Color: " + ref3.getColor());
        System.out.println("Type: " + ref3.getType());
        System.out.println("Price: " + ref3.getPrice());
        System.out.println("Dust Free: " + ref3.getIsDustFree());
        System.out.println("Eco Friendly: " + ref3.getIsEcoFriendly());
        System.out.println();

        Chalk ref4 = new Chalk();
        ref4.setChalkId(4);
        ref4.setBrand("Apsara");
        ref4.setColor("Green");
        ref4.setType("Dustless Chalk");
        ref4.setPrice(18.0);
        ref4.setIsDustFree(true);
        ref4.setIsEcoFriendly(true);

        System.out.println("Chalk ID: " + ref4.getChalkId());
        System.out.println("Brand: " + ref4.getBrand());
        System.out.println("Color: " + ref4.getColor());
        System.out.println("Type: " + ref4.getType());
        System.out.println("Price: " + ref4.getPrice());
        System.out.println("Dust Free: " + ref4.getIsDustFree());
        System.out.println("Eco Friendly: " + ref4.getIsEcoFriendly());
        System.out.println();

        Chalk ref5 = new Chalk();
        ref5.setChalkId(5);
        ref5.setBrand("Nataraj");
        ref5.setColor("Pink");
        ref5.setType("Artist Chalk");
        ref5.setPrice(35.0);
        ref5.setIsDustFree(false);
        ref5.setIsEcoFriendly(false);

        System.out.println("Chalk ID: " + ref5.getChalkId());
        System.out.println("Brand: " + ref5.getBrand());
        System.out.println("Color: " + ref5.getColor());
        System.out.println("Type: " + ref5.getType());
        System.out.println("Price: " + ref5.getPrice());
        System.out.println("Dust Free: " + ref5.getIsDustFree());
        System.out.println("Eco Friendly: " + ref5.getIsEcoFriendly());
    }

}
