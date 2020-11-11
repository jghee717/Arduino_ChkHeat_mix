//package sim.ERPID.repository;
//import sim.ERPID.domain.Heat;
//import sim.ERPID.domain.Member;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface HeatRepository {
//    Heat save(Heat heat);  //save= 회원 저장소에 저장, findby로 저장된 회원 반환
//    Optional<Heat> findById(Long id);  // Optional= null반환 대신 optional로 감싸서 반환?
//    Optional<Heat> findByName(String name);
//    Optional<Heat> findByNumber(Integer number);
//    Optional<Heat> findByBodyheat(String bodyheat);
//
//    List<Heat> findAll();
//}
