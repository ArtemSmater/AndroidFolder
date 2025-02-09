package homeworks;

import java.util.HashMap;
import java.util.Map;

public class Homework32 {
    public static void main(String[] args) {
        Color[] colors = new Color[10];
        colors[0] = new Color("red");
        colors[1] = new Color("orange");
        colors[2] = new Color("aqua");
        colors[3] = new Color("pink");
        colors[4] = new Color("gray");
        colors[5] = new Color("blue");
        colors[6] = new Color("white");
        colors[7] = new Color("black");
        colors[8] = new Color("yellow");
        colors[9] = new Color("brown");
        HashMap<String, Color> hashMap = new HashMap<>();
        for (Color color : colors) {
            hashMap.put(color.name(), color);
        }
        int counter = 1;
        for (Map.Entry<String, Color> value : hashMap.entrySet()) {
            String key = value.getKey();
            String color = value.getValue().toString().toUpperCase();
            System.out.printf("%d) %s: %s\n", counter++, key, color);
        }
    }
}

record Color(String name) {

    @Override
    public String toString() {
        return name;
    }
}
