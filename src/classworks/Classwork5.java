package classworks;

public class Classwork5 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("yellow",5);
        triangle.info();
    }
}

abstract class  Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void info();

    public abstract void print();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Triangle extends Shape{
    private double side;

    public Triangle(String color, double side) {
        super(color);
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

    @Override
    public void info() {
        System.out.printf("=== Равносторонний треугольник ===\n" +
                "Сторона: %.1f\nЦвет: %s\nПлощадь: %.1f\nПериметр: %.1f", side, getColor(), getArea(), getPerimeter());
        print();
    }

    @Override
    public void print() {
        int copy = (int) side;
        for (int i = 0; i <= side; i++) {
            for (int j = 0; j < copy; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            copy--;
        }
    }
}
