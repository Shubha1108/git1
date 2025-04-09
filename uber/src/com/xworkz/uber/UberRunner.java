package com.xworkz.uber;

import com.xworkz.uber.uberapp.UberApp;
import com.xworkz.uber.uberdto.UberDto;

public class UberRunner {

    public static void main(String[] args) {
        UberDto uberDto = new UberDto();
        uberDto.setFullName("Shubha");
        uberDto.setMobileNumber("9876543210");
        uberDto.setEmail("shubha@gmail.com");
        uberDto.setPassword("shubha11@123");
        uberDto.setPickupLocation("Chennai Central");

        UberApp uberApp = new UberApp();
        uberApp.userRegistered(uberDto);
        uberApp.fetchDetails();
    }
}