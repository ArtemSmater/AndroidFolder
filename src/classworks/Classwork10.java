package classworks;

import java.util.*;

public class Classwork10 {
    public static void main(String[] args) {
        ArrayList<Car> array = new ArrayList<>();
        array.add(new Car("Ялта",2));
        array.add(new Car("Краснодар",2));
        array.add(new Car("Мурманск",2));
        array.add(new Car("Иваново",2));
        array.add(new Car("Калуга",2));
        array.add(new Car("Владимир",2));
        array.add(new Car("Алтай",2));
        SortCars sortCars = new SortCars();
        array.sort(sortCars);
        for(Car car : array) {
            System.out.println(car.getLabel());
        }
    }
}
class SortCars implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getLabel().compareTo(o2.getLabel());
    }
}

class Car {
    private String label;
    private int number;

    public Car(String label, int number) {
        this.label = label;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public int getNumber() {
        return number;
    }
}