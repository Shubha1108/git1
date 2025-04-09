package com.xworkz.nykaa;

import com.xworkz.nykaa.nykaaapp.NykaaApp;
import com.xworkz.nykaa.nykaadto.NykaaDto;

public class NykaaRunner {

    public static void main(String[] args) {
        NykaaDto nykaaDto = new NykaaDto();
        nykaaDto.setFullName("Neha Sharma");
        nykaaDto.setMobileNumber("9876543210");
        nykaaDto.setEmail("neha.sharma@nykaa.com");
        nykaaDto.setPassword("Neha@2025");
        nykaaDto.setDeliveryAddress("Delhi, India");

        NykaaApp nykaaApp = new NykaaApp();
        nykaaApp.userRegistered(nykaaDto);
        nykaaApp.fetchDetails();
    }
}