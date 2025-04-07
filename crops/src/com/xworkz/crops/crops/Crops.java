package com.xworkz.crops.crops;

public class Crops {
    private int cropId;
    private String cropName;
    private String type;
    private String season;
    private double pricePerKg;
    private String soilType;
    private String region;

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public int getCropId() {
        return cropId;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCropName() {
        return cropName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
