package com.xworkz.rapido;

import com.xworkz.rapido.rapidoapp.RapidoApp;
import com.xworkz.rapido.rapidodto.RapidoDto;

public class RapidoRunner {

    public static void main(String[] args) {
        RapidoDto rapidoDto = new RapidoDto();
        rapidoDto.setFullName("Shash");
        rapidoDto.setMobileNumber("9876543210");
        rapidoDto.setEmail("shash@gmail.com");
        rapidoDto.setPassword("shash11@123");
        rapidoDto.setPickupLocation("Velachery, Chennai");

        RapidoApp rapidoApp = new RapidoApp();
        rapidoApp.userRegistered(rapidoDto);
        rapidoApp.fetchDetails();
    }
}