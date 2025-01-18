package homeworks.homework27;

import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        try {
            checkWavesInSentence(line);
        } catch (MyOwnException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkWavesInSentence(String line) throws MyOwnException {
        int count = returnWavesCount(line);
        if (count > 0 && count < 500) {
            System.out.println(count == 1 ? "Исходная строка на русском: " + line
                    + "\nВ ней содержится 1 гласная!" : "Исходная строка на русском: " +
                    line + "\nВ ней содержится " + count + " гласных!");
        } else if (count > 500) {
            System.out.println(count == 501 ? "Исходная строка на английском: " + line
                    + "\nВ ней содержится 1 гласная!" : "Исходная строка на английском: " +
                    line + "\nВ ней содержится " + (count - 500) + " гласных!");
        } else {
            throwException("Ошибка! В строке нет гласных букв!");
        }

    }

    public static void throwException(String message) throws MyOwnException {
        throw new MyOwnException(message);
    }

    public static int returnWavesCount(String line) {
        int result = 0;
        char[] vowelRus = {'а', 'А', 'у', 'У', 'о', 'О', 'ы', 'Ы', 'э', 'Э', 'я', 'Я', 'ю', 'Ю', 'ё', 'Ё', 'и', 'И', 'е', 'Е' };
        char[] vowelEng = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y' };
        char[] charLine = line.toCharArray();
        for (char c : charLine) {
            for (char rus : vowelRus) {
                if (c == rus) {
                    result++;
                }
            }
        }
        if (result == 0) result += 500;
        for (char c : charLine) {
            for (char value : vowelEng) {
                if (c == value) {
                    result++;
                }
            }
        }
        return result;
    }
}



