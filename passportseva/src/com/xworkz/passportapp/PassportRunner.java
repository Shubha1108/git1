package com.xworkz.passportapp;

import com.xworkz.passportapp.constants.Area;
import com.xworkz.passportapp.constants.Location;
import com.xworkz.passportapp.generatepassport.PassportSeva;
import com.xworkz.passportapp.passport.Passport;

public class PassportRunner {
    public static void main(String[] args) {
        Passport passport=new Passport();
        passport.setLocation(Location.postoffice);
        passport.setArea(Area.Banglore);
        passport.setFirstName("Shubha");
        passport.setLastName("M P");
        passport.setDob("11/08/2003");
        passport.setEmail("shubhamp@2003");
        passport.setUserId("1");
        passport.setPwd("123");
        passport.setConfirmPwd("123");
        passport.setSecurityQuestion("question");
        passport.setSecurityAnswer("answer");
        passport.setCaptcha("A123b");

        PassportSeva passportseva=new PassportSeva();
        if
        (passportseva.userRegisterd(passport)){
            System.out.println("user registration succesfull");
        }
        else
            System.out.println("unsuccesfull");






    }

}
