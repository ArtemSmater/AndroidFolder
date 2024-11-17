package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // 1
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("-> ");
//            array[i] = scanner.nextInt();
//        };
//        for (int i = 1; i <= size - 1; i++) {
//            if(array[i - 1] < array[i]){
//                System.out.print(array[i] + " ");
//            }
//        }

        // 2
//        int[] array = new int[20];
//        int min = 0;
//        int max = 0;
//        int count = 0, sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 41 + 10);
//        }
//        min = array[0];
//        max = array[0];
//        for (int j : array) {
//            if (min > j) min = j;
//            if (max < j) max = j;
//            if(j % 2 == 0){
//                count++;
//            } else {
//                sum += j;
//            }
//        }
//        System.out.println(Arrays.toString(array) + "\nКоличество четных элементов: " + count
//        + "\nСумма нечетных элементов: " + sum + "\nМинимальное значение: " + min +
//                "\nМаксимальное значение: " + max);

        // 3
//        ArrayList<Integer> array = new ArrayList<>();
//        int scan;
//        do{
//            System.out.print("Введите число: ");
//            scan = scanner.nextInt();
//            if(scan > 0){
//                array.add(scan);
//            }
//        } while (scan > 0);
//        System.out.print("Введите индекс элемента: ");
//        array.remove(scanner.nextInt());
//        for (int i : array) {
//            System.out.println(i + "   ");
//        }

        // 4
//        ArrayList<Integer> array = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            array.add((int) (Math.random() * 101));
//        }
//        int min = array.get(0);
//        int max = 0;
//        for (int j : array) {
//            if (min > j) min = j;
//            if (max < j) max = j;
//        }
//        int indMin = array.indexOf(min);
//        int indMax = array.indexOf(max);
//
//        for(int i : array){
//            System.out.print(i + "  ");
//        }
//        array.remove(indMin);
//        array.remove(indMax);
//        array.add(0, min);
//        array.add(array.size(), max);
//
//        System.out.println("\n\nМинимальное значение массива: " + min + "\n" +
//                "Максимальное значение: " + max + "\n");
//
//        for(int i : array){
//            System.out.print(i + "  ");
//        }

        // 5
//        int[] array1 = new int[5];
//        int[] array2 = new int[array1.length];
//        int[] array3 = new int[array2.length];
//        for (int i = 0, j = 1; i < array1.length; i++, j++) {
//            array1[i] = j;
//        }
//        for (int i = 0, j = 1; i < array1.length; i++, j++) {
//            array2[i] = j * 10 + j;
//        }
//        for (int i = 0; i < array3.length; i++) {
//            array3[i] = array1[i];
//            array3[i] = array2[i];
//        }
//        System.out.println(Arrays.toString(array3));

        // 6
//        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(11,22,33));
//        ArrayList<Integer> array3 = new ArrayList<>();
//        for (int i = 0; i < array1.size(); i++) {
//            array3.add(array1.get(i));
//            array3.add(array2.get(i));
//        }
//        System.out.println(array3);

        // 7
//        int[][] array1 = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//        for(int[] num : array1){
//            for (int i : num) {
//                System.out.print(i + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int[] ints : array1) {
//            for (int anInt : ints) {
//                System.out.print(anInt * anInt + "\t");
//            }
//            System.out.println();
//        }

        // 8
//        System.out.print("Количество строк: ");
//        int line = scanner.nextInt();
//        System.out.print("Количество столбцов: ");
//        int column = scanner.nextInt();
//        int [][] array = new int[column][line];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 31 - 20);
//            }
//        }
//        int count = 0;
//        for (int[] ints : array) {
//            for (int anInt : ints) {
//                System.out.print(anInt + "\t\t");
//                if (anInt < 0){
//                    count++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("\nКоличество отрицательных чисел: " + count);

        // 9
//        System.out.print("Количество строк: ");
//        int line = scanner.nextInt();
//        System.out.print("Количество столбцов: ");
//        int column = scanner.nextInt();
//        int [][] array = new int[line][column];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 101);
//            }
//        }
//        int sum1 = 0, sum2 = 0, sum3 = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t\t");
//                if(i == 0) sum1 += array[i][j];
//                if (i == 1) sum2 += array[i][j];
//                else sum3 += array[i][j];
//            }
//            System.out.println();
//        }
//        System.out.println("\nСумма элементов строки 1: " + sum1
//        + "\nСумма элементов строки 2: " + sum2 + "\nСумма элементов строки 3: " + sum3);
//
//        System.out.println(sum1 < sum2 && sum1 < sum3 ? "\nСтрока с минимальной суммой элементов " +
//                sum1 + ", имеет номер " + 1 : sum2 < sum1 && sum2 < sum3 ? "\nСтрока с минимальной суммой элементов " +
//                sum2 + ", имеет номер " + 2 : "\nСтрока с минимальной суммой элементов " +
//                sum3 + ", имеет номер " + 3);

        // 10
//        System.out.print("Размер массива: ");
//        int size = scanner.nextInt();
//        int[][] array = new int[size][];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < i; j++) {
//                array[i] = new int[j];
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 11);
//            }
//        }
//        for(int[] i : array){
//            for(int g : i){
//                System.out.print(g + " ");
//            }
//            System.out.println();
//        }

        // 11
//        int[][] array = new int[5][];
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new int[i + 1];
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = count++;
//            }
//        }
//        for(int[] anInt : array){
//            for(int i : anInt){
//                System.out.print(i + "\t");
//            }
//            System.out.println();
//        }

        // 12
