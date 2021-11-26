package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier { //futár

    private List<Ride> ridesList = new ArrayList<>();

    public void addRide(Ride ride) {
        for (int i = 0; i < ridesList.size(); i++) {
            if (isLargerThanNumberRideOfDay(i, ride)) {
                if (ridesList.get(i).getDayOfWeek() < ridesList.get(i+1).getDayOfWeek()) {
                    ridesList.add(ride);
                }
            }
            throw new IllegalArgumentException("Rossz adatot adtál meg!");
        }
    }

    private boolean isLargerThanNumberRideOfDay(int i, Ride ride) {
      if (ridesList.get(i).getNumberRideOfDay() > ridesList.get(i+1).getNumberRideOfDay()) {
          return true;
      }
      return false;
    }
}
