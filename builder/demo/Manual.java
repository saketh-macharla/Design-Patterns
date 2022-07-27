package builder.demo;

public class Manual {
    private String seats;
    private String Engine;
    private String tripComputer;
    private String gps;

    public Manual() {
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public String isGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats='" + seats + '\'' +
                ", Engine='" + Engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
