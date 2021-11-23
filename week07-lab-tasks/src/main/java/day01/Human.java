package day01;

import java.time.LocalDate;

public class Human {

    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (isYearOfBirthValid(yearOfBirth) && isNameValid(name)) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    private boolean isYearOfBirthValid (int yearOfBirth) {
        if (LocalDate.now().getYear() - yearOfBirth >= 120) {
            throw new IllegalArgumentException("Nem jó születési évet adtál meg!");
        }
        return true;
    }

    public boolean isNameValid (String name) {
        if(!(name != null && name.indexOf(" ") > 0)) {
            throw new IllegalArgumentException("Meg kell adnod a vezeték és a keresztnevedet is!");
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
