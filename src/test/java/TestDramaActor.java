import models.ComedyActor;
import models.DramaActor;
import models.FilmGenreType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestDramaActor {

    private DramaActor seriousMike;

    @Before
    public void before(){
        seriousMike = new DramaActor("Mike The Spike");
    }

    @Test
    public void hasName(){
        assertEquals("Mike The Spike", seriousMike.getName());
    }

    @Test
    public void hasEmptyWalletOnInitialisation(){
        assertEquals(0, seriousMike.getWallet());
    }

    @Test
    public void hasDramaGenreSpeciality(){
        assertEquals(FilmGenreType.DRAMA, seriousMike.getGenreOfSpeciality());
    }

    @Test
    public void canAddToWallet(){
        seriousMike.addToWallet(100);
        assertEquals(100, seriousMike.getWallet());
    }

    @Test
    public void hasDramaSpecificAudition(){
        assertEquals("I am a really serious actor guys.", seriousMike.audition());
    }

    @Test
    public void hasEmptyListOfFilmsOnInitialization(){
        assertEquals(0, seriousMike.getFilmsStarredIn().size());
    }
}
