package models;

import javax.persistence.*;

@Entity
@Table(name = "directors")
public class Director {

    private int id;
    private String name;
    private Studio studio;
    private Film film;

    public Director(){}

    public Director(String name, Studio studio) {
        this.name = name;
        this.studio = studio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "studio_id", nullable = false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

//    public Film getFilm() {
//        return film;
//    }
//
//    public void setFilm(Film film) {
//        this.film = film;
//    }
}
