//package sim.ERPID.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import sim.ERPID.domain.Heat;
//import sim.ERPID.domain.Member;
//
//import java.util.Optional;
//
//public interface SpringDateJpaHeatRepository extends JpaRepository<Heat, Long>, HeatRepository{
//    Optional<Heat> findByName(String name);
//    Optional<Heat> findByNumber(Integer number);
//    Optional<Heat> findByBodyheat(String bodyheat);
//
//}
