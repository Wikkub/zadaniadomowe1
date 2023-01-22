package zad3;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements IMovieRepositoryApi {
    List<Movie> listOfMovies = new ArrayList<>();

    @Override
    public void addMovie(Movie movie) {
        listOfMovies.add(movie);
    }

    @Override
    public void deleteMovie(Movie movie) {
        listOfMovies.remove(movie);
    }

    @Override
    public List<Movie> findAll() {
        return this.listOfMovies;
    }

    @Override
    public Movie findByTitle(String title) {
        for (int i = 0; i < this.listOfMovies.size(); i++) {
            Movie movie = this.listOfMovies.get(i);
            if (title.equals(movie.getTitle())) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return listOfMovies.size();
    }
}
