package com.xworkz.steel;

import com.xworkz.steel.steel.Steel;

public class SteelRunner {
    public static void main(String[] args) {
        Steel steel1 = new Steel();
        steel1.setSteelId(101);
        steel1.setBrand("Tata Steel");
        steel1.setGrade("A1");
        steel1.setType("Rebar");
        steel1.setWeight(500.0);
        steel1.setPrice(45000.0);
        steel1.setOrigin("India");

        System.out.println("Steel ID: " + steel1.getSteelId());
        System.out.println("Brand: " + steel1.getBrand());
        System.out.println("Grade: " + steel1.getGrade());
        System.out.println("Type: " + steel1.getType());
        System.out.println("Weight: " + steel1.getWeight());
        System.out.println("Price: " + steel1.getPrice());
        System.out.println("Origin: " + steel1.getOrigin());
        System.out.println("-----------------------------");

        Steel steel2 = new Steel();
        steel2.setSteelId(102);
        steel2.setBrand("JSW Steel");
        steel2.setGrade("B2");
        steel2.setType("Structural");
        steel2.setWeight(350.0);
        steel2.setPrice(37000.0);
        steel2.setOrigin("India");

        System.out.println("Steel ID: " + steel2.getSteelId());
        System.out.println("Brand: " + steel2.getBrand());
        System.out.println("Grade: " + steel2.getGrade());
        System.out.println("Type: " + steel2.getType());
        System.out.println("Weight: " + steel2.getWeight());
        System.out.println("Price: " + steel2.getPrice());
        System.out.println("Origin: " + steel2.getOrigin());
        System.out.println("-----------------------------");

        Steel steel3 = new Steel();
        steel3.setSteelId(103);
        steel3.setBrand("POSCO");
        steel3.setGrade("C3");
        steel3.setType("Cold Rolled");
        steel3.setWeight(250.0);
        steel3.setPrice(41000.0);
        steel3.setOrigin("South Korea");

        System.out.println("Steel ID: " + steel3.getSteelId());
        System.out.println("Brand: " + steel3.getBrand());
        System.out.println("Grade: " + steel3.getGrade());
        System.out.println("Type: " + steel3.getType());
        System.out.println("Weight: " + steel3.getWeight());
        System.out.println("Price: " + steel3.getPrice());
        System.out.println("Origin: " + steel3.getOrigin());
        System.out.println("-----------------------------");

        Steel steel4 = new Steel();
        steel4.setSteelId(104);
        steel4.setBrand("ArcelorMittal");
        steel4.setGrade("D4");
        steel4.setType("Hot Rolled");
        steel4.setWeight(600.0);
        steel4.setPrice(48000.0);
        steel4.setOrigin("Luxembourg");

        System.out.println("Steel ID: " + steel4.getSteelId());
        System.out.println("Brand: " + steel4.getBrand());
        System.out.println("Grade: " + steel4.getGrade());
        System.out.println("Type: " + steel4.getType());
        System.out.println("Weight: " + steel4.getWeight());
        System.out.println("Price: " + steel4.getPrice());
        System.out.println("Origin: " + steel4.getOrigin());
        System.out.println("-----------------------------");

        Steel steel5 = new Steel();
        steel5.setSteelId(105);
        steel5.setBrand("Nippon Steel");
        steel5.setGrade("E5");
        steel5.setType("Alloy Steel");
        steel5.setWeight(450.0);
        steel5.setPrice(46000.0);
        steel5.setOrigin("Japan");

        System.out.println("Steel ID: " + steel5.getSteelId());
        System.out.println("Brand: " + steel5.getBrand());
        System.out.println("Grade: " + steel5.getGrade());
        System.out.println("Type: " + steel5.getType());
        System.out.println("Weight: " + steel5.getWeight());
        System.out.println("Price: " + steel5.getPrice());
        System.out.println("Origin: " + steel5.getOrigin());
    }
}
