package com.xworkz.max;

import com.xworkz.max.maxapp.MaxApp;
import com.xworkz.max.maxdto.MaxDto;

public class MaxRunner {

    public static void main(String[] args) {
        MaxDto maxDto = new MaxDto();
        maxDto.setFullName("Shubha");
        maxDto.setMobileNumber("9876543210");
        maxDto.setEmail("shubha@gmail.com");
        maxDto.setPassword("shubha11@123");
        maxDto.setShippingAddress("Chennai, India");

        MaxApp maxApp = new MaxApp();
        maxApp.userRegistered(maxDto);
        maxApp.fetchDetails();
    }
}