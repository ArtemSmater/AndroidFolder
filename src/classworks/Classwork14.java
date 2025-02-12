package classworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Classwork14 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneNumbers = new HashMap<>();
        addNumber("Романов", 889922, phoneNumbers);
        addNumber("Калинкин", 449988, phoneNumbers);
        addNumber("Калинкин", 116655, phoneNumbers);
        addNumber("Зотов", 778899, phoneNumbers);
        addNumber("Зотов", 112233, phoneNumbers);
        addNumber("Зотов", 445577, phoneNumbers);
        printValues(phoneNumbers);
    }

    private static void printValues(Map<String, ArrayList<Integer>> map) {
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString().substring(1, entry.getValue().toString().length() - 1));
        }
    }

    private static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}
