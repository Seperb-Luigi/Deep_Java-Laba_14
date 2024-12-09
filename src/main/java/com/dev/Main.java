package com.dev;

import java.util.Arrays;
public class Main {
    public static int[] FilCountNumb(int[] input) {
        return Arrays.stream(input)
                .filter(n -> Integer.toString(Math.abs(n)).length() <= 2)
                .toArray();
    }
    public static String repNegNum(String input) {
        return input.replaceAll("-\\d+", "NEGATIVE");
    }

    public static void main(String[] args) {
        int[] numbers = {467, -111, 999, 999, 666, 777, 333, 52, 7645, -41, 41};
        int[] processedNumbers = FilCountNumb(numbers);
        System.out.println("Оброблений масив: " + Arrays.toString(processedNumbers));

        String text = "-72 car, 14 taxi and -34 bus";
        String updatedText = repNegNum(text);
        System.out.println("new text: " + updatedText);
    }
}

