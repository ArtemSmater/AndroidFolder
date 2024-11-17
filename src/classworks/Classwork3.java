package classworks;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесены изменения");


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
//    }
//
//    public static void print(int start, int count){
//        for (int i = start; i <= count; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

    }
}
