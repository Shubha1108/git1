package com.xworkz.trends.trendsapp;

import com.xworkz.trends.trendsdto.TrendsDto;

public class TrendsApp {
    TrendsDto dto;

    public void userRegistered(TrendsDto trendsDto) {
        boolean isValid = validateUser(trendsDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = trendsDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(TrendsDto trendsDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (trendsDto.getFullName() != null && !trendsDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (trendsDto.getMobileNumber() != null && !trendsDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (trendsDto.getEmail() != null && trendsDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (trendsDto.getPassword() != null && !trendsDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (trendsDto.getShippingAddress() != null && !trendsDto.getShippingAddress().isEmpty())
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
