package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.foodapp.FoodApp;
import com.xworkz.fooddelivery.fooddto.FoodDto;

public class FoodRunner {
    public static void main(String[] args) {
        FoodDto foodDto = new FoodDto();
        foodDto.setCustomerName("Ravi Kumar");
        foodDto.setContactNumber("9123456780");
        foodDto.setEmail("ravi.kumar@example.com");
        foodDto.setDeliveryAddress("Bangalore, India");
        foodDto.setFavoriteDish("Paneer Butter Masala");

        FoodApp foodApp = new FoodApp();
        foodApp.registerCustomer(foodDto);
        foodApp.displayCustomerInfo();
    }
}
