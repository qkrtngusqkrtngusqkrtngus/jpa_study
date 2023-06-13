package hellojpa;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "member_seq_generator", sequenceName = "member_seq")
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "USERNAME")
    private String name;
    @ManyToOne //관계 Team이 1, Member N
    @JoinColumn(name = "TEAM_ID") //조인하는 컬럼
    private Team team;

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
