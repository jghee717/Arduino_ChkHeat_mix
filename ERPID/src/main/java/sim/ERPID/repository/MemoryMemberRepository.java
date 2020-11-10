package sim.ERPID.repository;

import sim.ERPID.domain.Member;


import java.sql.Date;
import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    } // member에 Id값을 셋팅해주고 store에 저장 ->map에 저장

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); // null일 경우도 감싸서
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); // map의 loop 다 돌면서 하나라도 찾으면 반환. 그래도 없으면 옵셔널에 널포함해서 반환
    }

    @Override
    public Optional<Member> findByNumber(Integer number) {
        return store.values().stream()
                .filter(member -> member.getNumber().equals(number))
                .findAny(); // map의 loop 다 돌면서 하나라도 찾으면 반환. 그래도 없으면 옵셔널에 널포함해서 반환
    }
    public Optional<Member> findByPw(String pw) {
        return store.values().stream()
                .filter(member -> member.getPw().equals(pw))
                .findAny(); // map의 loop 다 돌면서 하나라도 찾으면 반환. 그래도 없으면 옵셔널에 널포함해서 반환
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return store.values().stream()
                .filter(member -> member.getEmail().equals(email))
                .findAny();
    }

    @Override
    public Optional<Member> findByJumin(String jumin) {
        return store.values().stream()
                .filter(member -> member.getJumin().equals(jumin))
                .findAny();
    }
    @Override
    public Optional<Member> findBySex(String sex) {
        return store.values().stream()
                .filter(member -> member.getSex().equals(sex))
                .findAny();
    }

    @Override
    public Optional<Member> findByAddress(String address) {
        return store.values().stream()
                .filter(member -> member.getAddress().equals(address))
                .findAny();
    }
    @Override
    public Optional<Member> findByDepartment(String department) {
        return store.values().stream()
                .filter(member -> member.getAddress().equals(department))
                .findAny();
    }
    @Override
    public Optional<Member> findByPosition(String position) {
        return store.values().stream()
                .filter(member -> member.getAddress().equals(position))
                .findAny();
    }
    @Override
    public Optional<Member> findByStatus(String status) {
        return store.values().stream()
                .filter(member -> member.getAddress().equals(status))
                .findAny();
    }

    @Override
    public Optional<Member> findByHire(Date hire) {
        return store.values().stream()
                .filter(member -> member.getAddress().equals(hire))
                .findAny();
    }

    @Override
    public Optional<Member> findByResign(Date resign) {
        return store.values().stream()
                .filter(member -> member.getAddress().equals(resign))
                .findAny();
    }

    @Override
    public Optional<Member> findByBodyheat(String bodyheat) {
        return store.values().stream()
                .filter(member -> member.getBodyheat().equals(bodyheat))
                .findAny();
    }


    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
