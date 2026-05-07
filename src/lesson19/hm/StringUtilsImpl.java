package lesson19.hm;

import com.sun.source.tree.Tree;

import java.sql.Array;
import java.util.*;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Arguments cannot be null");
        }
        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Arguments cannot be null");
        }
        Set<Integer> set = new TreeSet<>();
        int startIndex = 0;
        int foundIndex = text.indexOf(word, startIndex);
        while (foundIndex != -1) {
            set.add(foundIndex);
            startIndex = foundIndex + word.length();
            foundIndex = text.indexOf(word, startIndex);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer value : set) {
            result[index] = value;
            index++;
        }
        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        List<Double> listOfNumbers = new ArrayList<>();
        StringBuilder stringWithNumbers = new StringBuilder();
        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            if (Character.isDigit(symbol) || stringWithNumbers.length() != 0 && symbol == '.') {
                stringWithNumbers.append(symbol);
            } else if (stringWithNumbers.length() != 0) {
                double number = Double.parseDouble(String.valueOf(stringWithNumbers));
                listOfNumbers.add(number);
                stringWithNumbers.setLength(0);
            }
        }
        double[] arrayOfNumbers = new double[listOfNumbers.size()];
        int index = 0;
        for (Double value : listOfNumbers) {
            arrayOfNumbers[index] = value;
            index++;
        }
        return arrayOfNumbers;
    }
}
