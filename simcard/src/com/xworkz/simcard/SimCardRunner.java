package com.xworkz.simcard;

import com.xworkz.simcard.simcard.SimCard;

public class SimCardRunner {
    public static void main(String[] args) {
        SimCard ref1 = new SimCard();
        ref1.setSimId(1);
        ref1.setNetworkProvider("Airtel");
        ref1.setSimType("Nano");
        ref1.setBalance(50.0);
        ref1.setIsActive(true);
        ref1.setMobileNumber("9876543210");
        ref1.setValidity("28 days");

        System.out.println("Sim ID: " + ref1.getSimId());
        System.out.println("Network Provider: " + ref1.getNetworkProvider());
        System.out.println("Sim Type: " + ref1.getSimType());
        System.out.println("Balance: " + ref1.getBalance());
        System.out.println("Active: " + ref1.getIsActive());
        System.out.println("Mobile Number: " + ref1.getMobileNumber());
        System.out.println("Validity: " + ref1.getValidity());
        System.out.println();

        SimCard ref2 = new SimCard();
        ref2.setSimId(2);
        ref2.setNetworkProvider("Jio");
        ref2.setSimType("Micro");
        ref2.setBalance(120.5);
        ref2.setIsActive(true);
        ref2.setMobileNumber("9123456780");
        ref2.setValidity("56 days");

        System.out.println("Sim ID: " + ref2.getSimId());
        System.out.println("Network Provider: " + ref2.getNetworkProvider());
        System.out.println("Sim Type: " + ref2.getSimType());
        System.out.println("Balance: " + ref2.getBalance());
        System.out.println("Active: " + ref2.getIsActive());
        System.out.println("Mobile Number: " + ref2.getMobileNumber());
        System.out.println("Validity: " + ref2.getValidity());
        System.out.println();

        SimCard ref3 = new SimCard();
        ref3.setSimId(3);
        ref3.setNetworkProvider("Vi");
        ref3.setSimType("Standard");
        ref3.setBalance(75.0);
        ref3.setIsActive(false);
        ref3.setMobileNumber("9871234567");
        ref3.setValidity("15 days");

        System.out.println("Sim ID: " + ref3.getSimId());
        System.out.println("Network Provider: " + ref3.getNetworkProvider());
        System.out.println("Sim Type: " + ref3.getSimType());
        System.out.println("Balance: " + ref3.getBalance());
        System.out.println("Active: " + ref3.getIsActive());
        System.out.println("Mobile Number: " + ref3.getMobileNumber());
        System.out.println("Validity: " + ref3.getValidity());
        System.out.println();

        SimCard ref4 = new SimCard();
        ref4.setSimId(4);
        ref4.setNetworkProvider("BSNL");
        ref4.setSimType("Nano");
        ref4.setBalance(35.0);
        ref4.setIsActive(true);
        ref4.setMobileNumber("7890654321");
        ref4.setValidity("90 days");

        System.out.println("Sim ID: " + ref4.getSimId());
        System.out.println("Network Provider: " + ref4.getNetworkProvider());
        System.out.println("Sim Type: " + ref4.getSimType());
        System.out.println("Balance: " + ref4.getBalance());
        System.out.println("Active: " + ref4.getIsActive());
        System.out.println("Mobile Number: " + ref4.getMobileNumber());
        System.out.println("Validity: " + ref4.getValidity());
        System.out.println();

        SimCard ref5 = new SimCard();
        ref5.setSimId(5);
        ref5.setNetworkProvider("Tata Docomo");
        ref5.setSimType("Micro");
        ref5.setBalance(10.0);
        ref5.setIsActive(false);
        ref5.setMobileNumber("9988776655");
        ref5.setValidity("Expired");

        System.out.println("Sim ID: " + ref5.getSimId());
        System.out.println("Network Provider: " + ref5.getNetworkProvider());
        System.out.println("Sim Type: " + ref5.getSimType());
        System.out.println("Balance: " + ref5.getBalance());
        System.out.println("Active: " + ref5.getIsActive());
        System.out.println("Mobile Number: " + ref5.getMobileNumber());
        System.out.println("Validity: " + ref5.getValidity());
    }
}
