package classworks;

import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println();
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println(((Object)(512)).getClass().getSimpleName());

        /*
        %s - для вывода строковых значений, %-6s - номер_ (отсчет слева)
        %d - для вывода целочисленных значений, %8d - _____123 - выделение конкретного места под значение (отсчет справа)
        %f - для вывода вещественных чисел, %f.2 - вывод двух значений после запятой, %6.2f - 6 место для всех чисел, 2 - цифр после точки
        %c - для вывода одиночного символа
        */

        /*
                    Операции инкримента
        int a = 8;
        int b = ++a;  a = 9; b = 9; - сначала инкремент, потом присваивание

        int a = 8;
        int b = a++;  a = 9; b = 8; - операция инкремента самая крайняя
         */

//        int num = 2345;
//        int a = num % 10;
//        int num1 = (num - a) / 10;
//        int b = num1 % 10;
//        num1 = (num1 - b) / 10;
//        int c = num1 % 10;
//        int d = (num1 - c) / 10;
//
//        int anotherNum = (a * 1000) + (b * 100) + (c * 10) + d;
//
//        System.out.printf("Исходное число: %d\nОбратное число: %d", num, anotherNum);


//        int a = 5, b = 4, c = 7;
//
//        int sum = a + b + c;
//        int multiplication = a * b * c;
//        double average = (double) (sum) / 3;
//
//        System.out.printf("\nСумма чисел: %d\nПроизведение чисел: %d\nСреднее арифметическое: %.1f", sum, multiplication, average);

        Scanner scanner = new Scanner(System.in);
//        int a, b, c, d;
//        System.out.print("Введите четыре числа: \n" + "Первое число: ");
//        a = scanner.nextInt();
//        System.out.print("Второе число: ");
//        b = scanner.nextInt();
//        System.out.print("Третье число: ");
//        c = scanner.nextInt();
//        System.out.print("Четвертое число: ");
//        d = scanner.nextInt();
//        System.out.printf("Результат: %.2f", (double)(a + b) / (c + d));
//        scanner.close();

//        System.out.print("Введите ваш возраст: ");
//        int age = scanner.nextInt();
//        boolean isYoung = age < 18;
//        boolean isOld = age < 65;
//        if(isYoung || !isOld){ // false  false
//            System.out.println("Можно не работать");
//        } else {
//            System.out.println("Можно работать!");
//        }

//        System.out.print("Введите первую сторону: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите вторую сторону: ");
//        int b = scanner.nextInt();
//        System.out.print("Введите третью сторону: ");
//        int c = scanner.nextInt();
//        if(a == b && a == c){
//            System.out.println("Треугольник равносторонний");
//        } else if(a == b || a == c || b == c){
//            System.out.println("Треугольник равнобедренный");
//        } else {
//            System.out.println("Треугольник разносторонний");
//        }

//        System.out.print("Введите количество ворон: ");
//        int num = scanner.nextInt();
//        if(num >=0 && num <= 10){
//            if(num == 1){
//                System.out.println(num + " ворона.");
//            } else if(num <= 4 && num != 0){
//                System.out.println(num + " вороны.");
//            } else {
//                System.out.println(num + " ворон.");
//            }
//        } else {
//            System.out.println("Неккоректное число!");
//        }

//        System.out.print("Введите номер дня недели: ");
//        int day = scanner.nextInt();
//        if (day >= 1 && day <= 7) {
//            if(day <= 5){
//               switch (day){
//                   case 1 -> System.out.println("Рабочий день - понедельник.");
//                   case 2 -> System.out.println("Рабочий день - вторник.");
//                   case 3 -> System.out.println("Рабочий день - среда.");
//                   case 4 -> System.out.println("Рабочий день - четверг.");
//                   default -> System.out.println("Рабочий день - пятница.");
//               }
//            } else{
//                if (day == 6){
//                    System.out.println("Выходной день - суббота.");
//                } else {
//                    System.out.println("Выходной день - воскресенье.");
//                }
//            }
//        } else {
//            System.out.println("Несуществующий день!");
////        }
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a == 0 || b == 0 ? "Делить на ноль нельзя" : a / b);

//        System.out.print("Введите номер месяца: ");
//        int num = scanner.nextInt();
//        String s = switch (num) {
//            case 12, 1, 2 -> "Winter";
//            case 3, 4, 5 -> "Spring";
//            case 6, 7, 8 -> "Summer";
//            case 9, 10, 11 -> "Autumn";
//            default -> "Несуществующий месяц!";
//        };
//        System.out.println(s);


//        System.out.print("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите второе число: ");
//        a += scanner.nextInt();
//        System.out.print("Введите третье число: ");
//        a += scanner.nextInt();
//        System.out.println("Сумма чисел: " + a);

//        int a = true ? false ? 10 : 20 : 30;
//        System.out.println(a);

//        if(true){
//            if(false){
//                System.out.println(10);
//            } else {
//                System.out.println(20);
//            }
//        } else{
//            System.out.println(30);
//        }

//        System.out.print("Введите номер месяца: ");
//        int month = scanner.nextInt();
//        System.out.print("Введите год: ");
//        int year = scanner.nextInt();
//        int days = 0;
//        if(month >= 1 && month <= 12){
//            switch (month){
//                case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
//                case 4, 6, 9, 11 -> days = 30;
//                case 2 -> {
//                    if (year % 4 == 0) {
//                        days = 29;
//                    } else {
//                        days = 28;
//                    }
//                }
//            }
//            System.out.println("Количество дней: " + days);
//        } else {
//            System.out.println("Несуществующий месяц!");
//        }

//        System.out.print("Введите число в двеннадцатибальной системе: ");
//        int mark = scanner.nextInt();
//        System.out.print("Ваш балл в пятибальной системе: ");
//        switch ((mark >= 1 && mark <= 3) ? 2 :
//                (mark >= 4 && mark <= 6) ? 3 :
//                        (mark >= 7 && mark <= 9) ? 4 :
//                                (mark >= 10 && mark <= 12) ? 5 : 0){
//            case 2 -> System.out.print("2");
//            case 3 -> System.out.print("3");
//            case 4 -> System.out.print("4");
//            case 5 -> System.out.print("5");
//            case 0 -> System.out.print("такого значения нет!");
//        }

    }
}

