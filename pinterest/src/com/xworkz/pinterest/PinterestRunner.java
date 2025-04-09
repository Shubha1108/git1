package com.xworkz.pinterest;

import com.xworkz.pinterest.pinterestapp.PinterestApp;
import com.xworkz.pinterest.pinterestdto.PinterestDto;

public class PinterestRunner {

    public static void main(String[] args) {
        PinterestDto pinterestDto = new PinterestDto();
        pinterestDto.setFullName("Shubha");
        pinterestDto.setMobileNumber("9876543210");
        pinterestDto.setEmail("shubha@gmail.com");
        pinterestDto.setPassword("shubha11@123");
        pinterestDto.setShippingAddress("Chennai, India");

        PinterestApp pinterestApp = new PinterestApp();
        pinterestApp.userRegistered(pinterestDto);
        pinterestApp.fetchDetails();
    }
}