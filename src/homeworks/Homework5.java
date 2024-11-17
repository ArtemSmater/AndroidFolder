package homeworks;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int hour = scanner.nextInt();
        String s = "";
        switch ((hour >= 0 && hour < 6) ? 1 :
                (hour >= 6 && hour < 13) ? 2 :
                        (hour >= 13 && hour < 17) ? 3 :
                                (hour >= 17 && hour < 24) ? 4 : 0) {
            case 1 -> s = "Доброй ночи.";
            case 2 -> s = "Доброе утро.";
            case 3 -> s = "Добрый день.";
            case 4 -> s = "Добрый вечер.";
            case 0 -> s = "Неккоректное значение времени!";
        }
        System.out.println(s);
    }
}
