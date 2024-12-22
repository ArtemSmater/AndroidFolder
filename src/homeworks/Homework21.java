package homeworks;

public class Homework21 {
    public static void main(String[] args) {

        Box[] boxes = new Box[6];
        boxes[0] = new Box(3, 2);
        boxes[1] = new Box(3, 3);
        boxes[2] = new Box(4, 4);
        boxes[3] = new Box3D(3, 2,4);
        boxes[4] = new Box3D(3, 4,5);
        boxes[5] = new Box3D(2, 2,2);

        for(Box box : boxes){
            box.showInfo();
        }
    }
}

class Box {
    private static int count = 0;
    private double length;
    private double width;

    public Box(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public void showInfo() {
        count++;
        System.out.println(boxInfo() + "\nVolume: " + boxVolume());
    }

    public String boxInfo() {
        return String.format("\nObject № %d Box {length = %.1f, width = %.1f}", count, length, width);
    }

    public double boxVolume() {
        String result = String.format("%.1f", length * width);
        return Double.parseDouble(result);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


}

class Box3D extends Box {
    private double height;
    private static int count = 1;

    public Box3D(int length, int width, int height) {
        super(length, width);
        setHeight(height);
    }

    @Override
    public String boxInfo() {
        return String.format("\nObject № %d Box3D {length = %.1f, width = %.1f, height = %.1f}",
                count, getLength(), getWidth(), height);
    }

    @Override
    public double boxVolume() {
        count++;
        return super.boxVolume() * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
