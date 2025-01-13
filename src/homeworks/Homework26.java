package homeworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {
        ArraysActions.createArrays();
    }
}

class ArraysActions {
    public static void createArrays() {
        System.out.print("Введите количество элементов числового массива: ");
        int firstSize = inputInt();
        Integer[] arrayInt = fillIntArray(new Integer[firstSize]);
        System.out.print("Введите количество элементов строчного массива: ");
        int secondSize = inputInt();
        String[] arrayString = fillStringArray(new String[secondSize]);
        ConvertValues<Integer> convertValues1 = new ConvertValues<>();
        ConvertValues<String> convertValues2 = new ConvertValues<>();
        convertValues1.printArray(arrayInt);
        convertValues2.printArray(arrayString);
    }

    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) return scanner.nextInt();
        else return inputInt();
    }

    public static Integer[] fillIntArray(Integer[] array) {
        int count = 0;
        try {
            do {
                System.out.print("-> ");
                array[count] = inputInt();
                count++;
            } while (array.length - 1 >= count);
        } catch (Exception e) {
            throw new InputMismatchException();
        }

        return array;
    }

    public static String[] fillStringArray(String[] array) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("-> ");
            array[count] = scanner.nextLine();
            count++;
        } while (array.length - 1 >= count);
        return array;
    }
}

class ConvertValues<T> {
    public void printArray(T[] array) {
        System.out.print("Массив: ");
        for (T values : array) {
            System.out.print(values + " ");
        }
        System.out.println();
    }
}

