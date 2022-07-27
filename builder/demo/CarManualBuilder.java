package builder.demo;

public class CarManualBuilder implements Builder{

    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setSeats("No fo seats:"+seats);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean flag) {
        this.manual.setTripComputer("TripComputer: "+flag);
    }

    @Override
    public void setGPS(boolean flag) {
        this.manual.setGps("GPS: "+flag);
    }

    public Manual getProduct(){
        Manual product = this.manual;
        this.reset();
        return  product;
    }
}
