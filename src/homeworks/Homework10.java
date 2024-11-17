package homeworks;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Выбор фигуры:\s
                1 - треугольник
                2 - прямоугольник
                3 - круг
                Ваш выбор:""");
        int shape = scanner.nextInt();
        switch (shape) {
            case 1 -> {
                System.out.print("Введите сторону a = ");
                int a = scanner.nextInt();
                System.out.print("Введите сторону b = ");
                int b = scanner.nextInt();
                System.out.print("Введите сторону c = ");
                int c = scanner.nextInt();
                double p = (a + b + c) / 2.;
                double squareTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.printf("\nПлощадь треугольника: %.2f\n", squareTriangle);
            }
            case 2 -> {
                double squareRectangle = 0;
                System.out.print("Введите сторону a = ");
                squareRectangle += scanner.nextInt();
                System.out.print("Введите сторону b = ");
                squareRectangle *= scanner.nextInt();
                System.out.printf("\nПлощадь прямоугольника: %.2f\n", squareRectangle);
            }
            case 3 -> {
                System.out.print("Введите радиус круга: ");
                double squareCircle = scanner.nextInt();
                System.out.printf("\nПлощадь круга: %.2f\n", Math.PI * Math.pow(squareCircle, 2));
            }
            default -> System.out.println("\nНеверный выбор!");
        }
    }
}
