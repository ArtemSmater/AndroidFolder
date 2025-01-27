package homeworks;

import java.util.LinkedList;
import java.util.ListIterator;

public class Homework30 {
    public static void main(String[] args) {
        LinkedList<RainbowColors> colors = new LinkedList<>();
        colors.add(new RainbowColors("Red", 0));
        colors.add(new RainbowColors("Orange", 1));
        colors.add(new RainbowColors("Yellow", 2));
        colors.add(new RainbowColors("Green", 3));
        colors.add(new RainbowColors("LightBlue", 4));
        colors.add(new RainbowColors("Blue", 5));
        colors.add(new RainbowColors("Purple", 6));
        for (int i = 0; i < colors.size(); i++) {
            if(i == 0) {
                System.out.print("Список: [" + colors.get(i).getColor() + ", ");
            } else if (i == colors.size() - 1) {
                System.out.print(colors.get(i).getColor() + "]");
            } else {
                System.out.print(colors.get(i).getColor() + ", ");
            }
        }
        ListIterator<RainbowColors> listIterator = colors.listIterator();
        System.out.println("\n\nСписок итераторов в прямом направлении:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " " + listIterator.previousIndex());
        }
        System.out.println("\nСписок итераторов в обратном направлении:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " " + listIterator.nextIndex());
        }
    }
}

class RainbowColors {
    private String color;
    private int number;

    public RainbowColors(String color, int number) {
        setColor(color);
        setNumber(number);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Number = %d Color = %-9s Index =", number, color);
    }
}
