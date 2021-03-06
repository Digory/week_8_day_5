import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestStudio {

    private Studio studio;
    private Director director;
    private Film film;
    private RomanceActor actor;


    @Before
    public void before(){
        studio = new Studio("Nice Films", 1000000);
        director = new Director("Digory", studio);
        film = new Film("Mark's marvellous rabbits", FilmGenreType.JUST_WEIRD, studio, director);
        actor = new RomanceActor("Hugh Grant");
    }

    @Test
    public void hasName(){
        assertEquals("Nice Films", studio.getName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, studio.getBudget());
    }

    @Test
    public void directorListEmptyOnInitialization(){
        assertEquals(0, studio.getDirectors().size());
    }

    @Test
    public void canAddDirector(){
        studio.addDirector(director);
        assertEquals(1, studio.getDirectors().size());
    }

    @Test
    public void filmListEmptyOnInitialization(){
        assertEquals(0, studio.getFilms().size());
    }

    @Test
    public void canAddFilm(){
        studio.addFilm(film);
        assertEquals(1, studio.getFilms().size());
    }

    @Test
    public void canPayActor(){
        studio.payActor(actor, 5000);
        assertEquals(5000, actor.getWallet());
    }

    @Test
    public void doesNotPayActorIfBudgetTooSmall(){
        studio.payActor(actor, 2000000);
        assertEquals(0, actor.getWallet());
    }

}
