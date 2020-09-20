package sim.ERPID.repository;

import sim.ERPID.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);  //save= 회원 저장소에 저장, findby로 저장된 회원 반환
    Optional<Member> findById(Long id);  // Optional= null반환 대신 optional로 감싸서 반환?
    Optional<Member> findByName(String name);
    Optional<Member> findByNumber(Integer number);
    Optional<Member> findByPw(String pw);
    Optional<Member> findByEmail(String email);
    Optional<Member> findBySex(String sex);
    Optional<Member> findByAddress(String address);
    Optional<Member> findByJumin(String jumin);
    Optional<Member> findByDepartment(String department);
    Optional<Member> findByPosition(String position);
    Optional<Member> findByStatus(String status);

    List<Member> findAll();
}
