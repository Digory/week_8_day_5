package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "studios")
public class Studio {

    private int id;
    private String name;
    private List<Director> directors;
    private List<Film> films;
    private int budget;

    public Studio(){}

    public Studio(String name, int budget) {
        this.name = name;
        this.budget = budget;
        directors = new ArrayList<Director>();
        films = new ArrayList<Film>();
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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @OneToMany(mappedBy = "studio")
    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public void addDirector(Director director){
        directors.add(director);
    }

    @OneToMany(mappedBy = "studio")
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film){
        films.add(film);
    }

    public boolean payActor(Actor actor, int amount){
        if (amount <= budget){
            budget -= amount;
            actor.addToWallet(amount);
            return true;
        }
        return false;

    }
}
