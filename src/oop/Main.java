package oop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SetCity setCity = new SetCity();
        setCity.addCity("Пенза", 312);
        setCity.addCity("Петербург", 812);
        setCity.addCity("Новгород", 554);
        setCity.addCity("Томск", 712);
        setCity.addCity("Москва", 495);
        setCity.addCity("Новосибирск", 955);
        setCity.addCity("Омск", 183);
        System.out.println(setCity.getSize());
        System.out.println(setCity);
        setCity.removeCities(0, 5);
        System.out.println(setCity.getSize());
        System.out.println(setCity);
        setCity.reverseCollection();
    }
}

class SetCity {
    private final Set<City> hash = new HashSet<>();
    private final Set<City> tree = new TreeSet<>();

    private boolean isEven(int code) {
        return code % 2 == 0;
    }

    public void reverseCollection() {
        System.out.println("##############################################################\n" +
                "Печать городов в порядке убывания:");
        TreeSet<City> newTree = new TreeSet<>(tree);
        newTree.addAll(hash);
        Iterator<City> iterator = newTree.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeCities(int min, int max) {
        System.out.println("##############################################################\n" +
                "Удаляем города с количеством символов в названии больше 5: ");
        hash.removeIf(x -> x.getName().length() > min && x.getName().length() > max);
        tree.removeIf(x -> x.getName().length() > min && x.getName().length() > max);
    }

    public String getSize() {
        return String.format("\nКоличество городов: %d\n", hash.size() + tree.size());
    }

    public void addCity(String name, int code) {
        boolean result = !name.isEmpty() && code != 0;
        if (result) {
            if (isEven(code)) {
                hash.add(new City(name, code));
            } else {
                tree.add(new City(name, code));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Список городов с четным кодом (HashSet):\n");
        for (City city : hash) {
            result.append(city).append(";\n");
        }
        result.append("\nСписок городов с нечетным кодом (TreeSet):\n");
        for (City city : tree) {
            result.append(city).append(";\n");
        }
        return result.toString();
    }
}

class City implements Comparable<City> {
    private final String name;
    private final int code;

    public City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "; code: " + code;
    }

    @Override
    public int compareTo(City o) {
        return !name.isEmpty() ? name.compareTo(o.getName()) : 0;
    }
}
