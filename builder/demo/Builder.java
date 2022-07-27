package builder.demo;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(boolean flag);
    void setGPS(boolean flag);
}
