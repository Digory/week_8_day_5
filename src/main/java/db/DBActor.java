package db;

import models.Actor;
import models.Film;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBActor {

    private static Session session;

    public static void addActorToFilm(Actor actor, Film film){
        film.addActor(actor);
        DBHelper.update(film);
    }

//    ASK ABOUT THIS - Why do we need to go into the database if the below method works?
//    public static List<Actor> getActorsInFilm(Film film){
//        return film.getActors();
//    }

    public static List<Actor> getActorsInFilm(Film film){
        List<Actor> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try{
            Criteria cr = session.createCriteria(Actor.class);
            cr.createAlias("filmsStarredIn", "film");
            cr.add(Restrictions.eq("film.id", film.getId()));
            results = cr.list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        } finally{
            session.close();
        }
        return results;
    }

}
