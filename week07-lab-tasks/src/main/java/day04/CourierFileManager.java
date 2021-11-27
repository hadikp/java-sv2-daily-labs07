package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CourierFileManager {

    public Courier createCourierByFile(Path path) {
        Courier courierManager = new Courier();
        List<String> workList = readFile(path);
        for (String st: workList) {
            String[] workListSplit = st.split(" ");
            Ride newRide = new Ride(Integer.parseInt(workListSplit[0]), Integer.parseInt(workListSplit[1]), Integer.parseInt(workListSplit[2]));
            courierManager.addRide(newRide);
        }
        return courierManager;
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
