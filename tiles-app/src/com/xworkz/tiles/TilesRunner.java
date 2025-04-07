package com.xworkz.tiles;

import com.xworkz.tiles.tiles.Tiles;

public class TilesRunner {
    public static void main(String[] args) {
        Tiles t1 = new Tiles();
        t1.setTileId(1);
        t1.setBrand("Kajaria");
        t1.setMaterial("Ceramic");
        t1.setColor("White");
        t1.setSize("2x2");
        t1.setPricePerBox(600.0);
        t1.setAntiSkid(true);

        System.out.println("Tile ID: " + t1.getTileId());
        System.out.println("Brand: " + t1.getBrand());
        System.out.println("Material: " + t1.getMaterial());
        System.out.println("Color: " + t1.getColor());
        System.out.println("Size: " + t1.getSize());
        System.out.println("Price per box: " + t1.getPricePerBox());
        System.out.println("Anti-skid: " + t1.isAntiSkid());

        Tiles t2 = new Tiles();
        t2.setTileId(2);
        t2.setBrand("Somany");
        t2.setMaterial("Vitrified");
        t2.setColor("Grey");
        t2.setSize("4x2");
        t2.setPricePerBox(750.0);
        t2.setAntiSkid(false);

        System.out.println("\nTile ID: " + t2.getTileId());
        System.out.println("Brand: " + t2.getBrand());
        System.out.println("Material: " + t2.getMaterial());
        System.out.println("Color: " + t2.getColor());
        System.out.println("Size: " + t2.getSize());
        System.out.println("Price per box: " + t2.getPricePerBox());
        System.out.println("Anti-skid: " + t2.isAntiSkid());

        Tiles t3 = new Tiles();
        t3.setTileId(3);
        t3.setBrand("Nitco");
        t3.setMaterial("Porcelain");
        t3.setColor("Beige");
        t3.setSize("3x3");
        t3.setPricePerBox(800.0);
        t3.setAntiSkid(true);

        System.out.println("\nTile ID: " + t3.getTileId());
        System.out.println("Brand: " + t3.getBrand());
        System.out.println("Material: " + t3.getMaterial());
        System.out.println("Color: " + t3.getColor());
        System.out.println("Size: " + t3.getSize());
        System.out.println("Price per box: " + t3.getPricePerBox());
        System.out.println("Anti-skid: " + t3.isAntiSkid());

        Tiles t4 = new Tiles();
        t4.setTileId(4);
        t4.setBrand("Simpolo");
        t4.setMaterial("Marble");
        t4.setColor("Black");
        t4.setSize("2x4");
        t4.setPricePerBox(1200.0);
        t4.setAntiSkid(false);

        System.out.println("\nTile ID: " + t4.getTileId());
        System.out.println("Brand: " + t4.getBrand());
        System.out.println("Material: " + t4.getMaterial());
        System.out.println("Color: " + t4.getColor());
        System.out.println("Size: " + t4.getSize());
        System.out.println("Price per box: " + t4.getPricePerBox());
        System.out.println("Anti-skid: " + t4.isAntiSkid());

        Tiles t5 = new Tiles();
        t5.setTileId(5);
        t5.setBrand("Johnson");
        t5.setMaterial("Granite");
        t5.setColor("Brown");
        t5.setSize("1x1");
        t5.setPricePerBox(500.0);
        t5.setAntiSkid(true);

        System.out.println("\nTile ID: " + t5.getTileId());
        System.out.println("Brand: " + t5.getBrand());
        System.out.println("Material: " + t5.getMaterial());
        System.out.println("Color: " + t5.getColor());
        System.out.println("Size: " + t5.getSize());
        System.out.println("Price per box: " + t5.getPricePerBox());
        System.out.println("Anti-skid: " + t5.isAntiSkid());
    }
}


