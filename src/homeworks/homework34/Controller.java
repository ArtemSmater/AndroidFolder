package homeworks.homework34;

public class Controller {
    private final View userInterface;
    private final Model movieModel;

    public Controller() {
        this.userInterface = new View();
        this.movieModel = new Model();
    }

    public void run(){
        char answer = ' ';
        while (answer != 'q') {
            answer = userInterface.getAnswer();
            checkAnswer(answer);
        }
    }

    public void checkAnswer(char answer) {
        switch (answer) {
            case '1' :
                movieModel.addMovie(userInterface.createMovie());
                break;
            case '2' :
                userInterface.showMovies(movieModel.getMovies());
                break;
            case '3' :
                userInterface.showMovie(movieModel.getMovie(userInterface.getTitle()));
                break;
            case '4' :
                userInterface.deleteResult(movieModel.removeMovie(userInterface.getToDelete()));
                break;
            case 'q' :
                userInterface.turnOffApp();
                break;
            default:
                userInterface.wrongAnswer();
        }
    }
}
