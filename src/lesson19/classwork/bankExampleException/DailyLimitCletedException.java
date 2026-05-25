package lesson19.classwork.bankExampleException;

public class DailyLimitCletedException extends RuntimeException {
    public DailyLimitCletedException() {
        super("Limit cleted");
    }
}
