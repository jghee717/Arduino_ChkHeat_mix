package sim.ERPID.repository;

import sim.ERPID.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);  //save= 회원 저장소에 저장, findby로 저장된 회원 반환
    Optional<Member> findById(Long id);  // Optional= null반환 대신 optional로 감싸서 반환?
    Optional<Member> findByName(String name);
    List<Member> findAll();
}