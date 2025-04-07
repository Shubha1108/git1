package com.xworkz.mobilecase.mobilecase;

public class MobileCase {
    private int caseId;
    private String brand;
    private String modelCompatible;
    private String material;
    private String color;
    private double price;
    private boolean isWaterResistant;

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModelCompatible(String modelCompatible) {
        this.modelCompatible = modelCompatible;
    }

    public String getModelCompatible() {
        return modelCompatible;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setIsWaterResistant(boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
    }

    public boolean getIsWaterResistant() {
        return isWaterResistant;
    }
}

