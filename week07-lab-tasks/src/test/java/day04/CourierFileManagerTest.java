package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

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
        System.out.println(cfm.createCourierByFile(path).getRidesList());

    }

}