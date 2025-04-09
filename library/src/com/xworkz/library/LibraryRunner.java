package com.xworkz.library;

import com.xworkz.library.libraryapp.LibraryApp;
import com.xworkz.library.librarydto.LibraryDto;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryDto libraryDto = new LibraryDto();
        libraryDto.setName("Anusha R");
        libraryDto.setMembershipId("LIB12345");
        libraryDto.setEmail("anusha.r@example.com");
        libraryDto.setContactNumber("9988776655");
        libraryDto.setAddress("Mysore, Karnataka");

        LibraryApp libraryApp = new LibraryApp();
        libraryApp.registerMember(libraryDto);
        libraryApp.displayMemberDetails();
    }
}
