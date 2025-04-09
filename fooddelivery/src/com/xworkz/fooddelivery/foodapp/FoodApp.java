package com.xworkz.fooddelivery.foodapp;

import com.xworkz.fooddelivery.fooddto.FoodDto;

public class FoodApp {
    FoodDto dto;

    public void registerCustomer(FoodDto foodDto) {
        boolean isValid = validateCustomer(foodDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = foodDto;
            System.out.println("Customer registration successful.");
        } else {
            System.out.println("Customer registration failed.");
        }
    }

    public boolean validateCustomer(FoodDto foodDto) {
        boolean isValid = false;
        boolean isNameValid = false;
        boolean isContactValid = false;
        boolean isEmailValid = false;
        boolean isAddressValid = false;
        boolean isDishValid = false;

        if (foodDto.getCustomerName() != null && !foodDto.getCustomerName().isEmpty())
            isNameValid = true;
        else
            System.out.println("Invalid customer name.");

        if (foodDto.getContactNumber() != null && !foodDto.getContactNumber().isEmpty())
            isContactValid = true;
        else
            System.out.println("Invalid contact number.");

        if (foodDto.getEmail() != null && foodDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email.");

        if (foodDto.getDeliveryAddress() != null && !foodDto.getDeliveryAddress().isEmpty())
            isAddressValid = true;
        else
            System.out.println("Invalid delivery address.");

        if (foodDto.getFavoriteDish() != null && !foodDto.getFavoriteDish().isEmpty())
            isDishValid = true;
        else
            System.out.println("Favorite dish cannot be empty.");

        if (isNameValid && isContactValid && isEmailValid && isAddressValid && isDishValid)
            isValid = true;

        return isValid;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Delivery Address: " + dto.getDeliveryAddress());
        System.out.println("Favorite Dish: " + dto.getFavoriteDish());
    }
}
