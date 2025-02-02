package classworks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Classwork11 {
    public static void main(String[] args) {
        intArray();
    }

    private static void intArray() {
        int[] firstArray = {3,1,2,5,5,5,7,8};
        Set<Integer> hashSet = new HashSet<>();
        for (int j : firstArray) {
            hashSet.add(j);
        }
        System.out.println("Первый массив: " + Arrays.toString(firstArray));
        System.out.println("Исходный HashSet: " + hashSet);
        int i = 0;
        int[] secondArray = new int[hashSet.size()];
        for (Integer in : hashSet) {
            secondArray[i++] = in;
        }
        System.out.println("Второй массив: " + Arrays.toString(secondArray));
    }
}
