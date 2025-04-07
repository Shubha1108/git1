package com.xworkz.constitution.constitution;

public class Constitution {
    private int constitutionId;
    private String country;
    private String type;
    private int yearOfAdoption;
    private String founder;
    private boolean isAmended;
    private int numberOfArticles;

    public void setConstitutionId(int constitutionId) {
        this.constitutionId = constitutionId;
    }

    public int getConstitutionId() {
        return constitutionId;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setYearOfAdoption(int yearOfAdoption) {
        this.yearOfAdoption = yearOfAdoption;
    }

    public int getYearOfAdoption() {
        return yearOfAdoption;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getFounder() {
        return founder;
    }

    public void setIsAmended(boolean isAmended) {
        this.isAmended = isAmended;
    }

    public boolean getIsAmended() {
        return isAmended;
    }

    public void setNumberOfArticles(int numberOfArticles) {
        this.numberOfArticles = numberOfArticles;
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }
}
