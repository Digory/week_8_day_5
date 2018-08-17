import db.DBHelper;
import models.*;

public class Runner {
    public static void main(String[] args) {

        Studio studio = new Studio("Nice Films");
        DBHelper.save(studio);

        Director directorNelly = new Director("Nelly", studio);
        DBHelper.save(directorNelly);

        Director directorNeil = new Director("Neil", studio);
        DBHelper.save(directorNeil);

        Film filmRabbits = new Film("Mark's Marvellous Rabbits", FilmGenreType.JUST_WEIRD, studio, directorNelly);
        DBHelper.save(filmRabbits);

        Film filmRabbitsTwo = new Film("Mark's Marvellous Rabbits 2", FilmGenreType.HORROR, studio, directorNeil);
        DBHelper.save(filmRabbitsTwo);

        ComedyActor comedyJane = new ComedyActor("Jane");
        DBHelper.save(comedyJane);

        DramaActor seriousMike = new DramaActor("Mike the Spike");
        DBHelper.save(seriousMike);

        filmRabbits.addActor(comedyJane);
        filmRabbits.addActor(seriousMike);
        DBHelper.update(filmRabbits);
    }
}
