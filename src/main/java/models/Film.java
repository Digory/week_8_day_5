package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private FilmGenreType genre;
    private Studio studio;
    private Director director;
    private List<Actor> actors;

    public Film(){}

    public Film(String title, FilmGenreType genre, Studio studio, Director director) {
        this.title = title;
        this.genre = genre;
        this.studio = studio;
        this.director = director;
        actors = new ArrayList<Actor>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @ManyToOne
    @JoinColumn(name = "studio_id", nullable = false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

//    public Director getDirector() {
//        return director;
//    }
//
//    public void setDirector(Director director) {
//        this.director = director;
//    }

//    public List<Actor> getActors() {
//        return actors;
//    }
//
//    public void setActors(List<Actor> actors) {
//        this.actors = actors;
//    }
//
//    public void addActor(Actor actor){
//        actors.add(actor);
//    }
}
