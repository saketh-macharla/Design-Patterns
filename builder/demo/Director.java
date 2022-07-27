package builder.demo;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
    void constructSUV(Builder builder){
        builder.reset();
        builder.setSeats(12);
        builder.setEngine("SportEngine-2");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
