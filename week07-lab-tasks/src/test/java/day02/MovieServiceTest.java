package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testReadFile () {
        Path path = Paths.get("src/test/resources/movies.csv");
        MovieService ms = new MovieService(path);
        assertEquals(5, ms.getMoviesList().size());
        assertEquals(1977, ms.getMoviesList().get(2).getYear());
    }

    @Test
    void testFileNotFound() {
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> new MovieService(Path.of("resources/movies.csv")));
        assertEquals("Dont read file", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }

}