package com.xworkz.zepto;

import com.xworkz.zepto.zeptoapp.ZeptoApp;
import com.xworkz.zepto.zeptodto.ZeptoDto;

public class ZeptoRunner {
    public static void main(String[] args) {
        ZeptoDto zeptoDto = new ZeptoDto();
        zeptoDto.setFullName("Suresh N");
        zeptoDto.setMobileNumber("9998887770");
        zeptoDto.setEmail("suresh@zepto.com");
        zeptoDto.setPassword("Suresh@123");
        zeptoDto.setShippingAddress("Mumbai, India");

        ZeptoApp zeptoApp = new ZeptoApp();
        zeptoApp.userRegistered(zeptoDto);
        zeptoApp.fetchDetails();
    }
}