import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestDirector {

    private Director director;
    private Studio studio;
    private Film film;

    @Before
    public void before(){
        studio = new Studio("Nice films", 1000000);
        director = new Director("Digory", studio);
    }

    @Test
    public void hasName(){
        assertEquals("Digory", director.getName());
    }

    @Test
    public void hasStudio(){
        assertEquals(studio, director.getStudio());
    }

    @Test
    public void canSetFilm(){
        director.setFilm(film);
        assertEquals(film, director.getFilm());
    }
}
