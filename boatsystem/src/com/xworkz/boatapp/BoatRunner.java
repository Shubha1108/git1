package com.xworkz.boatapp;

import com.xworkz.boatapp.boat.Boat;

public class BoatRunner {
    public static void main(String[] args) {
        System.out.println("main method started");
        Boat ref=new Boat();
        ref.setBoatId(1);
        ref.setBoatName("BOAT");
        ref.setBoatOwner("Shubha");
        ref.setBoatType("sailing boat");

        System.out.println("boat id is "+ref.getBoatId());
        System.out.println("boat name is "+ref.getBoatName());
        System.out.println("boat owner is "+ref.getBoatOwner());
        System.out.println("boat type is "+ref.getBoatType());
        System.out.println("main method ended");

        Boat ref1=new Boat();
        ref1.setBoatId(2);
        ref1.setBoatName("BOAT 1.0");
        ref1.setBoatOwner("Shashank");
        ref1.setBoatType("motor boat");

        int boatId=ref1.getBoatId();
        String boatName=ref1.getBoatName();
        String boatOwner=ref1.getBoatOwner();
        String boatType=ref1.getBoatType();

        System.out.println("boat id is "+boatId);
        System.out.println("boat name is "+boatName);
        System.out.println("boat owner is "+boatOwner);
        System.out.println("boat type is "+boatType);




    }
}
