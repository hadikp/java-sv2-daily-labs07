package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Courier { //futár

    private List<Ride> ridesList = new ArrayList<>(Arrays.asList(new Ride(0, 1, 1)));

    public void addRide(Ride newRide) {
            if (isLargerThendayOfWeek(newRide)) {
                    ridesList.add(newRide);
            } else {
                throw new IllegalArgumentException("Rossz adatot adtál meg!");
            }
    }

    private boolean isLargerThendayOfWeek(Ride newRide) {
        if (ridesList.get(ridesList.size()-1).getDayOfWeek() <= newRide.getDayOfWeek()) {
            return true;
        }
        return false;
    }

    private boolean isLargerThenNumberRideOfDay(Ride newRide) {
      if (ridesList.get(ridesList.size()-1).getNumberRideOfDay() < newRide.getNumberRideOfDay()) {
          return true;
      }
      return false;
    }

    public List<Ride> getRidesList() {
        return ridesList;
    }
}
