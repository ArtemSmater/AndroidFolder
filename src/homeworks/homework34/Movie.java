package homeworks.homework34;

import java.util.Map;

public class Movie {
    private final String title;
    private final String genre;
    private final String director;
    private final String studio;
    private final String actors;
    private final String year;
    private final String duration;

    public Movie(Map<String, String> movies) {
        this.title = movies.get("название");
        this.genre = movies.get("жанр");
        this.director = movies.get("режиссера");
        this.studio = movies.get("студию");
        this.actors = movies.get("актера");
        this.year = movies.get("год выпуска");
        this.duration = movies.get("длительность");
    }

    @Override
    public String toString() {
        return String.format("""
                        
                        Название: %s
                        Жанр: %s
                        Режиссер: %s
                        Студия: %s
                        Актеры: %s
                        Год: %s
                        Длительность: %s
                        """,
                title, genre, director, studio, actors, year, duration);
    }
}
