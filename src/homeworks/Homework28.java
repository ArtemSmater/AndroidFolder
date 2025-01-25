package homeworks;

import java.util.Scanner;

interface ReturnSmall {
    String smallWord(String line1, String line2);
}

public class Homework28 {
    public static void main(String[] args) {
        printAnswer();
    }

    public static void printAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое слово: ");
        String first = scanner.nextLine();
        System.out.print("Второе слово: ");
        String second = scanner.nextLine();
        ReturnSmall searchSmall = (line1, line2) -> line1.length() < line2.length() ?
                line1 : line2.length() < line1.length() ?
                line2 : "не найдено, так как они равны по длине!";
        System.out.println("Самое короткое слово: " + searchSmall.smallWord(first, second));
    }
}
