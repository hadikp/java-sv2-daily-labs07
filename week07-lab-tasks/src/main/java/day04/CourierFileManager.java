package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CourierFileManager {

    public void createCourierByFile(Path path) {
        List<String> workList = readFile(path);
        System.out.println(workList);

    }

    private List<String> readFile(Path path) {
        List<String> courierList = new ArrayList<>();
        try {
           courierList = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cant read file!", ioe);
        }
        return courierList;
    }
}
