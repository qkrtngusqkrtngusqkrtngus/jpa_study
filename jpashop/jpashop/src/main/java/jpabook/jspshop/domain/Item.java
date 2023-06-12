package jpabook.jspshop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String naem;
    private int price;
    private int srockQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSrockQuantity() {
        return srockQuantity;
    }

    public void setSrockQuantity(int srockQuantity) {
        this.srockQuantity = srockQuantity;
    }
}
