package com.xworkz.ladder;

import com.xworkz.ladder.ladder.Ladder;

public class LadderRunner {
    public static void main(String[] args) {
        Ladder ref1 = new Ladder();
        ref1.setLadderId(1);
        ref1.setBrand("AluminiumPro");
        ref1.setSteps(5);
        ref1.setHeight(6.5);
        ref1.setMaterial("Aluminum");
        ref1.setPrice(1500.0);
        ref1.setIsFoldable(true);

        System.out.println("Ladder ID: " + ref1.getLadderId());
        System.out.println("Brand: " + ref1.getBrand());
        System.out.println("Steps: " + ref1.getSteps());
        System.out.println("Height: " + ref1.getHeight());
        System.out.println("Material: " + ref1.getMaterial());
        System.out.println("Price: " + ref1.getPrice());
        System.out.println("Foldable: " + ref1.getIsFoldable());

        Ladder ref2 = new Ladder();
        ref2.setLadderId(2);
        ref2.setBrand("StepUp");
        ref2.setSteps(7);
        ref2.setHeight(8.0);
        ref2.setMaterial("Steel");
        ref2.setPrice(1800.0);
        ref2.setIsFoldable(false);

        System.out.println("\nLadder ID: " + ref2.getLadderId());
        System.out.println("Brand: " + ref2.getBrand());
        System.out.println("Steps: " + ref2.getSteps());
        System.out.println("Height: " + ref2.getHeight());
        System.out.println("Material: " + ref2.getMaterial());
        System.out.println("Price: " + ref2.getPrice());
        System.out.println("Foldable: " + ref2.getIsFoldable());

        Ladder ref3 = new Ladder();
        ref3.setLadderId(3);
        ref3.setBrand("HomeEase");
        ref3.setSteps(4);
        ref3.setHeight(5.0);
        ref3.setMaterial("Plastic");
        ref3.setPrice(1200.0);
        ref3.setIsFoldable(true);

        System.out.println("\nLadder ID: " + ref3.getLadderId());
        System.out.println("Brand: " + ref3.getBrand());
        System.out.println("Steps: " + ref3.getSteps());
        System.out.println("Height: " + ref3.getHeight());
        System.out.println("Material: " + ref3.getMaterial());
        System.out.println("Price: " + ref3.getPrice());
        System.out.println("Foldable: " + ref3.getIsFoldable());

        Ladder ref4 = new Ladder();
        ref4.setLadderId(4);
        ref4.setBrand("SafeClimb");
        ref4.setSteps(6);
        ref4.setHeight(7.5);
        ref4.setMaterial("Fiber");
        ref4.setPrice(1750.0);
        ref4.setIsFoldable(true);

        System.out.println("\nLadder ID: " + ref4.getLadderId());
        System.out.println("Brand: " + ref4.getBrand());
        System.out.println("Steps: " + ref4.getSteps());
        System.out.println("Height: " + ref4.getHeight());
        System.out.println("Material: " + ref4.getMaterial());
        System.out.println("Price: " + ref4.getPrice());
        System.out.println("Foldable: " + ref4.getIsFoldable());

        Ladder ref5 = new Ladder();
        ref5.setLadderId(5);
        ref5.setBrand("HeavyLift");
        ref5.setSteps(10);
        ref5.setHeight(12.0);
        ref5.setMaterial("Steel");
        ref5.setPrice(2200.0);
        ref5.setIsFoldable(false);

        System.out.println("\nLadder ID: " + ref5.getLadderId());
        System.out.println("Brand: " + ref5.getBrand());
        System.out.println("Steps: " + ref5.getSteps());
        System.out.println("Height: " + ref5.getHeight());
        System.out.println("Material: " + ref5.getMaterial());
        System.out.println("Price: " + ref5.getPrice());
        System.out.println("Foldable: " + ref5.getIsFoldable());
    }
}
