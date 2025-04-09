package com.xworkz.canva.canvaapp;

import com.xworkz.canva.canvadto.CanvaDto;

public class CanvaApp {
    CanvaDto dto;

    public void userRegistered(CanvaDto canvaDto) {
        boolean isValid = validateUser(canvaDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = canvaDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(CanvaDto canvaDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (canvaDto.getFullName() != null && !canvaDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (canvaDto.getMobileNumber() != null && !canvaDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (canvaDto.getEmail() != null && canvaDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (canvaDto.getPassword() != null && !canvaDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (canvaDto.getShippingAddress() != null && !canvaDto.getShippingAddress().isEmpty())
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
