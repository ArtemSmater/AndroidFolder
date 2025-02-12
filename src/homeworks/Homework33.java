package homeworks;

import java.util.HashMap;
import java.util.Map;

public class Homework33 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("X", 1);
        hashMap.put("Y", 2);
        hashMap.put("Z", 3);
        System.out.println("Исходный Map: " + hashMap);
        System.out.println("Измененный Map: " + changeMap(hashMap));
    }

    private static Map<Integer, String> changeMap(Map<String, Integer> values) {
        Map<Integer, String> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            result.put(entry.getValue(), "[" + entry.getKey() + "]");
        }
        return result;
    }
}
