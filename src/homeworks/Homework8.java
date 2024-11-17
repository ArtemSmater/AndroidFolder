package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Начало диапазона: ");
        int start = scanner.nextInt();
        System.out.print("Конец диапазона: ");
        int end = scanner.nextInt();
        if(start > end){
            System.out.println("Неправильно введенные значения!");
        } else{
            int[] array = new int[end - start + 1];
            for(int i = start, j = 0; j < array.length; i++, j++){
                array[j] = i;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
