//package sim.ERPID.repository;
//
//
//import sim.ERPID.domain.Heat;
//
//import java.util.*;
//
//public class MemoryHeatRepository implements HeatRepository {
//
//    private static Map<Long, Heat> store = new HashMap<>();
//    private static long sequence = 0L;
//
//    @Override
//    public Heat save(Heat heat) {
//        heat.setId(++sequence);
//        store.put(heat.getId(), heat);
//        return heat;
//    } // member에 Id값을 셋팅해주고 store에 저장 ->map에 저장
//
//    @Override
//    public Optional<Heat> findById(Long id) {
//        return Optional.ofNullable(store.get(id)); // null일 경우도 감싸서
//    }
//
//    @Override
//    public Optional<Heat> findByName(String name) {
//        return store.values().stream()
//                .filter(heat -> heat.getName().equals(name))
//                .findAny(); // map의 loop 다 돌면서 하나라도 찾으면 반환. 그래도 없으면 옵셔널에 널포함해서 반환
//    }
//
//    @Override
//    public Optional<Heat> findByNumber(Integer number) {
//        return store.values().stream()
//                .filter(heat -> heat.getNumber().equals(number))
//                .findAny(); // map의 loop 다 돌면서 하나라도 찾으면 반환. 그래도 없으면 옵셔널에 널포함해서 반환
//    }
//
//    @Override
//    public Optional<Heat> findByBodyheat(String bodyheat) {
//        return store.values().stream()
//                .filter(heat -> heat.getBodyheat().equals(bodyheat))
//                .findAny();
//    }
//
//    @Override
//    public List<Heat> findAll() {
//        return new ArrayList<>(store.values());
//    }
//
//    public void clearStore() {
//        store.clear();
//    }
//}
