package com.xworkz.mattress.mattress;

public class Mattress {
    private int mattressId;
    private String brand;
    private String size;
    private String material;
    private double price;
    private boolean isReversible;
    private int warrantyYears;

    public void setMattressId(int mattressId) {
        this.mattressId = mattressId;
    }

    public int getMattressId() {
        return mattressId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setIsReversible(boolean isReversible) {
        this.isReversible = isReversible;
    }

    public boolean getIsReversible() {
        return isReversible;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }
}
