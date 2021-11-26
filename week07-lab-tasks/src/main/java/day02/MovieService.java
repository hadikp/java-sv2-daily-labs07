package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> moviesList = new ArrayList<>();

    public MovieService(Path path) {
        List<String> filmList = readFile(path);
        this.moviesList = makeMovie(filmList);
    }

    private  List<Movie> makeMovie(List<String> filmList) {
        List<Movie> movieList = new ArrayList<>();
        for (String st: filmList) {
            String[] stSlice = st.split(";");
            Movie movie = new Movie(stSlice[2], stSlice[0], Integer.parseInt(stSlice[1]));
            movieList.add(movie);
        }
        return movieList;
    }

    private List<String> readFile(Path path) {
        List<String> filmList = new ArrayList<>();
        try {
            filmList = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Dont read file", ioe);
        }
        return filmList;
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }
}
