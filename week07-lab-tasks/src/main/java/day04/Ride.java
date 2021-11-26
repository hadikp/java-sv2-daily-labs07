package day04;

public class Ride {

    private int dayOfWeek;
    private int numberRideOfDay;
    private double kmOfRide;

    public Ride(int dayOfWeek, int numberRideOfDay, double kmOfRide) {
        this.dayOfWeek = dayOfWeek;
        this.numberRideOfDay = numberRideOfDay;
        this.kmOfRide = kmOfRide;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getNumberRideOfDay() {
        return numberRideOfDay;
    }

    public double getKmOfRide() {
        return kmOfRide;
    }


}
