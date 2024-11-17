package classworks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {

//        int sum = 0;
//        System.out.print("Введите число: ");
//        while (scanner.hasNextInt()){
//            System.out.print("Введите число: ");
//            sum += scanner.nextInt();
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        System.out.print("Введите начало диапазона: ");
//        int start = scanner.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int end = scanner.nextInt();
//        int sum = 0;
//        while (start <= end){
//            if(start % 2 == 1){
//                sum += start;
//            }
//            start++;
//        }
//        System.out.println("Сумма нечетных чисел: " + sum);

//        int a, sum = 0, count = 0;
//        do {
//            System.out.print("Введите число: ");
//            a = scanner.nextInt();
//            if(a < 0){
//                sum += a;
//                count++;
//            }
//        } while (a != 0);
//        System.out.printf("Среднее арифметическое чисел: %.2f", (float)sum / count);


//        int ascNum, descNum = 0, copy;
//        System.out.print("Введите число: ");
//        ascNum = scanner.nextInt();
//        copy = ascNum;
//        do{
//            descNum *= 10;
//            descNum += copy % 10;
//            copy /= 10;
//        } while (copy != 0);
//        System.out.println(ascNum == descNum ? "Число " + ascNum + " является палиндромом" : "Число " + ascNum + " не является палиндромом!");

//        int a, b = 0, count = 0;
//        while (true){
//            System.out.print("Введите число: ");
//            a = scanner.nextInt();
//            if(a == 0){
//                break;
//            } else if(count == 0){
//                b += a;
//                count++;
//            } else {
//                b *= a;
//            }
//        }
//        System.out.printf("Произведение чисел: %d", b);

//        int i = 1;
//        while (i < 10){
//            int j = 1;
//            while (j < 10){
//                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5){
//            int j = 0;
//            while (j <= 16){
//                System.out.print(i % 2 == 0 ? "+" : "-");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        int j = 0;
//        while (i < 10){
//            if (j == 0){
//                System.out.print("*");
//                j++;
//            } else {
//                int copy = j;
//                while (copy != 0){
//                    System.out.print(" ");
//                    copy--;
//                }
//                j++;
//                System.out.print("*");
//            }
//            System.out.println();
//            i++;
//        }


//        int i = 0;
//        while (i < 50){
//            int j = 0;
//            while (j < 50){
//                System.out.print(i == j ? "*" : " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//            if(i == 49){
//            }
//        }

//        int count = 0;
//        for (int i = 0; i < 5; i++){
//            System.out.print("-> ");
//            if(scanner.hasNextInt()){
//                count++;
//            }
//            scanner.nextLine();
//        }
//        System.out.println("Количество введенных цифр: " + count);

//        System.out.print("Количество символов: ");
//        int count = scanner.nextInt();
//        for(int i = 0; i < count; i++){
//            System.out.print("*");
//        }

//        System.out.print("Введите целое число: ");
//        int num = scanner.nextInt();
//        System.out.print("Числа: ");
//        for(int i = 1; i <= num; i++){
//            if(num % i == 0){
//                System.out.print(i + " ");
//            }
//        }

//        System.out.print("Введите начало диапазона: ");
//        int start = scanner.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int end = scanner.nextInt();
//        for(int i = start; i < end; i++){
//            if(i % 10 == i / 10) System.out.print(i + " ");
//        }

//        System.out.print("Введите высоту: ");
//        int height = scanner.nextInt();
//        System.out.print("Введите ширину: ");
//        int width = scanner.nextInt();
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                System.out.print(i == 0 ? " * " :
//                        i == height - 1 ? " * " :
//                        j == 0 ? " * " :
//                        j == width - 1 ? " * " : "   ");
//            }
//            System.out.println();
//        }

//        System.out.print("Введите длину гипотенузы: ");
//        int num = scanner.nextInt();
//        for (int i = num; i > 0; i--){
//            int b = i;
//            while (b > 0){
//                System.out.print("* ");
//                b--;
//            }
//            System.out.println();
//        }

//        System.out.print("Введите высоту треугольника: ");
//        int height = scanner.nextInt();
//        int indent = (height / 2) - 1;
//        for(int i = 0; i < height; i++){
//            if(i % 2 == 1){
//                int copy1 = indent;
//                while (copy1 > 0){
//                    System.out.print(" ");
//                    copy1--;
//                }
//                int copy2 = i;
//                while (copy2 > 0){
//                    System.out.print("*");
//                    copy2--;
//                }
//                indent--;
//                System.out.println();
//            }
//        }
//        System.out.print("Введите количество элементов: ");
//        int num = scanner.nextInt(), sum = 0;
//        int[] array = new int[num];
//        for(int i = 0; i < num; i++){
//            System.out.print("-> ");
//            int a = scanner.nextInt();
//            array[i] = a;
//        }
//        for(int i = 0; i < array.length - 1; i++){
//            if(array[i] < 0){
//                sum += array[i];
//            }
//        }
//        System.out.println("Сумма отрицательных чисел: " + sum);
//
//        System.out.print("Введите количество элементов: ");
//        int num = scanner.nextInt(), sum = 0;
//        int[] array = new int[num];
//        for(int i = 0; i < num; i++){
//            System.out.print("-> ");
//            int a = scanner.nextInt();
//            array[i] = a;
//        }
//        for(int i = 0; i < array.length - 1; i++){
//            if(array[i] < 0){
//                sum += array[i];
//            }
//        }
//        System.out.println("Сумма отрицательных чисел: " + sum);

//        System.out.print("Введите количество элементов: ");
//        int num = scanner.nextInt(), sum = 0;
//        int[] array = new int[num];
//        for(int i = 0; i < num; i++){
//            System.out.print("-> ");
//            int a = scanner.nextInt();
//            array[i] = a;
//        }
//        for(int i = 0; i < array.length - 1; i++){
//            if(array[i + 1] > array[i]){
//                System.out.print(array[i + 1] + " ");
//
//            }
//        }


//        System.out.print("Введите длину первого массива: ");
//        int size = scanner.nextInt();
//        int[] firstArray = new int[size];
//        int[] secondArray = new int[firstArray.length];
//        for(int i = 0; i < size; i++){
//            System.out.print("-> ");
//            firstArray[i] = scanner.nextInt();
//        }
//        for(int i = 0, j = firstArray.length - 1; i < firstArray.length; i++, j--){
//            secondArray[i] = firstArray[j];
//        }
//        System.out.print("Значения первого массива: ");
//        for(int num : firstArray){
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        System.out.print("Значения второго массива: ");
//        for(int num : secondArray){
//            System.out.print(num + " ");
//        }

//        int a = (int) (Math.random() * 7 - 2);

//        int[] array = new int[20];
//        for(int i =0; i < array.length; i++){
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        int sum = 0;
//        int count = 0;
//        for (int j : array) {
//            if (j % 2 == 0) {
//                count++;
//            } else {
//                sum += j;
//            }
//        }
//        System.out.println("Количество четных элементов: " + count);
//        System.out.println("Сумма нечетных элементов: " + sum);

//        int[] array = new int[50];
//        for(int i = 0; i < array.length; i++){
//            array[i] = (int) (i * Math.random());
//        }
//        for (int i : array){
//            System.out.print(i + " ");
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Начало диапазона: ");
//        int start = scanner.nextInt();
//        System.out.print("Конец диапазона: ");
//        int end = scanner.nextInt();
//        if(start > end){
//            System.out.println("Неправильно введенные значения!");
//        } else{
//            int[] array = new int[end - start + 1];
//            for(int i = start, j = 0; j < array.length; i++, j++){
//                array[j] = i;
//            }
//            System.out.println(Arrays.toString(array));
//        }
//        ArrayList<Integer> array = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        int num = 0;
//        while ((num = scanner.nextInt()) > 0){
//            array.add(num);
//        }
//        System.out.print("Введите индекс: ");
//        int index = scanner.nextInt();
//        if(index >= 0 && index < array.size()){
//            array.remove(index);
//            for(Integer i : array){
//                System.out.println(i + "\t");
//            }
//        } else {
//            System.out.println("Выход за пределы массива!");
//        }

//        ArrayList<Integer> array = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        int num = 0;
//        do {
//            num = scanner.nextInt();
//            if (num > 0) array.add(num);
//            else break;
//        } while (true);
//        System.out.print("Введите индекс: ");
//        int index = scanner.nextInt();
//        if (index >= 0 && index < array.size()) {
//            array.remove(index);
//            for (Integer i : array) {
//                System.out.println(i + "\t");
//            }
//        } else {
//            System.out.println("Выход за пределы массива!");
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for(int i = 0; i < 10; i++){
//            numbers.add(i, (int) (Math.random() * 101));
//        }
//        int max = numbers.get(1);
//        for (Integer number : numbers) {
//            if (max < number) {
//                max = number;
//            }
//        }
//        int min = numbers.get(1);
//        for (Integer number : numbers) {
//            if (min > number) {
//                min = number;
//            }
//        }
//        System.out.println(numbers + "\n");
//        System.out.println("Максимальное значение в массиве: " + max);
//        System.out.println("Минимальное  значение в массиве: " + min  + "\n");
//        for(int i = 0; i < numbers.size(); i++){
//            if(max == numbers.get(i)){
//                numbers.remove(i);
//                break;
//            }
//        }
//        for(int i = 0; i < numbers.size(); i++){
//            if(min == numbers.get(i)){
//                numbers.remove(i);
//                break;
//            }
//        }
//        numbers.add(0, min);
//        numbers.add(numbers.size(), max);
//        System.out.println(numbers);

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for(int i = 0; i < 10; i++){
//            numbers.add(i, (int) (Math.random() * 101));
//        }
//        int max = numbers.get(1);
//        for (Integer number : numbers) {
//            if (max < number) {
//                max = number;
//            }
//        }
//        int min = numbers.get(1);
//        for (Integer number : numbers) {
//            if (min > number) {
//                min = number;
//            }
//        }
//        System.out.println(numbers + "\n");
//        System.out.println("Максимальное значение в массиве: " + max);
//        System.out.println("Минимальное  значение в массиве: " + min  + "\n");
//
//
//        numbers.remove((Integer) max);
//        numbers.remove((Integer) min);
//
//        numbers.add(0, min);
//        numbers.add(numbers.size(), max);
//        System.out.println(numbers);

//        ArrayList<Integer> numbers1 = new ArrayList<>();
//        ArrayList<Integer> numbers2 = new ArrayList<>();
//        for(int i = 0; i < 3; i++){
//            numbers1.add(i + 1);
//        }
//        for(int i = 0; i < 3; i++){
//            numbers2.add((i + 1) * 10 + (i + 1));
//        }
//        int first = 0;
//        int second = 0;
//        System.out.print("Результат: ");
//        for (int i = 0; i <= numbers1.size() * 2 - 1; i++){
//            if(i % 2 == 0){
//                System.out.print(numbers1.get(first));
//                first++;
//            } else {
//                System.out.print(numbers2.get(second));
//                second++;
//            }
//            if(i != numbers1.size() * 2 - 1){
//                System.out.print(", ");
//            } else {
//                System.out.print(".");
//            }
//        }

//        ArrayList<Integer> numbers1 = new ArrayList<>();
//        ArrayList<Integer> numbers2 = new ArrayList<>();
//        for(int i = 0; i < 3; i++){
//            numbers1.add(i + 1);
//        }
//        for(int i = 0; i < 5; i++){
//            numbers2.add((i + 1) * 10 + (i + 1));
//        }
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = 0; i < numbers2.size(); i++){
//            if(i < numbers1.size()) result.add(numbers1.get(i));
//            if(i < numbers2.size()) result.add(numbers2.get(i));
//        }
//        System.out.println("Результат: " + result);

//        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(11,22,33,44,55));
//        int first = 0;
//        int second = 0;
//        System.out.print("Результат: ");
//        if(numbers1.size() == numbers2.size()){
//            for (int i = 0; i <= numbers1.size() * 2; i++){
//                if(i % 2 == 0){
//                    System.out.print(numbers1.get(first));
//                    first++;
//                } else {
//                    System.out.print(numbers2.get(second));
//                    second++;
//                }
//                if(i != numbers1.size() * 2 - 1){
//                    System.out.print(", ");
//                } else {
//                    System.out.print(".");
//                }
//            }
//        } else {
//            int sum = 0;
//            if(numbers1.size() > numbers2.size()){
//                sum = numbers1.size() - numbers2.size();
//            }
//        }

//        int a = 3;
//        int b = 3;
//        int first = 0;
//        int second = 0;
//        int third = 0;
//        int [][] array = new int[a][b];
//        for(int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length; j++){
//                int random = ((int) (Math.random() * 101));
//                array[i][j] = random;
//            }
//        }
//
//        for(int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length; j++){
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if(i == 0){
//                    first += array[i][j];
//                } else if (i == 1){
//                    second += array[i][j];
//                } else {
//                    third += array[i][j];
//                }
//            }
//        }
//
//
//        if (first < second && first < third){
//            System.out.println("Строка с наименьшим значением 1: " + first);
//        }
//
//        if (second < first && second < third){
//            System.out.println("Строка с наименьшим значением 2: " + second);
//        }
//
//        if (third < first && third < second){
//            System.out.println("Строка с наименьшим значением 3: " + third);
//        }
//
//        System.out.println("Сумма элементов первой строки: " + first);
//        System.out.println("Сумма элементов второй строки: " + second);
//        System.out.println("Сумма элементов третьей строки: " + third);

//        int[][] mas = new int[5][];
//        mas[0] = new int[1];
//        mas[1] = new int[2];
//        mas[2] = new int[3];
//        mas[3] = new int[4];
//        mas[4] = new int[5];
//        int count = 0;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] array = new int[5][];
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = new int[i + 1];
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = count;
//                count++;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
