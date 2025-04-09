package com.xworkz.trends;

import com.xworkz.trends.trendsapp.TrendsApp;
import com.xworkz.trends.trendsdto.TrendsDto;

public class TrendsRunner {

    public static void main(String[] args) {
        TrendsDto trendsDto = new TrendsDto();
        trendsDto.setFullName("Shubha");
        trendsDto.setMobileNumber("9876543210");
        trendsDto.setEmail("shubha@gmail.com");
        trendsDto.setPassword("shubha11@123");
        trendsDto.setShippingAddress("Chennai, India");

        TrendsApp trendsApp = new TrendsApp();
        trendsApp.userRegistered(trendsDto);
        trendsApp.fetchDetails();
    }
}