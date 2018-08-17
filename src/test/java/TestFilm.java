import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestFilm {

    private Film film;
    private Studio studio;
    private Director director;

    @Before
    public void before(){
        studio = new Studio("Nice Films");
        director = new Director("Digory", studio);
        film = new Film("Mark's Marvellous Rabbits", FilmGenreType.JUST_WEIRD, studio, director);
    }

    @Test
    public void hasTitle(){
        assertEquals("Mark's Marvellous Rabbits", film.getTitle());
    }

    @Test
    public void hasStudio(){
        assertEquals(studio, film.getStudio());
    }

//    @Test
//    public void hasDirector(){
//        assertEquals(director, film.getDirector());
//    }

    @Test
    public void hasGenre(){
        assertEquals(FilmGenreType.JUST_WEIRD, film.getGenre());
    }

//    @Test
//    public void actorListEmptyOnInitialisation(){
//        assertEquals(0, film.getActors().size());
//    }
//
//    @Test
//    public void canAddToActorList(){
//        film.addActor(new DramaActor("Jane"));
//        assertEquals(1, film.getActors().size());
//    }
}
