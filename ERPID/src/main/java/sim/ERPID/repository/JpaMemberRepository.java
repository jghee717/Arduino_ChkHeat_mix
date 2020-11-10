package sim.ERPID.repository;

import sim.ERPID.domain.Member;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

    @PersistenceContext
    private final EntityManager em; //jpa를 쓰려면 엔티티매니저
    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    public Member save(Member member) {
        em.persist(member);
        return member;
    }
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }


    public Optional<Member> findByPw(String pw) {
        List<Member> result = em.createQuery("select m from Member m where m.pw = :pw", Member.class)
                .setParameter("pw", pw)
                .getResultList();
        return result.stream().findAny();
    }
    public Optional<Member> findByEmail(String email) {
        List<Member> result = em.createQuery("select m from Member m where m.email = :email", Member.class)
                .setParameter("email", email)
                .getResultList();
        return result.stream().findAny();
    }
    public Optional<Member> findByJumin(String jumin) {
        List<Member> result = em.createQuery("select m from Member m where m.jumin = :jumin", Member.class)
                .setParameter("jumin", jumin)
                .getResultList();
        return result.stream().findAny();
    }
    @Override
    public Optional<Member> findBySex(String sex) {
        List<Member> result = em.createQuery("select m from Member m where m.sex = :sex", Member.class)
                .setParameter(sex, sex)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findByAddress(String address) {
        List<Member> result = em.createQuery("select m from Member m where m.address = :address", Member.class)
                .setParameter("address", address)
                .getResultList();
        return result.stream().findAny();
    }
    public Optional<Member> findByDepartment(String department) {
        List<Member> result = em.createQuery("select m from Member m where m.department = :department", Member.class)
                .setParameter("department", department)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findByPosition(String position) {
        List<Member> result = em.createQuery("select m from Member m where m.position = :position", Member.class)
                .setParameter("position", position)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findByStatus(String status) {
        List<Member> result = em.createQuery("select m from Member m where m.status = :status", Member.class)
                .setParameter("status", status)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findByHire(Date hire) {
        List<Member> result = em.createQuery("select m from Member m where m.hire = :hire", Member.class)
                .setParameter("hire", hire)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findByResign(Date resign) {
        List<Member> result = em.createQuery("select m from Member m where m.resign = :resign", Member.class)
                .setParameter("resign", resign)
                .getResultList();
        return result.stream().findAny();
    }
    public Optional<Member> findByBodyheat(String bodyheat) {
        List<Member> result = em.createQuery("select m from Member m where m.bodyheat = :bodyheat", Member.class)
                .setParameter("bodyheat", bodyheat)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public Optional<Member> findByNumber(Integer number) {
        Member member = em.find(Member.class, number);
        return Optional.ofNullable(member);
    }


}
