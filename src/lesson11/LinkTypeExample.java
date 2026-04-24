package lesson11;

public class LinkTypeExample {

    public void showLinkTypeExample() {
        Integer primitiveValue = 0;
        incrementValue(primitiveValue);
        System.out.println("Переменная в методе main = " + primitiveValue);
    }

    /**
     * Увеличивает значение переменной в него переданной
     * @param primitiveValue переменная
     */
    public void incrementValue(Integer primitiveValue) {
        primitiveValue++;
        System.out.println("Эта же переменная в методе increment = " + primitiveValue);
    }
}
