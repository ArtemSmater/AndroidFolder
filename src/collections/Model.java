package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {

    private final Map<String, Article> articles;

    public Model() {
        this.articles = new LinkedHashMap<>();
    }

    public void saveArticle(Map<String, String> receivedArticle) {
        Article article = new Article(receivedArticle);
        articles.put(receivedArticle.get("название"), article);
    }

    public Collection<Article> getArticles() {
        return articles.values();
    }

    public Article getArticle(String title) {
        Article article = null;
        for (Map.Entry<String, Article> entry : articles.entrySet()) {
            if(entry.getKey().equals(title)) {
                article = articles.get(entry.getKey());
            }
        }
        return article;
    }

    public boolean removeArticle(String title) {
        for (Map.Entry<String, Article> entry : articles.entrySet()) {
            if(entry.getKey().equals(title)) {
                articles.remove(title);
                return true;
            }
        }
        return false;
    }
}

