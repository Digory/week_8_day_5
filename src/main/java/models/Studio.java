package models;

import java.util.ArrayList;
import java.util.List;

public class Studio {

    private String name;
    private List<Director> directors;
    private List<Film> films;

    public Studio(String name) {
        this.name = name;
        directors = new ArrayList<Director>();
        films = new ArrayList<Film>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public void addDirector(Director director){
        directors.add(director);
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film){
        films.add(film);
    }
}
