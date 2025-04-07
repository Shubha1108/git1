package com.xworkz.shirt.shirt;

public class Shirt {
    private int shirtId;
    private String brand;
    private String size;
    private String color;
    private String type;
    private double price;
    private boolean isFullSleeve;

    public void setShirtId(int shirtId){
        this.shirtId = shirtId;
    }
    public int getShirtId(){
        return shirtId;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void setFullSleeve(boolean isFullSleeve){
        this.isFullSleeve = isFullSleeve;
    }
    public boolean isFullSleeve(){
        return isFullSleeve;
    }
}
