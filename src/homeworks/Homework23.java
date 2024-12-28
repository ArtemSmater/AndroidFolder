package homeworks;

public class Homework23 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Ball(4.5);
        figures[1] = new Cylinder(2, 2);
        figures[2] = new Pyramid(20,15);

        for (Figure figure : figures) {
            figure.showVolume();
        }
    }
}

abstract class Figure {
    private double radius;
    private double side;

    public Figure(double side, double radius) {
        setSide(side);
        setRadius(radius);
    }

    public Figure(double radius) {
        setRadius(radius);
    }

    public abstract void showVolume();

    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
        else this.radius = 1;
    }

    public void setSide(double side) {
        if (side > 0) this.side = side;
        else this.side = 1;
    }

    public double getRadius() {
        return radius;
    }

    public double getSide() {
        return side;
    }
}

class Ball extends Figure {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public void showVolume() {
        System.out.printf("\nFigure: %-8s | Figure's volume: %.2f",
                getClass().getSimpleName(), (4. / 3) * Math.PI * Math.pow(getRadius(), 3));
    }
}

class Cylinder extends Figure {
    public Cylinder(double side, double radius) {
        super(side, radius);
    }

    @Override
    public void showVolume() {
        System.out.printf("\nFigure: %-8s | Figure's volume: %.2f",
                getClass().getSimpleName(), Math.PI * Math.pow(getRadius(), 2) * getSide());
    }
}

class Pyramid extends Figure {
    public Pyramid(double side, double radius) {
        super(side, radius);
    }

    @Override
    public void showVolume() {
        System.out.printf("\nFigure: %-8s | Figure's volume: %.2f\n",
                getClass().getSimpleName(), 1 / 3. * getSide() * Math.pow(getRadius(), 2));
    }
}
