package homeworks.homework34;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {

    private final Map<String, Movie> storage;

    public Model() {
        this.storage = new LinkedHashMap<>();
    }

    public void addMovie(Map<String, String> movies) {
        Movie movie = new Movie(movies);
        storage.put(movies.get("название"), movie);
    }

    public Collection<Movie> getMovies() {
        return storage.values();
    }

    public Movie getMovie(String title) {
        Movie movie = null;
        for (Map.Entry<String, Movie> entry : storage.entrySet()) {
            if (entry.getKey().equals(title)) {
                movie = storage.get(title);
            }
        }
        return movie;
    }

    public boolean removeMovie(String title) {
        for (Map.Entry<String, Movie> entry : storage.entrySet()) {
            if (entry.getKey().equals(title)) {
                storage.remove(title);
                return true;
            }
        }
        return false;
    }
}
