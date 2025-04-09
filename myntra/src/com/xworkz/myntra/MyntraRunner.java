package com.xworkz.myntra;

import com.xworkz.myntra.myntraapp.MyntraApp;
import com.xworkz.myntra.myntradto.MyntraDto;

public class MyntraRunner {

    public static void main(String[] args) {
        MyntraDto myntraDto = new MyntraDto();
        myntraDto.setFullName("Anjali Verma");
        myntraDto.setMobileNumber("9123456789");
        myntraDto.setEmail("anjali.verma@example.com");
        myntraDto.setPassword("anjali@123");
        myntraDto.setDeliveryAddress("Mumbai, India");

        MyntraApp myntraApp = new MyntraApp();
        myntraApp.userRegistered(myntraDto);
        myntraApp.fetchDetails();
    }
}