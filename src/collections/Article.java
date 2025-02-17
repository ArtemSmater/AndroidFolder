package collections;

import java.util.Map;

public class Article {
    private final String title;
    private final String author;
    private final String pages;
    private final String description;

    public Article(Map<String, String> values) {
        this.title = values.get("название");
        this.author = values.get("автора");
        this.pages = values.get("количество страниц");
        this.description = values.get("краткое описание");
    }

    @Override
    public String toString() {
        return String.format("""
                        Название статьи: %s
                        Автор статьи: %s
                        Количество страниц: %s
                        Краткое описание: %s
                        """,
                title, author, pages, description);
    }
}
