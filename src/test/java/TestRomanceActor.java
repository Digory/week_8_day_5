import models.DramaActor;
import models.FilmGenreType;
import models.RomanceActor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestRomanceActor {

    private RomanceActor romanticMike;

    @Before
    public void before(){
        romanticMike = new RomanceActor("Mike McRomance");
    }

    @Test
    public void hasName(){
        assertEquals("Mike McRomance", romanticMike.getName());
    }

    @Test
    public void hasEmptyWalletOnInitialisation(){
        assertEquals(0, romanticMike.getWallet());
    }

    @Test
    public void hasRomanticGenreSpeciality(){
        assertEquals(FilmGenreType.ROMANCE, romanticMike.getGenreOfSpeciality());
    }

    @Test
    public void canAddToWallet(){
        romanticMike.addToWallet(100);
        assertEquals(100, romanticMike.getWallet());
    }

    @Test
    public void hasRomanceSpecificAudition(){
        assertEquals(" --just stands there with rose in mouth, winking-- ", romanticMike.audition());
    }

    @Test
    public void hasEmptyListOfFilmsOnInitialization(){
        assertEquals(0, romanticMike.getFilmsStarredIn().size());
    }
}
