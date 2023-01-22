package zad3;

import java.util.List;

public interface IMovieRepositoryApi {

    public void addMovie (Movie movie);
    public void deleteMovie(Movie movie);
    public List<Movie> findAll();
    public Movie findByTitle(String title);
    public int size ();

}
