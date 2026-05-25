package lesson19.classwork.bankExampleException;

public class CardLimitCletedException extends RuntimeException {
    public CardLimitCletedException() {
        super("Card limit cleted");
    }
}
