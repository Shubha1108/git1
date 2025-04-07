package com.xworkz.passportapp.generatepassport;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.xworkz.passportapp.passport.Passport;

import java.sql.SQLOutput;

public class PassportSeva {
    public boolean userRegisterd(Passport passport){
        boolean isUserRegisterd=false;
        if(userValid(passport)){
            isUserRegisterd=true;
        }return isUserRegisterd;
    }
    public boolean userValid(Passport passport) {
        boolean isUserValid = false;
        boolean isAreaValid = false;
        boolean isLocationValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isUserIdValid = false;
        boolean isPwdValid = false;
        boolean isConfirmPwdValid = false;
        boolean isCapchaValid = false;
        boolean isSecurityQuestionValid = false;
        boolean isSecurityAnswerValid = false;
        if (passport.getArea() != null)
            isAreaValid = true;
        else
            System.out.println("area is invalid");
        if (passport.getLocation() != null)
            isLocationValid = true;
        else
            System.out.println("location is invalid");
        if (passport.getFirstName() != null)
            isFirstNameValid = true;
        else
            System.out.println("first name is invalid");
        if (passport.getLastName() != null)
            isLastNameValid = true;
        else
            System.out.println("last name is invalid");
        if (passport.getDob() != null)
            isDobValid = true;
        else
            System.out.println("dob is invalid");
        if (passport.getEmail() != null)
            isEmailValid = true;
        else
            System.out.println("email is not valid");
        if (passport.getUserId() != null)
            isUserIdValid = true;
        else
            System.out.println("userid is invalid");
        if (passport.getPwd() != null)
            isPwdValid = true;
        else
            System.out.println("pwd id invalid");
        if (passport.getConfirmPwd() != null)
            isConfirmPwdValid = true;
        else
            System.out.println("confirm password invalid");
        if (passport.getCaptcha() != null)
            isCapchaValid = true;
        else
            System.out.println("capcha is invalid");
        if (passport.getSecurityQuestion() != null)
            isSecurityQuestionValid = true;
        else
            System.out.println("security question invalid");
        if (passport.getSecurityAnswer() != null)
            isSecurityAnswerValid = true;
        else
            System.out.println("security answer is invalid");

        if(isUserIdValid && isCapchaValid && isAreaValid &&  isLastNameValid && isFirstNameValid && isDobValid && isEmailValid && isLocationValid && isPwdValid && isSecurityAnswerValid && isSecurityQuestionValid && isConfirmPwdValid){
            isUserValid=true;
        }

            return isUserValid;

    }


}
