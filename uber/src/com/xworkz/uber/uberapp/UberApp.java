package com.xworkz.uber.uberapp;

import com.xworkz.uber.uberdto.UberDto;

public class UberApp {
    UberDto dto;

    public void userRegistered(UberDto uberDto) {
        boolean isValid = validateUser(uberDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = uberDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(UberDto uberDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPickupLocationValid = false;

        if (uberDto.getFullName() != null && !uberDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (uberDto.getMobileNumber() != null && !uberDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (uberDto.getEmail() != null && uberDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (uberDto.getPassword() != null && !uberDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (uberDto.getPickupLocation() != null && !uberDto.getPickupLocation().isEmpty())
            isPickupLocationValid = true;
        else
            System.out.println("Invalid pickup location.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isPickupLocationValid)
            isValid = true;

        return isValid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User pickup location is: " + dto.getPickupLocation());
        System.out.println("User password is: " + dto.getPassword());
    }
}
