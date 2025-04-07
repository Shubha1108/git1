package com.xworkz.mattress;

import com.xworkz.mattress.mattress.Mattress;

public class MattressRunner {
    public static void main(String[] args) {
        Mattress ref1 = new Mattress();
        ref1.setMattressId(1);
        ref1.setBrand("Sleepwell");
        ref1.setSize("Queen");
        ref1.setMaterial("Memory Foam");
        ref1.setPrice(15000.0);
        ref1.setIsReversible(true);
        ref1.setWarrantyYears(10);

        System.out.println("Mattress ID: " + ref1.getMattressId());
        System.out.println("Brand: " + ref1.getBrand());
        System.out.println("Size: " + ref1.getSize());
        System.out.println("Material: " + ref1.getMaterial());
        System.out.println("Price: " + ref1.getPrice());
        System.out.println("Reversible: " + ref1.getIsReversible());
        System.out.println("Warranty (years): " + ref1.getWarrantyYears());

        Mattress ref2 = new Mattress();
        ref2.setMattressId(2);
        ref2.setBrand("Wakefit");
        ref2.setSize("King");
        ref2.setMaterial("Orthopedic Foam");
        ref2.setPrice(18000.0);
        ref2.setIsReversible(false);
        ref2.setWarrantyYears(7);

        System.out.println("\nMattress ID: " + ref2.getMattressId());
        System.out.println("Brand: " + ref2.getBrand());
        System.out.println("Size: " + ref2.getSize());
        System.out.println("Material: " + ref2.getMaterial());
        System.out.println("Price: " + ref2.getPrice());
        System.out.println("Reversible: " + ref2.getIsReversible());
        System.out.println("Warranty (years): " + ref2.getWarrantyYears());

        Mattress ref3 = new Mattress();
        ref3.setMattressId(3);
        ref3.setBrand("Kurlon");
        ref3.setSize("Single");
        ref3.setMaterial("Coir");
        ref3.setPrice(9000.0);
        ref3.setIsReversible(true);
        ref3.setWarrantyYears(5);

        System.out.println("\nMattress ID: " + ref3.getMattressId());
        System.out.println("Brand: " + ref3.getBrand());
        System.out.println("Size: " + ref3.getSize());
        System.out.println("Material: " + ref3.getMaterial());
        System.out.println("Price: " + ref3.getPrice());
        System.out.println("Reversible: " + ref3.getIsReversible());
        System.out.println("Warranty (years): " + ref3.getWarrantyYears());

        Mattress ref4 = new Mattress();
        ref4.setMattressId(4);
        ref4.setBrand("Duroflex");
        ref4.setSize("Double");
        ref4.setMaterial("Spring");
        ref4.setPrice(12000.0);
        ref4.setIsReversible(false);
        ref4.setWarrantyYears(6);

        System.out.println("\nMattress ID: " + ref4.getMattressId());
        System.out.println("Brand: " + ref4.getBrand());
        System.out.println("Size: " + ref4.getSize());
        System.out.println("Material: " + ref4.getMaterial());
        System.out.println("Price: " + ref4.getPrice());
        System.out.println("Reversible: " + ref4.getIsReversible());
        System.out.println("Warranty (years): " + ref4.getWarrantyYears());

        Mattress ref5 = new Mattress();
        ref5.setMattressId(5);
        ref5.setBrand("Flo");
        ref5.setSize("Queen");
        ref5.setMaterial("Gel Memory Foam");
        ref5.setPrice(16000.0);
        ref5.setIsReversible(true);
        ref5.setWarrantyYears(10);

        System.out.println("\nMattress ID: " + ref5.getMattressId());
        System.out.println("Brand: " + ref5.getBrand());
        System.out.println("Size: " + ref5.getSize());
        System.out.println("Material: " + ref5.getMaterial());
        System.out.println("Price: " + ref5.getPrice());
        System.out.println("Reversible: " + ref5.getIsReversible());
        System.out.println("Warranty (years): " + ref5.getWarrantyYears());
    }
}
