
package com.xworkz.flipkart;

import com.xworkz.flipkart.flipkartapp.FlipkartApp;
import com.xworkz.flipkart.flipkartdto.FlipkartDto;

public class FlipkartRunner {

    public static void main(String[] args) {
        FlipkartDto flipkartDto = new FlipkartDto();
        flipkartDto.setFullName("Ravi Kumar");
        flipkartDto.setMobileNumber("9876543210");
        flipkartDto.setEmail("ravi.kumar@flipkart.com");
        flipkartDto.setPassword("Ravi@2025");
        flipkartDto.setShippingAddress("Bangalore, India");

        FlipkartApp flipkartApp = new FlipkartApp();
        flipkartApp.userRegistered(flipkartDto);
        flipkartApp.fetchDetails();
    }
}