package models;

import db.DBFilm;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static models.FilmGenreType.COMEDY;

@Entity
@Table(name = "actors")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Actor {
    private int id;
    protected String name;
    protected int wallet;
    protected FilmGenreType genreOfSpeciality;
    protected List<Film> filmsStarredIn;

    public Actor(){}

    public Actor(String name, FilmGenreType genreOfSpeciality){
        this.name = name;
        this.genreOfSpeciality = genreOfSpeciality;
        wallet = 0;
        filmsStarredIn = new ArrayList<Film>();
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

    @Column(name = "wallet")
    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void addToWallet(int amount) {
        wallet += amount;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "genre_of_speciality")
    public FilmGenreType getGenreOfSpeciality() {
        return genreOfSpeciality;
    }

    public void setGenreOfSpeciality(FilmGenreType genreOfSpeciality) {
        this.genreOfSpeciality = genreOfSpeciality;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(
            name = "films_actors",
            joinColumns = {@JoinColumn(name = "actor_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)}
    )
    public List<Film> getFilmsStarredIn() {
        return filmsStarredIn;
    }

    public void setFilmsStarredIn(List<Film> filmsStarredIn) {
        this.filmsStarredIn = filmsStarredIn;
    }

    public void addToFilmsStarredIn(Film film){
        filmsStarredIn.add(film);
    }

    public static String getAmountOfFilmsByGenre(Actor actor){
        List<Film> filmsStarredIn = DBFilm.getFilmsStarredIn(actor);
        int comedies = 0;
        int dramas = 0;
        int romances = 0;
        int horrors = 0;
        int justWeird = 0;
        for (Film film : filmsStarredIn){
            switch(film.getGenre()){
                case COMEDY: comedies++;
                break;
                case DRAMA: dramas++;
                break;
                case ROMANCE: romances++;
                break;
                case HORROR: horrors++;
                break;
                case JUST_WEIRD: justWeird++;
                break;
        }}
        return "Comedies: " + comedies + "\n" +
                "Dramas: " + dramas + "\n" +
                "Romances: " + romances + "\n" +
                "Horrors: " + horrors + "\n" +
                "Just weird: " + justWeird;
    }

    public abstract String audition();
}
