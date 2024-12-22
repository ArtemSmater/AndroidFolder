package practice;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void showInfo(){
        System.out.printf("Прямоугольник\nШирина: %s\nДлина: %s", width,length);
    }
}

class First extends Rectangle{
    private String background;

    public First(int width, int length, String background) {
        super(width, length);
        this.background = background;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nЦвет: %s", background);
    }
}

class Second extends Rectangle {

    private String ground;

    public Second(int width, int length, String ground) {
        super(width, length);
        this.ground = ground;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\nРамка: %s", ground);
    }
}

