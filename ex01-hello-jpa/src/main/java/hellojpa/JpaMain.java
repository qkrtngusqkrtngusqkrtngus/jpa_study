package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {

            //저장
            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member member = new Member();
            member.setName("member1");
            member.setTeam(team);
            em.persist(member);

            //조회
            /* 영속성 컨텍스트에서 가져오는거 말고 디비에서 가져오는거 보고싶으면 영속성 컨텍스트에 있는 데이터를 지운다. */
             em.flush();
             em.clear();

            Member findMember = em.find(Member.class, member.getId()); //영속성 컨텍스트에서 가져옴
            List<Member> members = findMember.getTeam().getMembers();

            for (Member m : members){
                System.out.println("m = " + m.getName());
            }

            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
