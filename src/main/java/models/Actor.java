package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Actor {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void addToWallet(int amount) {
        wallet += amount;
    }

    public FilmGenreType getGenreOfSpeciality() {
        return genreOfSpeciality;
    }

    public void setGenreOfSpeciality(FilmGenreType genreOfSpeciality) {
        this.genreOfSpeciality = genreOfSpeciality;
    }

    public List<Film> getFilmsStarredIn() {
        return filmsStarredIn;
    }

    public void setFilmsStarredIn(List<Film> filmsStarredIn) {
        this.filmsStarredIn = filmsStarredIn;
    }

    public abstract String audition();
}
