package homeworks.homework34;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {

    public char getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                ===== Редактирование данных каталога фильмов =====
                Действия с фильмами:
                1 - добавление фильма
                2 - каталог фильмов
                3 - просмотр определенного фильма
                4 - удаление фильма
                q - выход из программы
                Выберите вариант действия:\s""");
        char result = scanner.next().charAt(0);
        System.out.println("==================================================\n");
        return result;
    }

    public Map<String, String> createMovie() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> newMovie = new LinkedHashMap<>();
        newMovie.put("название", "");
        newMovie.put("жанр", "");
        newMovie.put("режиссера", "");
        newMovie.put("год выпуска", "");
        newMovie.put("длительность", "");
        newMovie.put("студию", "");
        newMovie.put("актера", "");
        System.out.println("============= Создание нового фильма =============");
        for (Map.Entry<String, String> entry : newMovie.entrySet()) {
            System.out.print("Введите " + entry.getKey() + " фильма: ");
            newMovie.put(entry.getKey(), scanner.nextLine());
        }
        System.out.println("==================================================\n");
        return newMovie;
    }

    public void showMovies(Collection<Movie> movies) {
        System.out.println("================= Список фильмов =================");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("==================================================\n");
    }

    public String getTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("================ Получение фильма ================\n" +
                "Введите название: ");
        String result = scanner.nextLine();
        System.out.println("==================================================");
        return result;
    }

    public void showMovie(Movie movie) {
        if (movie != null) {
            System.out.println(movie);
        } else {
            System.out.println("\nТакого фильма не существует!\n");
        }
    }

    public String getToDelete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("================= Удаление фильма ================\n" +
                "Введите название: ");
        String result = scanner.nextLine();
        System.out.println("==================================================\n");
        return result;
    }

    public void deleteResult(boolean isDeleted) {
        if (isDeleted) {
            System.out.println("Фильм удален!\n");
        } else {
            System.out.println("Фильм не найден!\n");
        }
    }

    public void wrongAnswer() {
        System.out.println("Неверный выбор!\n");
    }

    public void turnOffApp() {
        System.out.println("Выход из программы!");
    }
}
