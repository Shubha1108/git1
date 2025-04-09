package com.xworkz.amazon;

import com.xworkz.amazon.amazonapp.AmazonApp;
import com.xworkz.amazon.amazondto.AmazonDto;

public class AmazonRunner {

        public static void main(String[] args) {
            AmazonDto amazonDto = new AmazonDto();
            amazonDto.setFullName("shubha");
            amazonDto.setMobileNumber("9876543210");
            amazonDto.setEmail("shubha@gmail.com");
            amazonDto.setPassword("shubha11@123");
            amazonDto.setShippingAddress("chennai, India");

            AmazonApp amazonApp = new AmazonApp();
            amazonApp.UserRegistered(amazonDto);
            amazonApp.fetchDetails();
        }
    }



