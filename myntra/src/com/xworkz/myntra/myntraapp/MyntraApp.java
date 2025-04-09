package com.xworkz.myntra.myntraapp;

import com.xworkz.myntra.myntradto.MyntraDto;

public class MyntraApp {
    MyntraDto dto;

    public void userRegistered(MyntraDto myntraDto) {
        boolean isValid = validateUser(myntraDto);

        if (isValid) {
            dto = myntraDto;
            System.out.println("User successfully registered on Myntra.");
        } else {
            System.out.println("Registration failed. Please check your details.");
        }
    }

    public boolean validateUser(MyntraDto myntraDto) {
        boolean isValid = true;

        if (myntraDto.getFullName() == null || myntraDto.getFullName().isEmpty()) {
            System.out.println("Invalid full name.");
            isValid = false;
        }

        if (myntraDto.getMobileNumber() == null || myntraDto.getMobileNumber().isEmpty()) {
            System.out.println("Invalid mobile number.");
            isValid = false;
        }

        if (myntraDto.getEmail() == null || !myntraDto.getEmail().contains("@")) {
            System.out.println("Invalid email address.");
            isValid = false;
        }

        if (myntraDto.getPassword() == null || myntraDto.getPassword().isEmpty()) {
            System.out.println("Invalid password.");
            isValid = false;
        }

        if (myntraDto.getDeliveryAddress() == null || myntraDto.getDeliveryAddress().isEmpty()) {
            System.out.println("Invalid delivery address.");
            isValid = false;
        }

        return isValid;
    }

    public void fetchDetails() {
        System.out.println("Full Name: " + dto.getFullName());
        System.out.println("Mobile Number: " + dto.getMobileNumber());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Delivery Address: " + dto.getDeliveryAddress());
        System.out.println("Password: " + dto.getPassword());
    }
}
