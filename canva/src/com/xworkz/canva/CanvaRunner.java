package com.xworkz.canva;

import com.xworkz.canva.canvaapp.CanvaApp;
import com.xworkz.canva.canvadto.CanvaDto;

public class CanvaRunner {

    public static void main(String[] args) {
        CanvaDto canvaDto = new CanvaDto();
        canvaDto.setFullName("Shubha");
        canvaDto.setMobileNumber("9876543210");
        canvaDto.setEmail("shubha@gmail.com");
        canvaDto.setPassword("shubha11@123");
        canvaDto.setShippingAddress("Chennai, India");

        CanvaApp canvaApp = new CanvaApp();
        canvaApp.userRegistered(canvaDto);
        canvaApp.fetchDetails();
    }
}