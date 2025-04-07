package com.xworkz.marker.marker;

public class Marker {
    private int markerId;
    private String brand;
    private String color;
    private String type;
    private double price;
    private boolean isRefillable;
    private String tipType;

    public void setMarkerId(int markerId) {
        this.markerId = markerId;
    }

    public int getMarkerId() {
        return markerId;
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

    public void setRefillable(boolean isRefillable) {
        this.isRefillable = isRefillable;
    }

    public boolean isRefillable() {
        return isRefillable;
    }

    public void setTipType(String tipType) {
        this.tipType = tipType;
    }

    public String getTipType() {
        return tipType;
    }
}
