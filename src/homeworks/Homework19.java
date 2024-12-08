package homeworks;

import java.util.Scanner;

public class Homework19 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3, 4);
        Rectangle rectangle3 = new Rectangle().newRectangle();
        rectangle1.getInfo();
        rectangle2.getInfo();
        rectangle3.getInfo();

        Car car1 = new Car();
        Car car2 = new Car("Пятерка", 2001, "Лада", 76, "dark green", 150000);
        car1.getInfo();
        car2.getInfo();
    }

    public static class Rectangle {
        private int a;
        private int b;

        public Rectangle(){
            setA(3);
            setB(9);
        }

        public Rectangle(int a, int b) {
            setA(a);
            setB(b);
        }

        public Rectangle newRectangle(){
            System.out.print("Введите длину: ");
            int a = scanner.nextInt();
            System.out.print("Введите ширину: ");
            int b = scanner.nextInt();
            return new Rectangle(a,b);
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public void setA(int a) {
            if (a > 0) {
                this.a = a;
            }
        }

        public void setB(int b) {
            if (b > 0) {
                this.b = b;
            }
        }

        public void stars() {
            System.out.println();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        public void getInfo() {
            System.out.println();
            System.out.printf("""
                    Длина прямоугольника: %d
                    Ширина прямоугольника: %d
                    Площадь прямоугольника: %d
                    Периметр прямоугольника: %d
                    Гипотенуза прямоугольника: %.2f""", getA(), getB(), square(), perimeter(), hypotenuse());
            stars();
        }

        public int square() {
            return a * b;
        }

        public int perimeter() {
            return 2 * (a + b);
        }

        public double hypotenuse() {
            return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        }

    }

    public static class Car {
        private String model;
        private int year;
        private String label;
        private int power;
        private String color;
        private int price;

        public Car() {
            model = "X7 M50i";
            year = 2021;
            label = "BMW";
            power = 530;
            color = "white";
            price = 10790000;
        }

        public Car(String model, int year, String label, int power, String color, int price) {
            setModel(model);
            setYear(year);
            setLabel(label);
            setPower(power);
            setColor(color);
            setPrice(price);
        }

        
        public Car newCar(){
            System.out.print("Год выпуска: ");
            int year = scanner.nextInt();
            System.out.print("Мощность: ");
            int power = scanner.nextInt();
            System.out.print("Цена автомобиля: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введите модель: ");
            String model = scanner.nextLine();
            System.out.print("Введите марку: ");
            String label = scanner.nextLine();
            System.out.print("Цвет автомобиля: ");
            String color = scanner.nextLine();
            return new Car(model, year, label, power, color, price);
        }

        public void getInfo() {
            System.out.println();
            System.out.printf("""
                    ************ Данные автомобиля ************
                    Название модели: %s
                    Год выпуска: %d
                    Производитель: %s
                    Мощность: %d л.с.
                    Цвет машины: %s
                    Цена: %d
                    ===========================================""",
                    getModel(), getYear(), getLabel(), getPower(), getColor(), getPrice());
            System.out.println();
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year > 0) {
                this.year = year;
            }
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            if (power > 0) {
                this.power = power;
            }
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            if (price > 0) {
                this.price = price;
            }
        }
    }
}
