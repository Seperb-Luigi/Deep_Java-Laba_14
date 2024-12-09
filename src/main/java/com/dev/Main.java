package com.dev;


    public class Main {
        public static void main(String[] args) {
            // Завдання 1: Видалення ведучих та кінцевих пробілів, заміна пробілів між словами на один
            String inputText = "         Hello,         world!        ";
            String cleanedText = inputText.trim().replaceAll("\\s+", " ");
            System.out.println("Очищений текст: " + cleanedText);  // Виведе: "Hello, world!"

            // Завдання 2: Формування масиву чисел, кількість цифр у яких дорівнює максимальній кількості цифр
            int[] numbers = {12, 345, 2, 6, 789};
            int maxLength = 0;

            // Знаходимо максимальну кількість цифр у числах
            for (int num : numbers) {
                int length = Integer.toString(Math.abs(num)).length();
                if (length > maxLength) {
                    maxLength = length;
                }
            }

            // Формуємо новий масив з чисел з такою ж кількістю цифр, як максимальна
            int[] result = new int[numbers.length];
            int index = 0;
            for (int num : numbers) {
                if (Integer.toString(Math.abs(num)).length() == maxLength) {
                    result[index++] = num;
                }
            }

            System.out.print("Числа з максимальною кількістю цифр: ");
            for (int i = 0; i < index; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();  // Перехід на новий рядок

            // Завдання 3: Замінити від'ємні числа на []
            String inputString = "String 12 with numbers -1, 2, 5, -4, 12. Replace all negative";
            String[] parts = inputString.split(", ");

            StringBuilder resultString = new StringBuilder();
            for (String part : parts) {
                if (part.contains("-")) {
                    resultString.append("[]").append(", ");
                } else {
                    resultString.append(part).append(", ");
                }
            }

            // Видалення останнього зайвого коми та пробілу
            resultString.setLength(resultString.length() - 2);

            // Додаємо решту частини рядка
            resultString.append(".");
            System.out.println("Рядок після заміни від'ємних чисел: " + resultString);
        }
    }

