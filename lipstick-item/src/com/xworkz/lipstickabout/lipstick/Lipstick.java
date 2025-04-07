package com.xworkz.lipstickabout.lipstick;

public class Lipstick {
    private int lipstickId;
    private String brand;
    private String shade;
    private String type;
    private double price;

    public void setLipstickId(int lipstickId){
        this.lipstickId=lipstickId;

    }
    public int getLipstickId(){
        return lipstickId;
    }
    public void setBrand(String lipstickId){
        this.brand=brand;
    }
    public String  getBrand(){
        return brand;

    }
    public void setShade(String shade){
        this.shade=shade;
    }
    public String getShade(){
        return shade;
    }
    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }


}
