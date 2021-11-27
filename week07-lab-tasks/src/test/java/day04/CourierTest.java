package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Path path;

    @Test
    void testAddRide () {
        Courier courier = new Courier();
        CourierFileManager cfm = new CourierFileManager();
        path = Paths.get("src/test/resources/courier.txt");
        cfm.createCourierByFile(path);
        System.out.println(courier.getRidesList());
    }

}