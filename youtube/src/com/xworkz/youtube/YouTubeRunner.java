package com.xworkz.youtube;

import com.xworkz.youtube.youtubeapp.YouTubeApp;
import com.xworkz.youtube.youtubedto.YouTubeDto;

public class YouTubeRunner {

    public static void main(String[] args) {
        YouTubeDto youTubeDto = new YouTubeDto();
        youTubeDto.setFullName("Rahul Kumar");
        youTubeDto.setMobileNumber("9123456789");
        youTubeDto.setEmail("rahulkumar@gmail.com");
        youTubeDto.setPassword("Rahul@2024");
        youTubeDto.setShippingAddress("Mumbai, India");

        YouTubeApp youTubeApp = new YouTubeApp();
        youTubeApp.userRegistered(youTubeDto);
        youTubeApp.fetchDetails();
    }
}