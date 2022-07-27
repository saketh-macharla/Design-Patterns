package factory.pattern.demo;

abstract public class Plan {

    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }

}
