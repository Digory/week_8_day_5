package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "drama_actors")
public class DramaActor extends Actor{

    public DramaActor(){}

    public DramaActor(String name) {
        super(name, FilmGenreType.DRAMA);
    }

    public String audition() {
        return "I am a really serious actor guys.";
    }
}
