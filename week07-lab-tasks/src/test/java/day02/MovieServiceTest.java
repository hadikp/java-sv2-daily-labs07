package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testReadFile () {
        Path path = Paths.get("src/test/resources/movies.csv");
        MovieService ms = new MovieService(path);
        System.out.println(ms.getMoviesList().get(2).getYear());
    }

}