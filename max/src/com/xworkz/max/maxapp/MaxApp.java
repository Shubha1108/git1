package com.xworkz.max.maxapp;

import com.xworkz.max.maxdto.MaxDto;

public class MaxApp {
    MaxDto dto;

    public void userRegistered(MaxDto maxDto) {
        boolean isValid = validateUser(maxDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = maxDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(MaxDto maxDto) {
        boolean isValid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isShippingAddressValid = false;

        if (maxDto.getFullName() != null && !maxDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (maxDto.getMobileNumber() != null && !maxDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (maxDto.getEmail() != null && maxDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (maxDto.getPassword() != null && !maxDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (maxDto.getShippingAddress() != null && !maxDto.getShippingAddress().isEmpty())
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
