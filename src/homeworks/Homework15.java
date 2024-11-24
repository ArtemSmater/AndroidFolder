package homeworks;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine().toLowerCase().trim().replaceAll("\\s","");
        String copy = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            copy += line.charAt(i);
        }
        if(copy.equals(line)){
            System.out.println("Строка палиндром!");
        } else {
            System.out.println("Строка не палиндром!");
        }
    }
}
