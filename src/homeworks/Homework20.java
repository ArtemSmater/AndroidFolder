package homeworks;

public class Homework20 {
    public static void main(String[] args) {
        FigureArea.triangleG(3,4,5);
        FigureArea.triangle(6, 7);
        FigureArea.box(7);
        FigureArea.rectangle(2,6);
        FigureArea.getCounter();
    }

    public static class FigureArea {
        private static int counter = 0;

        public static void triangleG(int a, int b, int c) {
            counter++;
            double p = (a + b + c) / 2.;
            double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("\nПлощадь треугольника по формуле Герона (%d, %d, %d): %.1f", a, b, c, result);
        }

        public static void triangle(int a, int b) {
            counter++;
            System.out.printf("\nПлощадь треугольника через основание и высоту (%d, %d): %.1f", a, b, (a * b) / 2.);
        }

        public static void box(int a) {
            counter++;
            System.out.printf("\nПлощадь квадрата (%d) : %d", a, a * a);
        }

        public static void rectangle(int a, int b) {
            counter++;
            System.out.printf("\nПлощадь прямоугольника (%d, %d) : %d", a, b, a * b);
        }

        public static void getCounter() {
            System.out.println("\nКоличество подсчетов: " + counter);
        }
    }
}


