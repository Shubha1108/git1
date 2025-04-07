package com.xworkz.celebrity;

import com.xworkz.celebrity.celebrity.Celebrity;

public class CelebrityRunner {
    public static void main(String[] args) {
        Celebrity ref1 = new Celebrity();
        ref1.setCelebrityId(1);
        ref1.setName("Shah Rukh Khan");
        ref1.setAge(58);
        ref1.setProfession("Actor");
        ref1.setNationality("Indian");
        ref1.setNetWorth(770.0);
        ref1.setIsActive(true);

        System.out.println("Celebrity ID: " + ref1.getCelebrityId());
        System.out.println("Name: " + ref1.getName());
        System.out.println("Age: " + ref1.getAge());
        System.out.println("Profession: " + ref1.getProfession());
        System.out.println("Nationality: " + ref1.getNationality());
        System.out.println("Net Worth: $" + ref1.getNetWorth() + " million");
        System.out.println("Is Active: " + ref1.getIsActive());
        System.out.println();

        Celebrity ref2 = new Celebrity();
        ref2.setCelebrityId(2);
        ref2.setName("Taylor Swift");
        ref2.setAge(34);
        ref2.setProfession("Singer");
        ref2.setNationality("American");
        ref2.setNetWorth(1100.0);
        ref2.setIsActive(true);

        System.out.println("Celebrity ID: " + ref2.getCelebrityId());
        System.out.println("Name: " + ref2.getName());
        System.out.println("Age: " + ref2.getAge());
        System.out.println("Profession: " + ref2.getProfession());
        System.out.println("Nationality: " + ref2.getNationality());
        System.out.println("Net Worth: $" + ref2.getNetWorth() + " million");
        System.out.println("Is Active: " + ref2.getIsActive());
        System.out.println();

        Celebrity ref3 = new Celebrity();
        ref3.setCelebrityId(3);
        ref3.setName("Leonardo DiCaprio");
        ref3.setAge(49);
        ref3.setProfession("Actor");
        ref3.setNationality("American");
        ref3.setNetWorth(300.0);
        ref3.setIsActive(true);

        System.out.println("Celebrity ID: " + ref3.getCelebrityId());
        System.out.println("Name: " + ref3.getName());
        System.out.println("Age: " + ref3.getAge());
        System.out.println("Profession: " + ref3.getProfession());
        System.out.println("Nationality: " + ref3.getNationality());
        System.out.println("Net Worth: $" + ref3.getNetWorth() + " million");
        System.out.println("Is Active: " + ref3.getIsActive());
        System.out.println();

        Celebrity ref4 = new Celebrity();
        ref4.setCelebrityId(4);
        ref4.setName("Emma Watson");
        ref4.setAge(34);
        ref4.setProfession("Actress");
        ref4.setNationality("British");
        ref4.setNetWorth(85.0);
        ref4.setIsActive(true);

        System.out.println("Celebrity ID: " + ref4.getCelebrityId());
        System.out.println("Name: " + ref4.getName());
        System.out.println("Age: " + ref4.getAge());
        System.out.println("Profession: " + ref4.getProfession());
        System.out.println("Nationality: " + ref4.getNationality());
        System.out.println("Net Worth: $" + ref4.getNetWorth() + " million");
        System.out.println("Is Active: " + ref4.getIsActive());
        System.out.println();

        Celebrity ref5 = new Celebrity();
        ref5.setCelebrityId(5);
        ref5.setName("Bruce Lee");
        ref5.setAge(32);
        ref5.setProfession("Martial Artist");
        ref5.setNationality("Hong Kong-American");
        ref5.setNetWorth(10.0);
        ref5.setIsActive(false);

        System.out.println("Celebrity ID: " + ref5.getCelebrityId());
        System.out.println("Name: " + ref5.getName());
        System.out.println("Age: " + ref5.getAge());
        System.out.println("Profession: " + ref5.getProfession());
        System.out.println("Nationality: " + ref5.getNationality());
        System.out.println("Net Worth: $" + ref5.getNetWorth() + " million");
        System.out.println("Is Active: " + ref5.getIsActive());
    }
}
