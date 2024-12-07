package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String number = scanner.nextLine().trim()
                .replaceAll("\\s","")
                .replaceAll("-","")
                .replaceAll("\\(","")
                .replaceAll("\\)","");
        String result = "";
        Pattern pattern = Pattern.compile("^[+-]?7\\d{10}$");
        Matcher matcher = pattern.matcher(number);
        while (matcher.find()){
            result = matcher.group();
        }
        System.out.println(result.isEmpty() ?
                "Неверно введен номер!" : "Номер верен: " + result);
    }
}
