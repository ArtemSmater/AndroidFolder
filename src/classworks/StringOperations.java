package classworks;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 Массив символов в строку
//        char[] array = {'П', 'р', 'и', 'в', 'е', 'т'};
//        String result = new String(array);
//        System.out.println(result);

        // 2 Строку в массив символов
//        String line = "I love programming";
//        char[] array = new char[line.length()];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = line.charAt(i);
//        }
//        for (char ch : array){
//            System.out.print(ch);
//        }

        // 3 Перезаписать строку в нижний/верхний регистр
//        String nameFemale = "Olga".toLowerCase();
//        String nameMale = "Artem".toUpperCase();
//        System.out.println(nameFemale + " " + nameMale);

        // 4 Взять определенный символ из строки
//        String text = "I want to speak English fluently";
//        char symbol = text.charAt(0);
//        System.out.println(symbol);

        // 5
//        System.out.print("Введите предложение: ");
//        String line = scanner.nextLine().toLowerCase();
//        int[] array = new int['я' - 'а' + 1];
//        for (int i = 0; i < line.length(); i++) {
//            char symbol = line.charAt(i);
//            if(symbol >= 'а' && symbol <= 'я')
//                array[symbol - 'а']++;
//        }
//        for (int i = 0, j = 'а'; i < array.length; i++, j++) {
//            char symbol = (char) j;
//            System.out.print(symbol + " = " + array[i] + " , ");
//        }
//        System.out.println(array.length);
    }

// Exceptions
//    public static int getFactorial(int number){
//        int result = 1;
//        try {
//            if(number < 1){
//                throw new Exception("Your number is smaller than 1!");
//            }
//            for (int i = 1; i <= number; i++) {
//                result *= i;
//            }
//        } catch (Exception exception){
//            System.out.println(exception.getMessage());
//            result = number;
//        }
//        return result;
//    }
}
