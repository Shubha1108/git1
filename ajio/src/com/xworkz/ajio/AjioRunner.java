package com.xworkz.ajio;

import com.xworkz.ajio.ajioapp.AjioApp;
import com.xworkz.ajio.ajiodto.AjioDto;

public class AjioRunner {
    public static void main(String[] args) {
        AjioDto ajioDto = new AjioDto();
        ajioDto.setFullName("Ritika Sharma");
        ajioDto.setMobileNumber("9876512345");
        ajioDto.setEmail("ritika@ajio.com");
        ajioDto.setPassword("Ritika@321");
        ajioDto.setShippingAddress("Delhi, India");

        AjioApp ajioApp = new AjioApp();
        ajioApp.userRegistered(ajioDto);
        ajioApp.fetchDetails();
    }
}