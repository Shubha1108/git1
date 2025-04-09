package com.xworkz.library.libraryapp;

import com.xworkz.library.librarydto.LibraryDto;

public class LibraryApp {
    LibraryDto dto;

    public void registerMember(LibraryDto libraryDto) {
        boolean isValid = validateMember(libraryDto);
        boolean isRegistered = false;

        if (isValid) {
            isRegistered = true;
            dto = libraryDto;
            System.out.println("Member registration successful.");
        } else {
            System.out.println("Member registration failed.");
        }
    }

    public boolean validateMember(LibraryDto libraryDto) {
        boolean isValid = false;
        boolean isNameValid = false;
        boolean isMembershipIdValid = false;
        boolean isEmailValid = false;
        boolean isContactValid = false;
        boolean isAddressValid = false;

        if (libraryDto.getName() != null && !libraryDto.getName().isEmpty())
            isNameValid = true;
        else
            System.out.println("Invalid name.");

        if (libraryDto.getMembershipId() != null && !libraryDto.getMembershipId().isEmpty())
            isMembershipIdValid = true;
        else
            System.out.println("Invalid membership ID.");

        if (libraryDto.getEmail() != null && libraryDto.getEmail().contains("@"))
            isEmailValid = true;
        else
            System.out.println("Invalid email.");

        if (libraryDto.getContactNumber() != null && !libraryDto.getContactNumber().isEmpty())
            isContactValid = true;
        else
            System.out.println("Invalid contact number.");

        if (libraryDto.getAddress() != null && !libraryDto.getAddress().isEmpty())
            isAddressValid = true;
        else
            System.out.println("Invalid address.");

        if (isNameValid && isMembershipIdValid && isEmailValid && isContactValid && isAddressValid)
            isValid = true;

        return isValid;
    }

    public void displayMemberDetails() {
        System.out.println("Member Name: " + dto.getName());
        System.out.println("Membership ID: " + dto.getMembershipId());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Address: " + dto.getAddress());
    }

}
