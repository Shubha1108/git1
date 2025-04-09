package com.xworkz.zudio;

import com.xworkz.zudio.zudioapp.ZudioApp;
import com.xworkz.zudio.zudiodto.ZudioDto;

public class ZudioRunner {

    public static void main(String[] args) {
        ZudioDto zudioDto = new ZudioDto();
        zudioDto.setFullName("Shubha");
        zudioDto.setMobileNumber("9876543210");
        zudioDto.setEmail("shubha@gmail.com");
        zudioDto.setPassword("shubha11@123");
        zudioDto.setShippingAddress("Indiranagar, Bangalore");

        ZudioApp zudioApp = new ZudioApp();
        zudioApp.userRegistered(zudioDto);
        zudioApp.fetchDetails();
    }
}