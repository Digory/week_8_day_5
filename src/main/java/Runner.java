import db.*;
import models.*;

import java.util.List;

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

        DBActor.addActorToFilm(comedyJane, filmRabbits);
        DBActor.addActorToFilm(seriousMike, filmRabbits);
        DBActor.addActorToFilm(comedyJane, filmRabbitsTwo);

//        ASK ABOUT THIS ON MONDAY - You get duplicates in the join table if you add a film to the actor's list of films,
//        and add the actor to the film's list of actors, and update. Is it okay to only add one to the other and
//        update, even though that would mean differences between the information in the Java world, and the database?

        List<Film> filmsProducedBStudio = DBStudio.getFilmsProducedByStudio(studio);

        List<Director> directorsWorkingForStudio = DBStudio.getDirectorsWorkingForStudio(studio);

        Film film = DBFilm.getFilmDirectedBy(directorNeil);

        List<Actor> actorsInFilm = DBActor.getActorsInFilm(filmRabbits);

        List<Film> filmsActorHasStarredIn = DBFilm.getFilmsStarredIn(comedyJane);
    }
}
