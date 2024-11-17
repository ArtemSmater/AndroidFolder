package practice;


import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {


        // 1
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int ascNum = scanner.nextInt();
//        int descNum = 0;
//        do {
//            descNum *= 10;
//            descNum += ascNum % 10;
//            ascNum /= 10;
//        } while (ascNum != 0);
//        System.out.println("Обратная запись числа: " + descNum);


        // 2
//        int a = 5;
//        int b = 7;
//
//        a += b;
//        b = a - b;
//        a -= b;
//
//        System.out.println("a = " + a + "\n" + "b = " + b);

        // 3
//        String line1 = "--------------------------------------";
//        String line2 = "\t\tJAVA PRIMITIVE TYPES\t\t";
//        String next = "\n";
//        String line3 = String.format("| %-12s | %-12s | %4s |", "CATEGORY", "NAME", "BITS");
//        String line4 = String.format("| %-12s | %-12s | %04d |", "Floating", "double", Double.SIZE);
//        String line5 = String.format("| %-12s | %-12s | %04d |", "Floating", "float", Float.SIZE);
//        String line6 = String.format("| %-12s | %-12s | %04d |", "Integral", "long", Long.SIZE);
//        String line7 = String.format("| %-12s | %-12s | %04d |", "Integral", "int", Integer.SIZE);
//        String line8 = String.format("| %-12s | %-12s | %04d |", "Integral", "short", Short.SIZE);
//        String line9 = String.format("| %-12s | %-12s | %04d |", "Integral", "byte", Byte.SIZE);
//        String line10 = String.format("| %-12s | %-12s | %04d |", "Integral", "char", Character.SIZE);
//        String line11 = String.format("| %-12s | %-12s | %04d |", "Boolean", "boolean", 1);
//        System.out.println(line1 + next + line2 + next + line1 + next + line3 + next + line1 + next + line4 + next + line5 + next + line6
//                + next + line7 + next + line8 + next + line9 + next + line10 + next + line11 + next + line1);

        // 4
//        System.out.print("Первое число: ");
//        int a = scanner.nextInt();
//        System.out.print("Второе число: ");
//        int b = scanner.nextInt();
//        System.out.print("Третье число: ");
//        int c = scanner.nextInt();
//        int sum = a + b + c;
//        System.out.printf("Сумма: %d\nПроизведение: %d\nСреднее арифметическое: %.1f", sum, a * b * c, sum / 3f );

        // 5
//        System.out.print("Введите четыре числа: \nПервое число: ");
//        int sum1 = scanner.nextInt();
//        System.out.print("Второе число: ");
//        sum1 += scanner.nextInt();
//        System.out.print("Третье число: ");
//        int sum2 = scanner.nextInt();
//        System.out.print("Четвертое число: ");
//        sum2 += scanner.nextInt();
//        System.out.printf("Результат: %.2f", (double)sum1 / sum2);

        // 6
//        System.out.print("What is your name? ");
//        String name = scanner.nextLine();
//        System.out.print("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Where do you live? ");
//        String city = scanner.nextLine();
//        System.out.println();
//        System.out.printf("This is %s\nHe is %d years old\nHe lives in %s", name, age, city);
//        System.out.println();

        // 7
//        String typeByte = String.format("Переменная типа byte   занимает %d байт памяти (%d  бит памяти), и принимает значения в диапазоне от %d до %d",
//                Byte.BYTES, Byte.SIZE,Byte.MIN_VALUE,Byte.MAX_VALUE);
//        String typeShort = String.format("Переменная типа short  занимает %d байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d",
//                Short.BYTES, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
//        String typeInt = String.format("Переменная типа int    занимает %d байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d",
//                Integer.BYTES, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
//        String typeLong = String.format("Переменная типа long   занимает %d байт памяти (%d бит памяти), и принимает значения в диапазоне от %d до %d",
//                Long.BYTES, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
//        String typeFloat = String.format("Переменная типа float  занимает %d байт памяти (%d бит памяти), и принимает значения в диапазоне от %s до %s",
//                Float.BYTES, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
//        String typeDouble = String.format("Переменная типа double занимает %d байт памяти (%d бит памяти), и принимает значения в диапазоне от %s до %s",
//                Double.BYTES, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
//        String next = "\n";
//        System.out.println(typeByte + next + typeShort + next + typeInt + next + typeLong + next + typeFloat + next + typeDouble);

        // 9
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        int copy = num, composition = 0, average = 0, count = 0;
//        do {
//            int lastValue = copy % 10;
//            if (count == 0) {
//                composition += 1;
//                composition *= lastValue;
//            } else {
//                composition *= lastValue;
//            }
//            average += lastValue;
//            count++;
//            copy /= 10;
//        } while (copy != 0);
//        System.out.printf("Произведение цифр числа %d: %d\nСреднее арифметическое числа %d: %.1f",
//                num, composition, num,(double) average / (double) count);
//        System.out.println();

        // 10
//        System.out.print("Введите первую сторону: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите вторую сторону: ");
//        int b = scanner.nextInt();
//        System.out.print("Введите третью сторону: ");
//        int c = scanner.nextInt();
//        System.out.println();
//        System.out.println(a == b && a == c ? "Треугольник равностороний!" :
//                a == b || b == c || c == a ? "Треугольник равнобедренный!" : "Треугольник разносторонний!");

        // 11
//        System.out.print("Введите количество ворон: ");
//        int count = scanner.nextInt();
//        if(count > 9) System.out.println("Слишком дохера ворон!");
//        else if (count < 0) System.out.println("Что-то мало ворон!");
//        else {
//        System.out.println(count == 1 ? "На ветке " + count + " ворона!" :
//                count > 1 && count < 5 ? "На ветке " + count + " вороны!" :
//                "На ветке " + count + " ворон!");
//        }

        // 12
//        System.out.print("Введите номер дня недели: ");
//        int number = scanner.nextInt();
//        String result = switch (number){
//            case 1 -> "Monday is a workday!";
//            case 2 -> "Tuesday is a workday!";
//            case 3 -> "Wednesday is a workday!";
//            case 4 -> "Thursday is a workday!";
//            case 5 -> "Friday is a workday!";
//            case 6 -> "Saturday is a holiday!";
//            case 7 -> "Sunday is a holiday!";
//            default -> "Wrong day!";
//        };
//        System.out.println(result);

        // 13
//        System.out.print("Первое число: ");
//        int a = scanner.nextInt();
//        System.out.print("Второе число: ");
//        int b = scanner.nextInt();
//        System.out.println(b == 0 ? "На ноль делить нельзя!" : "Частное чисел: " + a / b);

        // 14
//        System.out.print("Month number: ");
//        int month = scanner.nextInt();
//        System.out.print("Year: ");
//        int year = scanner.nextInt();
//        String days = switch (month){
//            case 1, 3, 5, 7, 8, 10, 12 -> "Days: " + 31;
//            case 4, 6, 9, 11 -> "Days: " +  30;
//            case 2 -> year % 2 == 0 ? "Days: " +  29 : "Days: " +  28;
//            default -> "Wrong month!";
//        };
//        System.out.println(days);

        // 15
//        System.out.print("Month number: ");
//        int month = scanner.nextInt();
//        String season = switch (month){
//            case 3, 4, 5 -> "Spring";
//            case 6, 7, 8 -> "Summer";
//            case 9, 10, 11 -> "Autumn";
//            case 12, 1, 2 -> "Winter";
//            default -> "Wrong month!";
//        };
//        System.out.println(season);

        // 16
//        System.out.print("Введите балл по 12-ти балльной системе оценивания: ");
//        int mark = scanner.nextInt();
//        int grade = switch ((mark > 0 && mark < 4) ? 1 :
//                (mark > 3 && mark < 7) ? 2 :
//                        (mark > 6 && mark < 10) ? 3 :
//                                (mark > 9 && mark < 13) ? 4 : 0){
//            case 1 -> 2;
//            case 2 -> 3;
//            case 3 -> 4;
//            case 4 -> 5;
//            case 0 -> 1;
//            default -> 0;
//        };
//        if(grade == 1){
//            System.out.println("Неверный или слишком низкий балл для перевода!");
//        } else {
//            System.out.println("Ваш балл по 5-ти балльной системе оценивания: " + grade);
//        }

        // 17
//        System.out.print("Введи количество мелочуги от 1 до 99: ");
//        int sum = scanner.nextInt();
//        int last = sum % 10;
//        if (sum > 0 && sum < 100){
//            System.out.print("У тебя в кармане ");
//            System.out.print(last == 1 && sum < 20 ? sum + " копейка!" :
//                    last > 1 && last < 5 && sum > 20 ? sum + " копейки!" : sum + " копеек!");
//        } else {
//            System.out.println("Неправильное количество монет!");
//        }

        // 18
//        System.out.print("Введите количество часов: ");
//        int hours = scanner.nextInt();
//        System.out.println(hours >= 0 && hours < 6 ? "Good night!" :
//                hours >= 6 && hours < 13 ? "Good morning!" :
//                hours >= 13 && hours < 17 ? "Good afternoon!" :
//                hours >= 17 && hours < 24 ? "Good evening!" : "Wrong hour!");

        // 19
//        System.out.print("Введите начало диапазона: ");
//        int start = scanner.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int end = scanner.nextInt();
//        System.out.println();
//        if(start >= end){
//            System.out.println("Некорректный диапазон значений!");
//        } else {
//            for (int i = start; i <= end; i++) {
//                if(i % 2 == 0){
//                    System.out.println("i = " + i);
//                }
//            }
//        }

        // 20
//        int sum = 0;
//        System.out.print("Введите число: ");
//        while (scanner.hasNextInt()){
//            System.out.print("Введите число: ");
//            sum += scanner.nextInt();
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

        // 21
//        System.out.print("Начало диапазона: ");
//        int start = scanner.nextInt();
//        System.out.print("Конец диапазона: ");
//        int end = scanner.nextInt(), sum = 0;
//        if (start >= end) {
//            System.out.println("\nНекорректный диапазон!");
//        } else {
//            for (int i = start; i <= end; i++) {
//                if (i % 2 == 1) sum += i;
//            }
//        }
//        System.out.println("\nСумма нечетныйх чисел: " + sum);

        // 22
//        int sum = 0, min = 0, max = 0, count = 0, scan;
//        do{
//            System.out.print("Введите число: ");
//            scan = scanner.nextInt();
//            if (count == 0) {
//                min = scan;
//                max = scan;
//            } else {
//                if (max < scan) max = scan;
//                if (min > scan && scan != 0) min = scan;
//            }
//            if(scan > 0){
//                sum += scan;
//                count++;
//            }
//        } while (scan != 0);
//        System.out.printf("\nСреднее арифметическое: %.2f \n\nМинимальное значение: %d\nМаксимальное значение: %d\n",
//                (double) sum / count, min, max);

        // 23 (1)
//        System.out.print("Введите число: ");
//        int scan = scanner.nextInt(), count = 0, sum = 0;
//        if (scan < 0) {
//            sum += scan;
//            count++;
//        }
//        while (scan != 0) {
//            System.out.print("Введите число: ");
//            scan = scanner.nextInt();
//            if (scan < 0) {
//                sum += scan;
//                count++;
//            }
//        }
//        System.out.printf("\nСреднее арифметическое отрицательных чисел: %.2f\n", sum / (double) count);
//
        // 23 (2)
//        int scan, count = 0, sum = 0;
//        do{
//            System.out.print("Введите число: ");
//            scan = scanner.nextInt();
//            if(scan < 0){
//                sum += scan;
//                count++;
//            }
//        } while (scan != 0);
//        System.out.printf("\nСреднее арифметическое отрицательных чисел: %.2f\n", sum / (double) count);

        // 24
//        System.out.print("Введите число: ");
//        int ascNum = scanner.nextInt(), descNum = 0, copy;
//        copy = ascNum;
//        do{
//            descNum *= 10;
//            descNum += copy % 10;
//            copy /= 10;
//
//        } while (copy > 0);
//        System.out.println(ascNum == descNum ? "Число " + ascNum + " палиндром!" :
//                "Число " + ascNum + " не является палиндромом!");

        // 24
//        int composition = 0, scan;
//        do{
//            System.out.print("Введите число: ");
//            scan = scanner.nextInt();
//            if (scan != 0 && composition == 0){
//                composition++;
//                composition *= scan;
//            } else if (scan != 0){
//                composition *= scan;
//            }
//
//        } while (scan != 0);
//        System.out.println("Произведение чисел: " + composition);

        // 25
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
//            }
//            System.out.println();
//        }

        // 26
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print("^");
//            }
//            System.out.println();
//        }

        // 27
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 11; j++) {
//                if(i % 2 == 0){
//                    System.out.print("+");
//                } else {
//                    System.out.print("-");
//                }
//            }
//            System.out.println();
//        }

        // 28
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(i == j){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // 29
//        System.out.print("Количество символов: ");
//        int count = scanner.nextInt();
//        for (int i = 0; i < count; i++) {
//            System.out.print("*");
//        }

        // 30
//        System.out.print("Введите целое число: ");
//        int num = scanner.nextInt();
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0){
//                System.out.print(i + " ");
//            }
//        }

        // 31
//        System.out.print("Введите начало диапазона: ");
//        int start = scanner.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int end = scanner.nextInt();
//        for (int i = start; i < end; i++) {
//            if(i / 10 == i % 10){
//                System.out.print(i + " ");
//            }
//        }

        // 32
//        System.out.print("Введите ширину прямоугольника: ");
//        int width = scanner.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        int height = scanner.nextInt();
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                if ((i == 0 || i == height - 1) || (j == 0 || j == width - 1)){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // 33
//        System.out.print("Введите высоту треугольника: ");
//        int height = scanner.nextInt();
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 34
//        System.out.print("Введите высоту треугольника: ");
//        int height = scanner.nextInt();
//        for (int i = height; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 34
//        System.out.print("Введите высоту треугольника: ");
//        int height = scanner.nextInt();
//        int space = height / 2;
//        for (int i = 0; i < height; i++) {
//            if(i % 2 == 1){
//                for (int j = 0; j < space; j++) {
//                    System.out.print(" ");
//                }
//                for (int g = 0; g < i; g++) {
//                    if(g == 0 || g == i - 1 || i == height - 1){
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//                space--;
//            }
//        }

        // 35
//        System.out.print("Введите размер поля: ");
//        int size = scanner.nextInt();
//        System.out.print("Введите количество символов: ");
//        int count = scanner.nextInt();
//        for (int i = 0; i < size; i++) {
//            if(i % 2 == 0){
//                for (int f = 0; f < count; f++) {
//                    for (int g = 0; g < size; g++) {
//                        if(g % 2 == 0){
//                            for (int j = 0; j < count; j++) {
//                                System.out.print(" * ");
//                            }
//                        } else {
//                            for (int j = 0; j < count; j++) {
//                                System.out.print("   ");
//                            }
//                        }
//                    }
//                    System.out.println();
//                }
//            } else {
//                for (int f = 0; f < count; f++) {
//                    for (int g = 0; g < size; g++) {
//                        if(g % 2 == 0){
//                            for (int j = 0; j < count; j++) {
//                                System.out.print("   ");
//                            }
//                        } else {
//                            for (int j = 0; j < count; j++) {
//                                System.out.print(" * ");
//                            }
//                        }
//                    }
//                    System.out.println();
//                }
//            }
//        }

        // 36
//        System.out.print("Количество символов: ");
//        int count = scanner.nextInt();
//        System.out.print("Введите тип символа: ");
//        String symbol = scanner.next();
//        System.out.print("Ориентация: \n" +
//                "0 - горизонтальная\n" +
//                "1 - вертикальная\nВыбор: ");
//        int orientation = scanner.nextInt();
//        for (int i = 0; i < count; i++) {
//            if(orientation == 0){
//                System.out.print(symbol + " ");
//            } else {
//                System.out.println(symbol);
//            }
//        }

        // 37
//        System.out.print("Введите высоту треугольника: ");
//        int height = scanner.nextInt();
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < i; j++) {
//                if(j == 0 || j == i - 1 || i == height - 1){
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//
//            }
//            System.out.println();
//        }

        // 38
//        System.out.print("Введите количество элементов массива: ");
//        int count = scanner.nextInt();
//        int[] array = new int[count];
//        if(count < 5){
//            for (int i = 0; i < count; i++) {
//                System.out.print("-> ");
//                array[i] = scanner.nextInt();
//            }
//        } else {
//            for (int i = 0; i < count; i++) {
//                array[i] = 0;
//            }
//        }
//        for(int num : array){
//            System.out.print(num + " ");
//        }

        // 39
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt(), sum = 0;
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.print("-> ");
//            array[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            if(array[i] < 0){
//                sum += array[i];
//            }
//        }
//        System.out.print(Arrays.toString(array) + "\nСумма отрицательных элементов массива: " + sum);
    }
}
