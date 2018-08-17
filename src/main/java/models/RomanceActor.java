package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "romance_actors")
public class RomanceActor extends Actor{

    public RomanceActor(){}

    public RomanceActor(String name) {
        super(name, FilmGenreType.ROMANCE);
    }

    public String audition() {
        return " --just stands there with rose in mouth, winking-- ";
    }
}
