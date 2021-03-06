package sim.ERPID.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sim.ERPID.domain.Member;


import java.sql.Date;
import java.util.Optional;
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    Optional<Member> findByName(String name);
    Optional<Member> findByPw(String pw);
    Optional<Member> findByNumber(Integer number);
    Optional<Member> findByEmail(String email);
    Optional<Member> findBySex(String sex);
    Optional<Member> findByAddress(String address);
    Optional<Member> findByJumin(String jumin);
    Optional<Member> findByDepartment(String department);
    Optional<Member> findByPosition(String position);
    Optional<Member> findByStatus(String status);
    Optional<Member> findByHire(Date hire);
    Optional<Member> findByResign(Date resign);
    Optional<Member> findByBodyheat(String bodyheat);


}
//스프링 데이터 JPA가 SpringDataJpaMemberRepository 를 스프링 빈으로 자동 등록해준다.
