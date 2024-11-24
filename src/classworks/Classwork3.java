package classworks;

import java.util.Scanner;

public class Classwork3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 2
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//            for (int j = 0; j < array.length; j++) {
//                if (i != j){
//                    if(array[i] == array[j]){
//                        j = 0;
//                        array[i] = (int) (Math.random() * 11);
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));

        // 1
//        System.out.print("Введите количество строк: ");
//        int lines = scanner.nextInt();
//        System.out.print("Введите количество столбцов: ");
//        int columns = scanner.nextInt();
//        int[][] array = new int[lines][columns];
//        int count = 0, change = 0;
//        for (int i = 0; i < lines; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = (int) (Math.random() * 101);
//            }
//        }
//        for (int[] anInt : array){
//            for (int i : anInt){
//                System.out.print(i + "\t\t");
//            }
//            System.out.println();
//        }
//        System.out.println("------------------------------------");
//        for (int i = 0; i < lines; i++) {
//            for (int j = 0; j < columns; j++) {
//                for (int k = 0; k < columns; k++) {
//                    if(array[i][j] < array[i][k]){
//                        int min = array[i][k];
//                        array[i][k] = array[i][j];
//                        array[i][j] = min;
//                        change++;
//                    }
//                    count++;
//                }
//                count++;
//            }
//            count++;
//        }
//        System.out.printf("Массив отсортирован за %d итераций, при этом сделано %d замен элементов \n",
//                count, change);
//        for (int[] anInt : array){
//            for (int i : anInt){
//                System.out.print(i + "\t\t");
//            }
//            System.out.println();
//        }


//        System.out.print("Введите размер: ");
//        int size = scanner.nextInt();
//        for (int i = 0; i <= size; i++) {
//            print(1, i);
//        }
//        for (int i = size - 1; i > 0; i--) {
//            print(1, i);
//        }
        arrayActions();
    }

    public static void arrayActions() {
        System.out.print("Введите длину массива: ");
        int size = scanner.nextInt();
        int choose = 0;
        int[] array = new int[size];
        do {
            System.out.print("""
                    Меню:
                    1. Ввод элементов массива
                    2. Отображение массива
                    3. Поиск элементов в массиве
                    4. Сортировка массива
                    5. Выход
                    Ваш выбор:\s""");
            choose = scanner.nextInt();

            switch (choose) {
                case 1 -> inputNumbers(array);
                case 2 -> printArray(array);
                case 3 -> searchNumber(array);
                case 4 -> sortArray(array);
                case 5 -> System.out.println("Выход!");
                default -> System.out.println("Неверный выбор!");
            }
        } while (choose != 5);
    }

    public static void inputNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void searchNumber(int[] array) {
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                result = i;
            }
        }
        if (result == -1) {
            System.out.println("Элемент не найден!");
        } else {
            System.out.println("Элемент найден, его позиция: " + (result + 1));
        }
    }

    public static void sortArray(int[] array) {
        System.out.print("Старый массив: ");
        printArray(array);
        for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
            for (int k = 0, l = 1; k < array.length - 1; k++, l++) {
                if (array[k] > array[l]) {
                    int f = array[k];
                    array[k] = array[l];
                    array[l] = f;
                }
            }
        }
        System.out.print("Новый массив: ");
        printArray(array);
    }


    public static void print(int start, int count) {
        for (int i = start; i <= count; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void convertTo() {
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.print("""
                В какую систему перевести число:\s
                1. Двоичную
                2. Восьмеричную
                3. Десятичную
                4. Шестнадцатеричную
                :\s""");
        int choose = scanner.nextInt();
        String result;
        switch (choose) {
            case 1 -> result = binary(num, 2);
            case 2 -> result = octal(num, 8);
            case 3 -> result = decimal(num, 10);
            case 4 -> result = hexadecimal(num, 16);
            default -> result = "Неверный выбор";
        }
        System.out.println("\nРезультат перевода: " + result);
    }

    public static String binary(int num, int base) {
        String[] envelope = {"0", "1"};
        if (num < base) {
            return envelope[num];
        } else {
            return binary(num / base, base) + envelope[num % base];
        }
    }

    public static String octal(int num, int base) {
        String[] envelope = {"0", "1", "2", "3", "4", "5", "6", "7"};
        if (num < base) {
            return envelope[num];
        } else {
            return octal(num / base, base) + envelope[num % base];
        }
    }

    public static String decimal(int num, int base) {
        String[] envelope = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        if (num < base) {
            return envelope[num];
        } else {
            return decimal(num / base, base) + envelope[num % base];
        }
    }

    public static String hexadecimal(int num, int base) {
        String[] envelope = {"0", "1", "2", "3", "4", "5", "6", "7", "8"
                , "9", "A", "B", "C", "D", "E", "F"};
        if (num < base) {
            return envelope[num];
        } else {
            return hexadecimal(num / base, base) + envelope[num % base];
        }
    }
}
