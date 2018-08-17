package models;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private String title;
    private FilmGenreType genre;
    private Studio studio;
    private Director director;
    private List<Actor> actors;

    public Film(String title, FilmGenreType genre, Studio studio, Director director) {
        this.title = title;
        this.genre = genre;
        this.studio = studio;
        this.director = director;
        actors = new ArrayList<Actor>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FilmGenreType getGenre() {
        return genre;
    }

    public void setGenre(FilmGenreType genre) {
        this.genre = genre;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }
}
