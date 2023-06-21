package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.swing.*;

@Entity
public class Movie extends Item {

    private String director;
    private String Actor;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return Actor;
    }

    public void setActor(String actor) {
        Actor = actor;
    }
}
