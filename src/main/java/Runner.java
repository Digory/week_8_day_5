import db.DBHelper;
import models.Director;
import models.Studio;

public class Runner {
    public static void main(String[] args) {

        Studio studio = new Studio("Nice Films");
        DBHelper.save(studio);

        Director directorNeil = new Director("Neil", studio);
        DBHelper.save(directorNeil);
    }
}
