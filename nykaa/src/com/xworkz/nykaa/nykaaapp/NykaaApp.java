package com.xworkz.nykaa.nykaaapp;

import com.xworkz.nykaa.nykaadto.NykaaDto;

public class NykaaApp {
    NykaaDto dto;

    public void userRegistered(NykaaDto nykaaDto) {
        boolean isValid = validateUser(nykaaDto);
        boolean isvalid = false;

        if (isValid) {
            isvalid = true;
            dto = nykaaDto;
        } else {
            System.out.println("Registration failed");
        }
    }

    public boolean validateUser(NykaaDto nykaaDto) {
        boolean isvalid = false;
        boolean isFullNameValid = false;
        boolean isMobileNumberValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isDeliveryAddressValid = false;

        if (nykaaDto.getFullName() != null && !nykaaDto.getFullName().isEmpty())
            isFullNameValid = true;
        else
            System.out.println("Invalid full name. Please try again later.");

        if (nykaaDto.getMobileNumber() != null && !nykaaDto.getMobileNumber().isEmpty())
            isMobileNumberValid = true;
        else
            System.out.println("Invalid mobile number. Please try again later.");

        if (nykaaDto.getEmail() != null && nykaaDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email address. Please enter a valid email.");

        if (nykaaDto.getPassword() != null && !nykaaDto.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Invalid password.");

        if (nykaaDto.getDeliveryAddress() != null && !nykaaDto.getDeliveryAddress().isEmpty())
            isDeliveryAddressValid = true;
        else
            System.out.println("Invalid delivery address.");

        if (isFullNameValid && isMobileNumberValid && isEmailValid && isPasswordValid && isDeliveryAddressValid)
            isvalid = true;

        return isvalid;
    }

    public void fetchDetails() {
        System.out.println("Full name is: " + dto.getFullName());
        System.out.println("User mobile number is: " + dto.getMobileNumber());
        System.out.println("User email is: " + dto.getEmail());
        System.out.println("User delivery address is: " + dto.getDeliveryAddress());
        System.out.println("User password is: " + dto.getPassword());
    }

}
