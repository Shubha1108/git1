package com.xworkz.mobilecase;

import com.xworkz.mobilecase.mobilecase.MobileCase;

public class MobileCaseRunner {
    public static void main(String[] args) {
        MobileCase case1 = new MobileCase();
        case1.setCaseId(1);
        case1.setBrand("Spigen");
        case1.setModelCompatible("iPhone 14");
        case1.setMaterial("TPU");
        case1.setColor("Black");
        case1.setPrice(1299.0);
        case1.setIsWaterResistant(true);

        System.out.println("Case ID: " + case1.getCaseId());
        System.out.println("Brand: " + case1.getBrand());
        System.out.println("Model: " + case1.getModelCompatible());
        System.out.println("Material: " + case1.getMaterial());
        System.out.println("Color: " + case1.getColor());
        System.out.println("Price: " + case1.getPrice());
        System.out.println("Water Resistant: " + case1.getIsWaterResistant());

        MobileCase case2 = new MobileCase();
        case2.setCaseId(2);
        case2.setBrand("Caseology");
        case2.setModelCompatible("Samsung S22");
        case2.setMaterial("Silicone");
        case2.setColor("Blue");
        case2.setPrice(999.0);
        case2.setIsWaterResistant(false);

        System.out.println("\nCase ID: " + case2.getCaseId());
        System.out.println("Brand: " + case2.getBrand());
        System.out.println("Model: " + case2.getModelCompatible());
        System.out.println("Material: " + case2.getMaterial());
        System.out.println("Color: " + case2.getColor());
        System.out.println("Price: " + case2.getPrice());
        System.out.println("Water Resistant: " + case2.getIsWaterResistant());

        MobileCase case3 = new MobileCase();
        case3.setCaseId(3);
        case3.setBrand("OtterBox");
        case3.setModelCompatible("Pixel 7");
        case3.setMaterial("Polycarbonate");
        case3.setColor("Gray");
        case3.setPrice(1799.0);
        case3.setIsWaterResistant(true);

        System.out.println("\nCase ID: " + case3.getCaseId());
        System.out.println("Brand: " + case3.getBrand());
        System.out.println("Model: " + case3.getModelCompatible());
        System.out.println("Material: " + case3.getMaterial());
        System.out.println("Color: " + case3.getColor());
        System.out.println("Price: " + case3.getPrice());
        System.out.println("Water Resistant: " + case3.getIsWaterResistant());

        MobileCase case4 = new MobileCase();
        case4.setCaseId(4);
        case4.setBrand("Ringke");
        case4.setModelCompatible("OnePlus 11");
        case4.setMaterial("Hybrid");
        case4.setColor("Transparent");
        case4.setPrice(899.0);
        case4.setIsWaterResistant(false);

        System.out.println("\nCase ID: " + case4.getCaseId());
        System.out.println("Brand: " + case4.getBrand());
        System.out.println("Model: " + case4.getModelCompatible());
        System.out.println("Material: " + case4.getMaterial());
        System.out.println("Color: " + case4.getColor());
        System.out.println("Price: " + case4.getPrice());
        System.out.println("Water Resistant: " + case4.getIsWaterResistant());

        MobileCase case5 = new MobileCase();
        case5.setCaseId(5);
        case5.setBrand("Spigen");
        case5.setModelCompatible("iPhone 13");
        case5.setMaterial("Leather");
        case5.setColor("Brown");
        case5.setPrice(1599.0);
        case5.setIsWaterResistant(true);

        System.out.println("\nCase ID: " + case5.getCaseId());
        System.out.println("Brand: " + case5.getBrand());
        System.out.println("Model: " + case5.getModelCompatible());
        System.out.println("Material: " + case5.getMaterial());
        System.out.println("Color: " + case5.getColor());
        System.out.println("Price: " + case5.getPrice());
        System.out.println("Water Resistant: " + case5.getIsWaterResistant());
    }
}
