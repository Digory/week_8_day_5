import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestStudio {

    private Studio studio;
    private Director director;
    private Film film;


    @Before
    public void before(){
        studio = new Studio("Nice Films");
        director = new Director("Digory", studio);
        film = new Film("Mark's marvellous rabbits", FilmGenreType.JUST_WEIRD, studio, director);
    }

    @Test
    public void hasName(){
        assertEquals("Nice Films", studio.getName());
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

}
