package com.xworkz.crops;

import com.xworkz.crops.crops.Crops;

public class CropsRunner {
    public static void main(String[] args) {
        Crops crop1 = new Crops();
        crop1.setCropId(1);
        crop1.setCropName("Wheat");
        crop1.setType("Cereal");
        crop1.setSeason("Rabi");
        crop1.setPricePerKg(25.5);
        crop1.setSoilType("Loamy");
        crop1.setRegion("Punjab");

        System.out.println("Crop ID: " + crop1.getCropId());
        System.out.println("Crop Name: " + crop1.getCropName());
        System.out.println("Type: " + crop1.getType());
        System.out.println("Season: " + crop1.getSeason());
        System.out.println("Price per Kg: " + crop1.getPricePerKg());
        System.out.println("Soil Type: " + crop1.getSoilType());
        System.out.println("Region: " + crop1.getRegion());

        Crops crop2 = new Crops();
        crop2.setCropId(2);
        crop2.setCropName("Rice");
        crop2.setType("Cereal");
        crop2.setSeason("Kharif");
        crop2.setPricePerKg(30.0);
        crop2.setSoilType("Clayey");
        crop2.setRegion("West Bengal");

        System.out.println("\nCrop ID: " + crop2.getCropId());
        System.out.println("Crop Name: " + crop2.getCropName());
        System.out.println("Type: " + crop2.getType());
        System.out.println("Season: " + crop2.getSeason());
        System.out.println("Price per Kg: " + crop2.getPricePerKg());
        System.out.println("Soil Type: " + crop2.getSoilType());
        System.out.println("Region: " + crop2.getRegion());

        Crops crop3 = new Crops();
        crop3.setCropId(3);
        crop3.setCropName("Cotton");
        crop3.setType("Fiber");
        crop3.setSeason("Kharif");
        crop3.setPricePerKg(60.0);
        crop3.setSoilType("Black Soil");
        crop3.setRegion("Maharashtra");

        System.out.println("\nCrop ID: " + crop3.getCropId());
        System.out.println("Crop Name: " + crop3.getCropName());
        System.out.println("Type: " + crop3.getType());
        System.out.println("Season: " + crop3.getSeason());
        System.out.println("Price per Kg: " + crop3.getPricePerKg());
        System.out.println("Soil Type: " + crop3.getSoilType());
        System.out.println("Region: " + crop3.getRegion());

        Crops crop4 = new Crops();
        crop4.setCropId(4);
        crop4.setCropName("Sugarcane");
        crop4.setType("Commercial");
        crop4.setSeason("Annual");
        crop4.setPricePerKg(3.0);
        crop4.setSoilType("Alluvial");
        crop4.setRegion("Uttar Pradesh");

        System.out.println("\nCrop ID: " + crop4.getCropId());
        System.out.println("Crop Name: " + crop4.getCropName());
        System.out.println("Type: " + crop4.getType());
        System.out.println("Season: " + crop4.getSeason());
        System.out.println("Price per Kg: " + crop4.getPricePerKg());
        System.out.println("Soil Type: " + crop4.getSoilType());
        System.out.println("Region: " + crop4.getRegion());

        Crops crop5 = new Crops();
        crop5.setCropId(5);
        crop5.setCropName("Groundnut");
        crop5.setType("Oilseed");
        crop5.setSeason("Kharif");
        crop5.setPricePerKg(50.0);
        crop5.setSoilType("Sandy");
        crop5.setRegion("Gujarat");

        System.out.println("\nCrop ID: " + crop5.getCropId());
        System.out.println("Crop Name: " + crop5.getCropName());
        System.out.println("Type: " + crop5.getType());
        System.out.println("Season: " + crop5.getSeason());
        System.out.println("Price per Kg: " + crop5.getPricePerKg());
        System.out.println("Soil Type: " + crop5.getSoilType());
        System.out.println("Region: " + crop5.getRegion());
    }

}
