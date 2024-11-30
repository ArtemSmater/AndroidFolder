package classworks;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 Массив символов в строку

//        char[] array = {'П', 'р', 'и', 'в', 'е', 'т'};
//        String result = new String(array);
//        System.out.println(result);

        // 2 Строку в массив символов

//        String line = "I love programming";
//        char[] array = line.toCharArray();
////        for (int i = 0; i < array.length; i++) {
////            array[i] = line.charAt(i);
////        }

        // StringBuilder

        StringBuilder s = new StringBuilder();

        s.append("Hello world!"); // добавление элементов

        s.insert(s.length(), "   Привет!"); // добавление в определенное место

        s.delete(10, 13); // диапазон значений

        s.deleteCharAt(5); // удалить символ по индексу

        s.replace(5, 10, " Space");

        s.reverse();

        // Practice
        System.out.println(s);

        StringBuilder builder = createBuilder(5, 2);
        System.out.println(builder);
        updateBuilder(builder, '=', "равно");
        updateBuilder(builder, '+', "плюс");
        updateBuilder(builder, '*', "умножить");
        updateBuilder(builder, '/', "разделить");
        updateBuilder(builder, '-', "минус");
        System.out.println(builder);
//        for (char ch : array){
//            System.out.print(ch);
//        }

        // 3 Перезаписать строку в нижний/верхний регистр

//        String nameFemale = "Olga".toUpperCase();
//        String nameMale = "Artem".toLowerCase();
//        System.out.println(nameFemale + " " + nameMale);

        // 4 Взять определенный символ из строки

//        String text = "I want to speak English fluently";
//        char symbol = text.charAt(0);
//        System.out.println(symbol);

        // 5 Сколько букв в слове

//        System.out.print("Введите предложение: ");
//        String line = scanner.nextLine().toLowerCase();
//        int[] array = new int['я' - 'а' + 1];
//        for (int i = 0; i < line.length(); i++) {
//            char symbol = line.charAt(i);
//            if(symbol >= 'а' && symbol <= 'я')
//                array[symbol - 'а']++;
//        }
//        for (int i = 0, j = 'а'; i < array.length; i++, j++) {
//            char symbol = (char) j;
//            System.out.print(symbol + " = " + array[i] + " , ");
//        }
//        System.out.println(array.length);

        // 6 Замена символов в строке

//        String line = "I want to break free";
//        char[] array = line.replaceAll("\\s", "").toCharArray();
//        System.out.println(Arrays.toString(array));

//        String line = "https://dzen.ru/?clid=2411725&yredirect=true";
//        char[] array = line.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == '/') array[i] = '\\';
//        }
//        line = new String(array);
//        System.out.println(line);
//
//        String[] array = line.split("/");
//        String result = String.join("\\", array);
//        System.out.println(result);

        // 7 Нахождение индекса определенного символа

//        String line = "Im looking forward to the leaving the hospital";
//        int start = line.indexOf('l');
//        int end = line.lastIndexOf('l');
//        int middle1 = line.indexOf('l', start); // с какого индекса вправо
//        int middle2 = line.lastIndexOf('l', end); // с какого индекса влево

        // 8 Поменять слова местами (обрезка строки)

//        System.out.print("Введите строку: ");
//        String line = scanner.nextLine();
//        System.out.println(line.substring(line.indexOf(' ') + 1) +
//                " " + line.substring(0, line.indexOf(' ')));

        // 9 Разбить строку по символу в массив

//        String line = "I run every morning!";
//        String[] array = line.split(" ");
//        for(String s : array) System.out.println(s);

//        System.out.print("Введите ФИО полностью: ");
//        String line = scanner.nextLine();
//        String[] info = line.split("\\s");
//        String result = "";
//        for (int i = 0; i < info.length; i++) {
//            if (i != 0) {
//                info[i] = info[i].charAt(0) + ".";
//            }
//           result += info[i] + " ";
//        }
//        System.out.println(result);

        // 10 Перевернуть строку

//        System.out.print("Введите строку: ");
//        String line = scanner.nextLine();
//        for (int i = line.length() - 1; i >= 0 ; i--) {
//            System.out.print(line.charAt(i));
//        }

        // 11 Массив строк в строку

//        String[] array = new String[]{"Я","буду","хорошим","программистом","совсем","скоро!"};
//        String line = String.join(" ", array);
//        System.out.println(line);

        // Замена элементов в строке (1)

//        String line = "I learn Java. I want to be a Java developer";
//        String[] array = line.split("Java");
//        String result = String.join("Android", array);
//        System.out.println(result);

        // Замена элементов в строке (2)

//        String line = "I learn Java. I want to be a Java developer";
//        String result = line.replace("Java", "Android");
//        System.out.println(result);

        // Замена элементов в строеке (Практика)

//        String line = "Замените в этой строке все появления буквы 'о' на 'О', кроме первого и полседнего вхождения!";
//        String start = line.substring(0, line.indexOf('о') + 1);
//        String middle = line.substring(line.indexOf('о') + 1, line.lastIndexOf('о'));
//        middle = middle.replace('о', 'О');
//        String end = line.substring(line.lastIndexOf('о'));
//        System.out.println(start + middle + end);


//        String line = "Замените в этой строке все появления буквы 'о' на 'О', кроме первого и полседнего вхождения!";
//        String middle = line.substring(line.indexOf('о') + 1, line.lastIndexOf('о')).replace('о', 'О');
//        System.out.println(line.substring(0, line.indexOf('о') + 1) + middle + line.substring(line.lastIndexOf('о')));

//        System.out.print("Введите предложение: ");
//        String line = scanner.nextLine();
//        System.out.print("Регистер какого символа поменять: ");
//        String symbol = scanner.next();
//        char[] array = line.toCharArray();
//        for (int i = line.indexOf(symbol) + 1; i < line.lastIndexOf(symbol); i++)
//            if(array[i] == symbol.toCharArray()[0]) array[i] = symbol.toUpperCase().toCharArray()[0];
//        String result = new String(array);
//        System.out.println(result);

        // 12 Проверка на содержание элемента в строке
//        System.out.println("I learn Java every day".startsWith("I"));
//        System.out.println("I learn Java every day".endsWith("day"));
//        System.out.println("I learn Java every day".contains("I"));

        // 13 Замена элементов в строке (практика)

//        System.out.print("Введите строку: ");
//        String line = scanner.nextLine();
//        System.out.print("Заменяемое значение: ");
//        String find = scanner.nextLine();
//        System.out.print("Новое значение: ");
//        String change = scanner.nextLine();
//        if(line.contains(find)){
//            line = line.replace(find, change);
//            System.out.println(line);
//        } else {
//            System.out.println("Такого элемента не существует!");
//        }
    }

    public static StringBuilder createBuilder(int a, int b) {
        StringBuilder builder = new StringBuilder();
        builder.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        builder.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        builder.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        builder.append(a).append(" / ").append(b).append(" = ").append(a / b).append("\n");
        return builder;
    }

    public static void updateBuilder(StringBuilder builder, char oldValue, String newValue) {
        for (int i = 0; i < builder.length(); i++) {
            char symbol = builder.charAt(i);
            if (symbol == oldValue) builder.replace(i, i + 1, newValue);
        }
    }

// Exceptions
//    public static int getFactorial(int number){
//        int result = 1;
//        try {
//            if(number < 1){
//                throw new Exception("Your number is smaller than 1!");
//            }
//            for (int i = 1; i <= number; i++) {
//                result *= i;
//            }
//        } catch (Exception exception){
//            System.out.println(exception.getMessage());
//            result = number;
//        }
//        return result;
//    }
}
