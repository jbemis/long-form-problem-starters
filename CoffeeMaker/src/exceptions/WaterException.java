package exceptions;

public class WaterException extends Exception{
    private double water;

    public WaterException(double water) {
        super(water + "Not enough water supplied to the machine");
        this.water = water;
    }
}
