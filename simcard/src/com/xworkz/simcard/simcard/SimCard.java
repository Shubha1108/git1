package com.xworkz.simcard.simcard;

public class SimCard {
    private int simId;
    private String networkProvider;
    private String simType;
    private double balance;
    private boolean isActive;
    private String mobileNumber;
    private String validity;

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public int getSimId() {
        return simId;
    }

    public void setNetworkProvider(String networkProvider) {
        this.networkProvider = networkProvider;
    }

    public String getNetworkProvider() {
        return networkProvider;
    }

    public void setSimType(String simType) {
        this.simType = simType;
    }

    public String getSimType() {
        return simType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getValidity() {
        return validity;
    }
}
