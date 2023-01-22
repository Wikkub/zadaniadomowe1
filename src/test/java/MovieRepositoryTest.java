import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zad3.Movie;
import zad3.MovieRepository;

public class MovieRepositoryTest {
    @Test
    public void shouldAddMovie () {
        //given
        Movie movie = new Movie();
        MovieRepository movieRepository = new MovieRepository();
        int expected = 1;
        //when
        movieRepository.addMovie(movie);
        //then
        Assertions.assertEquals(expected, movieRepository.size());
    }
}
