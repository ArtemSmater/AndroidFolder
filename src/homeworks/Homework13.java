package homeworks;

import java.util.Scanner;

public class Homework13 {
    static Scanner scanner = new Scanner(System.in);
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("-> ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Количество отрицательных чисел в массиве: " + negative(array, 0));
        numbers(array, 0);
    }

    public static void numbers (int[] array, int i){
        if(array[i] < 0){
            count1++;
        }
        if(i == array.length - 1){
            System.out.println("\nКоличество отрицательных чисел массива: " + count1);
            return;
        }
        numbers(array, i + 1);
    }

    public static int negative (int[] array, int i){
        if(array[i] < 0){
            count2++;
        }
        if(i == array.length - 1){
            return count2;
        }
        return negative(array, i + 1);
    }
}
