package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "comedy_actors")
public class ComedyActor extends Actor{

    public ComedyActor(){}

    public ComedyActor(String name) {
        super(name, FilmGenreType.COMEDY);
    }

    public String audition() {
        return "So two whales are sitting in a bar, one of them says WOOOIIIIOIOIOOOOOWOIWWOOOOOOOIW" +
                "WWWWWWWOOOOOOOOOOOOOOOOOOOIIOIOIOWWWWOWOWOWOWOWOIOIOIIIIIIIIIIIOOOOWWWWWWWWWWWWWOWOW" +
                "WWWWOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO. The other one says, Frank, you're drunk.";
    }
}
