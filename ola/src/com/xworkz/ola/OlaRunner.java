package com.xworkz.ola;

import com.xworkz.ola.olaapp.OlaApp;
import com.xworkz.ola.oladto.OlaDto;

public class OlaRunner {

    public static void main(String[] args) {
        OlaDto olaDto = new OlaDto();
        olaDto.setFullName("Shubha");
        olaDto.setMobileNumber("9876543210");
        olaDto.setEmail("shubha@gmail.com");
        olaDto.setPassword("ola123@shubha");
        olaDto.setPickupLocation("Whitefield, Bangalore");

        OlaApp olaApp = new OlaApp();
        olaApp.userRegistered(olaDto);
        olaApp.fetchDetails();
    }}