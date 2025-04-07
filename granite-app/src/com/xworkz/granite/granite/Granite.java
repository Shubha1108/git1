package com.xworkz.granite.granite;

public class Granite {
    private int graniteId;
    private String brand;
    private String color;
    private String texture;
    private double pricePerSqFt;
    private String origin;
    private boolean isPolished;

    public void setGraniteId(int graniteId) {
        this.graniteId = graniteId;
    }

    public int getGraniteId() {
        return graniteId;
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

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    public void setPricePerSqFt(double pricePerSqFt) {
        this.pricePerSqFt = pricePerSqFt;
    }

    public double getPricePerSqFt() {
        return pricePerSqFt;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setPolished(boolean isPolished) {
        this.isPolished = isPolished;
    }

    public boolean isPolished() {
        return isPolished;
    }
}
