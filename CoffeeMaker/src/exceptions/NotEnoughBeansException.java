package exceptions;

public class NotEnoughBeansException extends BeansAmountException {

    public NotEnoughBeansException(double beans) {
        super(beans, beans + " # is not enough beans");
    }


    public String getMessage() {
        return "# is not enough beans";
    }
}
