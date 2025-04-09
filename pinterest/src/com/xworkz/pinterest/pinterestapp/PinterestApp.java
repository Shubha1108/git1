package com.xworkz.pinterest.pinterestapp;

import com.xworkz.pinterest.pinterestdto.PinterestDto;

public class PinterestApp {
    PinterestDto dto;

    public void userRegistered(PinterestDto pinterestDto) {
        boolean isValid = validateUser(pinterestDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = pinterestDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(PinterestDto pinterestDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (pinterestDto.getFullName() != null && !pinterestDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (pinterestDto.getMobileNumber() != null && !pinterestDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (pinterestDto.getEmail() != null && pinterestDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (pinterestDto.getPassword() != null && !pinterestDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (pinterestDto.getShippingAddress() != null && !pinterestDto.getShippingAddress().isEmpty())
            isShippingAddressValid = true;
        else
            System.out.println("Invalid shipping address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isShippingAddressValid)
            isValid = true;

        return isValid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User shipping address is: " + dto.getShippingAddress());
        System.out.println("User password is: " + dto.getPassword());
    }
}