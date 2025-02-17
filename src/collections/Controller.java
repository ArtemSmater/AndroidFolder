package collections;

import java.util.Collection;
import java.util.Map;

public class Controller {

    private final View userInterface;
    private final Model articleModel;

    public Controller() {
        this.userInterface = new View();
        this.articleModel = new Model();
    }

    public void run() {
        char answer = ' ';
        while (answer != 'q') {
            answer = userInterface.throwOffers();
            checkAnswer(answer);
        }
    }

    public void checkAnswer(char answer) {
        switch (answer) {
            case '1' :
                Map<String, String> articles = userInterface.createArticle();
                articleModel.saveArticle(articles);
                break;
            case '2' :
                Collection<Article> collection = articleModel.getArticles();
                userInterface.showArticles(collection);
                break;
            case '3' :
                userInterface.showArticle(articleModel.getArticle(userInterface.getTitle()));
                break;
            case '4' :
                userInterface.isRemoved(articleModel.removeArticle(userInterface.removeArticle()));
                break;
            case 'q' :
                userInterface.turnedOff();
                break;
            default:
                userInterface.wrongAnswer();
        }
    }
}
