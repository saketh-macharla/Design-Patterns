package builder.demo;

public class CarBuilder implements Builder{
    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean flag) {
        this.car.setTripComputer(flag);
    }

    @Override
    public void setGPS(boolean flag) {
        this.car.setGps(flag);
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return  product;
    }
}
