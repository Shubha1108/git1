package com.xworkz.chalk.chalk;

public class Chalk {
    private int chalkId;
    private String brand;
    private String color;
    private String type;
    private double price;
    private boolean isDustFree;
    private boolean isEcoFriendly;

    public void setChalkId(int chalkId) {
        this.chalkId = chalkId;
    }

    public int getChalkId() {
        return chalkId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setIsDustFree(boolean isDustFree) {
        this.isDustFree = isDustFree;
    }

    public boolean getIsDustFree() {
        return isDustFree;
    }

    public void setIsEcoFriendly(boolean isEcoFriendly) {
        this.isEcoFriendly = isEcoFriendly;
    }

    public boolean getIsEcoFriendly() {
        return isEcoFriendly;
    }
}

