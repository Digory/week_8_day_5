package models;

public class DramaActor extends Actor{

    public DramaActor(String name, int wallet) {
        super(name, FilmGenreType.DRAMA);
    }

    public String audition() {
        return "I am a really serious actor guys.";
    }
}
