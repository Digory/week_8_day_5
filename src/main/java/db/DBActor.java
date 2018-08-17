package db;

import models.Actor;
import models.Film;

public class DBActor {

    public static void addActorToFilm(Actor actor, Film film){
        film.addActor(actor);
        DBHelper.update(film);
    }
}
