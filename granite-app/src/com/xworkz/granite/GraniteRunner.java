package com.xworkz.granite;

import com.xworkz.granite.granite.Granite;

public class GraniteRunner {
    public static void main(String[] args) {
        Granite g1 = new Granite();
        g1.setGraniteId(1);
        g1.setBrand("Classic Granite");
        g1.setColor("Black Galaxy");
        g1.setTexture("Glossy");
        g1.setPricePerSqFt(120.0);
        g1.setOrigin("India");
        g1.setPolished(true);

        System.out.println("Granite ID: " + g1.getGraniteId());
        System.out.println("Brand: " + g1.getBrand());
        System.out.println("Color: " + g1.getColor());
        System.out.println("Texture: " + g1.getTexture());
        System.out.println("Price per SqFt: " + g1.getPricePerSqFt());
        System.out.println("Origin: " + g1.getOrigin());
        System.out.println("Polished: " + g1.isPolished());

        Granite g2 = new Granite();
        g2.setGraniteId(2);
        g2.setBrand("Royal Stones");
        g2.setColor("Steel Grey");
        g2.setTexture("Matte");
        g2.setPricePerSqFt(95.0);
        g2.setOrigin("India");
        g2.setPolished(false);

        System.out.println("\nGranite ID: " + g2.getGraniteId());
        System.out.println("Brand: " + g2.getBrand());
        System.out.println("Color: " + g2.getColor());
        System.out.println("Texture: " + g2.getTexture());
        System.out.println("Price per SqFt: " + g2.getPricePerSqFt());
        System.out.println("Origin: " + g2.getOrigin());
        System.out.println("Polished: " + g2.isPolished());

        Granite g3 = new Granite();
        g3.setGraniteId(3);
        g3.setBrand("StoneHub");
        g3.setColor("White Pearl");
        g3.setTexture("Rough");
        g3.setPricePerSqFt(130.0);
        g3.setOrigin("Brazil");
        g3.setPolished(true);

        System.out.println("\nGranite ID: " + g3.getGraniteId());
        System.out.println("Brand: " + g3.getBrand());
        System.out.println("Color: " + g3.getColor());
        System.out.println("Texture: " + g3.getTexture());
        System.out.println("Price per SqFt: " + g3.getPricePerSqFt());
        System.out.println("Origin: " + g3.getOrigin());
        System.out.println("Polished: " + g3.isPolished());

        Granite g4 = new Granite();
        g4.setGraniteId(4);
        g4.setBrand("Granite World");
        g4.setColor("Red Multicolor");
        g4.setTexture("Glossy");
        g4.setPricePerSqFt(110.0);
        g4.setOrigin("South Africa");
        g4.setPolished(true);

        System.out.println("\nGranite ID: " + g4.getGraniteId());
        System.out.println("Brand: " + g4.getBrand());
        System.out.println("Color: " + g4.getColor());
        System.out.println("Texture: " + g4.getTexture());
        System.out.println("Price per SqFt: " + g4.getPricePerSqFt());
        System.out.println("Origin: " + g4.getOrigin());
        System.out.println("Polished: " + g4.isPolished());

        Granite g5 = new Granite();
        g5.setGraniteId(5);
        g5.setBrand("MarbleCraft");
        g5.setColor("Tan Brown");
        g5.setTexture("Textured");
        g5.setPricePerSqFt(105.0);
        g5.setOrigin("India");
        g5.setPolished(false);

        System.out.println("\nGranite ID: " + g5.getGraniteId());
        System.out.println("Brand: " + g5.getBrand());
        System.out.println("Color: " + g5.getColor());
        System.out.println("Texture: " + g5.getTexture());
        System.out.println("Price per SqFt: " + g5.getPricePerSqFt());
        System.out.println("Origin: " + g5.getOrigin());
        System.out.println("Polished: " + g5.isPolished());
    }

}
