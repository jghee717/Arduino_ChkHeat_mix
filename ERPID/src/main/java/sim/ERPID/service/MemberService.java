package sim.ERPID.service;

import sim.ERPID.domain.Member;
import sim.ERPID.repository.MemberRepository;
import sim.ERPID.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //회원가입

    public long join(Member member){
        // 같은 이름의 중복 회원x
        validateDuplicateMember(member); // 중복회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m ->{  //m(member)에 null이 아닌 값이 있으면
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }
    //전체 회원 조회
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
