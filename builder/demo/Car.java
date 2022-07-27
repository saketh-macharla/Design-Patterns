package builder.demo;

public class Car {

    private int seats;
    private String Engine;
    private boolean tripComputer;
    private boolean gps;

    public Car() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", Engine='" + Engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
