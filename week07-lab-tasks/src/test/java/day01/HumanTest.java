package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human;
    Human peter;

    @BeforeEach
    void init () {
        human = new Human("Hadik Péter", 1972);
    }

    @Test
    void isNameValidTest () {
        boolean result = human.isNameValid("Hadik Péter");
        assertTrue(result);
    }

    @Test
    void testHumanName () {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Human("Hadik", 1971));
        assertEquals("Meg kell adnod a vezeték és a keresztnevedet is!", exception.getMessage());
    }

    @Test
    void testHumanAge () {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Human("Hadik Péter", 1872));
        assertEquals("Nem jó születési évet adtál meg!", exception.getMessage());
    }


}