//        int[][] array = new int[5][];
//        for (int i = array.length - 1; i >= 0; i--) {
//            array[i] = new int[i + 1];
//        }
//        int count = 10;
//        for (int i = array.length - 1; i >= 0 ; i--) {
//            for (int j = array[i].length - 1; j >= 0 ; j--) {
//                array[i][j] = count;
//                count++;
//            }
//        }
//        for (int i = array.length - 1; i >= 0 ; i--) {
//            for (int j = array[i].length - 1; j >= 0 ; j--) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

        // 13
//        System.out.print("Введите начало диапазона: ");
//        int start = scanner.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int end = scanner.nextInt();
//        int[] array = new int[end - start + 1];
//        for (int i = start, j = 0; j < array.length; i++, j++) {
//            array[j] = i;
//        }
//        for(int i : array){
//            System.out.print(i + "\t");
//        }

        // 14
//        System.out.print("Введите высоту массива: ");
//        int height = scanner.nextInt();
//        System.out.print("Введите ширину массива: ");
//        int width = scanner.nextInt();
//        int[][] array1 = new int[height][width];
//        int[] array2 = new int[width];
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                array1[i][j] = (int) (Math.random() * 11);
//            }
//        }
//        for (int i = 0; i < width; i++) {
//            array2[i] = (int) (Math.random() * 11);
//        }
//        System.out.println("Двумерный массив: ");
//        for(int[] i : array1){
//            for (int j : i){
//                System.out.print(j + " \t");
//            }
//            System.out.println();
//        }
//        System.out.println("\nОдномерный массив: ");
//        for(int i : array2){
//            System.out.print(i + "\t");
//        }
//
//        for (int i = 0; i < array1.length; i++) {
//            if (i % 2 == 1){
//                array1[i] = array2;
//            }
//        }
//        System.out.println("\n\nРезультат : ");
//        for(int[] i : array1){
//            for (int j : i){
//                System.out.print(j + " \t");
//            }
//            System.out.println();

//        System.out.println(maxValue(3, 8, 9, 4, 1, 2, 5));
//        System.out.println(maxValue(1, 2, 5));
//        int[] array = {-2, 3, 8, -11, -4, 6};
//        System.out.println(count(array));

//        System.out.print("Введите размер зубчатого массива: ");
//        int size = scanner.nextInt();
//        int[][] array = new int[size][];
//        int copy = size;
//        for (int i = 0; i < size; i++) {
//            array[i] = new int[i + 1];
//            array[i][0] = 1;
//            array[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
//            }
//        }
//        for (int[] ints : array) {
//            for (int j = 0; j < copy; j++) {
//                System.out.print("  ");
//            }
//            for (int anInt : ints) {
//                if (anInt < 10) {
//                    System.out.print(anInt + "    ");
//                } else if (anInt < 100) {
//                    System.out.print(anInt + "   ");
//                } else if (anInt < 1000) {
//                    System.out.print(anInt + "  ");
//                } else {
//                    System.out.print(anInt + " ");
//                }
//
//            }
//            System.out.println();
//            copy--;
        int[] array = {1, 2, 3, 4, 7};
        System.out.print(amount(0, array));
//        }
    }

    public static int amount(int num, int[] array){
        if(num == array.length - 1){
            return array[num];
        }
        return array[num] + amount(num + 1, array);
    }

    public static int count (int[] v){
        int count = 0;
        for (int j : v) {
            if (j < 0) {
                count++;
            }
        }
        System.out.print("Количество отрицательных чисел в массиве: ");
        return count;
    }

    // 8
    public static void calculator(){
        double a = input();
        double b = input();
        System.out.print("""
                1 - сумма
                2 - разность
                3 - произведение
                4 - частное
                Выберите номер операции:\s""");
        double operation = scanner.nextDouble();
        if(operation > 0 && operation < 5) System.out.println("Результат: " + result(operation, a,b));
        else {
            System.out.println("Операции не существует!");
        }

    }
    public static double input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        if(scanner.hasNextDouble()){
            return scanner.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод!");
            return input();
        }
    }

    public static double result(double operation, double a, double b){
        return switch ((int) operation){
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            default -> b == 0 ? Double.NaN : a / b;
        };
    }



    // 7
    public static void operation(int...v){
        switch (v.length){
            case 2 -> System.out.println("Сумма двух чисел: " + sum(v[0], v[1]));
            case 3 -> System.out.println("Сумма трех чисел: " + sum(v[0], v[1], v[2]));
            default -> System.out.println("Неверное количество данных!");
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b;
    }

    // 6
    public static int maxValue(int[] v){
        int max = v[0];
        for (int j : v) {
            if (max < j) max = j;
        }
        return max;
    }


    // 5
    public static void printLine(int start, int end){
        for (int i = start; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 4
    public static void numbers (int... v){
        int max = 0;
        for (int j : v) {
            if (j % 13 == 0 && j > 0) {
                if (max < j) max = j;
            }
        }
        System.out.println(max == 0 ? "Число не найдено" : max);
    }

    // 3
//    public static void operation(int a, int b){
//        System.out.print("Результат: ");
//        System.out.print(a > b ? (a - b) : (a + b));
//    }
    // 2
    public static void cube(int count){
        for (int i = 1; i < count; i++) {
            System.out.println(i + " в кубе = " + (int) Math.pow(i, 3));
        }
    }

    // 1
    public static String average (int...v){
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j : v) {
            sum += j;
        }
        double average = (double) sum / v.length;
        for (int j : v) {
            if (j < average) {
                numbers.add(j);
            }
        }
        return String.format("Среднее арифметическое: %.1f\n%s", average, numbers);
    }
}
