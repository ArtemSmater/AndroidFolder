package homeworks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework17 {
    public static void main(String[] args) {
        String line = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, " +
                "login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru, 1login@ru.name.ру " +
                "1login@ru.name.ru.ru, 1lo%%@@!gin@ru.name.ru, 1login@ru.name.RU";
        Pattern pattern = Pattern.compile("[\\wА-я.-]{6,16}@[A_Za-z]+\\.?[A_Za-z]*.ru");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
