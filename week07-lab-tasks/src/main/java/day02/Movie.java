package day02;

public class Movie {

    private String director;
    private String filmTitle;
    private int year;

    public Movie(String director, String filmTitle, int year) {
        this.director = director;
        this.filmTitle = filmTitle;
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public int getYear() {
        return year;
    }
}
