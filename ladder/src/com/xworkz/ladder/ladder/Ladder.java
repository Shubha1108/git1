package com.xworkz.ladder.ladder;

public class Ladder {
    private int ladderId;
    private String brand;
    private int steps;
    private double height;
    private String material;
    private double price;
    private boolean isFoldable;

    public void setLadderId(int ladderId) {
        this.ladderId = ladderId;
    }

    public int getLadderId() {
        return ladderId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
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

    public void setIsFoldable(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

    public boolean getIsFoldable() {
        return isFoldable;
    }
}

