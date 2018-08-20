package exceptions;

public class NoCupsRemainingException extends Exception {
    ///REQUIRES: cups remaining > 0, time since last brew < 60
    public NoCupsRemainingException() {
        super("No cups remaining.");
    }
}
