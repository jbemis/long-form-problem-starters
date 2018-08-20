package exceptions;

public class StaleCoffeeException extends Exception {
    private int timeSinceLastBrew;

    public StaleCoffeeException(int timeSinceLastBrew) {
        super(timeSinceLastBrew + "Too much time since last brew, stale coffee ew.");
        this.timeSinceLastBrew = timeSinceLastBrew;
    }
}
