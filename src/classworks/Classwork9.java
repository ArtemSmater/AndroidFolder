package classworks;

interface StringActions {
    String function(String line);
}

public class Classwork9 {
    public static void main(String[] args) {
        String lineIn = "I learn Java every day!";
        System.out.println("Исходная строка: " + lineIn);
        String lineUp = getString(String::toUpperCase, lineIn);
        System.out.println("Верхний регистр: " + lineUp);

         StringActions reverse = (StringActions) -> {
            StringBuilder result = new StringBuilder();
            for (int i = StringActions.length() - 1; i >= 0; i--) {
                result.append(StringActions.charAt(i));
            }
            return result.toString();
        };
        System.out.println("Перевернутая строка: " + reverse.function(lineIn));
    }

    public static String getString(StringActions actions, String line) {
        return actions.function(line);
    }
}