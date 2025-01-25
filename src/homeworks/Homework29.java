package homeworks;

import java.util.Scanner;
import java.util.function.Predicate;

public class Homework29 {
    private static int count = 1;
    public static void main(String[] args) {
        do {
            emptyCheck(inputLine());
            count++;
        } while (count != 3);

    }

    public static String inputLine() {
        System.out.printf("Строка %d: ", count);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void emptyCheck(String line) {
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(line) ?
                "Строка " + count + " пустая!\n" :
                "Строка " + count + " не пустая!\n");
    }
}

