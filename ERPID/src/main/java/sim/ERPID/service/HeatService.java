//package sim.ERPID.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import sim.ERPID.domain.Heat;
//import sim.ERPID.repository.HeatRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//public class HeatService {
//    private final HeatRepository heatRepository;
//
//    @Autowired
//    public HeatService(HeatRepository heatRepository) {
//        this.heatRepository = heatRepository;
//    }
//
//    //회원가입
//
//    public long join(Heat heat) {
//        // 같은 이름의 중복 회원x
//        validateDuplicateHeat(heat); //중복 회원 검증
//        heatRepository.save(heat);
//        return heat.getId();
//    }
//
//    private void validateDuplicateHeat(Heat heat) {
//        heatRepository.findByNumber((Integer) heat.getNumber())
//                .ifPresent(m -> {  //
//                    throw new IllegalStateException("이미 존재하는 사원번호입니다.");
//                });
//    }
//
//    //전체 회원 조회
//    public List<Heat> findHeats() {
//        return heatRepository.findAll();
//    }
//
//    public Optional<Heat> findOne(Long heatId) {
//        return heatRepository.findById(heatId);
//    }
//}
