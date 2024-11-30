package homeworks;

import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {
        change(builder());
    }

    public static StringBuilder builder(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        return new StringBuilder(scanner.nextLine().trim().replaceAll("\\s", ""));
    }

    public static void change (StringBuilder builder){
        for (int i = 0; i < builder.length(); i++) {
            char symbol = builder.charAt(i);
            for (int j = i; j < builder.length(); j++) {
                if(symbol == builder.charAt(j) && j != i){
                    builder.replace(j, j + 1, " ");
                }
            }
        }
        System.out.println("Измененная строка: " +
                builder.toString().replaceAll("\\s", ""));
    }
}
