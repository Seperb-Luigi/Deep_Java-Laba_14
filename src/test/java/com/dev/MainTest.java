package com.dev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Тест для Завдання 1: Очищення тексту
    @Test
    public void testCleanText() {
        String inputText = "    Hello,     world!    ";
        String expected = "Hello, world!";
        String actual = inputText.trim().replaceAll("\\s+", " ");
        assertEquals(expected, actual, "Текст не був очищений правильно.");
    }

    // Тест для Завдання 2: Масив з числами, що мають максимальну кількість цифр
    @Test
    public void testMaxDigitCountNumbers() {
        int[] numbers = {12, 345, 2, 6, 7896};
        int maxLength = 0;

        for (int num : numbers) {
            int length = Integer.toString(Math.abs(num)).length();
            if (length > maxLength) {
                maxLength = length;
            }
        }

        int[] result = new int[numbers.length];
        int index = 0;
        for (int num : numbers) {
            if (Integer.toString(Math.abs(num)).length() == maxLength) {
                result[index++] = num;
            }
        }

        // Перевірка результату
        int[] expected = {7896}; // Має бути лише одне число з максимальною кількістю цифр
        int[] actual = new int[index];
        System.arraycopy(result, 0, actual, 0, index);
        assertArrayEquals(expected, actual, "Масив не сформовано правильно.");
    }

    // Тест для Завдання 3: Заміна від'ємних чисел на []
    @Test
    public void testReplaceNegativeNumbers() {
        String inputString = "String 12 with numbers, -1, 2, 5, -4, 12. Replace all negative";
        String expected = "String 12 with numbers, [], 2, 5, [], 12. Replace all negative";

        // Розділяємо текст на частини по комах
        String[] parts = inputString.split(", ");
        StringBuilder resultString = new StringBuilder();

        // Перебираємо кожну частину
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            // Якщо в частині є від'ємне число
            if (part.contains("-")) {
                resultString.append("[]");
            } else {
                resultString.append(part);
            }
            // Додаємо кому, якщо не останній елемент
            if (i < parts.length - 1) {
                resultString.append(", ");
            }
        }

        // Додаємо решту частину тексту після останнього числа
        resultString.append(inputString.substring(inputString.lastIndexOf(parts[parts.length - 1]) + parts[parts.length - 1].length()));

        String actual = resultString.toString();

        // Перевірка
        assertEquals(expected, actual, "Рядок після заміни від'ємних чисел неправильний.");
    }
}