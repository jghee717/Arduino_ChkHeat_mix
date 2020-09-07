package sim.ERPID.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sim.ERPID.domain.Member;

import java.util.Optional;
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    Optional<Member> findByName(String name);
    Optional<Member> findByNumber(Integer number);
}
//스프링 데이터 JPA가 SpringDataJpaMemberRepository 를 스프링 빈으로 자동 등록해준다.
