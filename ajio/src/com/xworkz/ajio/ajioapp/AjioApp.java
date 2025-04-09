package com.xworkz.ajio.ajioapp;

import com.xworkz.ajio.ajiodto.AjioDto;

public class AjioApp {
    AjioDto dto;

    public void userRegistered(AjioDto ajioDto) {
        boolean isValid = validateUser(ajioDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = ajioDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(AjioDto ajioDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (ajioDto.getFullName() != null && !ajioDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (ajioDto.getMobileNumber() != null && !ajioDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (ajioDto.getEmail() != null && ajioDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (ajioDto.getPassword() != null && !ajioDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (ajioDto.getShippingAddress() != null && !ajioDto.getShippingAddress().isEmpty())
            isShippingAddressValid = true;
        else
            System.out.println("Invalid shipping address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isShippingAddressValid)
            isvalid = true;

        return isvalid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User shipping address is: " + dto.getShippingAddress());
        System.out.println("User password is: " + dto.getPassword());
    }

}
