package com.xworkz.netflix;

import com.xworkz.netflix.netflixapp.NetflixApp;
import com.xworkz.netflix.netflixdto.NetflixDto;

public class NetflixRunner {

    public static void main(String[] args) {
        NetflixDto netflixDto = new NetflixDto();
        netflixDto.setFullName("Ravi Sharma");
        netflixDto.setMobileNumber("9876543210");
        netflixDto.setEmail("ravi.sharma@gmail.com");
        netflixDto.setPassword("Ravi@2025");
        netflixDto.setShippingAddress("Hyderabad, India");

        NetflixApp netflixApp = new NetflixApp();
        netflixApp.userRegistered(netflixDto);
        netflixApp.fetchDetails();
    }
}