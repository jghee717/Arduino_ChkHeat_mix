//package sim.ERPID.repository;
//
//import sim.ERPID.domain.Heat;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.sql.Date;
//import java.util.List;
//import java.util.Optional;
//
//public class JpaHeatRepository implements HeatRepository{
//    @PersistenceContext
//    private final EntityManager em; //jpa를 쓰려면 엔티티매니저
//    public JpaHeatRepository(EntityManager em) {
//        this.em = em;
//    }
//
//    public Heat save(Heat heat) {
//        em.persist(heat);
//        return heat;
//    }
//
//    public Optional<Heat> findById(Long id) {
//        Heat heat = em.find(Heat.class, id);
//        return Optional.ofNullable(heat);
//    }
//
//    @Override
//    public Optional<Heat> findByNumber(Integer number) {
//        Heat heat = em.find(Heat.class, number);
//        return Optional.ofNullable(heat);
//    }
//
//    public Optional<Heat> findByName(String name) {
//        List<Heat> result = em.createQuery("select m from Heat m where m.name = :name", Heat.class)
//                .setParameter("name", name)
//                .getResultList();
//        return result.stream().findAny();
//    }
//
//    @Override
//    public Optional<Heat> findByBodyheat(String bodyheat) {
//        List<Heat> result = em.createQuery("select m from Heat m where m.bodyheat = :bodyheat", Heat.class)
//                .setParameter("bodyheat", bodyheat)
//                .getResultList();
//        return result.stream().findAny();
//    }
//    public List<Heat> findAll() {
//        return em.createQuery("select m from Heat m", Heat.class)
//                .getResultList();
//    }
//}
