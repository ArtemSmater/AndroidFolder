package classworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Patterns {
    public static void main(String[] args) {
//        String line = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:25. " +
//                "Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09. []";
//        try {
//            String pattern = "[А-Я\\[\\]]";
            // 1 [0-9] - поиск всех цифр по одному символу
            // 2 [0-9][0-9][0-9][0-9] - 4 цифры подряд (0 - 9)
            // 3 [12] - поиск либо 1 или 2
            // 4 [А-Яа-яЁё] / [А-яЁё] - поиск всех русскоязычных символов
            // 5 [A-Za-z] - поиск всех англоязычных символов
            // 6 [А-Я\\[\\]]"; - спецсимволы экранируются \\, символ - пишется в начале или в конце
            // 7 [^0-9] - абсолютно все, кроме цифр
            // 8 [0-9][0-9]:[0-9][0-9] 4-х значное число до 99:99
            // 9 "." - вывести все символы строки по отдельности

            // 10 //d - ищет цифру (аналог [A-Z]) //D - все, кроме цифр
            // 11 //s - ищет пробелы, //S - все, без пробелов
            // 12 //w - ищет букву, цифру, подчеркивание (кроме кириллицы) //W - все, кроме
            // 13
            // + от 1 до бесконечности (одно и более) [\\d]+
            // * от 0 до бесконечности (может не быть, может быть сколь угодно) [\\d]*
            // ? от 0 до 1 (либо нет, либо одно) [\\d]?
            // {2} - только два повторения
            // {2,} - от двух до бесконечности
            // {2,4} - от двух до четырех
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(line);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
                // 1 индексы начала и конца строки
//            System.out.println("Шаблон совпадения найден с " +
//                    matcher.start() + " по " + (matcher.end() - 1));

                // 2 вывод совпадений (1)
//            System.out.println(line.substring(matcher.start(), matcher.end()));

                // 2 вывод совпадений (2)
//            System.out.println(matcher.group());
//            }
//        } catch (PatternSyntaxException exception){
//            System.out.println("Неправильное регулярное выражение: "
//                    + exception.getMessage());
//            System.out.println("Описание: " + exception.getDescription());
//            System.out.println("Позиция: " + exception.getIndex());


        // 1 Пример с цифровыми значениями
//        String numbers = "Цифры: 7, +17, -42, 0013, 0.333";
//        String find1 = "[+-]?\\d+\\.?\\d*";
//        Pattern pattern1 = Pattern.compile(find1);
//        Matcher matcher1 = pattern1.matcher(numbers);
//        while (matcher1.find()){
////            System.out.println(matcher1.group());
//        }

        // 2 Пример со строковыми значениями
//        String htmlCode = "author=Пушкин А.С.; title = Евгений Онегин;" +
//                "price =200; year= 1831";
////        String find2 = "\\w+\\s?=\\s?[А-я0-9]+\\s?[А-я]*\\.?\\s?[А-я]?\\.?";
////        String find2 = "\\w+\\s?=\\s?[А-я0-9 .]+";
//        String find2 = "\\w+\\s?=[^;]+"; // все до указанного символа
//        Pattern pattern2 = Pattern.compile(find2);
//        Matcher matcher2 = pattern2.matcher(htmlCode);
//        while (matcher2.find()){
////            System.out.println(matcher2.group());
//        }

        // 3 Практика
//        String phone = "+ 7 499 456-45-78, +74994564578, 7 (499) 456 45 78, " +
//                "74994564587";
//        String find3 = "\\+?7\\d{11}";
//        Pattern pattern3 = Pattern.compile(find3);
//        Matcher matcher3 = pattern3.matcher(phone);
//        while (matcher3.find()){
////            System.out.println(matcher3.group());
//        }

        // 4 Практика
//        String text = "Python (в русском языке встречаются названия питон[16] или пайтон[17]) - " +
//                "высокоуровневый язык программирования общего назначения с динамической " +
//                "строгой типизацией и автоматическим управлением памятью[18][19].";
//
//        Pattern pattern4 = Pattern.compile("\\[\\d\\d]");
//        Matcher matcher4 = pattern4.matcher(text);
//        while (matcher4.find()){
////            System.out.println(matcher4.group());
//        }

        // 5 Практика
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите дату в формате dd-mm-yyyy: ");
//        String date = scanner.nextLine();
//        StringBuilder result = new StringBuilder();
//        Pattern pattern5 = Pattern.compile("(0[1-9]|[12][0-9]|3[01])-(0[0-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])");
//        Matcher matcher5 = pattern5.matcher(date);
//        while (matcher5.find()){
//            result.append(matcher5.group());
//        }
//        if(result.isEmpty()){
//            System.out.println("Неверное выражение!");
//        } else {
//            System.out.print(result);
//        }

        // 6 Практика
//        System.out.print("Придумайте пароль: ");
//        String password = scanner.nextLine();
//        StringBuilder builder = new StringBuilder();
//        Pattern pattern6 = Pattern.compile("^[\\w@-]{6,18}$");
//        Matcher matcher6 = pattern6.matcher(password);
//        while (matcher6.find()){
//            builder.append(matcher6.group()).append("\n");
//        }
//        if(builder.isEmpty()){
//            System.out.println("Неверное выражение!");
//        } else {
//            System.out.println(builder);
//        }

        // 7 Практика
//        String weather = "В июне 2021 года, 02/06/2021, 05/06/2021, 14/06/2021, " +
//                "были зафиксированы максимумы ежемесячных осадков.";
//        Pattern pattern = Pattern.compile("[0-3][0-9]/[01][0-9]/[12][019][0-9][0-9]");
//        Matcher matcher = pattern.matcher(weather);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

        // 8 Практика
//        System.out.print("Введите номер телефона: ");
//        String number = scanner.nextLine().trim()
//                .replaceAll("\\s","")
//                .replaceAll("-","")
//                .replaceAll("\\(","")
//                .replaceAll("\\)","");
//        String result = "";
//        Pattern pattern = Pattern.compile("^\\+?7\\d{10}$");
//        Matcher matcher = pattern.matcher(number);
//        while (matcher.find()){
//            result = matcher.group();
//        }
//        System.out.println(result.isEmpty() ? "Неверно введен номер!" : result);

        
    }
}
