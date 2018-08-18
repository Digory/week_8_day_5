import db.DBActor;
import db.DBHelper;
import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestActor {

    private Studio studio;
    private Director directorNelly;
    private Film filmRabbits;
    private Film filmRabbitsTwo;
    private ComedyActor comedyMike;

    @Before
    public void before(){
        studio = new Studio("Nice Films", 1000000);
        DBHelper.save(studio);

        directorNelly = new Director("Nelly", studio);
        DBHelper.save(directorNelly);

        Director directorNeil = new Director("Neil", studio);
        DBHelper.save(directorNeil);

        filmRabbits = new Film("Mark's Marvellous Rabbits", FilmGenreType.JUST_WEIRD, studio, directorNelly);
        DBHelper.save(filmRabbits);

        filmRabbitsTwo = new Film("Mark's Marvellous Rabbits 2", FilmGenreType.HORROR, studio, directorNeil);
        DBHelper.save(filmRabbitsTwo);

        comedyMike = new ComedyActor("Mike Funnington");
        DBHelper.save(comedyMike);

        DBActor.addActorToFilm(comedyMike, filmRabbits);
        DBActor.addActorToFilm(comedyMike, filmRabbitsTwo);
    }

    @Test
    public void canShowAmountOfFilmsByGenre(){
        assertEquals("Comedies: 0\n" +
                "Dramas: 0\n" +
                "Romances: 0\n" +
                "Horrors: 1\n" +
                "Just weird: 1", Actor.getAmountOfFilmsByGenre(comedyMike));
    }
}
