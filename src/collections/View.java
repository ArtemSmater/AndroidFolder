package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {

    public char throwOffers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                ========== Ввод пользовательских данных ==========
                Действия со статьями:
                1 - создание статьи
                2 - просмотр статей
                3 - просмотр определенной статьи
                4 - удаление статьи
                q - выход из программы
                Выберите вариант действия:\s""");
        char result = scanner.next().charAt(0);
        System.out.println("==================================================\n");
        return result;
    }

    public Map<String, String> createArticle() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> result = new LinkedHashMap<>();
        result.put("название", "");
        result.put("автора", "");
        result.put("количество страниц", "");
        result.put("краткое описание", "");
        System.out.println("============== Создание новой статьи =============");
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.print("Введите " + entry.getKey() + " статьи: ");
            result.put(entry.getKey(), scanner.nextLine());
        }
        System.out.println("==================================================\n");
        return result;
    }

    public void showArticles(Collection<Article> collection) {
        System.out.println("=============== Сохраненные статьи ===============");
        for (Object values : collection) {
            System.out.println(values);
        }
        System.out.println("==================================================\n");
    }

    public String getTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("========== Просмотр определенной статьи ==========\n" +
                "Введите название статьи: ");
        String result = scanner.nextLine();
        System.out.println("==================================================\n");
        return result;
    }

    public String removeArticle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("================ Удаление статьи =================\n" +
                "Введите название статьи: ");
        String result = scanner.nextLine();
        System.out.println("==================================================\n");
        return result;
    }

    public void isRemoved(boolean isFound) {
        if(isFound) {
            System.out.println("Статья удалена!\n");
        } else {
            System.out.println("Такой статьи не существует!\n");
        }
    }

    public void showArticle(Article article) {
        if(article != null) {
            System.out.println(article + "\n");
        } else {
            System.out.println("Статья не найдена\n");
        }
    }

    public void wrongAnswer() {
        System.out.println("Неверный выбор!\n");
    }

    public void turnedOff() {
        System.out.println("Выход из программы!");
    }
}
