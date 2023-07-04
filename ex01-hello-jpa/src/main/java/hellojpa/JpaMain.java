package hellojpa;

import javassist.compiler.MemberResolver;
import org.hibernate.Hibernate;
import org.hibernate.criterion.CriteriaQuery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            String qlString = "select m From Member as m";
//            String username;
//            if(username != null) {
//                String where = "where m.username like '%kim%'";
//                qlString + where;
//            }
//            List<Member> result = em.createQuery(
//                    qlString,
//                    Member.class
//            ).getResultList();

            Member member = new Member();
            member.setUsername("member1");
            em.persist(member);

            // flush -> commit, query

            em.flush();
            //결과 0
            //dbconn.executeQuery("select * from member");

            for (Member member1 : resultList) {
                System.out.println("member1 = " + member1);
            }

            tx.commit();
        } catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        emf.close();

    }

}