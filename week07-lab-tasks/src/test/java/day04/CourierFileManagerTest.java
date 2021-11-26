package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    @Test
    void testReadFile() {
        CourierFileManager cfm = new CourierFileManager();
        Path path = Paths.get("src/test/resources/courier.txt");
        cfm.createCourierByFile(path);
    }

}