package homeworks;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пятизначное число: ");
        int ascNum = scanner.nextInt();
        int a = ascNum % 10;
        ascNum /= 10;
        int b = ascNum % 10;
        ascNum /= 10;
        int c = ascNum % 10;
        ascNum /= 10;
        int d = ascNum % 10;
        int e = ascNum / 10;

        int descNum = (10000 * e) + (1000 * d) + (100 * c) + (10 * b) + a;
        int composition = a * b * c * d * e;
        double average = (a + b + c + d + e) / 5.;

        System.out.printf("Произведение чисел числа %d : %d\nСреднее арифметическое числа %d : %.1f ", descNum, composition, descNum, average);
    }
}
