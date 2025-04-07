package com.xworkz.buttermilk;

import com.xworkz.buttermilk.buttermilk.ButtermilkTank;

public class ButtermilkTankRunner {
    public static void main(String[] args) {
        ButtermilkTank ref1 = new ButtermilkTank();
        ref1.setTankId(1);
        ref1.setBrand("DairyFresh");
        ref1.setCapacity(100.0);
        ref1.setColor("White");
        ref1.setMaterial("Stainless Steel");
        ref1.setPrice(7500.0);
        ref1.setPortable(true);

        System.out.println("Tank ID: " + ref1.getTankId());
        System.out.println("Brand: " + ref1.getBrand());
        System.out.println("Capacity: " + ref1.getCapacity() + " liters");
        System.out.println("Color: " + ref1.getColor());
        System.out.println("Material: " + ref1.getMaterial());
        System.out.println("Price: " + ref1.getPrice());
        System.out.println("Portable: " + ref1.isPortable());

        ButtermilkTank ref2 = new ButtermilkTank();
        ref2.setTankId(2);
        ref2.setBrand("CoolTanks");
        ref2.setCapacity(200.0);
        ref2.setColor("Silver");
        ref2.setMaterial("Aluminum");
        ref2.setPrice(9500.0);
        ref2.setPortable(false);

        System.out.println("\nTank ID: " + ref2.getTankId());
        System.out.println("Brand: " + ref2.getBrand());
        System.out.println("Capacity: " + ref2.getCapacity() + " liters");
        System.out.println("Color: " + ref2.getColor());
        System.out.println("Material: " + ref2.getMaterial());
        System.out.println("Price: " + ref2.getPrice());
        System.out.println("Portable: " + ref2.isPortable());

        ButtermilkTank ref3 = new ButtermilkTank();
        ref3.setTankId(3);
        ref3.setBrand("MilkoTech");
        ref3.setCapacity(150.0);
        ref3.setColor("Blue");
        ref3.setMaterial("Plastic");
        ref3.setPrice(6800.0);
        ref3.setPortable(true);

        System.out.println("\nTank ID: " + ref3.getTankId());
        System.out.println("Brand: " + ref3.getBrand());
        System.out.println("Capacity: " + ref3.getCapacity() + " liters");
        System.out.println("Color: " + ref3.getColor());
        System.out.println("Material: " + ref3.getMaterial());
        System.out.println("Price: " + ref3.getPrice());
        System.out.println("Portable: " + ref3.isPortable());

        ButtermilkTank ref4 = new ButtermilkTank();
        ref4.setTankId(4);
        ref4.setBrand("ChillServe");
        ref4.setCapacity(300.0);
        ref4.setColor("Grey");
        ref4.setMaterial("Fiber");
        ref4.setPrice(12000.0);
        ref4.setPortable(false);

        System.out.println("\nTank ID: " + ref4.getTankId());
        System.out.println("Brand: " + ref4.getBrand());
        System.out.println("Capacity: " + ref4.getCapacity() + " liters");
        System.out.println("Color: " + ref4.getColor());
        System.out.println("Material: " + ref4.getMaterial());
        System.out.println("Price: " + ref4.getPrice());
        System.out.println("Portable: " + ref4.isPortable());

        ButtermilkTank ref5 = new ButtermilkTank();
        ref5.setTankId(5);
        ref5.setBrand("TankPro");
        ref5.setCapacity(250.0);
        ref5.setColor("Black");
        ref5.setMaterial("Polycarbonate");
        ref5.setPrice(11000.0);
        ref5.setPortable(true);

        System.out.println("\nTank ID: " + ref5.getTankId());
        System.out.println("Brand: " + ref5.getBrand());
        System.out.println("Capacity: " + ref5.getCapacity() + " liters");
        System.out.println("Color: " + ref5.getColor());
        System.out.println("Material: " + ref5.getMaterial());
        System.out.println("Price: " + ref5.getPrice());
        System.out.println("Portable: " + ref5.isPortable());
    }

}
