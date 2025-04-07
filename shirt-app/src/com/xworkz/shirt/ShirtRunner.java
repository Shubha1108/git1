package com.xworkz.shirt;

import com.xworkz.shirt.shirt.Shirt;

public class ShirtRunner {
    public static void main(String[] args) {
        Shirt ref1 = new Shirt();
        ref1.setShirtId(101);
        ref1.setBrand("Arrow");
        ref1.setSize("M");
        ref1.setColor("Blue");
        ref1.setType("Formal");
        ref1.setPrice(1200.0);
        ref1.setFullSleeve(true);

        System.out.println("Shirt ID: " + ref1.getShirtId());
        System.out.println("Brand: " + ref1.getBrand());
        System.out.println("Size: " + ref1.getSize());
        System.out.println("Color: " + ref1.getColor());
        System.out.println("Type: " + ref1.getType());
        System.out.println("Price: " + ref1.getPrice());
        System.out.println("Full Sleeve: " + ref1.isFullSleeve());

        Shirt ref2 = new Shirt();
        ref2.setShirtId(102);
        ref2.setBrand("Van Heusen");
        ref2.setSize("L");
        ref2.setColor("White");
        ref2.setType("Casual");
        ref2.setPrice(1000.0);
        ref2.setFullSleeve(false);

        System.out.println("\nShirt ID: " + ref2.getShirtId());
        System.out.println("Brand: " + ref2.getBrand());
        System.out.println("Size: " + ref2.getSize());
        System.out.println("Color: " + ref2.getColor());
        System.out.println("Type: " + ref2.getType());
        System.out.println("Price: " + ref2.getPrice());
        System.out.println("Full Sleeve: " + ref2.isFullSleeve());

        Shirt ref3 = new Shirt();
        ref3.setShirtId(103);
        ref3.setBrand("Peter England");
        ref3.setSize("S");
        ref3.setColor("Black");
        ref3.setType("Party Wear");
        ref3.setPrice(1500.0);
        ref3.setFullSleeve(true);

        System.out.println("\nShirt ID: " + ref3.getShirtId());
        System.out.println("Brand: " + ref3.getBrand());
        System.out.println("Size: " + ref3.getSize());
        System.out.println("Color: " + ref3.getColor());
        System.out.println("Type: " + ref3.getType());
        System.out.println("Price: " + ref3.getPrice());
        System.out.println("Full Sleeve: " + ref3.isFullSleeve());

        Shirt ref4 = new Shirt();
        ref4.setShirtId(104);
        ref4.setBrand("Zara");
        ref4.setSize("XL");
        ref4.setColor("Grey");
        ref4.setType("Formal");
        ref4.setPrice(1800.0);
        ref4.setFullSleeve(false);

        System.out.println("\nShirt ID: " + ref4.getShirtId());
        System.out.println("Brand: " + ref4.getBrand());
        System.out.println("Size: " + ref4.getSize());
        System.out.println("Color: " + ref4.getColor());
        System.out.println("Type: " + ref4.getType());
        System.out.println("Price: " + ref4.getPrice());
        System.out.println("Full Sleeve: " + ref4.isFullSleeve());

        Shirt ref5 = new Shirt();
        ref5.setShirtId(105);
        ref5.setBrand("H&M");
        ref5.setSize("M");
        ref5.setColor("Maroon");
        ref5.setType("Casual");
        ref5.setPrice(1300.0);
        ref5.setFullSleeve(true);

        System.out.println("\nShirt ID: " + ref5.getShirtId());
        System.out.println("Brand: " + ref5.getBrand());
        System.out.println("Size: " + ref5.getSize());
        System.out.println("Color: " + ref5.getColor());
        System.out.println("Type: " + ref5.getType());
        System.out.println("Price: " + ref5.getPrice());
        System.out.println("Full Sleeve: " + ref5.isFullSleeve());
    }
}

