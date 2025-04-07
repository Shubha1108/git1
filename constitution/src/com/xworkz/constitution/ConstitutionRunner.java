package com.xworkz.constitution;

import com.xworkz.constitution.constitution.Constitution;

public class ConstitutionRunner {
    public static void main(String[] args) {
        Constitution ref1 = new Constitution();
        ref1.setConstitutionId(1);
        ref1.setCountry("India");
        ref1.setType("Written");
        ref1.setYearOfAdoption(1950);
        ref1.setFounder("Dr. B.R. Ambedkar");
        ref1.setIsAmended(true);
        ref1.setNumberOfArticles(395);

        System.out.println("Constitution ID: " + ref1.getConstitutionId());
        System.out.println("Country: " + ref1.getCountry());
        System.out.println("Type: " + ref1.getType());
        System.out.println("Year of Adoption: " + ref1.getYearOfAdoption());
        System.out.println("Founder: " + ref1.getFounder());
        System.out.println("Is Amended: " + ref1.getIsAmended());
        System.out.println("Number of Articles: " + ref1.getNumberOfArticles());
        System.out.println();

        Constitution ref2 = new Constitution();
        ref2.setConstitutionId(2);
        ref2.setCountry("USA");
        ref2.setType("Written");
        ref2.setYearOfAdoption(1789);
        ref2.setFounder("James Madison");
        ref2.setIsAmended(true);
        ref2.setNumberOfArticles(7);

        System.out.println("Constitution ID: " + ref2.getConstitutionId());
        System.out.println("Country: " + ref2.getCountry());
        System.out.println("Type: " + ref2.getType());
        System.out.println("Year of Adoption: " + ref2.getYearOfAdoption());
        System.out.println("Founder: " + ref2.getFounder());
        System.out.println("Is Amended: " + ref2.getIsAmended());
        System.out.println("Number of Articles: " + ref2.getNumberOfArticles());
        System.out.println();

        Constitution ref3 = new Constitution();
        ref3.setConstitutionId(3);
        ref3.setCountry("UK");
        ref3.setType("Unwritten");
        ref3.setYearOfAdoption(1215);
        ref3.setFounder("Magna Carta");
        ref3.setIsAmended(true);
        ref3.setNumberOfArticles(0);

        System.out.println("Constitution ID: " + ref3.getConstitutionId());
        System.out.println("Country: " + ref3.getCountry());
        System.out.println("Type: " + ref3.getType());
        System.out.println("Year of Adoption: " + ref3.getYearOfAdoption());
        System.out.println("Founder: " + ref3.getFounder());
        System.out.println("Is Amended: " + ref3.getIsAmended());
        System.out.println("Number of Articles: " + ref3.getNumberOfArticles());
        System.out.println();

        Constitution ref4 = new Constitution();
        ref4.setConstitutionId(4);
        ref4.setCountry("France");
        ref4.setType("Written");
        ref4.setYearOfAdoption(1958);
        ref4.setFounder("Charles de Gaulle");
        ref4.setIsAmended(true);
        ref4.setNumberOfArticles(89);

        System.out.println("Constitution ID: " + ref4.getConstitutionId());
        System.out.println("Country: " + ref4.getCountry());
        System.out.println("Type: " + ref4.getType());
        System.out.println("Year of Adoption: " + ref4.getYearOfAdoption());
        System.out.println("Founder: " + ref4.getFounder());
        System.out.println("Is Amended: " + ref4.getIsAmended());
        System.out.println("Number of Articles: " + ref4.getNumberOfArticles());
        System.out.println();

        Constitution ref5 = new Constitution();
        ref5.setConstitutionId(5);
        ref5.setCountry("Germany");
        ref5.setType("Written");
        ref5.setYearOfAdoption(1949);
        ref5.setFounder("Konrad Adenauer");
        ref5.setIsAmended(true);
        ref5.setNumberOfArticles(146);

        System.out.println("Constitution ID: " + ref5.getConstitutionId());
        System.out.println("Country: " + ref5.getCountry());
        System.out.println("Type: " + ref5.getType());
        System.out.println("Year of Adoption: " + ref5.getYearOfAdoption());
        System.out.println("Founder: " + ref5.getFounder());
        System.out.println("Is Amended: " + ref5.getIsAmended());
        System.out.println("Number of Articles: " + ref5.getNumberOfArticles());
    }

}
