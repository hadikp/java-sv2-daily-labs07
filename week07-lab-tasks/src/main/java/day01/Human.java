package day01;

import java.time.LocalDate;

public class Human {

    private String name;
    private LocalDate yearOfBirth;

    public Human(String name, LocalDate yearOfBirth) {
        String[] nameSplit = name.split(" ");
        if (nameSplit.length != 2) {
            throw new IllegalArgumentException("Meg kell adnod a vezeték és a keresztnevdet is!");
        }
        LocalDate now =  LocalDate.now();
        //if ((yearOfBirth) > 120) {
           // throw new IllegalArgumentException("Nem jó születési évet adtál meg!");
        //}
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }
}
