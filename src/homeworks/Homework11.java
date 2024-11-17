package homeworks;

import java.util.Scanner;

public class Homework11 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Площадь какой фигуры необходимо вычислить: \n" +
                "1 - прямоугольник, 2 - треугольник, 3 - круг: ");
        int shape = scanner.nextInt();
        operation(shape);
    }

    public static void operation(int shape){
        switch (shape) {
            case 1 -> {
                System.out.print("\nВведите сторону a = ");
                int a = scanner.nextInt();
                System.out.print("Введите сторону b = ");
                int b = scanner.nextInt();
                System.out.printf("\nПлощадь прямоугольника: %.2f\n", rectangle(a, b));
            }
            case 2 -> {
                System.out.print("\nВведите сторону a = ");
                int c = scanner.nextInt();
                System.out.print("Введите сторону b = ");
                int d = scanner.nextInt();
                System.out.print("Введите сторону c = ");
                int f = scanner.nextInt();
                System.out.printf("\nПлощадь треугольника: %.2f\n", triangle(c, d, f));
            }
            case 3 -> {
                System.out.print("\nВведите радиус круга: ");
                int r = scanner.nextInt();
                System.out.printf("\nПлощадь круга: %.2f\n", circle(r));
            }
            default -> System.out.println("\nНеверный выбор!");
        }
    }

    public static double rectangle (int a, int b){
        return a * b;
    }

    public static double triangle (int a, int b, int c){
        double p = (a + b + c) / 2.;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double circle (int r){
        return Math.PI * Math.pow(r, 2);
    }
}
