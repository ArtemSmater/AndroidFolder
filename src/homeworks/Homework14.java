package homeworks;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(counter(line));
    }

    public static String counter(String line){
        int small = 0;
        int big = 0;
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            if(symbol >= 'A' && symbol <= 'Z'){
                big++;
            } else if (symbol >= 'a' && symbol <= 'z'){
                small++;
            }
        }
        return String.format("Количество строчных букв: %d\n" +
                "Количество прописных букв: %d", small, big);
    }
}
