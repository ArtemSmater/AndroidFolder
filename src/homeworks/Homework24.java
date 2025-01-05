package homeworks;

import java.util.ArrayList;

public class Homework24 {
    public static void main(String[] args) {
        ArrayList<Resize> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(100, 150));
        for (Resize rectangle : rectangles) {
            rectangle.showInfo();
            rectangle.resizeWidth(250);
            rectangle.resizeLength(300);
            rectangle.showInfo();
        }
    }
}

interface Resize {
    void resizeWidth(int width);
    void resizeLength(int length);
    void showInfo();
}

class Rectangle implements Resize {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void resizeWidth(int width) {
        if (width > 0) this.width = width;
        else this.width = 1;
    }

    @Override
    public void resizeLength(int length) {
        if (length > 0) this.length = length;
        else this.length = 1;
    }

    @Override
    public void showInfo() {
        System.out.printf("\nWidth: %d, Height: %d", width, length);
    }
}
