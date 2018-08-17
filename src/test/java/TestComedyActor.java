import models.ComedyActor;
import models.FilmGenreType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestComedyActor {

    private ComedyActor funnyMike;

    @Before
    public void before(){
        funnyMike = new ComedyActor("Mike Funnington");
    }

    @Test
    public void hasName(){
        assertEquals("Mike Funnington", funnyMike.getName());
    }

    @Test
    public void hasEmptyWalletOnInitialisation(){
        assertEquals(0, funnyMike.getWallet());
    }

    @Test
    public void hasComedyGenreSpeciality(){
        assertEquals(FilmGenreType.COMEDY, funnyMike.getGenreOfSpeciality());
    }

    @Test
    public void canAddToWallet(){
        funnyMike.addToWallet(100);
        assertEquals(100, funnyMike.getWallet());
    }

    @Test
    public void hasComedySpecificAudition(){
        assertEquals("So two whales are sitting in a bar, one of them says WOOOIIIIOIOIOOOOOWOIWWOOOOOOOIW" +
                "WWWWWWWOOOOOOOOOOOOOOOOOOOIIOIOIOWWWWOWOWOWOWOWOIOIOIIIIIIIIIIIOOOOWWWWWWWWWWWWWOWOW" +
                "WWWWOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO. The other one says, Frank, you're drunk.",
                funnyMike.audition());
    }

    @Test
    public void hasEmptyListOfFilmsOnInitialization(){
        assertEquals(0, funnyMike.getFilmsStarredIn().size());
    }
}
