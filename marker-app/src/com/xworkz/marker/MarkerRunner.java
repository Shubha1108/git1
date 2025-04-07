package com.xworkz.marker;

import com.xworkz.marker.marker.Marker;

public class MarkerRunner {
    public static void main(String[] args) {
        Marker m1 = new Marker();
        m1.setMarkerId(1);
        m1.setBrand("Camlin");
        m1.setColor("Black");
        m1.setType("Permanent");
        m1.setPrice(25.0);
        m1.setRefillable(true);
        m1.setTipType("Bullet");

        System.out.println("Marker ID: " + m1.getMarkerId());
        System.out.println("Brand: " + m1.getBrand());
        System.out.println("Color: " + m1.getColor());
        System.out.println("Type: " + m1.getType());
        System.out.println("Price: " + m1.getPrice());
        System.out.println("Refillable: " + m1.isRefillable());
        System.out.println("Tip Type: " + m1.getTipType());

        Marker m2 = new Marker();
        m2.setMarkerId(2);
        m2.setBrand("Faber-Castell");
        m2.setColor("Blue");
        m2.setType("Whiteboard");
        m2.setPrice(30.0);
        m2.setRefillable(false);
        m2.setTipType("Chisel");

        System.out.println("\nMarker ID: " + m2.getMarkerId());
        System.out.println("Brand: " + m2.getBrand());
        System.out.println("Color: " + m2.getColor());
        System.out.println("Type: " + m2.getType());
        System.out.println("Price: " + m2.getPrice());
        System.out.println("Refillable: " + m2.isRefillable());
        System.out.println("Tip Type: " + m2.getTipType());

        Marker m3 = new Marker();
        m3.setMarkerId(3);
        m3.setBrand("Luxor");
        m3.setColor("Red");
        m3.setType("Permanent");
        m3.setPrice(20.0);
        m3.setRefillable(true);
        m3.setTipType("Fine");

        System.out.println("\nMarker ID: " + m3.getMarkerId());
        System.out.println("Brand: " + m3.getBrand());
        System.out.println("Color: " + m3.getColor());
        System.out.println("Type: " + m3.getType());
        System.out.println("Price: " + m3.getPrice());
        System.out.println("Refillable: " + m3.isRefillable());
        System.out.println("Tip Type: " + m3.getTipType());

        Marker m4 = new Marker();
        m4.setMarkerId(4);
        m4.setBrand("Sharpie");
        m4.setColor("Green");
        m4.setType("Highlighter");
        m4.setPrice(35.0);
        m4.setRefillable(false);
        m4.setTipType("Slanted");

        System.out.println("\nMarker ID: " + m4.getMarkerId());
        System.out.println("Brand: " + m4.getBrand());
        System.out.println("Color: " + m4.getColor());
        System.out.println("Type: " + m4.getType());
        System.out.println("Price: " + m4.getPrice());
        System.out.println("Refillable: " + m4.isRefillable());
        System.out.println("Tip Type: " + m4.getTipType());

        Marker m5 = new Marker();
        m5.setMarkerId(5);
        m5.setBrand("Cello");
        m5.setColor("Orange");
        m5.setType("Sketch");
        m5.setPrice(15.0);
        m5.setRefillable(true);
        m5.setTipType("Brush");

        System.out.println("\nMarker ID: " + m5.getMarkerId());
        System.out.println("Brand: " + m5.getBrand());
        System.out.println("Color: " + m5.getColor());
        System.out.println("Type: " + m5.getType());
        System.out.println("Price: " + m5.getPrice());
        System.out.println("Refillable: " + m5.isRefillable());
        System.out.println("Tip Type: " + m5.getTipType());
    }

}
