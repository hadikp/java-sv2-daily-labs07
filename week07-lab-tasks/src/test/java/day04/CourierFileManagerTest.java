package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    CourierFileManager cfm;
    Path path;

    @BeforeEach
    void init() {
        cfm = new CourierFileManager();
        path = Paths.get("src/test/resources/courier.txt");
    }


    @Test
    void testReadFile() {
        cfm = new CourierFileManager();

    }

    @Test
    void  testCreateCourierByFile() {
        List<Ride> rideList = cfm.createCourierByFile(path).getRidesList();
        assertEquals(7, rideList.size());
        assertEquals(1, rideList.get(1).getDayOfWeek());
        assertEquals(2, rideList.get(3).getDayOfWeek());
    }

}