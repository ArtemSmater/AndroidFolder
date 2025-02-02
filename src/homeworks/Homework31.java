package homeworks;

import java.util.*;

public class Homework31 {
    public static void main(String[] args) {
        System.out.println("Наименьший элемент в TreeSet: " + returnTheSmallest(fillCollection()));
    }

    private static TreeSet<Integer> fillCollection() {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.print("Введите количество значений: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("-> ");
            treeSet.add(scanner.nextInt());
        }
        return treeSet;
    }

    private static int returnTheSmallest(TreeSet<Integer> map) {
        return map.first();
    }
}
