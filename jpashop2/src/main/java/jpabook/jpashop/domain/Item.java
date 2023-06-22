package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
public abstract class Item extends BaseEntity { //item만 단독으로 테이블에 저장할 일이 없다는 가정

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;
    private int srockQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
