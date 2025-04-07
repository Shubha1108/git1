package com.xworkz.watertank;

import com.xworkz.watertank.tank.WaterTank;

public class WaterTankRunner {
    public static void main(String[] args) {
        WaterTank tank1 = new WaterTank();
        tank1.setTankId(1);
        tank1.setBrand("Sintex");
        tank1.setCapacity(1000);
        tank1.setColor("Black");
        tank1.setMaterial("Plastic");
        tank1.setPrice(4500.0);
        tank1.setInsulated(true);

        System.out.println("Tank ID: " + tank1.getTankId());
        System.out.println("Brand: " + tank1.getBrand());
        System.out.println("Capacity: " + tank1.getCapacity() + " liters");
        System.out.println("Color: " + tank1.getColor());
        System.out.println("Material: " + tank1.getMaterial());
        System.out.println("Price: " + tank1.getPrice());
        System.out.println("Insulated: " + tank1.isInsulated());

        WaterTank tank2 = new WaterTank();
        tank2.setTankId(2);
        tank2.setBrand("Plasto");
        tank2.setCapacity(500);
        tank2.setColor("White");
        tank2.setMaterial("HDPE");
        tank2.setPrice(3000.0);
        tank2.setInsulated(false);

        System.out.println("\nTank ID: " + tank2.getTankId());
        System.out.println("Brand: " + tank2.getBrand());
        System.out.println("Capacity: " + tank2.getCapacity() + " liters");
        System.out.println("Color: " + tank2.getColor());
        System.out.println("Material: " + tank2.getMaterial());
        System.out.println("Price: " + tank2.getPrice());
        System.out.println("Insulated: " + tank2.isInsulated());

        WaterTank tank3 = new WaterTank();
        tank3.setTankId(3);
        tank3.setBrand("Ashirvad");
        tank3.setCapacity(2000);
        tank3.setColor("Blue");
        tank3.setMaterial("PVC");
        tank3.setPrice(6500.0);
        tank3.setInsulated(true);

        System.out.println("\nTank ID: " + tank3.getTankId());
        System.out.println("Brand: " + tank3.getBrand());
        System.out.println("Capacity: " + tank3.getCapacity() + " liters");
        System.out.println("Color: " + tank3.getColor());
        System.out.println("Material: " + tank3.getMaterial());
        System.out.println("Price: " + tank3.getPrice());
        System.out.println("Insulated: " + tank3.isInsulated());

        WaterTank tank4 = new WaterTank();
        tank4.setTankId(4);
        tank4.setBrand("Vectus");
        tank4.setCapacity(750);
        tank4.setColor("Green");
        tank4.setMaterial("Plastic");
        tank4.setPrice(3800.0);
        tank4.setInsulated(false);

        System.out.println("\nTank ID: " + tank4.getTankId());
        System.out.println("Brand: " + tank4.getBrand());
        System.out.println("Capacity: " + tank4.getCapacity() + " liters");
        System.out.println("Color: " + tank4.getColor());
        System.out.println("Material: " + tank4.getMaterial());
        System.out.println("Price: " + tank4.getPrice());
        System.out.println("Insulated: " + tank4.isInsulated());

        WaterTank tank5 = new WaterTank();
        tank5.setTankId(5);
        tank5.setBrand("Storewel");
        tank5.setCapacity(1500);
        tank5.setColor("Yellow");
        tank5.setMaterial("LLDPE");
        tank5.setPrice(5800.0);
        tank5.setInsulated(true);

        System.out.println("\nTank ID: " + tank5.getTankId());
        System.out.println("Brand: " + tank5.getBrand());
        System.out.println("Capacity: " + tank5.getCapacity() + " liters");
        System.out.println("Color: " + tank5.getColor());
        System.out.println("Material: " + tank5.getMaterial());
        System.out.println("Price: " + tank5.getPrice());
        System.out.println("Insulated: " + tank5.isInsulated());
    }

}
