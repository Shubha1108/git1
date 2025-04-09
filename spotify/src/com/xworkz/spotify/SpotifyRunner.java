package com.xworkz.spotify;

import com.xworkz.spotify.spotifyapp.SpotifyApp;
import com.xworkz.spotify.spotifydto.SpotifyDto;

public class SpotifyRunner {
    public static void main(String[] args) {
        SpotifyDto spotifyDto = new SpotifyDto();
        spotifyDto.setFullName("Shubha");
        spotifyDto.setMobileNumber("9876543210");
        spotifyDto.setEmail("shubha@gmail.com");
        spotifyDto.setPassword("shubha11@123");
        spotifyDto.setShippingAddress("Chennai, India");

        SpotifyApp spotifyApp = new SpotifyApp();
        spotifyApp.userRegistered(spotifyDto);
        spotifyApp.fetchDetails();
    }
}