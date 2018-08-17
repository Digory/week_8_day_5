package models;

public class RomanceActor extends Actor{

    public RomanceActor(String name, int wallet) {
        super(name, FilmGenreType.ROMANCE);
    }

    public String audition() {
        return " --just stands there with rose in mouth, winking-- ";
    }
}
