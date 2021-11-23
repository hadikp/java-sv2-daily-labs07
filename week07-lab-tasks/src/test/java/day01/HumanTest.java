package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testHumanName () {
        Human human = new Human("Hadik Péter", LocalDate.of(1971, 10, 25));
        System.out.println(human.getName());
    }


}