package exceptions;

public class BeansAmountException extends Exception {
    //REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups
    protected double beans;

    public BeansAmountException(double beans) {
        super(beans + "# is not the right amount of beans");
        this.beans = beans;
    }

    protected BeansAmountException(double beans, String message) {
        super(message);
        this.beans = beans;
    }

    public double getBeans() { return this.beans; }
}
